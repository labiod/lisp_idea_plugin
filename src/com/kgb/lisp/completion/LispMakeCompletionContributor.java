package com.kgb.lisp.completion;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.lang.ASTNode;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.ProcessingContext;
import com.kgb.lisp.LispLanguage;
import com.kgb.lisp.LispUtil;
import com.kgb.lisp.psi.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.completion.LispMakeCompletionContributor
 */
public class LispMakeCompletionContributor extends CompletionContributor {

    public LispMakeCompletionContributor() {
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(LispTypes.MAKE).withLanguage(LispLanguage.INSTANCE),
                new CompletionProvider<CompletionParameters>() {
                    @Override
                    protected void addCompletions(@NotNull CompletionParameters completionParameters,
                                                  ProcessingContext processingContext,
                                                  @NotNull CompletionResultSet resultSet) {
                        List<String> makesOption = LispUtil.getMakeOption(completionParameters.getEditor().getProject());
                        for(String make : makesOption) {
                            resultSet.addElement(LookupElementBuilder.create(make));
                        }

                    }
                });
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(LispTypes.OBJECT_FIELD).withLanguage(LispLanguage.INSTANCE),
                new CompletionProvider<CompletionParameters>() {
                    @Override
                    protected void addCompletions(@NotNull CompletionParameters completionParameters,
                                                  ProcessingContext processingContext,
                                                  @NotNull CompletionResultSet completionResultSet) {
                        ASTNode node = completionParameters.getPosition().getNode();
                        PsiElement parent;
                        if(node.getTreeParent().getPsi() instanceof LispFile) {
                            parent = node.getPsi();
                            while (!(node.getPsi() instanceof LispFile)) {
                                System.out.println(node);
                                node = node.getTreePrev();
                                if(node == null) {
                                    break;
                                }
                                if(node.getPsi() instanceof LispBlockBody) {
                                    parent = ((LispBlockBody) parent).getMakeDef();
                                    if(parent != null) {
                                        break;
                                    }
                                } else if(node.getElementType() == LispTypes.MAKE) {
                                    parent = node.getPsi();
                                    break;
                                }
                            }
                        } else {
                            parent = completionParameters.getPosition().getNode().getTreeParent().getTreeParent().getPsi();
                        }
                        System.out.println(parent.getNode().getElementType());
                        if(parent instanceof LispMakeDef) {
                            String value =  ((LispMakeDef) parent).getMakeVariant().getText();
                            value = value.substring(5);
                            System.out.println(value);
                            List<LispDefStructure> defStructures = LispUtil.findDefStructures(completionParameters.getEditor().getProject(), value);
                            if(defStructures.size() == 1) {
                                List<LispSlotDescription> slotDescriptions = defStructures.get(0).getSlotDescriptionList();
                                for(LispSlotDescription description : slotDescriptions) {
                                    completionResultSet.addElement(LookupElementBuilder.create(description.getSlotName().getText()));
                                }
                            }
                        } else if(parent.getNode().getElementType() == LispTypes.MAKE) {
                            String value =  parent.getText();
                            value = value.substring(5);
                            System.out.println(value);
                            List<LispDefStructure> defStructures = LispUtil.findDefStructures(completionParameters.getEditor().getProject(), value);
                            if(defStructures.size() == 1) {
                                List<LispSlotDescription> slotDescriptions = defStructures.get(0).getSlotDescriptionList();
                                for(LispSlotDescription description : slotDescriptions) {
                                    completionResultSet.addElement(LookupElementBuilder.create(description.getSlotName().getText()));
                                }
                            }
                        }
                    }
                });
    }
}
