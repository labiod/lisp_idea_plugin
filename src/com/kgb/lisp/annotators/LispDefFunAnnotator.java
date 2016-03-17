package com.kgb.lisp.annotators;

import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiExpression;
import com.intellij.psi.PsiLiteralExpression;
import com.kgb.lisp.LispUtil;
import com.kgb.lisp.psi.LispDefFunItem;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.annotators.LispDefFunAnnotator
 */
public class LispDefFunAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        String value = element.getText();
        if (value != null && value.startsWith("(")) {
            Project project = element.getProject();
            String[] elems = value.substring(1).trim().split(" ");
            if(elems.length == 0 || elems[0].length() == 0 || elems[0].equals(")")) {
                return;
            }
            String key = elems[0];
            List<LispDefFunItem> defFunItemList = LispUtil.findDefFunctions(project, key);
            if (defFunItemList.size() == 1) {
                TextRange range = new TextRange(element.getTextRange().getStartOffset() + 7,
                        element.getTextRange().getStartOffset() + 7);
                Annotation annotation = holder.createInfoAnnotation(range, null);
                annotation.setTextAttributes(DefaultLanguageHighlighterColors.LINE_COMMENT);
            } else if(defFunItemList.size() == 0){
                List<String> baseMethod = LispUtil.getBaseMethodName();
                if(!baseMethod.contains(key)) {
                    TextRange range = new TextRange(element.getTextRange().getStartOffset() + 1,
                            element.getTextRange().getEndOffset());
                    holder.createErrorAnnotation(range, "Unresolved function");
                }
            }
        }
    }
}
