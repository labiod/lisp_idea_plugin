package com.kgb.lisp;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.kgb.lisp.icons.LispIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.LispFileType
 */
public class LispFileType extends LanguageFileType {
    public static final LispFileType INSTANCE = new LispFileType();

    private LispFileType() {
        super(LispLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return LispConstant.LISP_LANG_NAME;
    }

    @NotNull
    @Override
    public String getDescription() {
        return LispConstant.LISP_LANG_DESCRIPTION;
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return LispConstant.LANG_DEFAULT_EXTENSION;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return LispIcons.ICON;
    }
}
