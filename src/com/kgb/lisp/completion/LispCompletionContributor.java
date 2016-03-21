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
        System.out.println("create completion");
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(LispTypes.PF_NAME).withLanguage(LispLanguage.INSTANCE),
                new CompletionProvider<CompletionParameters>() {
                    @Override
                    protected void addCompletions(@NotNull CompletionParameters completionParameters, ProcessingContext processingContext, @NotNull CompletionResultSet resultSet) {
                        PsiElement parent = completionParameters.getPosition().getParent();
                        if(parent instanceof LispFuncName) {
                            List<String> baseMethods = LispUtil.getBaseMethodName();
                            for(String method : baseMethods) {
                                resultSet.addElement(LookupElementBuilder.create(method));
                            }
                            List<LispDefFun> defFunctions = LispUtil.findDefFunctions(completionParameters.getEditor().getProject());
                            for(LispDefFun fun : defFunctions) {
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

                    }
                });
    }


}
