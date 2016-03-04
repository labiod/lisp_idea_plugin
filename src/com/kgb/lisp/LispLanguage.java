package com.kgb.lisp;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.LispLanguage
 */
public class LispLanguage extends Language {
    public static final LispLanguage INSTANCE = new LispLanguage(LispConstant.LANG_ID);

    private LispLanguage(@NotNull @NonNls String ID) {
        super(ID);
    }
}
