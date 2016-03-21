package com.kgb.lisp.annotators;

import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.kgb.lisp.LispUtil;
import com.kgb.lisp.psi.LispArg;
import com.kgb.lisp.psi.LispCallFunc;
import com.kgb.lisp.psi.LispSetqBlock;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.annotators.LispPropertyAnnotator
 */
public class LispPropertyAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {

        if(element instanceof LispCallFunc) {
            LispCallFunc callFunc = (LispCallFunc) element;
            List<LispArg> args = callFunc.getArgList();
            for(LispArg arg : args) {
                if(arg.getVar() != null) {
                    String value = arg.getVar().getText();
                    if (value != null) {
                        Project project = element.getProject();
                        if (value.trim().length() == 0) {
                            return;
                        }
                        String key = value.trim();
                        List<LispSetqBlock> properties = LispUtil.findProperties(project, key);
                        if (properties.size() == 1) {
                            TextRange range = new TextRange(arg.getTextRange().getStartOffset(),
                                    arg.getTextRange().getEndOffset());
                            Annotation annotation = holder.createInfoAnnotation(range, null);
                            annotation.setTextAttributes(DefaultLanguageHighlighterColors.PARAMETER);
                        } else if (properties.size() == 0) {
                            if(!LispUtil.hasPropertyInParent(project, element, key)) {
                                TextRange range = new TextRange(arg.getTextRange().getStartOffset(),
                                        arg.getTextRange().getEndOffset());
                                holder.createErrorAnnotation(range, "Unresolved property");
                            }
                        }
                    }
                }
            }
        } else {

        }
    }
}
