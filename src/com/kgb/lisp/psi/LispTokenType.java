package com.kgb.lisp.psi;

import com.intellij.psi.tree.IElementType;
import com.kgb.lisp.LispLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.psi.LispTokenType
 */
public class LispTokenType extends IElementType {
    public LispTokenType(@NotNull @NonNls String debugName) {
        super(debugName, LispLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "LispTokenType." + super.toString();
    }
}
