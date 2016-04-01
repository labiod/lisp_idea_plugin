package com.kgb.lisp.completion;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import com.intellij.util.ProcessingContext;
import com.kgb.lisp.LispLanguage;
import com.kgb.lisp.LispUtil;
import com.kgb.lisp.psi.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.completion.LispCompletionContributor
 */
public class LispCompletionContributor extends CompletionContributor {
    public LispCompletionContributor() {
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(LispTypes.SYMBOL).withLanguage(LispLanguage.INSTANCE),
                new CompletionProvider<CompletionParameters>() {
                    @Override
                    protected void addCompletions(@NotNull CompletionParameters completionParameters, ProcessingContext processingContext, @NotNull CompletionResultSet resultSet) {
                        PsiElement parent = completionParameters.getPosition().getParent();
                        if(parent instanceof LispFuncName) {
                            List<String> baseMethods = LispUtil.getBaseMethodName();
                            for(String method : baseMethods) {
                                resultSet.addElement(LookupElementBuilder.create(method));
                            }
                            List<LispDefunBlock> defFunctions = LispUtil.findDefFunctions(completionParameters.getEditor().getProject());
                            for(LispDefunBlock fun : defFunctions) {
                                resultSet.addElement(LookupElementBuilder.create(fun.getFuncName().getText()));
                            }
                        } else if(parent instanceof LispVar) {
                            List<String> vars = LispUtil.getAllProperty(completionParameters.getEditor().getProject());
                            for(String var : vars) {
                                resultSet.addElement(LookupElementBuilder.create(var));
                            }
                        } else {
                            resultSet.addElement(LookupElementBuilder.create("something"));
                        }
                        List<String> makesOption = LispUtil.getMakeOption(completionParameters.getEditor().getProject());
                        for(String make : makesOption) {
                            resultSet.addElement(LookupElementBuilder.create(make));
                        }
                    }
                });
    }


}
