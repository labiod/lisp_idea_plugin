package com.kgb.lisp.psi;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import com.kgb.lisp.LispLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.psi.LispElementType
 */
public class LispElementType extends IElementType {
    public LispElementType(@NotNull @NonNls String debugName) {
        super(debugName, LispLanguage.INSTANCE);
    }
}
