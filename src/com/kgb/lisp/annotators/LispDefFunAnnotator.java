package com.kgb.lisp.annotators;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.kgb.lisp.LispUtil;
import com.kgb.lisp.psi.*;
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
        if (value != null && element instanceof LispCallFunc) {
            ASTNode funNameElement = element.getNode().findChildByType(LispTypes.FUNC_NAME);
            if(funNameElement == null) {
                return;
            }
            String key = funNameElement.getText();
            List<LispDefunBlock> defFunItemList = LispUtil.findDefFunctions((LispFile) element.getContainingFile(), key);
            LispFuncName funcName = ((LispCallFunc) element).getFuncName();
            if (defFunItemList.size() == 1) {
                LispDefunBlock functionDef = defFunItemList.get(0);
                int argCount = ((LispCallFunc)element).getArgList().size();
                if(argCount == functionDef.getDefunVarList().size()) {
                    TextRange range = new TextRange(funcName.getTextRange().getStartOffset(),
                            funcName.getTextRange().getEndOffset());
                    Annotation annotation = holder.createInfoAnnotation(range, null);
                    annotation.setTextAttributes(DefaultLanguageHighlighterColors.FUNCTION_CALL);
                } else if(argCount < functionDef.getDefunVarList().size()) {
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
