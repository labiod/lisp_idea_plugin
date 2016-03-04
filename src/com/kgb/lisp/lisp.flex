package com.kgb.lisp.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.kgb.lisp.psi.LispTypes;
import com.intellij.psi.TokenType;

%%

%class LispLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{
    return;
%eof}

CRLF= \n|\r|\r\n
WHITE_SPACE=[\ \t\f]
END_OF_LINE_COMMENT=("#"|"!")[^\r\n]*
SEPARATOR=[:]
LEFT_PAREN="("
RIGHT_PAREN=")"
ATTRIBUTE="regexp:[\w_\d]+"
WHITE_SPACE=" "
string = \"(test)\"
INTEGER = [123]

KEYWORD_CHARACTER="def"|"defun"
//KEY_CHARACTER=[^:=\ \n\r\t\f\\] | "\\ "

%state WAITING_VALUE


%%

<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return LispTypes.COMMENT; }

<YYINITIAL> {KEYWORD_CHARACTER}                             { yybegin(YYINITIAL); return LispTypes.KEYWORD; }

//<YYINITIAL> {KEY_CHARACTER}+                                { yybegin(YYINITIAL); return LispTypes.KEY; }

<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_VALUE); return LispTypes.SEPARATOR; }

//<YYINITIAL> {LEFT_PAREN}                                     { yybegin(WAITING_VALUE); return LispTypes.LEFT_PAREN; }

//<YYINITIAL> {RIGHT_PAREN}                                     { yybegin(WAITING_VALUE); return LispTypes.RIGHT_PAREN; }

<WAITING_VALUE> {ATTRIBUTE}                                { yybegin(YYINITIAL); return LispTypes.ATTRIBUTE; }

<WAITING_VALUE> {string}                                { yybegin(YYINITIAL); return LispTypes.STRING; }

<WAITING_VALUE> {INTEGER}+                               { yybegin(YYINITIAL); return LispTypes.INTEGER; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

{WHITE_SPACE}+                                              { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

.                                                           { return TokenType.BAD_CHARACTER; }
