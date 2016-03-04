package com.kgb.lisp.lexer;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;

import java.io.Reader;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.lexer.LispLexerAdapter
 */
public class LispLexerAdapter extends FlexAdapter {
    public LispLexerAdapter() {
        super(new LispLexer(null));
    }
}
