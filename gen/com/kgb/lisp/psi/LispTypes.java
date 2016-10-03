// This is a generated file. Not intended for manual editing.
package com.kgb.lisp.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.kgb.lisp.psi.impl.*;

public interface LispTypes {

  IElementType ARG = new LispElementType("ARG");
  IElementType BASE_FUNCTION = new LispElementType("BASE_FUNCTION");
  IElementType BASE_FUNCTION_FORM = new LispElementType("BASE_FUNCTION_FORM");
  IElementType BASIC_TYPE = new LispElementType("BASIC_TYPE");
  IElementType BLOCK_BODY = new LispElementType("BLOCK_BODY");
  IElementType BOOLEAN_VALUE = new LispElementType("BOOLEAN_VALUE");
  IElementType CALL_FUNC = new LispElementType("CALL_FUNC");
  IElementType COLLECT_BLOCK = new LispElementType("COLLECT_BLOCK");
  IElementType CONDITIONS = new LispElementType("CONDITIONS");
  IElementType DECLARATION = new LispElementType("DECLARATION");
  IElementType DEFUN_BLOCK = new LispElementType("DEFUN_BLOCK");
  IElementType DEFUN_VAR = new LispElementType("DEFUN_VAR");
  IElementType DEFVAR_BLOCK = new LispElementType("DEFVAR_BLOCK");
  IElementType DEF_STRUCTURE = new LispElementType("DEF_STRUCTURE");
  IElementType DOCUMENTATION = new LispElementType("DOCUMENTATION");
  IElementType DOLIST_ARG = new LispElementType("DOLIST_ARG");
  IElementType DOLIST_BLOCK = new LispElementType("DOLIST_BLOCK");
  IElementType DOLIST_BODY = new LispElementType("DOLIST_BODY");
  IElementType DO_BLOCK = new LispElementType("DO_BLOCK");
  IElementType ELSE_FORM = new LispElementType("ELSE_FORM");
  IElementType EMPTY_BLOCK = new LispElementType("EMPTY_BLOCK");
  IElementType FILE_PATH = new LispElementType("FILE_PATH");
  IElementType FORM_BODY = new LispElementType("FORM_BODY");
  IElementType FUNC_NAME = new LispElementType("FUNC_NAME");
  IElementType GETF_ARG = new LispElementType("GETF_ARG");
  IElementType GETF_BLOCK = new LispElementType("GETF_BLOCK");
  IElementType GETF_VAR = new LispElementType("GETF_VAR");
  IElementType IF_FORM = new LispElementType("IF_FORM");
  IElementType INT_VAL = new LispElementType("INT_VAL");
  IElementType KEYWORDS = new LispElementType("KEYWORDS");
  IElementType LET_BLOCK = new LispElementType("LET_BLOCK");
  IElementType LET_BODY = new LispElementType("LET_BODY");
  IElementType LET_VAR_BLOCK = new LispElementType("LET_VAR_BLOCK");
  IElementType LIST_ARG = new LispElementType("LIST_ARG");
  IElementType LIST_BLOCK = new LispElementType("LIST_BLOCK");
  IElementType LIST_DEF = new LispElementType("LIST_DEF");
  IElementType LOAD_BLOCK = new LispElementType("LOAD_BLOCK");
  IElementType LOOP_BLOCK = new LispElementType("LOOP_BLOCK");
  IElementType LOOP_FOR_BLOCK = new LispElementType("LOOP_FOR_BLOCK");
  IElementType LOOP_FOR_FROM_BLOCK = new LispElementType("LOOP_FOR_FROM_BLOCK");
  IElementType LOOP_FOR_IN_BLOCK = new LispElementType("LOOP_FOR_IN_BLOCK");
  IElementType MAKE_DEF = new LispElementType("MAKE_DEF");
  IElementType MAKE_VALUES = new LispElementType("MAKE_VALUES");
  IElementType MAKE_VARIANT = new LispElementType("MAKE_VARIANT");
  IElementType OPERATION = new LispElementType("OPERATION");
  IElementType OPERATION_FORM = new LispElementType("OPERATION_FORM");
  IElementType PUSH_BLOCK = new LispElementType("PUSH_BLOCK");
  IElementType SETQ_ARGS = new LispElementType("SETQ_ARGS");
  IElementType SETQ_BLOCK = new LispElementType("SETQ_BLOCK");
  IElementType SLOT_DESCRIPTION = new LispElementType("SLOT_DESCRIPTION");
  IElementType SLOT_NAME = new LispElementType("SLOT_NAME");
  IElementType SLOT_OPTION = new LispElementType("SLOT_OPTION");
  IElementType SPECIAL_FORM = new LispElementType("SPECIAL_FORM");
  IElementType STRING_ARG = new LispElementType("STRING_ARG");
  IElementType STRING_VALUE = new LispElementType("STRING_VALUE");
  IElementType STRUCT_NAME = new LispElementType("STRUCT_NAME");
  IElementType STRUCT_NAME_AND_OPTIONS = new LispElementType("STRUCT_NAME_AND_OPTIONS");
  IElementType STRUCT_OPTION = new LispElementType("STRUCT_OPTION");
  IElementType THEN_FORM = new LispElementType("THEN_FORM");
  IElementType VAR = new LispElementType("VAR");

  IElementType CAR = new LispElementType("car");
  IElementType CDR = new LispElementType("cdr");
  IElementType COLLECT = new LispElementType("collect");
  IElementType COMMENT = new LispElementType("comment");
  IElementType CONC_NAME_KEY = new LispElementType(":conc-name");
  IElementType CONS = new LispElementType("cons");
  IElementType CONSTRUCTOR_KEY = new LispElementType(":constructor");
  IElementType COPIER = new LispElementType("copier");
  IElementType COPIER_KEY = new LispElementType(":copier");
  IElementType DECLARE = new LispElementType("DECLARE");
  IElementType DEFSTRUCT = new LispElementType("defstruct");
  IElementType DEFUN = new LispElementType("defun");
  IElementType DEFVAR = new LispElementType("defvar");
  IElementType DO = new LispElementType("do");
  IElementType DOLIST = new LispElementType("dolist");
  IElementType DOWNFROM = new LispElementType("downfrom");
  IElementType DOWNTO = new LispElementType("downto");
  IElementType ELEMENT_TYPE_KEY = new LispElementType(":element-type");
  IElementType EQ = new LispElementType("=");
  IElementType FALSE = new LispElementType("FALSE");
  IElementType FILL_POINTER_KEY = new LispElementType(":fill_pointer");
  IElementType FOR = new LispElementType("for");
  IElementType FORMAT = new LispElementType("format");
  IElementType FROM = new LispElementType("from");
  IElementType GETF = new LispElementType("getf");
  IElementType HASH_SYMBOL = new LispElementType("hash_symbol");
  IElementType IF = new LispElementType("if");
  IElementType IF_NULL = new LispElementType("null");
  IElementType IN = new LispElementType("in");
  IElementType INCLUDE_KEY = new LispElementType(":include");
  IElementType INITIAL_CONTENTS_KEY = new LispElementType(":initial_contents");
  IElementType INITIAL_ELEMENT_KEY = new LispElementType(":initial_element");
  IElementType INITIAL_OFFSET_KEY = new LispElementType(":initial-offset");
  IElementType LAMBDA = new LispElementType("LAMBDA");
  IElementType LET = new LispElementType("let");
  IElementType LIST = new LispElementType("list");
  IElementType LIST_KEYWORDS_1 = new LispElementType("&optional");
  IElementType LIST_KEYWORDS_2 = new LispElementType("&rest");
  IElementType LIST_KEYWORDS_3 = new LispElementType("&aux");
  IElementType LIST_KEYWORDS_4 = new LispElementType("&key");
  IElementType LIST_KEYWORDS_5 = new LispElementType("&allow-othr-keys");
  IElementType LOAD = new LispElementType("load");
  IElementType LOOP = new LispElementType("loop");
  IElementType LP = new LispElementType("(");
  IElementType MAKE = new LispElementType("MAKE");
  IElementType NAMED_OPTION_KEY = new LispElementType(":named");
  IElementType NULL = new LispElementType("nil");
  IElementType NUMBER = new LispElementType("number");
  IElementType OBJECT = new LispElementType("object");
  IElementType OBJECT_FIELD = new LispElementType("object_field");
  IElementType OP_1 = new LispElementType("OP_1");
  IElementType OP_2 = new LispElementType("OP_2");
  IElementType OP_3 = new LispElementType("OP_3");
  IElementType OP_4 = new LispElementType("OP_4");
  IElementType OP_5 = new LispElementType("OP_5");
  IElementType OP_6 = new LispElementType("OP_6");
  IElementType OP_7 = new LispElementType("OP_7");
  IElementType PREDICATE_KEY = new LispElementType(":predicate");
  IElementType PRINT = new LispElementType("print");
  IElementType PRINT_FUNCTION_KEY = new LispElementType(":print-function");
  IElementType PRINT_OBJECT_KEY = new LispElementType(":print-object");
  IElementType PUSH = new LispElementType("push");
  IElementType QV = new LispElementType("'");
  IElementType QV2 = new LispElementType("\"");
  IElementType READ = new LispElementType("read");
  IElementType READ_ONLY_KEY = new LispElementType(":read-only");
  IElementType RP = new LispElementType(")");
  IElementType SETQ = new LispElementType("SETQ");
  IElementType SPACE = new LispElementType("SPACE");
  IElementType STRING = new LispElementType("string");
  IElementType SYMBOL = new LispElementType("symbol");
  IElementType TO = new LispElementType("to");
  IElementType TRUE = new LispElementType("TRUE");
  IElementType TYPE_KEY = new LispElementType(":type");
  IElementType UPTO = new LispElementType("upto");
  IElementType WRITE = new LispElementType("write");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ARG) {
        return new LispArgImpl(node);
      }
      else if (type == BASE_FUNCTION) {
        return new LispBaseFunctionImpl(node);
      }
      else if (type == BASE_FUNCTION_FORM) {
        return new LispBaseFunctionFormImpl(node);
      }
      else if (type == BASIC_TYPE) {
        return new LispBasicTypeImpl(node);
      }
      else if (type == BLOCK_BODY) {
        return new LispBlockBodyImpl(node);
      }
      else if (type == BOOLEAN_VALUE) {
        return new LispBooleanValueImpl(node);
      }
      else if (type == CALL_FUNC) {
        return new LispCallFuncImpl(node);
      }
      else if (type == COLLECT_BLOCK) {
        return new LispCollectBlockImpl(node);
      }
      else if (type == CONDITIONS) {
        return new LispConditionsImpl(node);
      }
      else if (type == DECLARATION) {
        return new LispDeclarationImpl(node);
      }
      else if (type == DEFUN_BLOCK) {
        return new LispDefunBlockImpl(node);
      }
      else if (type == DEFUN_VAR) {
        return new LispDefunVarImpl(node);
      }
      else if (type == DEFVAR_BLOCK) {
        return new LispDefvarBlockImpl(node);
      }
      else if (type == DEF_STRUCTURE) {
        return new LispDefStructureImpl(node);
      }
      else if (type == DOCUMENTATION) {
        return new LispDocumentationImpl(node);
      }
      else if (type == DOLIST_ARG) {
        return new LispDolistArgImpl(node);
      }
      else if (type == DOLIST_BLOCK) {
        return new LispDolistBlockImpl(node);
      }
      else if (type == DOLIST_BODY) {
        return new LispDolistBodyImpl(node);
      }
      else if (type == DO_BLOCK) {
        return new LispDoBlockImpl(node);
      }
      else if (type == ELSE_FORM) {
        return new LispElseFormImpl(node);
      }
      else if (type == EMPTY_BLOCK) {
        return new LispEmptyBlockImpl(node);
      }
      else if (type == FILE_PATH) {
        return new LispFilePathImpl(node);
      }
      else if (type == FORM_BODY) {
        return new LispFormBodyImpl(node);
      }
      else if (type == FUNC_NAME) {
        return new LispFuncNameImpl(node);
      }
      else if (type == GETF_ARG) {
        return new LispGetfArgImpl(node);
      }
      else if (type == GETF_BLOCK) {
        return new LispGetfBlockImpl(node);
      }
      else if (type == GETF_VAR) {
        return new LispGetfVarImpl(node);
      }
      else if (type == IF_FORM) {
        return new LispIfFormImpl(node);
      }
      else if (type == INT_VAL) {
        return new LispIntValImpl(node);
      }
      else if (type == KEYWORDS) {
        return new LispKeywordsImpl(node);
      }
      else if (type == LET_BLOCK) {
        return new LispLetBlockImpl(node);
      }
      else if (type == LET_BODY) {
        return new LispLetBodyImpl(node);
      }
      else if (type == LET_VAR_BLOCK) {
        return new LispLetVarBlockImpl(node);
      }
      else if (type == LIST_ARG) {
        return new LispListArgImpl(node);
      }
      else if (type == LIST_BLOCK) {
        return new LispListBlockImpl(node);
      }
      else if (type == LIST_DEF) {
        return new LispListDefImpl(node);
      }
      else if (type == LOAD_BLOCK) {
        return new LispLoadBlockImpl(node);
      }
      else if (type == LOOP_BLOCK) {
        return new LispLoopBlockImpl(node);
      }
      else if (type == LOOP_FOR_BLOCK) {
        return new LispLoopForBlockImpl(node);
      }
      else if (type == LOOP_FOR_FROM_BLOCK) {
        return new LispLoopForFromBlockImpl(node);
      }
      else if (type == LOOP_FOR_IN_BLOCK) {
        return new LispLoopForInBlockImpl(node);
      }
      else if (type == MAKE_DEF) {
        return new LispMakeDefImpl(node);
      }
      else if (type == MAKE_VALUES) {
        return new LispMakeValuesImpl(node);
      }
      else if (type == MAKE_VARIANT) {
        return new LispMakeVariantImpl(node);
      }
      else if (type == OPERATION) {
        return new LispOperationImpl(node);
      }
      else if (type == OPERATION_FORM) {
        return new LispOperationFormImpl(node);
      }
      else if (type == PUSH_BLOCK) {
        return new LispPushBlockImpl(node);
      }
      else if (type == SETQ_ARGS) {
        return new LispSetqArgsImpl(node);
      }
      else if (type == SETQ_BLOCK) {
        return new LispSetqBlockImpl(node);
      }
      else if (type == SLOT_DESCRIPTION) {
        return new LispSlotDescriptionImpl(node);
      }
      else if (type == SLOT_NAME) {
        return new LispSlotNameImpl(node);
      }
      else if (type == SLOT_OPTION) {
        return new LispSlotOptionImpl(node);
      }
      else if (type == SPECIAL_FORM) {
        return new LispSpecialFormImpl(node);
      }
      else if (type == STRING_ARG) {
        return new LispStringArgImpl(node);
      }
      else if (type == STRING_VALUE) {
        return new LispStringValueImpl(node);
      }
      else if (type == STRUCT_NAME) {
        return new LispStructNameImpl(node);
      }
      else if (type == STRUCT_NAME_AND_OPTIONS) {
        return new LispStructNameAndOptionsImpl(node);
      }
      else if (type == STRUCT_OPTION) {
        return new LispStructOptionImpl(node);
      }
      else if (type == THEN_FORM) {
        return new LispThenFormImpl(node);
      }
      else if (type == VAR) {
        return new LispVarImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
