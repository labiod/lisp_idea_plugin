package com.kgb.lexer.lisp;

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

EOL=\R
WHITE_SPACE=\s

SPACE=[\s\t]+
COMMENT=;.*
NUMBER=[0-9]+(\.[0-9]*)?
STRING=(\"([^\"\\]|\\.)*\")
TRUE=true|t
FALSE=false|f
HASH_SYMBOL=\*[a-zA-Z][a-zA-Z_\-0-9]*\*
MAKE=make-[a-zA-Z][a-zA-Z_\-0-9]*
SYMBOL=[a-zA-Z][a-zA-Z_\-0-9]*
OBJECT_FIELD=\:[a-zA-Z][a-zA-Z_\-0-9]*

%%
<YYINITIAL> {
  {WHITE_SPACE}            { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "="                      { return EQ; }
  "("                      { return LP; }
  ")"                      { return RP; }
  "-"                      { return OBJ_ACCESSOR; }
  "null"                   { return IF_NULL; }
  "nil"                    { return NULL; }
  "+"                      { return OP_1; }
  "-"                      { return OP_2; }
  "*"                      { return OP_3; }
  "/"                      { return OP_4; }
  "!"                      { return OP_5; }
  ">"                      { return OP_6; }
  "<"                      { return OP_7; }
  "'"                      { return QV; }
  "\""                     { return QV2; }
  "loop"                   { return LOOP; }
  "for"                    { return FOR; }
  "in"                     { return IN; }
  "from"                   { return FROM; }
  "downfrom"               { return DOWNFROM; }
  "to"                     { return TO; }
  "upto"                   { return UPTO; }
  "downto"                 { return DOWNTO; }
  "do"                     { return DO; }
  "collect"                { return COLLECT; }
  "defun"                  { return DEFUN; }
  "defstruct"              { return DEFSTRUCT; }
  "defvar"                 { return DEFVAR; }
  "let"                    { return LET; }
  "if"                     { return IF; }
  "car"                    { return CAR; }
  "cdr"                    { return CDR; }
  "setq"                   { return SETQ; }
  "cons"                   { return CONS; }
  "read"                   { return READ; }
  "list"                   { return LIST; }
  "getf"                   { return GETF; }
  "push"                   { return PUSH; }
  "dolist"                 { return DOLIST; }
  "format"                 { return FORMAT; }
  "load"                   { return LOAD; }
  ":conc-name"             { return CONC_NAME_KEY; }
  ":copier"                { return COPIER_KEY; }
  ":constructor"           { return CONSTRUCTOR_KEY; }
  ":include"               { return INCLUDE_KEY; }
  ":initial-offset"        { return INITIAL_OFFSET_KEY; }
  ":named"                 { return NAMED_OPTION_KEY; }
  ":predicate"             { return PREDICATE_KEY; }
  ":print-object"          { return PRINT_OBJECT_KEY; }
  ":print-function"        { return PRINT_FUNCTION_KEY; }
  ":type"                  { return TYPE_KEY; }
  ":read-only"             { return READ_ONLY_KEY; }
  ":initial_element"       { return INITIAL_ELEMENT_KEY; }
  ":initial_contents"      { return INITIAL_CONTENTS_KEY; }
  ":fill_pointer"          { return FILL_POINTER_KEY; }
  ":element-type"          { return ELEMENT_TYPE_KEY; }
  "&optional"              { return LIST_KEYWORDS_1; }
  "&rest"                  { return LIST_KEYWORDS_2; }
  "&aux"                   { return LIST_KEYWORDS_3; }
  "&key"                   { return LIST_KEYWORDS_4; }
  "&allow-othr-keys"       { return LIST_KEYWORDS_5; }
  "LAMBDA"                 { return LAMBDA; }
  "DECLARE"                { return DECLARE; }
  "write"                  { return WRITE; }
  "print"                  { return PRINT; }
  "copier"                 { return COPIER; }
  "object"                 { return OBJECT; }

  {SPACE}                  { return SPACE; }
  {COMMENT}                { return COMMENT; }
  {NUMBER}                 { return NUMBER; }
  {STRING}                 { return STRING; }
  {TRUE}                   { return TRUE; }
  {FALSE}                  { return FALSE; }
  {HASH_SYMBOL}            { return HASH_SYMBOL; }
  {MAKE}                   { return MAKE; }
  {SYMBOL}                 { return SYMBOL; }
  {OBJECT_FIELD}           { return OBJECT_FIELD; }

}

[^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
