package com.kgb.lisp;

import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import com.kgb.lisp.psi.LispTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class LispBraceMatcher implements PairedBraceMatcher {
    private static BracePair[] PAIR = new BracePair[] {
        new BracePair(LispTypes.LP, LispTypes.RP, false),
    };


    @Override
    public BracePair[] getPairs() {
        return PAIR;
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(@NotNull IElementType iElementType, @Nullable IElementType iElementType1) {
        return true;
    }

    @Override
    public int getCodeConstructStart(PsiFile psiFile, int i) {
        return i;
    }
}
