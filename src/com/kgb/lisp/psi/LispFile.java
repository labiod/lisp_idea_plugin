package com.kgb.lisp.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.kgb.lisp.LispFileType;
import com.kgb.lisp.LispLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.psi.LispFile
 */
public class LispFile extends PsiFileBase {
    public LispFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, LispLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return LispFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Lisp File";
    }

    @Nullable
    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
