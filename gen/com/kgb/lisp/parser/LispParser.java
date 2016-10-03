// This is a generated file. Not intended for manual editing.
package com.kgb.lisp.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.kgb.lisp.psi.LispTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class LispParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ARG) {
      r = arg(b, 0);
    }
    else if (t == BASE_FUNCTION) {
      r = base_function(b, 0);
    }
    else if (t == BASE_FUNCTION_FORM) {
      r = base_function_form(b, 0);
    }
    else if (t == BASIC_TYPE) {
      r = basic_type(b, 0);
    }
    else if (t == BLOCK_BODY) {
      r = block_body(b, 0);
    }
    else if (t == BOOLEAN_VALUE) {
      r = boolean_value(b, 0);
    }
    else if (t == CALL_FUNC) {
      r = call_func(b, 0);
    }
    else if (t == COLLECT_BLOCK) {
      r = collect_block(b, 0);
    }
    else if (t == CONDITIONS) {
      r = conditions(b, 0);
    }
    else if (t == DECLARATION) {
      r = declaration(b, 0);
    }
    else if (t == DEF_STRUCTURE) {
      r = def_structure(b, 0);
    }
    else if (t == DEFUN_BLOCK) {
      r = defun_block(b, 0);
    }
    else if (t == DEFUN_VAR) {
      r = defun_var(b, 0);
    }
    else if (t == DEFVAR_BLOCK) {
      r = defvar_block(b, 0);
    }
    else if (t == DO_BLOCK) {
      r = do_block(b, 0);
    }
    else if (t == DOCUMENTATION) {
      r = documentation(b, 0);
    }
    else if (t == DOLIST_ARG) {
      r = dolist_arg(b, 0);
    }
    else if (t == DOLIST_BLOCK) {
      r = dolist_block(b, 0);
    }
    else if (t == DOLIST_BODY) {
      r = dolist_body(b, 0);
    }
    else if (t == ELSE_FORM) {
      r = else_form(b, 0);
    }
    else if (t == EMPTY_BLOCK) {
      r = empty_block(b, 0);
    }
    else if (t == FILE_PATH) {
      r = file_path(b, 0);
    }
    else if (t == FORM_BODY) {
      r = form_body(b, 0);
    }
    else if (t == FUNC_NAME) {
      r = func_name(b, 0);
    }
    else if (t == GETF_ARG) {
      r = getf_arg(b, 0);
    }
    else if (t == GETF_BLOCK) {
      r = getf_block(b, 0);
    }
    else if (t == GETF_VAR) {
      r = getf_var(b, 0);
    }
    else if (t == IF_FORM) {
      r = if_form(b, 0);
    }
    else if (t == INT_VAL) {
      r = int_val(b, 0);
    }
    else if (t == KEYWORDS) {
      r = keywords(b, 0);
    }
    else if (t == LET_BLOCK) {
      r = let_block(b, 0);
    }
    else if (t == LET_BODY) {
      r = let_body(b, 0);
    }
    else if (t == LET_VAR_BLOCK) {
      r = let_var_block(b, 0);
    }
    else if (t == LIST_ARG) {
      r = list_arg(b, 0);
    }
    else if (t == LIST_BLOCK) {
      r = list_block(b, 0);
    }
    else if (t == LIST_DEF) {
      r = list_def(b, 0);
    }
    else if (t == LOAD_BLOCK) {
      r = load_block(b, 0);
    }
    else if (t == LOOP_BLOCK) {
      r = loop_block(b, 0);
    }
    else if (t == LOOP_FOR_BLOCK) {
      r = loop_for_block(b, 0);
    }
    else if (t == LOOP_FOR_FROM_BLOCK) {
      r = loop_for_from_block(b, 0);
    }
    else if (t == LOOP_FOR_IN_BLOCK) {
      r = loop_for_in_block(b, 0);
    }
    else if (t == MAKE_DEF) {
      r = make_def(b, 0);
    }
    else if (t == MAKE_VALUES) {
      r = make_values(b, 0);
    }
    else if (t == MAKE_VARIANT) {
      r = make_variant(b, 0);
    }
    else if (t == OPERATION) {
      r = operation(b, 0);
    }
    else if (t == OPERATION_FORM) {
      r = operation_form(b, 0);
    }
    else if (t == PUSH_BLOCK) {
      r = push_block(b, 0);
    }
    else if (t == SETQ_ARGS) {
      r = setq_args(b, 0);
    }
    else if (t == SETQ_BLOCK) {
      r = setq_block(b, 0);
    }
    else if (t == SLOT_DESCRIPTION) {
      r = slot_description(b, 0);
    }
    else if (t == SLOT_NAME) {
      r = slot_name(b, 0);
    }
    else if (t == SLOT_OPTION) {
      r = slot_option(b, 0);
    }
    else if (t == SPECIAL_FORM) {
      r = special_form(b, 0);
    }
    else if (t == STRING_ARG) {
      r = string_arg(b, 0);
    }
    else if (t == STRING_VALUE) {
      r = string_value(b, 0);
    }
    else if (t == STRUCT_NAME) {
      r = struct_name(b, 0);
    }
    else if (t == STRUCT_NAME_AND_OPTIONS) {
      r = struct_name_and_options(b, 0);
    }
    else if (t == STRUCT_OPTION) {
      r = struct_option(b, 0);
    }
    else if (t == THEN_FORM) {
      r = then_form(b, 0);
    }
    else if (t == VAR) {
      r = var(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // var | string_value | make_def | call_func | basic_type | hash_symbol | special_form | object_field
  public static boolean arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARG, "<arg>");
    r = var(b, l + 1);
    if (!r) r = string_value(b, l + 1);
    if (!r) r = make_def(b, l + 1);
    if (!r) r = call_func(b, l + 1);
    if (!r) r = basic_type(b, l + 1);
    if (!r) r = consumeToken(b, HASH_SYMBOL);
    if (!r) r = special_form(b, l + 1);
    if (!r) r = consumeToken(b, OBJECT_FIELD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // write | print | operation | car | cdr | cons | read | list | getf | format
  public static boolean base_function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_function")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASE_FUNCTION, "<base function>");
    r = consumeToken(b, WRITE);
    if (!r) r = consumeToken(b, PRINT);
    if (!r) r = operation(b, l + 1);
    if (!r) r = consumeToken(b, CAR);
    if (!r) r = consumeToken(b, CDR);
    if (!r) r = consumeToken(b, CONS);
    if (!r) r = consumeToken(b, READ);
    if (!r) r = consumeToken(b, LIST);
    if (!r) r = consumeToken(b, GETF);
    if (!r) r = consumeToken(b, FORMAT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LP SPACE* base_function SPACE* arg* SPACE* RP
  public static boolean base_function_form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_function_form")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && base_function_form_1(b, l + 1);
    r = r && base_function(b, l + 1);
    r = r && base_function_form_3(b, l + 1);
    r = r && base_function_form_4(b, l + 1);
    r = r && base_function_form_5(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, BASE_FUNCTION_FORM, r);
    return r;
  }

  // SPACE*
  private static boolean base_function_form_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_function_form_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "base_function_form_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean base_function_form_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_function_form_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "base_function_form_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // arg*
  private static boolean base_function_form_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_function_form_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!arg(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "base_function_form_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean base_function_form_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_function_form_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "base_function_form_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // number | string | boolean_value | NULL | string_value | list_def | hash_symbol
  public static boolean basic_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASIC_TYPE, "<basic type>");
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = boolean_value(b, l + 1);
    if (!r) r = consumeToken(b, NULL);
    if (!r) r = string_value(b, l + 1);
    if (!r) r = list_def(b, l + 1);
    if (!r) r = consumeToken(b, HASH_SYMBOL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // defun_block | special_form | call_func | empty_block | if_form | def_structure | make_def
  //             | symbol | basic_type
  public static boolean block_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_BODY, "<block body>");
    r = defun_block(b, l + 1);
    if (!r) r = special_form(b, l + 1);
    if (!r) r = call_func(b, l + 1);
    if (!r) r = empty_block(b, l + 1);
    if (!r) r = if_form(b, l + 1);
    if (!r) r = def_structure(b, l + 1);
    if (!r) r = make_def(b, l + 1);
    if (!r) r = consumeToken(b, SYMBOL);
    if (!r) r = basic_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LP SPACE* lambda_list_keyword? SPACE* lambda_field SPACE* RP
  static boolean boa_lambda_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boa_lambda_list")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && boa_lambda_list_1(b, l + 1);
    r = r && boa_lambda_list_2(b, l + 1);
    r = r && boa_lambda_list_3(b, l + 1);
    r = r && lambda_field(b, l + 1);
    r = r && boa_lambda_list_5(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean boa_lambda_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boa_lambda_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "boa_lambda_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // lambda_list_keyword?
  private static boolean boa_lambda_list_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boa_lambda_list_2")) return false;
    lambda_list_keyword(b, l + 1);
    return true;
  }

  // SPACE*
  private static boolean boa_lambda_list_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boa_lambda_list_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "boa_lambda_list_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean boa_lambda_list_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boa_lambda_list_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "boa_lambda_list_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TRUE | FALSE
  public static boolean boolean_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_value")) return false;
    if (!nextTokenIs(b, "<boolean value>", FALSE, TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_VALUE, "<boolean value>");
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LP SPACE* func_name SPACE* arg* SPACE* RP
  public static boolean call_func(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_func")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CALL_FUNC, null);
    r = consumeToken(b, LP);
    r = r && call_func_1(b, l + 1);
    r = r && func_name(b, l + 1);
    p = r; // pin = 3
    r = r && report_error_(b, call_func_3(b, l + 1));
    r = p && report_error_(b, call_func_4(b, l + 1)) && r;
    r = p && report_error_(b, call_func_5(b, l + 1)) && r;
    r = p && consumeToken(b, RP) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // SPACE*
  private static boolean call_func_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_func_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "call_func_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean call_func_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_func_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "call_func_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // arg*
  private static boolean call_func_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_func_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!arg(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "call_func_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean call_func_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_func_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "call_func_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // COLLECT SPACE* (form_body | arg)
  public static boolean collect_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collect_block")) return false;
    if (!nextTokenIs(b, COLLECT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLLECT);
    r = r && collect_block_1(b, l + 1);
    r = r && collect_block_2(b, l + 1);
    exit_section_(b, m, COLLECT_BLOCK, r);
    return r;
  }

  // SPACE*
  private static boolean collect_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collect_block_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "collect_block_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // form_body | arg
  private static boolean collect_block_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collect_block_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = form_body(b, l + 1);
    if (!r) r = arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // conc_name_key | (LP SPACE* conc_name_key SPACE* RP) | (LP SPACE* conc_name_key SPACE* conc_name_value SPACE*RP)
  static boolean conc_name_option(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conc_name_option")) return false;
    if (!nextTokenIs(b, "", LP, CONC_NAME_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONC_NAME_KEY);
    if (!r) r = conc_name_option_1(b, l + 1);
    if (!r) r = conc_name_option_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LP SPACE* conc_name_key SPACE* RP
  private static boolean conc_name_option_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conc_name_option_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && conc_name_option_1_1(b, l + 1);
    r = r && consumeToken(b, CONC_NAME_KEY);
    r = r && conc_name_option_1_3(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean conc_name_option_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conc_name_option_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "conc_name_option_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean conc_name_option_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conc_name_option_1_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "conc_name_option_1_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // LP SPACE* conc_name_key SPACE* conc_name_value SPACE*RP
  private static boolean conc_name_option_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conc_name_option_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && conc_name_option_2_1(b, l + 1);
    r = r && consumeToken(b, CONC_NAME_KEY);
    r = r && conc_name_option_2_3(b, l + 1);
    r = r && conc_name_value(b, l + 1);
    r = r && conc_name_option_2_5(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean conc_name_option_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conc_name_option_2_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "conc_name_option_2_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean conc_name_option_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conc_name_option_2_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "conc_name_option_2_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean conc_name_option_2_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conc_name_option_2_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "conc_name_option_2_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // symbol
  static boolean conc_name_value(PsiBuilder b, int l) {
    return consumeToken(b, SYMBOL);
  }

  /* ********************************************************** */
  // (LP SPACE* IF_NULL SPACE* var SPACE* RP) | operation_form | var
  public static boolean conditions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditions")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONS, "<conditions>");
    r = conditions_0(b, l + 1);
    if (!r) r = operation_form(b, l + 1);
    if (!r) r = var(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LP SPACE* IF_NULL SPACE* var SPACE* RP
  private static boolean conditions_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditions_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && conditions_0_1(b, l + 1);
    r = r && consumeToken(b, IF_NULL);
    r = r && conditions_0_3(b, l + 1);
    r = r && var(b, l + 1);
    r = r && conditions_0_5(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean conditions_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditions_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "conditions_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean conditions_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditions_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "conditions_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean conditions_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditions_0_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "conditions_0_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // boa_lambda_list
  static boolean constructor_arglist(PsiBuilder b, int l) {
    return boa_lambda_list(b, l + 1);
  }

  /* ********************************************************** */
  // symbol
  static boolean constructor_name(PsiBuilder b, int l) {
    return consumeToken(b, SYMBOL);
  }

  /* ********************************************************** */
  // constructor_key | (LP SPACE* constructor_key SPACE* RP)
  //                             | (LP SPACE* constructor_key SPACE* constructor_name SPACE* RP)
  //                             | (LP SPACE* constructor_key SPACE* constructor_name SPACE* constructor_arglist SPACE* RP)
  static boolean constructor_option(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_option")) return false;
    if (!nextTokenIs(b, "", LP, CONSTRUCTOR_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONSTRUCTOR_KEY);
    if (!r) r = constructor_option_1(b, l + 1);
    if (!r) r = constructor_option_2(b, l + 1);
    if (!r) r = constructor_option_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LP SPACE* constructor_key SPACE* RP
  private static boolean constructor_option_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_option_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && constructor_option_1_1(b, l + 1);
    r = r && consumeToken(b, CONSTRUCTOR_KEY);
    r = r && constructor_option_1_3(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean constructor_option_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_option_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "constructor_option_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean constructor_option_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_option_1_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "constructor_option_1_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // LP SPACE* constructor_key SPACE* constructor_name SPACE* RP
  private static boolean constructor_option_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_option_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && constructor_option_2_1(b, l + 1);
    r = r && consumeToken(b, CONSTRUCTOR_KEY);
    r = r && constructor_option_2_3(b, l + 1);
    r = r && constructor_name(b, l + 1);
    r = r && constructor_option_2_5(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean constructor_option_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_option_2_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "constructor_option_2_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean constructor_option_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_option_2_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "constructor_option_2_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean constructor_option_2_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_option_2_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "constructor_option_2_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // LP SPACE* constructor_key SPACE* constructor_name SPACE* constructor_arglist SPACE* RP
  private static boolean constructor_option_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_option_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && constructor_option_3_1(b, l + 1);
    r = r && consumeToken(b, CONSTRUCTOR_KEY);
    r = r && constructor_option_3_3(b, l + 1);
    r = r && constructor_name(b, l + 1);
    r = r && constructor_option_3_5(b, l + 1);
    r = r && constructor_arglist(b, l + 1);
    r = r && constructor_option_3_7(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean constructor_option_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_option_3_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "constructor_option_3_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean constructor_option_3_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_option_3_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "constructor_option_3_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean constructor_option_3_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_option_3_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "constructor_option_3_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean constructor_option_3_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_option_3_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "constructor_option_3_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // symbol
  static boolean copier_name(PsiBuilder b, int l) {
    return consumeToken(b, SYMBOL);
  }

  /* ********************************************************** */
  // copier_key | (LP SPACE* copier SPACE* copier_name? SPACE* RP)
  static boolean copier_option(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "copier_option")) return false;
    if (!nextTokenIs(b, "", LP, COPIER_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COPIER_KEY);
    if (!r) r = copier_option_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LP SPACE* copier SPACE* copier_name? SPACE* RP
  private static boolean copier_option_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "copier_option_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && copier_option_1_1(b, l + 1);
    r = r && consumeToken(b, COPIER);
    r = r && copier_option_1_3(b, l + 1);
    r = r && copier_option_1_4(b, l + 1);
    r = r && copier_option_1_5(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean copier_option_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "copier_option_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "copier_option_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean copier_option_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "copier_option_1_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "copier_option_1_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // copier_name?
  private static boolean copier_option_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "copier_option_1_4")) return false;
    copier_name(b, l + 1);
    return true;
  }

  // SPACE*
  private static boolean copier_option_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "copier_option_1_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "copier_option_1_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // LP SPACE* DECLARE SPACE* declare_body* SPACE* RP
  public static boolean declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && declaration_1(b, l + 1);
    r = r && consumeToken(b, DECLARE);
    r = r && declaration_3(b, l + 1);
    r = r && declaration_4(b, l + 1);
    r = r && declaration_5(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, DECLARATION, r);
    return r;
  }

  // SPACE*
  private static boolean declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "declaration_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "declaration_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // declare_body*
  private static boolean declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!declare_body(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declaration_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "declaration_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // LP SPACE* var SPACE* arg SPACE* RP
  static boolean declare_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_body")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && declare_body_1(b, l + 1);
    r = r && var(b, l + 1);
    r = r && declare_body_3(b, l + 1);
    r = r && arg(b, l + 1);
    r = r && declare_body_5(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean declare_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_body_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "declare_body_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean declare_body_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_body_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "declare_body_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean declare_body_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_body_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "declare_body_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // LP SPACE* DEFSTRUCT SPACE* struct_name_and_options SPACE* documentation? SPACE* slot_description* SPACE* RP
  public static boolean def_structure(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_structure")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && def_structure_1(b, l + 1);
    r = r && consumeToken(b, DEFSTRUCT);
    r = r && def_structure_3(b, l + 1);
    r = r && struct_name_and_options(b, l + 1);
    r = r && def_structure_5(b, l + 1);
    r = r && def_structure_6(b, l + 1);
    r = r && def_structure_7(b, l + 1);
    r = r && def_structure_8(b, l + 1);
    r = r && def_structure_9(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, DEF_STRUCTURE, r);
    return r;
  }

  // SPACE*
  private static boolean def_structure_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_structure_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "def_structure_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean def_structure_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_structure_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "def_structure_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean def_structure_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_structure_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "def_structure_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // documentation?
  private static boolean def_structure_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_structure_6")) return false;
    documentation(b, l + 1);
    return true;
  }

  // SPACE*
  private static boolean def_structure_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_structure_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "def_structure_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // slot_description*
  private static boolean def_structure_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_structure_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!slot_description(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "def_structure_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean def_structure_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_structure_9")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "def_structure_9", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // LP SPACE* DEFUN SPACE* func_name SPACE* LP SPACE* defun_var* SPACE* RP SPACE* documentation? SPACE* form_body+ SPACE* RP
  public static boolean defun_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defun_block")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && defun_block_1(b, l + 1);
    r = r && consumeToken(b, DEFUN);
    r = r && defun_block_3(b, l + 1);
    r = r && func_name(b, l + 1);
    r = r && defun_block_5(b, l + 1);
    r = r && consumeToken(b, LP);
    r = r && defun_block_7(b, l + 1);
    r = r && defun_block_8(b, l + 1);
    r = r && defun_block_9(b, l + 1);
    r = r && consumeToken(b, RP);
    r = r && defun_block_11(b, l + 1);
    r = r && defun_block_12(b, l + 1);
    r = r && defun_block_13(b, l + 1);
    r = r && defun_block_14(b, l + 1);
    r = r && defun_block_15(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, DEFUN_BLOCK, r);
    return r;
  }

  // SPACE*
  private static boolean defun_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defun_block_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "defun_block_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean defun_block_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defun_block_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "defun_block_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean defun_block_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defun_block_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "defun_block_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean defun_block_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defun_block_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "defun_block_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // defun_var*
  private static boolean defun_block_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defun_block_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!defun_var(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "defun_block_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean defun_block_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defun_block_9")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "defun_block_9", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean defun_block_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defun_block_11")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "defun_block_11", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // documentation?
  private static boolean defun_block_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defun_block_12")) return false;
    documentation(b, l + 1);
    return true;
  }

  // SPACE*
  private static boolean defun_block_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defun_block_13")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "defun_block_13", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // form_body+
  private static boolean defun_block_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defun_block_14")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = form_body(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!form_body(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "defun_block_14", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean defun_block_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defun_block_15")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "defun_block_15", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // symbol
  public static boolean defun_var(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defun_var")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, DEFUN_VAR, r);
    return r;
  }

  /* ********************************************************** */
  // LP SPACE* DEFVAR SPACE* setq_args* SPACE* RP
  public static boolean defvar_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defvar_block")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && defvar_block_1(b, l + 1);
    r = r && consumeToken(b, DEFVAR);
    r = r && defvar_block_3(b, l + 1);
    r = r && defvar_block_4(b, l + 1);
    r = r && defvar_block_5(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, DEFVAR_BLOCK, r);
    return r;
  }

  // SPACE*
  private static boolean defvar_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defvar_block_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "defvar_block_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean defvar_block_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defvar_block_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "defvar_block_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // setq_args*
  private static boolean defvar_block_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defvar_block_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!setq_args(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "defvar_block_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean defvar_block_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defvar_block_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "defvar_block_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // DO SPACE* form_body+
  public static boolean do_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_block")) return false;
    if (!nextTokenIs(b, DO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DO);
    r = r && do_block_1(b, l + 1);
    r = r && do_block_2(b, l + 1);
    exit_section_(b, m, DO_BLOCK, r);
    return r;
  }

  // SPACE*
  private static boolean do_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_block_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "do_block_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // form_body+
  private static boolean do_block_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_block_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = form_body(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!form_body(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "do_block_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // string
  public static boolean documentation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "documentation")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    exit_section_(b, m, DOCUMENTATION, r);
    return r;
  }

  /* ********************************************************** */
  // LP SPACE* var SPACE* arg SPACE* RP
  public static boolean dolist_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dolist_arg")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && dolist_arg_1(b, l + 1);
    r = r && var(b, l + 1);
    r = r && dolist_arg_3(b, l + 1);
    r = r && arg(b, l + 1);
    r = r && dolist_arg_5(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, DOLIST_ARG, r);
    return r;
  }

  // SPACE*
  private static boolean dolist_arg_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dolist_arg_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "dolist_arg_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean dolist_arg_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dolist_arg_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "dolist_arg_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean dolist_arg_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dolist_arg_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "dolist_arg_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // LP SPACE* dolist SPACE* dolist_arg SPACE* dolist_body SPACE* RP
  public static boolean dolist_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dolist_block")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && dolist_block_1(b, l + 1);
    r = r && consumeToken(b, DOLIST);
    r = r && dolist_block_3(b, l + 1);
    r = r && dolist_arg(b, l + 1);
    r = r && dolist_block_5(b, l + 1);
    r = r && dolist_body(b, l + 1);
    r = r && dolist_block_7(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, DOLIST_BLOCK, r);
    return r;
  }

  // SPACE*
  private static boolean dolist_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dolist_block_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "dolist_block_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean dolist_block_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dolist_block_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "dolist_block_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean dolist_block_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dolist_block_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "dolist_block_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean dolist_block_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dolist_block_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "dolist_block_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // block_body*
  public static boolean dolist_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dolist_body")) return false;
    Marker m = enter_section_(b, l, _NONE_, DOLIST_BODY, "<dolist body>");
    int c = current_position_(b);
    while (true) {
      if (!block_body(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dolist_body", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // element_type_key SPACE* type
  static boolean element_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_type")) return false;
    if (!nextTokenIs(b, ELEMENT_TYPE_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELEMENT_TYPE_KEY);
    r = r && element_type_1(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean element_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_type_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "element_type_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // block_body | arg
  public static boolean else_form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_form")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELSE_FORM, "<else form>");
    r = block_body(b, l + 1);
    if (!r) r = arg(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LP SPACE* RP
  public static boolean empty_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "empty_block")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && empty_block_1(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, EMPTY_BLOCK, r);
    return r;
  }

  // SPACE*
  private static boolean empty_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "empty_block_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "empty_block_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // base_function | symbol | string_value | call_func
  static boolean field_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_value")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = base_function(b, l + 1);
    if (!r) r = consumeToken(b, SYMBOL);
    if (!r) r = string_value(b, l + 1);
    if (!r) r = call_func(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // string
  public static boolean file_path(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_path")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    exit_section_(b, m, FILE_PATH, r);
    return r;
  }

  /* ********************************************************** */
  // fill_pointer_key SPACE*
  static boolean fill_pointer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fill_pointer")) return false;
    if (!nextTokenIs(b, FILL_POINTER_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FILL_POINTER_KEY);
    r = r && fill_pointer_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean fill_pointer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fill_pointer_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "fill_pointer_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // block_body | (LP SPACE* RP)
  public static boolean form_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "form_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORM_BODY, "<form body>");
    r = block_body(b, l + 1);
    if (!r) r = form_body_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LP SPACE* RP
  private static boolean form_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "form_body_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && form_body_1_1(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean form_body_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "form_body_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "form_body_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // symbol
  public static boolean func_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_name")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, FUNC_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // symbol | object_field | call_func | special_form | list_def
  public static boolean getf_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getf_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GETF_ARG, "<getf arg>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, OBJECT_FIELD);
    if (!r) r = call_func(b, l + 1);
    if (!r) r = special_form(b, l + 1);
    if (!r) r = list_def(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LP SPACE* getf SPACE* getf_arg SPACE* getf_var SPACE* RP
  public static boolean getf_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getf_block")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && getf_block_1(b, l + 1);
    r = r && consumeToken(b, GETF);
    r = r && getf_block_3(b, l + 1);
    r = r && getf_arg(b, l + 1);
    r = r && getf_block_5(b, l + 1);
    r = r && getf_var(b, l + 1);
    r = r && getf_block_7(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, GETF_BLOCK, r);
    return r;
  }

  // SPACE*
  private static boolean getf_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getf_block_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "getf_block_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean getf_block_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getf_block_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "getf_block_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean getf_block_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getf_block_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "getf_block_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean getf_block_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getf_block_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "getf_block_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // symbol | object_field
  public static boolean getf_var(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getf_var")) return false;
    if (!nextTokenIs(b, "<getf var>", OBJECT_FIELD, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GETF_VAR, "<getf var>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, OBJECT_FIELD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LP SPACE* IF SPACE* conditions* SPACE* then_form SPACE* else_form* RP
  public static boolean if_form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_form")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && if_form_1(b, l + 1);
    r = r && consumeToken(b, IF);
    r = r && if_form_3(b, l + 1);
    r = r && if_form_4(b, l + 1);
    r = r && if_form_5(b, l + 1);
    r = r && then_form(b, l + 1);
    r = r && if_form_7(b, l + 1);
    r = r && if_form_8(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, IF_FORM, r);
    return r;
  }

  // SPACE*
  private static boolean if_form_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_form_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "if_form_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean if_form_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_form_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "if_form_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // conditions*
  private static boolean if_form_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_form_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!conditions(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_form_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean if_form_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_form_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "if_form_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean if_form_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_form_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "if_form_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // else_form*
  private static boolean if_form_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_form_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!else_form(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_form_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // LP SPACE* include_key SPACE* include_structure_name SPACE* slot_description* SPACE* RP
  static boolean include_option(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_option")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && include_option_1(b, l + 1);
    r = r && consumeToken(b, INCLUDE_KEY);
    r = r && include_option_3(b, l + 1);
    r = r && include_structure_name(b, l + 1);
    r = r && include_option_5(b, l + 1);
    r = r && include_option_6(b, l + 1);
    r = r && include_option_7(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean include_option_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_option_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "include_option_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean include_option_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_option_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "include_option_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean include_option_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_option_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "include_option_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // slot_description*
  private static boolean include_option_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_option_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!slot_description(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "include_option_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean include_option_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_option_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "include_option_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // symbol
  static boolean include_structure_name(PsiBuilder b, int l) {
    return consumeToken(b, SYMBOL);
  }

  /* ********************************************************** */
  // initial_contents_key SPACE* object
  static boolean initial_contents(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initial_contents")) return false;
    if (!nextTokenIs(b, INITIAL_CONTENTS_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INITIAL_CONTENTS_KEY);
    r = r && initial_contents_1(b, l + 1);
    r = r && consumeToken(b, OBJECT);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean initial_contents_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initial_contents_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "initial_contents_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // initial_element_key SPACE* initial_element_value
  static boolean initial_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initial_element")) return false;
    if (!nextTokenIs(b, INITIAL_ELEMENT_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INITIAL_ELEMENT_KEY);
    r = r && initial_element_1(b, l + 1);
    r = r && initial_element_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean initial_element_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initial_element_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "initial_element_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // arg
  static boolean initial_element_value(PsiBuilder b, int l) {
    return arg(b, l + 1);
  }

  /* ********************************************************** */
  // number
  static boolean initial_offest(PsiBuilder b, int l) {
    return consumeToken(b, NUMBER);
  }

  /* ********************************************************** */
  // LP SPACE* initial_offset_key SPACE* initial_offest SPACE* RP
  static boolean initial_offset_option(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initial_offset_option")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && initial_offset_option_1(b, l + 1);
    r = r && consumeToken(b, INITIAL_OFFSET_KEY);
    r = r && initial_offset_option_3(b, l + 1);
    r = r && initial_offest(b, l + 1);
    r = r && initial_offset_option_5(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean initial_offset_option_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initial_offset_option_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "initial_offset_option_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean initial_offset_option_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initial_offset_option_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "initial_offset_option_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean initial_offset_option_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initial_offset_option_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "initial_offset_option_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // number | symbol
  public static boolean int_val(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "int_val")) return false;
    if (!nextTokenIs(b, "<int val>", NUMBER, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INT_VAL, "<int val>");
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, SYMBOL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LOOP | FOR | IN | FROM | TO | DO | COLLECT | DEFUN | LET | IF | setq | LAMBDA | DECLARE | DEFSTRUCT | MAKE | DEFVAR
  public static boolean keywords(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keywords")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEYWORDS, "<keywords>");
    r = consumeToken(b, LOOP);
    if (!r) r = consumeToken(b, FOR);
    if (!r) r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, FROM);
    if (!r) r = consumeToken(b, TO);
    if (!r) r = consumeToken(b, DO);
    if (!r) r = consumeToken(b, COLLECT);
    if (!r) r = consumeToken(b, DEFUN);
    if (!r) r = consumeToken(b, LET);
    if (!r) r = consumeToken(b, IF);
    if (!r) r = consumeToken(b, SETQ);
    if (!r) r = consumeToken(b, LAMBDA);
    if (!r) r = consumeToken(b, DECLARE);
    if (!r) r = consumeToken(b, DEFSTRUCT);
    if (!r) r = consumeToken(b, MAKE);
    if (!r) r = consumeToken(b, DEFVAR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // block_body
  static boolean lambda_body(PsiBuilder b, int l) {
    return block_body(b, l + 1);
  }

  /* ********************************************************** */
  // LP LAMBDA SPACE* lambda_list SPACE* declaration* SPACE* documentation? SPACE* lambda_body SPACE* RP
  static boolean lambda_expresion(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expresion")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LP, LAMBDA);
    r = r && lambda_expresion_2(b, l + 1);
    r = r && lambda_list(b, l + 1);
    r = r && lambda_expresion_4(b, l + 1);
    r = r && lambda_expresion_5(b, l + 1);
    r = r && lambda_expresion_6(b, l + 1);
    r = r && lambda_expresion_7(b, l + 1);
    r = r && lambda_expresion_8(b, l + 1);
    r = r && lambda_body(b, l + 1);
    r = r && lambda_expresion_10(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean lambda_expresion_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expresion_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "lambda_expresion_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean lambda_expresion_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expresion_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "lambda_expresion_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // declaration*
  private static boolean lambda_expresion_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expresion_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "lambda_expresion_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean lambda_expresion_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expresion_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "lambda_expresion_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // documentation?
  private static boolean lambda_expresion_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expresion_7")) return false;
    documentation(b, l + 1);
    return true;
  }

  // SPACE*
  private static boolean lambda_expresion_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expresion_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "lambda_expresion_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean lambda_expresion_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expresion_10")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "lambda_expresion_10", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // slot_name | (LP SPACE* slot_name SPACE* field_value? SPACE* RP)
  static boolean lambda_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_field")) return false;
    if (!nextTokenIs(b, "", LP, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = slot_name(b, l + 1);
    if (!r) r = lambda_field_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LP SPACE* slot_name SPACE* field_value? SPACE* RP
  private static boolean lambda_field_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_field_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && lambda_field_1_1(b, l + 1);
    r = r && slot_name(b, l + 1);
    r = r && lambda_field_1_3(b, l + 1);
    r = r && lambda_field_1_4(b, l + 1);
    r = r && lambda_field_1_5(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean lambda_field_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_field_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "lambda_field_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean lambda_field_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_field_1_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "lambda_field_1_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // field_value?
  private static boolean lambda_field_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_field_1_4")) return false;
    field_value(b, l + 1);
    return true;
  }

  // SPACE*
  private static boolean lambda_field_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_field_1_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "lambda_field_1_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (LP SPACE* RP) | (LP SPACE* var* SPACE* RP)
  static boolean lambda_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_list")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lambda_list_0(b, l + 1);
    if (!r) r = lambda_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LP SPACE* RP
  private static boolean lambda_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && lambda_list_0_1(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean lambda_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_list_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "lambda_list_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // LP SPACE* var* SPACE* RP
  private static boolean lambda_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && lambda_list_1_1(b, l + 1);
    r = r && lambda_list_1_2(b, l + 1);
    r = r && lambda_list_1_3(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean lambda_list_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_list_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "lambda_list_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // var*
  private static boolean lambda_list_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_list_1_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!var(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "lambda_list_1_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean lambda_list_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_list_1_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "lambda_list_1_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // list_keywords_1 | list_keywords_2 | list_keywords_3 | list_keywords_4 | list_keywords_5
  static boolean lambda_list_keyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_list_keyword")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LIST_KEYWORDS_1);
    if (!r) r = consumeToken(b, LIST_KEYWORDS_2);
    if (!r) r = consumeToken(b, LIST_KEYWORDS_3);
    if (!r) r = consumeToken(b, LIST_KEYWORDS_4);
    if (!r) r = consumeToken(b, LIST_KEYWORDS_5);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LP SPACE* LET SPACE* LP SPACE* let_var_block* SPACE* RP SPACE* let_body* SPACE* RP
  public static boolean let_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_block")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && let_block_1(b, l + 1);
    r = r && consumeToken(b, LET);
    r = r && let_block_3(b, l + 1);
    r = r && consumeToken(b, LP);
    r = r && let_block_5(b, l + 1);
    r = r && let_block_6(b, l + 1);
    r = r && let_block_7(b, l + 1);
    r = r && consumeToken(b, RP);
    r = r && let_block_9(b, l + 1);
    r = r && let_block_10(b, l + 1);
    r = r && let_block_11(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, LET_BLOCK, r);
    return r;
  }

  // SPACE*
  private static boolean let_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_block_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "let_block_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean let_block_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_block_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "let_block_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean let_block_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_block_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "let_block_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // let_var_block*
  private static boolean let_block_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_block_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!let_var_block(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "let_block_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean let_block_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_block_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "let_block_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean let_block_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_block_9")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "let_block_9", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // let_body*
  private static boolean let_block_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_block_10")) return false;
    int c = current_position_(b);
    while (true) {
      if (!let_body(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "let_block_10", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean let_block_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_block_11")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "let_block_11", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // LP SPACE* block_body* SPACE* RP | block_body
  public static boolean let_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LET_BODY, "<let body>");
    r = let_body_0(b, l + 1);
    if (!r) r = block_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LP SPACE* block_body* SPACE* RP
  private static boolean let_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_body_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && let_body_0_1(b, l + 1);
    r = r && let_body_0_2(b, l + 1);
    r = r && let_body_0_3(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean let_body_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_body_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "let_body_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // block_body*
  private static boolean let_body_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_body_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!block_body(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "let_body_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean let_body_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_body_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "let_body_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // LP SPACE* var SPACE* arg SPACE* RP
  public static boolean let_var_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_var_block")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && let_var_block_1(b, l + 1);
    r = r && var(b, l + 1);
    r = r && let_var_block_3(b, l + 1);
    r = r && arg(b, l + 1);
    r = r && let_var_block_5(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, LET_VAR_BLOCK, r);
    return r;
  }

  // SPACE*
  private static boolean let_var_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_var_block_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "let_var_block_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean let_var_block_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_var_block_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "let_var_block_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean let_var_block_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_var_block_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "let_var_block_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // string_arg | NULL | list_def
  public static boolean list_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIST_ARG, "<list arg>");
    r = string_arg(b, l + 1);
    if (!r) r = consumeToken(b, NULL);
    if (!r) r = list_def(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LP SPACE* list SPACE* arg* SPACE* RP
  public static boolean list_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_block")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && list_block_1(b, l + 1);
    r = r && consumeToken(b, LIST);
    r = r && list_block_3(b, l + 1);
    r = r && list_block_4(b, l + 1);
    r = r && list_block_5(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, LIST_BLOCK, r);
    return r;
  }

  // SPACE*
  private static boolean list_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_block_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "list_block_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean list_block_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_block_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "list_block_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // arg*
  private static boolean list_block_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_block_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!arg(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_block_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean list_block_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_block_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "list_block_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // QV* LP SPACE* list_arg* SPACE* RP
  public static boolean list_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_def")) return false;
    if (!nextTokenIs(b, "<list def>", LP, QV)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIST_DEF, "<list def>");
    r = list_def_0(b, l + 1);
    r = r && consumeToken(b, LP);
    r = r && list_def_2(b, l + 1);
    r = r && list_def_3(b, l + 1);
    r = r && list_def_4(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // QV*
  private static boolean list_def_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_def_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, QV)) break;
      if (!empty_element_parsed_guard_(b, "list_def_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean list_def_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_def_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "list_def_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // list_arg*
  private static boolean list_def_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_def_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!list_arg(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_def_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean list_def_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_def_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "list_def_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // LP SPACE* load SPACE* file_path SPACE* RP
  public static boolean load_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "load_block")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && load_block_1(b, l + 1);
    r = r && consumeToken(b, LOAD);
    r = r && load_block_3(b, l + 1);
    r = r && file_path(b, l + 1);
    r = r && load_block_5(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, LOAD_BLOCK, r);
    return r;
  }

  // SPACE*
  private static boolean load_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "load_block_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "load_block_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean load_block_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "load_block_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "load_block_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean load_block_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "load_block_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "load_block_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // LP SPACE* LOOP SPACE* loop_for_block* SPACE* do_block? SPACE* collect_block? SPACE* RP
  public static boolean loop_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_block")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && loop_block_1(b, l + 1);
    r = r && consumeToken(b, LOOP);
    r = r && loop_block_3(b, l + 1);
    r = r && loop_block_4(b, l + 1);
    r = r && loop_block_5(b, l + 1);
    r = r && loop_block_6(b, l + 1);
    r = r && loop_block_7(b, l + 1);
    r = r && loop_block_8(b, l + 1);
    r = r && loop_block_9(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, LOOP_BLOCK, r);
    return r;
  }

  // SPACE*
  private static boolean loop_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_block_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "loop_block_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean loop_block_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_block_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "loop_block_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // loop_for_block*
  private static boolean loop_block_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_block_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!loop_for_block(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "loop_block_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean loop_block_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_block_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "loop_block_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // do_block?
  private static boolean loop_block_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_block_6")) return false;
    do_block(b, l + 1);
    return true;
  }

  // SPACE*
  private static boolean loop_block_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_block_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "loop_block_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // collect_block?
  private static boolean loop_block_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_block_8")) return false;
    collect_block(b, l + 1);
    return true;
  }

  // SPACE*
  private static boolean loop_block_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_block_9")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "loop_block_9", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // FOR var SPACE* (loop_for_in_block | loop_for_from_block)
  public static boolean loop_for_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_for_block")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && var(b, l + 1);
    r = r && loop_for_block_2(b, l + 1);
    r = r && loop_for_block_3(b, l + 1);
    exit_section_(b, m, LOOP_FOR_BLOCK, r);
    return r;
  }

  // SPACE*
  private static boolean loop_for_block_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_for_block_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "loop_for_block_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // loop_for_in_block | loop_for_from_block
  private static boolean loop_for_block_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_for_block_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = loop_for_in_block(b, l + 1);
    if (!r) r = loop_for_from_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (FROM SPACE* int_val SPACE* TO SPACE* int_val) |
  //                         (DOWNFROM SPACE* int_val SPACE* TO SPACE* int_val) |
  //                         (FROM SPACE* int_val SPACE* DOWNTO int_val) |
  //                         (UPTO SPACE* int_val)
  public static boolean loop_for_from_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_for_from_block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOOP_FOR_FROM_BLOCK, "<loop for from block>");
    r = loop_for_from_block_0(b, l + 1);
    if (!r) r = loop_for_from_block_1(b, l + 1);
    if (!r) r = loop_for_from_block_2(b, l + 1);
    if (!r) r = loop_for_from_block_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // FROM SPACE* int_val SPACE* TO SPACE* int_val
  private static boolean loop_for_from_block_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_for_from_block_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FROM);
    r = r && loop_for_from_block_0_1(b, l + 1);
    r = r && int_val(b, l + 1);
    r = r && loop_for_from_block_0_3(b, l + 1);
    r = r && consumeToken(b, TO);
    r = r && loop_for_from_block_0_5(b, l + 1);
    r = r && int_val(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean loop_for_from_block_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_for_from_block_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "loop_for_from_block_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean loop_for_from_block_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_for_from_block_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "loop_for_from_block_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean loop_for_from_block_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_for_from_block_0_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "loop_for_from_block_0_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // DOWNFROM SPACE* int_val SPACE* TO SPACE* int_val
  private static boolean loop_for_from_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_for_from_block_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOWNFROM);
    r = r && loop_for_from_block_1_1(b, l + 1);
    r = r && int_val(b, l + 1);
    r = r && loop_for_from_block_1_3(b, l + 1);
    r = r && consumeToken(b, TO);
    r = r && loop_for_from_block_1_5(b, l + 1);
    r = r && int_val(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean loop_for_from_block_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_for_from_block_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "loop_for_from_block_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean loop_for_from_block_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_for_from_block_1_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "loop_for_from_block_1_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean loop_for_from_block_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_for_from_block_1_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "loop_for_from_block_1_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // FROM SPACE* int_val SPACE* DOWNTO int_val
  private static boolean loop_for_from_block_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_for_from_block_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FROM);
    r = r && loop_for_from_block_2_1(b, l + 1);
    r = r && int_val(b, l + 1);
    r = r && loop_for_from_block_2_3(b, l + 1);
    r = r && consumeToken(b, DOWNTO);
    r = r && int_val(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean loop_for_from_block_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_for_from_block_2_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "loop_for_from_block_2_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean loop_for_from_block_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_for_from_block_2_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "loop_for_from_block_2_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // UPTO SPACE* int_val
  private static boolean loop_for_from_block_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_for_from_block_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UPTO);
    r = r && loop_for_from_block_3_1(b, l + 1);
    r = r && int_val(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean loop_for_from_block_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_for_from_block_3_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "loop_for_from_block_3_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // IN SPACE* arg
  public static boolean loop_for_in_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_for_in_block")) return false;
    if (!nextTokenIs(b, IN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IN);
    r = r && loop_for_in_block_1(b, l + 1);
    r = r && arg(b, l + 1);
    exit_section_(b, m, LOOP_FOR_IN_BLOCK, r);
    return r;
  }

  // SPACE*
  private static boolean loop_for_in_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_for_in_block_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "loop_for_in_block_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // LP SPACE* make_variant SPACE* make_values* SPACE* make_option* SPACE* RP
  public static boolean make_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "make_def")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MAKE_DEF, null);
    r = consumeToken(b, LP);
    r = r && make_def_1(b, l + 1);
    r = r && make_variant(b, l + 1);
    p = r; // pin = 3
    r = r && report_error_(b, make_def_3(b, l + 1));
    r = p && report_error_(b, make_def_4(b, l + 1)) && r;
    r = p && report_error_(b, make_def_5(b, l + 1)) && r;
    r = p && report_error_(b, make_def_6(b, l + 1)) && r;
    r = p && report_error_(b, make_def_7(b, l + 1)) && r;
    r = p && consumeToken(b, RP) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // SPACE*
  private static boolean make_def_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "make_def_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "make_def_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean make_def_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "make_def_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "make_def_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // make_values*
  private static boolean make_def_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "make_def_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!make_values(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "make_def_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean make_def_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "make_def_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "make_def_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // make_option*
  private static boolean make_def_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "make_def_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!make_option(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "make_def_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean make_def_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "make_def_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "make_def_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // element_type | initial_element | fill_pointer | initial_contents
  static boolean make_option(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "make_option")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = element_type(b, l + 1);
    if (!r) r = initial_element(b, l + 1);
    if (!r) r = fill_pointer(b, l + 1);
    if (!r) r = initial_contents(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (object_field SPACE* arg) | arg
  public static boolean make_values(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "make_values")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAKE_VALUES, "<make values>");
    r = make_values_0(b, l + 1);
    if (!r) r = arg(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // object_field SPACE* arg
  private static boolean make_values_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "make_values_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OBJECT_FIELD);
    r = r && make_values_0_1(b, l + 1);
    r = r && arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean make_values_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "make_values_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "make_values_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // MAKE
  public static boolean make_variant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "make_variant")) return false;
    if (!nextTokenIs(b, MAKE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MAKE);
    exit_section_(b, m, MAKE_VARIANT, r);
    return r;
  }

  /* ********************************************************** */
  // named_option_key
  static boolean named_option(PsiBuilder b, int l) {
    return consumeToken(b, NAMED_OPTION_KEY);
  }

  /* ********************************************************** */
  // OP_1 | OP_2 | OP_3 | OP_4 | OP_5 | OP_6 | OP_7
  public static boolean operation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATION, "<operation>");
    r = consumeToken(b, OP_1);
    if (!r) r = consumeToken(b, OP_2);
    if (!r) r = consumeToken(b, OP_3);
    if (!r) r = consumeToken(b, OP_4);
    if (!r) r = consumeToken(b, OP_5);
    if (!r) r = consumeToken(b, OP_6);
    if (!r) r = consumeToken(b, OP_7);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LP SPACE* operation SPACE* arg SPACE* arg SPACE* RP
  public static boolean operation_form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operation_form")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && operation_form_1(b, l + 1);
    r = r && operation(b, l + 1);
    r = r && operation_form_3(b, l + 1);
    r = r && arg(b, l + 1);
    r = r && operation_form_5(b, l + 1);
    r = r && arg(b, l + 1);
    r = r && operation_form_7(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, OPERATION_FORM, r);
    return r;
  }

  // SPACE*
  private static boolean operation_form_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operation_form_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "operation_form_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean operation_form_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operation_form_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "operation_form_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean operation_form_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operation_form_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "operation_form_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean operation_form_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operation_form_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "operation_form_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // symbol
  static boolean predicate_name(PsiBuilder b, int l) {
    return consumeToken(b, SYMBOL);
  }

  /* ********************************************************** */
  // predicate_key | (LP SPACE* predicate_key SPACE* predicate_name SPACE* RP)
  static boolean predicate_option(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "predicate_option")) return false;
    if (!nextTokenIs(b, "", LP, PREDICATE_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PREDICATE_KEY);
    if (!r) r = predicate_option_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LP SPACE* predicate_key SPACE* predicate_name SPACE* RP
  private static boolean predicate_option_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "predicate_option_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && predicate_option_1_1(b, l + 1);
    r = r && consumeToken(b, PREDICATE_KEY);
    r = r && predicate_option_1_3(b, l + 1);
    r = r && predicate_name(b, l + 1);
    r = r && predicate_option_1_5(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean predicate_option_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "predicate_option_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "predicate_option_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean predicate_option_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "predicate_option_1_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "predicate_option_1_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean predicate_option_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "predicate_option_1_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "predicate_option_1_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (LP SPACE* print_function_key SPACE* printer_name SPACE RP) | (LP SPACE* print_function_key SPACE* RP)
  static boolean print_function_option(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "print_function_option")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = print_function_option_0(b, l + 1);
    if (!r) r = print_function_option_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LP SPACE* print_function_key SPACE* printer_name SPACE RP
  private static boolean print_function_option_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "print_function_option_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && print_function_option_0_1(b, l + 1);
    r = r && consumeToken(b, PRINT_FUNCTION_KEY);
    r = r && print_function_option_0_3(b, l + 1);
    r = r && printer_name(b, l + 1);
    r = r && consumeTokens(b, 0, SPACE, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean print_function_option_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "print_function_option_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "print_function_option_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean print_function_option_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "print_function_option_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "print_function_option_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // LP SPACE* print_function_key SPACE* RP
  private static boolean print_function_option_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "print_function_option_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && print_function_option_1_1(b, l + 1);
    r = r && consumeToken(b, PRINT_FUNCTION_KEY);
    r = r && print_function_option_1_3(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean print_function_option_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "print_function_option_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "print_function_option_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean print_function_option_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "print_function_option_1_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "print_function_option_1_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (LP SPACE* print_object_key SPACE* printer_name SPACE RP) | (LP SPACE* print_object_key SPACE* RP)
  static boolean print_object_option(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "print_object_option")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = print_object_option_0(b, l + 1);
    if (!r) r = print_object_option_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LP SPACE* print_object_key SPACE* printer_name SPACE RP
  private static boolean print_object_option_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "print_object_option_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && print_object_option_0_1(b, l + 1);
    r = r && consumeToken(b, PRINT_OBJECT_KEY);
    r = r && print_object_option_0_3(b, l + 1);
    r = r && printer_name(b, l + 1);
    r = r && consumeTokens(b, 0, SPACE, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean print_object_option_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "print_object_option_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "print_object_option_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean print_object_option_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "print_object_option_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "print_object_option_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // LP SPACE* print_object_key SPACE* RP
  private static boolean print_object_option_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "print_object_option_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && print_object_option_1_1(b, l + 1);
    r = r && consumeToken(b, PRINT_OBJECT_KEY);
    r = r && print_object_option_1_3(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean print_object_option_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "print_object_option_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "print_object_option_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean print_object_option_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "print_object_option_1_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "print_object_option_1_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // symbol | lambda_expresion
  static boolean printer_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "printer_name")) return false;
    if (!nextTokenIs(b, "", LP, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    if (!r) r = lambda_expresion(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // print_object_option | print_function_option
  static boolean printer_option(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "printer_option")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = print_object_option(b, l + 1);
    if (!r) r = print_function_option(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LP SPACE* push SPACE* symbol SPACE* arg SPACE* RP
  public static boolean push_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "push_block")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && push_block_1(b, l + 1);
    r = r && consumeToken(b, PUSH);
    r = r && push_block_3(b, l + 1);
    r = r && consumeToken(b, SYMBOL);
    r = r && push_block_5(b, l + 1);
    r = r && arg(b, l + 1);
    r = r && push_block_7(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, PUSH_BLOCK, r);
    return r;
  }

  // SPACE*
  private static boolean push_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "push_block_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "push_block_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean push_block_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "push_block_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "push_block_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean push_block_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "push_block_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "push_block_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean push_block_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "push_block_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "push_block_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // root_item *
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    int c = current_position_(b);
    while (true) {
      if (!root_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // !<<eof>> block_body
  static boolean root_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_item")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = root_item_0(b, l + 1);
    r = r && block_body(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<eof>>
  private static boolean root_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_item_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (LP SPACE* var SPACE* arg SPACE* RP) | var SPACE* arg
  public static boolean setq_args(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setq_args")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SETQ_ARGS, "<setq args>");
    r = setq_args_0(b, l + 1);
    if (!r) r = setq_args_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LP SPACE* var SPACE* arg SPACE* RP
  private static boolean setq_args_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setq_args_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && setq_args_0_1(b, l + 1);
    r = r && var(b, l + 1);
    r = r && setq_args_0_3(b, l + 1);
    r = r && arg(b, l + 1);
    r = r && setq_args_0_5(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean setq_args_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setq_args_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "setq_args_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean setq_args_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setq_args_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "setq_args_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean setq_args_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setq_args_0_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "setq_args_0_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // var SPACE* arg
  private static boolean setq_args_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setq_args_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var(b, l + 1);
    r = r && setq_args_1_1(b, l + 1);
    r = r && arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean setq_args_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setq_args_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "setq_args_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // LP SPACE* SETQ SPACE* setq_args* SPACE* RP
  public static boolean setq_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setq_block")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && setq_block_1(b, l + 1);
    r = r && consumeToken(b, SETQ);
    r = r && setq_block_3(b, l + 1);
    r = r && setq_block_4(b, l + 1);
    r = r && setq_block_5(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, SETQ_BLOCK, r);
    return r;
  }

  // SPACE*
  private static boolean setq_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setq_block_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "setq_block_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean setq_block_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setq_block_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "setq_block_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // setq_args*
  private static boolean setq_block_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setq_block_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!setq_args(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "setq_block_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean setq_block_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setq_block_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "setq_block_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // slot_name | (LP SPACE* slot_name SPACE* (slot_initform SPACE* slot_option*)* SPACE* RP)
  public static boolean slot_description(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_description")) return false;
    if (!nextTokenIs(b, "<slot description>", LP, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SLOT_DESCRIPTION, "<slot description>");
    r = slot_name(b, l + 1);
    if (!r) r = slot_description_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LP SPACE* slot_name SPACE* (slot_initform SPACE* slot_option*)* SPACE* RP
  private static boolean slot_description_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_description_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && slot_description_1_1(b, l + 1);
    r = r && slot_name(b, l + 1);
    r = r && slot_description_1_3(b, l + 1);
    r = r && slot_description_1_4(b, l + 1);
    r = r && slot_description_1_5(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean slot_description_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_description_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "slot_description_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean slot_description_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_description_1_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "slot_description_1_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (slot_initform SPACE* slot_option*)*
  private static boolean slot_description_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_description_1_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!slot_description_1_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "slot_description_1_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // slot_initform SPACE* slot_option*
  private static boolean slot_description_1_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_description_1_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = slot_initform(b, l + 1);
    r = r && slot_description_1_4_0_1(b, l + 1);
    r = r && slot_description_1_4_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean slot_description_1_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_description_1_4_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "slot_description_1_4_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // slot_option*
  private static boolean slot_description_1_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_description_1_4_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!slot_option(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "slot_description_1_4_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean slot_description_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_description_1_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "slot_description_1_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // arg
  static boolean slot_initform(PsiBuilder b, int l) {
    return arg(b, l + 1);
  }

  /* ********************************************************** */
  // symbol
  public static boolean slot_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_name")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, SLOT_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // (type_key SPACE* type) | read_only_key SPACE* slot_read_only
  public static boolean slot_option(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_option")) return false;
    if (!nextTokenIs(b, "<slot option>", READ_ONLY_KEY, TYPE_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SLOT_OPTION, "<slot option>");
    r = slot_option_0(b, l + 1);
    if (!r) r = slot_option_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // type_key SPACE* type
  private static boolean slot_option_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_option_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE_KEY);
    r = r && slot_option_0_1(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean slot_option_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_option_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "slot_option_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // read_only_key SPACE* slot_read_only
  private static boolean slot_option_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_option_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, READ_ONLY_KEY);
    r = r && slot_option_1_1(b, l + 1);
    r = r && slot_read_only(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean slot_option_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_option_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "slot_option_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TRUE | FALSE | NULL
  static boolean slot_read_only(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_read_only")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, NULL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // loop_block | setq_block | let_block | base_function_form | defvar_block | getf_block | list_block
  //                | push_block | dolist_block | load_block
  public static boolean special_form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "special_form")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = loop_block(b, l + 1);
    if (!r) r = setq_block(b, l + 1);
    if (!r) r = let_block(b, l + 1);
    if (!r) r = base_function_form(b, l + 1);
    if (!r) r = defvar_block(b, l + 1);
    if (!r) r = getf_block(b, l + 1);
    if (!r) r = list_block(b, l + 1);
    if (!r) r = push_block(b, l + 1);
    if (!r) r = dolist_block(b, l + 1);
    if (!r) r = load_block(b, l + 1);
    exit_section_(b, m, SPECIAL_FORM, r);
    return r;
  }

  /* ********************************************************** */
  // var | boolean_value | number | symbol
  public static boolean string_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_ARG, "<string arg>");
    r = var(b, l + 1);
    if (!r) r = boolean_value(b, l + 1);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, SYMBOL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // QV string_arg
  public static boolean string_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_value")) return false;
    if (!nextTokenIs(b, QV)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QV);
    r = r && string_arg(b, l + 1);
    exit_section_(b, m, STRING_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // symbol
  public static boolean struct_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_name")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, STRUCT_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // struct_name | (LP SPACE* struct_name SPACE* struct_option* SPACE* RP )
  public static boolean struct_name_and_options(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_name_and_options")) return false;
    if (!nextTokenIs(b, "<struct name and options>", LP, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_NAME_AND_OPTIONS, "<struct name and options>");
    r = struct_name(b, l + 1);
    if (!r) r = struct_name_and_options_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LP SPACE* struct_name SPACE* struct_option* SPACE* RP
  private static boolean struct_name_and_options_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_name_and_options_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && struct_name_and_options_1_1(b, l + 1);
    r = r && struct_name(b, l + 1);
    r = r && struct_name_and_options_1_3(b, l + 1);
    r = r && struct_name_and_options_1_4(b, l + 1);
    r = r && struct_name_and_options_1_5(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean struct_name_and_options_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_name_and_options_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "struct_name_and_options_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean struct_name_and_options_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_name_and_options_1_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "struct_name_and_options_1_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // struct_option*
  private static boolean struct_name_and_options_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_name_and_options_1_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!struct_option(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "struct_name_and_options_1_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean struct_name_and_options_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_name_and_options_1_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "struct_name_and_options_1_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // conc_name_option | constructor_option+ | copier_option | include_option | initial_offset_option
  //                 | named_option | predicate_option | printer_option | type_option
  public static boolean struct_option(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_option")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_OPTION, "<struct option>");
    r = conc_name_option(b, l + 1);
    if (!r) r = struct_option_1(b, l + 1);
    if (!r) r = copier_option(b, l + 1);
    if (!r) r = include_option(b, l + 1);
    if (!r) r = initial_offset_option(b, l + 1);
    if (!r) r = named_option(b, l + 1);
    if (!r) r = predicate_option(b, l + 1);
    if (!r) r = printer_option(b, l + 1);
    if (!r) r = type_option(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // constructor_option+
  private static boolean struct_option_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_option_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = constructor_option(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!constructor_option(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "struct_option_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // block_body | arg
  public static boolean then_form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "then_form")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, THEN_FORM, "<then form>");
    r = block_body(b, l + 1);
    if (!r) r = arg(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // symbol
  static boolean type(PsiBuilder b, int l) {
    return consumeToken(b, SYMBOL);
  }

  /* ********************************************************** */
  // LP SPACE* type_key SPACE* type SPACE* RP
  static boolean type_option(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_option")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && type_option_1(b, l + 1);
    r = r && consumeToken(b, TYPE_KEY);
    r = r && type_option_3(b, l + 1);
    r = r && type(b, l + 1);
    r = r && type_option_5(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPACE*
  private static boolean type_option_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_option_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "type_option_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean type_option_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_option_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "type_option_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPACE*
  private static boolean type_option_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_option_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPACE)) break;
      if (!empty_element_parsed_guard_(b, "type_option_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // symbol | hash_symbol
  public static boolean var(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var")) return false;
    if (!nextTokenIs(b, "<var>", HASH_SYMBOL, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR, "<var>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, HASH_SYMBOL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !RP
  static boolean wrong_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wrong_call")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RP);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
