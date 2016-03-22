package com.kgb.lisp.codestyle;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.kgb.lisp.lexer.LispLexerAdapter;
import com.kgb.lisp.psi.LispTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.codestyle.LispSyntaxHighlighter
 */
public class LispSyntaxHighlighter extends SyntaxHighlighterBase {
    private static final TextAttributesKey SEPARATOR = createTextAttributesKey("LISP_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("LISP_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey VALUE = createTextAttributesKey("LISP_VALUE", DefaultLanguageHighlighterColors.CONSTANT);
    public static final TextAttributesKey ATTRIBUTE = createTextAttributesKey("LISP_ATTRIBUTE", DefaultLanguageHighlighterColors.FUNCTION_CALL);
    public static final TextAttributesKey STRING = createTextAttributesKey("LISP_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey INTEGER = createTextAttributesKey("LISP_INTEGER", DefaultLanguageHighlighterColors.NUMBER);
    private static final TextAttributesKey COMMENT = createTextAttributesKey("LISP_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    private static final TextAttributesKey MULTI_COMMENT = createTextAttributesKey("LISP_MULTI_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    private static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("LISP_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    public static final TextAttributesKey[] BAD_CHARACTER_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    public static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    public static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    public static final TextAttributesKey[] ATTRIBUTES_KEYS = new TextAttributesKey[]{ATTRIBUTE};
    public static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
    public static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    public static final TextAttributesKey[] INTEGER_KEYS = new TextAttributesKey[]{INTEGER};
    public static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT, MULTI_COMMENT};
    public static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new LispLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if(tokenType.equals(LispTypes.EQ)) {
            return SEPARATOR_KEYS;
        } else if(tokenType.equals(LispTypes.DEFUN)
                || tokenType.equals(LispTypes.LET) || tokenType.equals(LispTypes.IF)
                || tokenType.equals(LispTypes.IF_NULL) || tokenType.equals(LispTypes.LOOP)
                || tokenType.equals(LispTypes.FOR) || tokenType.equals(LispTypes.IN)
                || tokenType.equals(LispTypes.DO)  || tokenType.equals(LispTypes.FROM)
                || tokenType.equals(LispTypes.TO)  || tokenType.equals(LispTypes.COLLECT)
                || tokenType.equals(LispTypes.CAR)  || tokenType.equals(LispTypes.CDR)
                || tokenType.equals(LispTypes.SETQ)  || tokenType.equals(LispTypes.CONS)
                || tokenType.equals(LispTypes.OP_1)  || tokenType.equals(LispTypes.OP_2)
                || tokenType.equals(LispTypes.OP_3)  || tokenType.equals(LispTypes.OP_4)
                || tokenType.equals(LispTypes.OP_5)  || tokenType.equals(LispTypes.OP_6)
                || tokenType.equals(LispTypes.OP_7) || tokenType.equals(LispTypes.DEFSTRUCT)
                || tokenType.equals(LispTypes.MAKE) || tokenType.equals(LispTypes.OP_2)
                || tokenType.equals(LispTypes.COPIER_KEY) || tokenType.equals(LispTypes.CONC_NAME_KEY)
                || tokenType.equals(LispTypes.CONSTRUCTOR_KEY) || tokenType.equals(LispTypes.INCLUDE_KEY)
                || tokenType.equals(LispTypes.PRINT_OBJECT_KEY) || tokenType.equals(LispTypes.PRINT_FUNCTION_KEY)
                || tokenType.equals(LispTypes.TYPE_KEY) || tokenType.equals(LispTypes.READ_ONLY_KEY)
                || tokenType.equals(LispTypes.ELEMENT_TYPE_KEY) || tokenType.equals(LispTypes.INITIAL_CONTENTS_KEY)
                || tokenType.equals(LispTypes.INITIAL_ELEMENT_KEY) || tokenType.equals(LispTypes.INITIAL_OFFSET_KEY)
                || tokenType.equals(LispTypes.FILL_POINTER_KEY) || tokenType.equals(LispTypes.NAMED_OPTION_KEY)
                ) {
            return KEYWORD_KEYS;
        } else if(tokenType.equals(LispTypes.COMMENT)) {
            return COMMENT_KEYS;
        } else if(tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHARACTER_KEYS;
        } else if(tokenType.equals(LispTypes.STRING)) {
            return STRING_KEYS;
        } else if(tokenType.equals(LispTypes.NUMBER)) {
            return INTEGER_KEYS;
        } else if(tokenType.equals(LispTypes.SYMBOL)) {
            return ATTRIBUTES_KEYS;
        } else if(tokenType.equals(LispTypes.NULL)
                || tokenType.equals(LispTypes.TRUE) || tokenType.equals(LispTypes.FALSE)
                ) {
            return VALUE_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }

}
