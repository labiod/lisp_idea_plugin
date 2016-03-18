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

SPACE=[\s\t]+
COMMENT=;.*
NUMBER=[0-9]+(\.[0-9]*)?
STRING=(\"([^\"\\]|\\.)*\")
PF_NAME=[a-zA-Z][a-zA-Z_\-0-9]*

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "="                { return EQ; }
  "("                { return LP; }
  ")"                { return RP; }
  "true"             { return TRUE; }
  "false"            { return FALSE; }
  "null"             { return IF_NULL; }
  "nil"              { return NULL; }
  "+"                { return OP_1; }
  "-"                { return OP_2; }
  "*"                { return OP_3; }
  "/"                { return OP_4; }
  "!"                { return OP_5; }
  ">"                { return OP_6; }
  "<"                { return OP_7; }
  "'"                { return QV; }
  "loop"             { return LOOP; }
  "for"              { return FOR; }
  "in"               { return IN; }
  "from"             { return FROM; }
  "downfrom"         { return DOWNFROM; }
  "to"               { return TO; }
  "upto"             { return UPTO; }
  "downto"           { return DOWNTO; }
  "do"               { return DO; }
  "collect"          { return COLLECT; }
  "defun"            { return DEFUN; }
  "let"              { return LET; }
  "if"               { return IF; }
  "car"              { return CAR; }
  "cdr"              { return CDR; }
  "setq"             { return SETQ; }
  "cons"             { return CONS; }
  "write"            { return WRITE; }
  "print"            { return PRINT; }

  {SPACE}            { return SPACE; }
  {COMMENT}          { return COMMENT; }
  {NUMBER}           { return NUMBER; }
  {STRING}           { return STRING; }
  {PF_NAME}          { return PF_NAME; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
