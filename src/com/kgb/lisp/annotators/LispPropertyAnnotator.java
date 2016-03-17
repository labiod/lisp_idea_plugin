package com.kgb.lisp.annotators;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.kgb.lisp.LispUtil;
import com.kgb.lisp.psi.LispDefFunItem;
import com.kgb.lisp.psi.LispSetqBlock;
import com.kgb.lisp.psi.LispTypes;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.annotators.LispPropertyAnnotator
 */
public class LispPropertyAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if(!element.getNode().getElementType().toString().equals(LispTypes.CALL_FUNC.toString())) {
            return;
        }
        String value = element.getNode().findChildByType(LispTypes.FUNC_ARG).getText();

        if (value != null) {
            Project project = element.getProject();
            if(value.trim().length() == 0) {
                return;
            }
            String key = value.trim();
            List<LispSetqBlock> properties = LispUtil.findProperties(project, key);
            if (properties.size() == 1) {
                TextRange range = new TextRange(element.getTextRange().getStartOffset(),
                        element.getTextRange().getEndOffset());
                Annotation annotation = holder.createInfoAnnotation(range, null);
                annotation.setTextAttributes(DefaultLanguageHighlighterColors.LINE_COMMENT);
            } else if(properties.size() == 0) {
                TextRange range = new TextRange(element.getTextRange().getStartOffset(),
                        element.getTextRange().getEndOffset());
                holder.createErrorAnnotation(range, "Unresolved property");
            }
        }
    }
}
