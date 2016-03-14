package com.kgb.lisp.lexer;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.kgb.lisp.psi.LispTypes.*;

%%

%{
  public LispLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class LispLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

SPACE=[\s\n\t\r]+
COMMENT="//".*
NUMBER=[0-9]+(\.[0-9]*)?
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")
KEYWORD=(do)|(loop)|(in)|(for)|(let)
PROPERTY_NAME=[a-zA-Z][a-zA-Z_\-0-9]*

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return com.intellij.psi.TokenType.WHITE_SPACE; }

  ";"                  { return SEMI; }
  "="                  { return EQ; }
  "("                  { return LP; }
  ")"                  { return RP; }
  "+"                  { return OP_1; }
  "-"                  { return OP_2; }
  "*"                  { return OP_3; }
  "/"                  { return OP_4; }
  "!"                  { return OP_5; }
  "defun"              { return DEFUN; }
  "let"                { return LET; }

  {SPACE}              { return SPACE; }
  {COMMENT}            { return COMMENT; }
  {NUMBER}             { return NUMBER; }
  {STRING}             { return STRING; }
  {KEYWORD}            { return KEYWORD; }
  {PROPERTY_NAME}      { return PROPERTY_NAME; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
