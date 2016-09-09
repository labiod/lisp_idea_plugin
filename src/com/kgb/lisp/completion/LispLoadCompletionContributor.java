package com.kgb.lisp.completion;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import com.kgb.lisp.LispUtil;
import com.kgb.lisp.psi.LispLoadBlock;
import com.kgb.lisp.psi.LispTypes;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class LispLoadCompletionContributor extends CompletionContributor {

    public LispLoadCompletionContributor() {
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(LispTypes.STRING), new CompletionProvider<CompletionParameters>() {
            @Override
            protected void addCompletions(@NotNull CompletionParameters completionParameters, ProcessingContext processingContext, @NotNull CompletionResultSet completionResultSet) {
                ASTNode parent = completionParameters.getPosition().getParent().getNode().getTreeParent();
                Project project = completionParameters.getEditor().getProject();
                if(parent.getPsi() instanceof LispLoadBlock && project != null) {
                    Collection<VirtualFile> files = LispUtil.getAllLispFiles(completionParameters.getEditor().getProject());
                    //                            String path = file.getPath().substring(basePath.length() + 1);
                    files.stream()
                            .filter(file -> !completionParameters.getOriginalFile().getVirtualFile().getPath().equals(file.getPath()))
                            .forEach(file -> {
                        String path = file.getPath();
//                            String path = file.getPath().substring(basePath.length() + 1);
                        completionResultSet.addElement(LookupElementBuilder.create(path));
                    });
                }
            }
        });
    }
}
