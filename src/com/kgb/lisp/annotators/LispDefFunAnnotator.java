package com.kgb.lisp.annotators;

import com.intellij.lang.ASTNode;
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
import com.kgb.lisp.psi.LispCallFunc;
import com.kgb.lisp.psi.LispDefFun;
import com.kgb.lisp.psi.LispTypes;
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
        if (value != null && element.getNode().getElementType().toString().equals(LispTypes.CALL_FUNC.toString())) {
            Project project = element.getProject();
            ASTNode funNameElement = element.getNode().findChildByType(LispTypes.FUNC_NAME);
            if(funNameElement == null) {
                return;
            }
            String key = funNameElement.getText();
            List<LispDefFun> defFunItemList = LispUtil.findDefFunctions(project, key);
            if (defFunItemList.size() == 1) {
                LispDefFun functionDef = defFunItemList.get(0);
                int argCount = ((LispCallFunc)element).getArgList().size();
                if(argCount == functionDef.getArgumentCount()) {
                    TextRange range = new TextRange(element.getTextRange().getStartOffset() + 7,
                            element.getTextRange().getStartOffset() + 7);
                    Annotation annotation = holder.createInfoAnnotation(range, null);
                    annotation.setTextAttributes(DefaultLanguageHighlighterColors.LINE_COMMENT);
                } else if(argCount < functionDef.getArgumentCount()) {
                    TextRange range = new TextRange(element.getTextRange().getStartOffset() + 1,
                            element.getTextRange().getEndOffset());
                    holder.createErrorAnnotation(range, "To few arguments");
                } else {
                    TextRange range = new TextRange(element.getTextRange().getStartOffset() + 1,
                            element.getTextRange().getEndOffset());
                    holder.createErrorAnnotation(range, "To many arguments");
                }
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
