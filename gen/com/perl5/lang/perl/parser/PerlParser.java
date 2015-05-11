// This is a generated file. Not intended for manual editing.
package com.perl5.lang.perl.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.perl5.lang.perl.lexer.PerlElementTypes.*;
import static com.perl5.lang.perl.parser.PerlParserUitl.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class PerlParser implements PsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ADD_EXPR) {
      r = expr(b, 0, 15);
    }
    else if (t == AND_EXPR) {
      r = expr(b, 0, 8);
    }
    else if (t == ASSIGN_EXPR) {
      r = expr(b, 0, 4);
    }
    else if (t == BAREWORD_EXPR) {
      r = bareword_expr(b, 0);
    }
    else if (t == BITWISE_AND_EXPR) {
      r = expr(b, 0, 10);
    }
    else if (t == BITWISE_OR_XOR_EXPR) {
      r = expr(b, 0, 9);
    }
    else if (t == BLOCK) {
      r = block(b, 0);
    }
    else if (t == BLOCK_COMPOUND) {
      r = block_compound(b, 0);
    }
    else if (t == CALLABLE) {
      r = callable(b, 0);
    }
    else if (t == CLOSE_TERM) {
      r = close_term(b, 0);
    }
    else if (t == COMMA_EXPR) {
      r = expr(b, 0, 3);
    }
    else if (t == COMPARE_EXPR) {
      r = expr(b, 0, 12);
    }
    else if (t == COMPILE_REGEX) {
      r = compile_regex(b, 0);
    }
    else if (t == DEREF_EXPR) {
      r = expr(b, 0, 21);
    }
    else if (t == DO_TERM) {
      r = do_term(b, 0);
    }
    else if (t == EQUAL_EXPR) {
      r = expr(b, 0, 11);
    }
    else if (t == EVAL_TERM) {
      r = eval_term(b, 0);
    }
    else if (t == EXPR) {
      r = expr(b, 0, -1);
    }
    else if (t == FILE_READ_TERM) {
      r = file_read_term(b, 0);
    }
    else if (t == FILETEST_EXPR) {
      r = filetest_expr(b, 0);
    }
    else if (t == FLIPFLOP_EXPR) {
      r = expr(b, 0, 6);
    }
    else if (t == FOR_COMPOUND) {
      r = for_compound(b, 0);
    }
    else if (t == FOR_STATEMENT_MODIFIER) {
      r = for_statement_modifier(b, 0);
    }
    else if (t == FOREACH_COMPOUND) {
      r = foreach_compound(b, 0);
    }
    else if (t == FOREACH_STATEMENT_MODIFIER) {
      r = foreach_statement_modifier(b, 0);
    }
    else if (t == GIVEN_COMPOUND) {
      r = given_compound(b, 0);
    }
    else if (t == GREP_TERM) {
      r = grep_term(b, 0);
    }
    else if (t == IF_COMPOUND) {
      r = if_compound(b, 0);
    }
    else if (t == IF_STATEMENT_MODIFIER) {
      r = if_statement_modifier(b, 0);
    }
    else if (t == LABEL) {
      r = label(b, 0);
    }
    else if (t == LABEL_DECLARATION) {
      r = label_declaration(b, 0);
    }
    else if (t == LAST_TERM) {
      r = last_term(b, 0);
    }
    else if (t == LP_AND_EXPR) {
      r = expr(b, 0, 0);
    }
    else if (t == LP_NOT_EXPR) {
      r = lp_not_expr(b, 0);
    }
    else if (t == LP_OR_XOR_EXPR) {
      r = expr(b, 0, -1);
    }
    else if (t == MAP_TERM) {
      r = map_term(b, 0);
    }
    else if (t == MATCH_REGEX) {
      r = match_regex(b, 0);
    }
    else if (t == MUL_EXPR) {
      r = expr(b, 0, 16);
    }
    else if (t == NAMED_BLOCK) {
      r = named_block(b, 0);
    }
    else if (t == NAMED_UNARY_EXPR) {
      r = named_unary_expr(b, 0);
    }
    else if (t == NAMESPACE) {
      r = namespace(b, 0);
    }
    else if (t == NEXT_TERM) {
      r = next_term(b, 0);
    }
    else if (t == NO_STATEMENT) {
      r = no_statement(b, 0);
    }
    else if (t == OPEN_FILE) {
      r = open_file(b, 0);
    }
    else if (t == OPEN_HANDLE) {
      r = open_handle(b, 0);
    }
    else if (t == OPEN_MODE) {
      r = open_mode(b, 0);
    }
    else if (t == OPEN_REF) {
      r = open_ref(b, 0);
    }
    else if (t == OPEN_TERM) {
      r = open_term(b, 0);
    }
    else if (t == OR_EXPR) {
      r = expr(b, 0, 7);
    }
    else if (t == PERL_ARRAY) {
      r = perl_array(b, 0);
    }
    else if (t == PERL_GLOB) {
      r = perl_glob(b, 0);
    }
    else if (t == PERL_HASH) {
      r = perl_hash(b, 0);
    }
    else if (t == PERL_REGEX) {
      r = perl_regex(b, 0);
    }
    else if (t == PERL_REGEX_MODIFIERS) {
      r = perl_regex_modifiers(b, 0);
    }
    else if (t == PERL_SCALAR) {
      r = perl_scalar(b, 0);
    }
    else if (t == POW_EXPR) {
      r = expr(b, 0, 19);
    }
    else if (t == PREF_PP_EXPR) {
      r = pref_pp_expr(b, 0);
    }
    else if (t == PREFIX_UNARY_EXPR) {
      r = prefix_unary_expr(b, 0);
    }
    else if (t == PRINT_TERM) {
      r = print_term(b, 0);
    }
    else if (t == REDO_TERM) {
      r = redo_term(b, 0);
    }
    else if (t == REF_EXPR) {
      r = ref_expr(b, 0);
    }
    else if (t == REFERENCE_VALUE) {
      r = reference_value(b, 0);
    }
    else if (t == REGEX_EXPR) {
      r = expr(b, 0, 17);
    }
    else if (t == REPLACEMENT_REGEX) {
      r = replacement_regex(b, 0);
    }
    else if (t == REQUIRE_TERM) {
      r = require_term(b, 0);
    }
    else if (t == RIGHTWARD_CALL_EXPR) {
      r = rightward_call_expr(b, 0);
    }
    else if (t == SCALAR_CALL) {
      r = scalar_call(b, 0);
    }
    else if (t == SHIFT_EXPR) {
      r = expr(b, 0, 14);
    }
    else if (t == SORT_TERM) {
      r = sort_term(b, 0);
    }
    else if (t == STRING) {
      r = string(b, 0);
    }
    else if (t == SUB_DECLARATION) {
      r = sub_declaration(b, 0);
    }
    else if (t == SUB_DEFINITION) {
      r = sub_definition(b, 0);
    }
    else if (t == SUB_TERM) {
      r = sub_term(b, 0);
    }
    else if (t == SUFF_PP_EXPR) {
      r = expr(b, 0, 20);
    }
    else if (t == TERM_EXPR) {
      r = term_expr(b, 0);
    }
    else if (t == TR_MODIFIERS) {
      r = tr_modifiers(b, 0);
    }
    else if (t == TR_REGEX) {
      r = tr_regex(b, 0);
    }
    else if (t == TR_REPLACEMENTLIST) {
      r = tr_replacementlist(b, 0);
    }
    else if (t == TR_SEARCHLIST) {
      r = tr_searchlist(b, 0);
    }
    else if (t == TRENAR_EXPR) {
      r = expr(b, 0, 5);
    }
    else if (t == UNDEF_TERM) {
      r = undef_term(b, 0);
    }
    else if (t == UNLESS_COMPOUND) {
      r = unless_compound(b, 0);
    }
    else if (t == UNLESS_STATEMENT_MODIFIER) {
      r = unless_statement_modifier(b, 0);
    }
    else if (t == UNTIL_COMPOUND) {
      r = until_compound(b, 0);
    }
    else if (t == UNTIL_STATEMENT_MODIFIER) {
      r = until_statement_modifier(b, 0);
    }
    else if (t == USE_STATEMENT) {
      r = use_statement(b, 0);
    }
    else if (t == VARIABLE_DECLARATION_GLOBAL) {
      r = variable_declaration_global(b, 0);
    }
    else if (t == VARIABLE_DECLARATION_LEXICAL) {
      r = variable_declaration_lexical(b, 0);
    }
    else if (t == VARIABLE_DECLARATION_LOCAL) {
      r = variable_declaration_local(b, 0);
    }
    else if (t == WHEN_STATEMENT_MODIFIER) {
      r = when_statement_modifier(b, 0);
    }
    else if (t == WHILE_COMPOUND) {
      r = while_compound(b, 0);
    }
    else if (t == WHILE_STATEMENT_MODIFIER) {
      r = while_statement_modifier(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return perlFile(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ADD_EXPR, AND_EXPR, ASSIGN_EXPR, BAREWORD_EXPR,
      BITWISE_AND_EXPR, BITWISE_OR_XOR_EXPR, COMMA_EXPR, COMPARE_EXPR,
      DEREF_EXPR, EQUAL_EXPR, EXPR, FILETEST_EXPR,
      FLIPFLOP_EXPR, LP_AND_EXPR, LP_NOT_EXPR, LP_OR_XOR_EXPR,
      MUL_EXPR, NAMED_UNARY_EXPR, OR_EXPR, POW_EXPR,
      PREFIX_UNARY_EXPR, PREF_PP_EXPR, REF_EXPR, REGEX_EXPR,
      RIGHTWARD_CALL_EXPR, SHIFT_EXPR, SUFF_PP_EXPR, TERM_EXPR,
      TRENAR_EXPR),
  };

  /* ********************************************************** */
  // brack_expr_term
  static boolean anon_array_ref(PsiBuilder b, int l) {
    return brack_expr_term(b, l + 1);
  }

  /* ********************************************************** */
  // brace_expr_term
  static boolean anon_hash_ref(PsiBuilder b, int l) {
    return brace_expr_term(b, l + 1);
  }

  /* ********************************************************** */
  // array_primitive brack_expr_term              // array slice
  //     | array_primitive brace_expr_term              // hash slice
  //     | array_primitive
  static boolean array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = array_0(b, l + 1);
    if (!r) r = array_1(b, l + 1);
    if (!r) r = array_primitive(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // array_primitive brack_expr_term
  private static boolean array_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = array_primitive(b, l + 1);
    r = r && brack_expr_term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // array_primitive brace_expr_term
  private static boolean array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = array_primitive(b, l + 1);
    r = r && brace_expr_term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // string_list
  //     | PERL_SIGIL_ARRAY '{' expr '}'   // scalar dereference
  //     | PERL_SIGIL_ARRAY scalar_expr       // scalar dereference
  //     | perl_array
  static boolean array_primitive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_primitive")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = string_list(b, l + 1);
    if (!r) r = array_primitive_1(b, l + 1);
    if (!r) r = array_primitive_2(b, l + 1);
    if (!r) r = perl_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PERL_SIGIL_ARRAY '{' expr '}'
  private static boolean array_primitive_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_primitive_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_SIGIL_ARRAY);
    r = r && consumeToken(b, PERL_LBRACE);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, PERL_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // PERL_SIGIL_ARRAY scalar_expr
  private static boolean array_primitive_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_primitive_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_SIGIL_ARRAY);
    r = r && scalar_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "{" file_items "}"
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    if (!nextTokenIs(b, PERL_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_LBRACE);
    r = r && file_items(b, l + 1);
    r = r && consumeToken(b, PERL_RBRACE);
    exit_section_(b, m, BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // block_safe [compound_continue_block]
  public static boolean block_compound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_compound")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<block compound>");
    r = block_safe(b, l + 1);
    r = r && block_compound_1(b, l + 1);
    exit_section_(b, l, m, BLOCK_COMPOUND, r, false, null);
    return r;
  }

  // [compound_continue_block]
  private static boolean block_compound_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_compound_1")) return false;
    compound_continue_block(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // <<parseBlock>>
  static boolean block_safe(PsiBuilder b, int l) {
    return parseBlock(b, l + 1);
  }

  /* ********************************************************** */
  // "{" [expr] "}"
  static boolean brace_expr_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "brace_expr_term")) return false;
    if (!nextTokenIs(b, PERL_LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, PERL_LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, brace_expr_term_1(b, l + 1));
    r = p && consumeToken(b, PERL_RBRACE) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  // [expr]
  private static boolean brace_expr_term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "brace_expr_term_1")) return false;
    expr(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // "[" [expr] "]"
  static boolean brack_expr_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "brack_expr_term")) return false;
    if (!nextTokenIs(b, PERL_LBRACK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, PERL_LBRACK);
    p = r; // pin = 1
    r = r && report_error_(b, brack_expr_term_1(b, l + 1));
    r = p && consumeToken(b, PERL_RBRACK) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  // [expr]
  private static boolean brack_expr_term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "brack_expr_term_1")) return false;
    expr(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // <<resetLastCallable>> (
  //     referencable_method
  //     | <<guessBarewordCallable>>
  // )
  public static boolean callable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<callable>");
    r = resetLastCallable(b, l + 1);
    r = r && callable_1(b, l + 1);
    exit_section_(b, l, m, CALLABLE, r, false, null);
    return r;
  }

  // referencable_method
  //     | <<guessBarewordCallable>>
  private static boolean callable_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callable_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = referencable_method(b, l + 1);
    if (!r) r = guessBarewordCallable(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // perl_handle
  static boolean close_arguments(PsiBuilder b, int l) {
    return perl_handle(b, l + 1);
  }

  /* ********************************************************** */
  // "close" ( "(" close_arguments ")" | close_arguments )
  public static boolean close_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "close_term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<close term>");
    r = consumeToken(b, "close");
    r = r && close_term_1(b, l + 1);
    exit_section_(b, l, m, CLOSE_TERM, r, false, null);
    return r;
  }

  // "(" close_arguments ")" | close_arguments
  private static boolean close_term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "close_term_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = close_term_1_0(b, l + 1);
    if (!r) r = close_arguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" close_arguments ")"
  private static boolean close_term_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "close_term_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_LPAREN);
    r = r && close_arguments(b, l + 1);
    r = r && consumeToken(b, PERL_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "sub" block_safe
  static boolean code_ref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_ref")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "sub");
    r = r && block_safe(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'qr' match_regex_body
  public static boolean compile_regex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compile_regex")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<compile regex>");
    r = consumeToken(b, "qr");
    r = r && match_regex_body(b, l + 1);
    exit_section_(b, l, m, COMPILE_REGEX, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // paren_expr_term block_safe
  static boolean compound_conditional_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_conditional_block")) return false;
    if (!nextTokenIs(b, PERL_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = paren_expr_term(b, l + 1);
    r = r && block_safe(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'continue' block_safe
  static boolean compound_continue_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_continue_block")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "continue");
    r = r && block_safe(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [label_declaration] (
  //         block_compound
  //         | if_compound
  //         | unless_compound
  //         | given_compound
  //         | while_compound
  //         | until_compound
  //         | for_compound
  //         | foreach_compound
  //      )
  static boolean compound_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_statement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = compound_statement_0(b, l + 1);
    r = r && compound_statement_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [label_declaration]
  private static boolean compound_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_statement_0")) return false;
    label_declaration(b, l + 1);
    return true;
  }

  // block_compound
  //         | if_compound
  //         | unless_compound
  //         | given_compound
  //         | while_compound
  //         | until_compound
  //         | for_compound
  //         | foreach_compound
  private static boolean compound_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block_compound(b, l + 1);
    if (!r) r = if_compound(b, l + 1);
    if (!r) r = unless_compound(b, l + 1);
    if (!r) r = given_compound(b, l + 1);
    if (!r) r = while_compound(b, l + 1);
    if (!r) r = until_compound(b, l + 1);
    if (!r) r = for_compound(b, l + 1);
    if (!r) r = foreach_compound(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "do" block_safe
  public static boolean do_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<do term>");
    r = consumeToken(b, "do");
    r = r && block_safe(b, l + 1);
    exit_section_(b, l, m, DO_TERM, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "eval" block_safe
  public static boolean eval_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "eval_term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<eval term>");
    r = consumeToken(b, "eval");
    r = r && block_safe(b, l + 1);
    exit_section_(b, l, m, EVAL_TERM, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // namespace | namespace_element
  static boolean file_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_item")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namespace(b, l + 1);
    if (!r) r = namespace_element(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // file_item*
  static boolean file_items(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_items")) return false;
    int c = current_position_(b);
    while (true) {
      if (!file_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file_items", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '<' [perl_handle] '>'
  public static boolean file_read_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_read_term")) return false;
    if (!nextTokenIs(b, PERL_LANGLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_LANGLE);
    r = r && file_read_term_1(b, l + 1);
    r = r && consumeToken(b, PERL_RANGLE);
    exit_section_(b, m, FILE_READ_TERM, r);
    return r;
  }

  // [perl_handle]
  private static boolean file_read_term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_read_term_1")) return false;
    perl_handle(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'for' for_compound_arguments
  public static boolean for_compound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_compound")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<for compound>");
    r = consumeToken(b, "for");
    r = r && for_compound_arguments(b, l + 1);
    exit_section_(b, l, m, FOR_COMPOUND, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // for_compound_arguments_iteration | for_compound_arguments_list
  static boolean for_compound_arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_compound_arguments")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = for_compound_arguments_iteration(b, l + 1);
    if (!r) r = for_compound_arguments_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // for_compound_arguments_iteration_arguments block_safe
  static boolean for_compound_arguments_iteration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_compound_arguments_iteration")) return false;
    if (!nextTokenIs(b, PERL_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = for_compound_arguments_iteration_arguments(b, l + 1);
    r = r && block_safe(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' [expr]  PERL_SEMI [expr] PERL_SEMI [expr] ')'
  static boolean for_compound_arguments_iteration_arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_compound_arguments_iteration_arguments")) return false;
    if (!nextTokenIs(b, PERL_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, PERL_LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, for_compound_arguments_iteration_arguments_1(b, l + 1));
    r = p && report_error_(b, consumeToken(b, PERL_SEMI)) && r;
    r = p && report_error_(b, for_compound_arguments_iteration_arguments_3(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, PERL_SEMI)) && r;
    r = p && report_error_(b, for_compound_arguments_iteration_arguments_5(b, l + 1)) && r;
    r = p && consumeToken(b, PERL_RPAREN) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  // [expr]
  private static boolean for_compound_arguments_iteration_arguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_compound_arguments_iteration_arguments_1")) return false;
    expr(b, l + 1, -1);
    return true;
  }

  // [expr]
  private static boolean for_compound_arguments_iteration_arguments_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_compound_arguments_iteration_arguments_3")) return false;
    expr(b, l + 1, -1);
    return true;
  }

  // [expr]
  private static boolean for_compound_arguments_iteration_arguments_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_compound_arguments_iteration_arguments_5")) return false;
    expr(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // [ variable_declaration | variable ] paren_expr_term block_compound
  static boolean for_compound_arguments_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_compound_arguments_list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = for_compound_arguments_list_0(b, l + 1);
    r = r && paren_expr_term(b, l + 1);
    r = r && block_compound(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ variable_declaration | variable ]
  private static boolean for_compound_arguments_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_compound_arguments_list_0")) return false;
    for_compound_arguments_list_0_0(b, l + 1);
    return true;
  }

  // variable_declaration | variable
  private static boolean for_compound_arguments_list_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_compound_arguments_list_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_declaration(b, l + 1);
    if (!r) r = variable(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'for' expr
  public static boolean for_statement_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_modifier")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<for statement modifier>");
    r = consumeToken(b, "for");
    p = r; // pin = 1
    r = r && expr(b, l + 1, -1);
    exit_section_(b, l, m, FOR_STATEMENT_MODIFIER, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'foreach' for_compound_arguments
  public static boolean foreach_compound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_compound")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<foreach compound>");
    r = consumeToken(b, "foreach");
    r = r && for_compound_arguments(b, l + 1);
    exit_section_(b, l, m, FOREACH_COMPOUND, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'foreach' expr
  public static boolean foreach_statement_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_statement_modifier")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<foreach statement modifier>");
    r = consumeToken(b, "foreach");
    p = r; // pin = 1
    r = r && expr(b, l + 1, -1);
    exit_section_(b, l, m, FOREACH_STATEMENT_MODIFIER, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // callable paren_expr_term
  static boolean function_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = callable(b, l + 1);
    r = r && paren_expr_term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'given' compound_conditional_block
  public static boolean given_compound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "given_compound")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<given compound>");
    r = consumeToken(b, "given");
    r = r && compound_conditional_block(b, l + 1);
    exit_section_(b, l, m, GIVEN_COMPOUND, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // perl_glob "{" glob_item_ref_variant "}"
  static boolean glob_item_ref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "glob_item_ref")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = perl_glob(b, l + 1);
    r = r && consumeToken(b, PERL_LBRACE);
    p = r; // pin = 2
    r = r && report_error_(b, glob_item_ref_variant(b, l + 1));
    r = p && consumeToken(b, PERL_RBRACE) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // "SCALAR"
  //     | "ARRAY"
  //     | "HASH"
  //     | "CODE"
  //     | "IO"
  //     | "GLOB"
  //     | "FORMAT"
  //     | "NAME"
  //     | "PACKAGE"
  static boolean glob_item_ref_variant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "glob_item_ref_variant")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "SCALAR");
    if (!r) r = consumeToken(b, "ARRAY");
    if (!r) r = consumeToken(b, "HASH");
    if (!r) r = consumeToken(b, "CODE");
    if (!r) r = consumeToken(b, "IO");
    if (!r) r = consumeToken(b, "GLOB");
    if (!r) r = consumeToken(b, "FORMAT");
    if (!r) r = consumeToken(b, "NAME");
    if (!r) r = consumeToken(b, "PACKAGE");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "(" grep_map_arguments_variations ")"
  //     | grep_map_arguments_variations
  static boolean grep_map_arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grep_map_arguments")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = grep_map_arguments_0(b, l + 1);
    if (!r) r = grep_map_arguments_variations(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" grep_map_arguments_variations ")"
  private static boolean grep_map_arguments_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grep_map_arguments_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_LPAREN);
    r = r && grep_map_arguments_variations(b, l + 1);
    r = r && consumeToken(b, PERL_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // block_safe expr
  //     | scalar_expr "," expr
  static boolean grep_map_arguments_variations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grep_map_arguments_variations")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = grep_map_arguments_variations_0(b, l + 1);
    if (!r) r = grep_map_arguments_variations_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // block_safe expr
  private static boolean grep_map_arguments_variations_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grep_map_arguments_variations_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block_safe(b, l + 1);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // scalar_expr "," expr
  private static boolean grep_map_arguments_variations_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grep_map_arguments_variations_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = scalar_expr(b, l + 1);
    r = r && consumeToken(b, PERL_COMMA);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'grep' grep_map_arguments
  public static boolean grep_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grep_term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<grep term>");
    r = consumeToken(b, "grep");
    r = r && grep_map_arguments(b, l + 1);
    exit_section_(b, l, m, GREP_TERM, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PERL_SIGIL_HASH brace_expr_term   // hash dereference w braces
  //     | PERL_SIGIL_HASH scalar_expr       // scalar dereference wo braces
  //     | perl_hash
  static boolean hash(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hash")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = hash_0(b, l + 1);
    if (!r) r = hash_1(b, l + 1);
    if (!r) r = perl_hash(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PERL_SIGIL_HASH brace_expr_term
  private static boolean hash_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hash_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_SIGIL_HASH);
    r = r && brace_expr_term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PERL_SIGIL_HASH scalar_expr
  private static boolean hash_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hash_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_SIGIL_HASH);
    r = r && scalar_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'if' compound_conditional_block if_compound_elsif * [if_compound_else]
  public static boolean if_compound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_compound")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<if compound>");
    r = consumeToken(b, "if");
    r = r && compound_conditional_block(b, l + 1);
    r = r && if_compound_2(b, l + 1);
    r = r && if_compound_3(b, l + 1);
    exit_section_(b, l, m, IF_COMPOUND, r, false, null);
    return r;
  }

  // if_compound_elsif *
  private static boolean if_compound_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_compound_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!if_compound_elsif(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_compound_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // [if_compound_else]
  private static boolean if_compound_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_compound_3")) return false;
    if_compound_else(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'else' block_safe
  static boolean if_compound_else(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_compound_else")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "else");
    r = r && block_safe(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'elsif' compound_conditional_block
  static boolean if_compound_elsif(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_compound_elsif")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "elsif");
    r = r && compound_conditional_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'if' expr
  public static boolean if_statement_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_modifier")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<if statement modifier>");
    r = consumeToken(b, "if");
    p = r; // pin = 1
    r = r && expr(b, l + 1, -1);
    exit_section_(b, l, m, IF_STATEMENT_MODIFIER, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // PERL_BAREWORD
  public static boolean label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "label")) return false;
    if (!nextTokenIs(b, PERL_BAREWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_BAREWORD);
    exit_section_(b, m, LABEL, r);
    return r;
  }

  /* ********************************************************** */
  // label ":"
  public static boolean label_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "label_declaration")) return false;
    if (!nextTokenIs(b, PERL_BAREWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, PERL_COLON);
    exit_section_(b, m, LABEL_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // 'last' [lnr_param]
  public static boolean last_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "last_term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<last term>");
    r = consumeToken(b, "last");
    r = r && last_term_1(b, l + 1);
    exit_section_(b, l, m, LAST_TERM, r, false, null);
    return r;
  }

  // [lnr_param]
  private static boolean last_term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "last_term_1")) return false;
    lnr_param(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // label | expr
  static boolean lnr_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lnr_param")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    if (!r) r = expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'map' grep_map_arguments
  public static boolean map_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<map term>");
    r = consumeToken(b, "map");
    r = r && grep_map_arguments(b, l + 1);
    exit_section_(b, l, m, MAP_TERM, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ['m'] match_regex_body
  public static boolean match_regex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_regex")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<match regex>");
    r = match_regex_0(b, l + 1);
    r = r && match_regex_body(b, l + 1);
    exit_section_(b, l, m, MATCH_REGEX, r, false, null);
    return r;
  }

  // ['m']
  private static boolean match_regex_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_regex_0")) return false;
    consumeToken(b, "m");
    return true;
  }

  /* ********************************************************** */
  // PERL_REGEX_QUOTE [perl_regex] PERL_REGEX_QUOTE [perl_regex_modifiers]
  static boolean match_regex_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_regex_body")) return false;
    if (!nextTokenIs(b, PERL_REGEX_QUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_REGEX_QUOTE);
    r = r && match_regex_body_1(b, l + 1);
    r = r && consumeToken(b, PERL_REGEX_QUOTE);
    r = r && match_regex_body_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [perl_regex]
  private static boolean match_regex_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_regex_body_1")) return false;
    perl_regex(b, l + 1);
    return true;
  }

  // [perl_regex_modifiers]
  private static boolean match_regex_body_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_regex_body_3")) return false;
    perl_regex_modifiers(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '<<' (string | <<parseBarewordString>>)
  static boolean multiline_marker(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiline_marker")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "<<");
    r = r && multiline_marker_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // string | <<parseBarewordString>>
  private static boolean multiline_marker_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiline_marker_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = string(b, l + 1);
    if (!r) r = parseBarewordString(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PERL_BLOCK_NAME block_safe
  public static boolean named_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_block")) return false;
    if (!nextTokenIs(b, PERL_BLOCK_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_BLOCK_NAME);
    r = r && block_safe(b, l + 1);
    exit_section_(b, m, NAMED_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // 'package' <<parsePerlPackage>>
  public static boolean namespace(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<namespace>");
    r = consumeToken(b, "package");
    p = r; // pin = 1
    r = r && parsePerlPackage(b, l + 1);
    exit_section_(b, l, m, NAMESPACE, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // namespace_element *
  static boolean namespace_content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_content")) return false;
    int c = current_position_(b);
    while (true) {
      if (!namespace_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_content", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (sub_definition | named_block | compound_statement | statement <<statementSemi>> ) PERL_SEMI*
  static boolean namespace_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_element")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namespace_element_0(b, l + 1);
    r = r && namespace_element_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // sub_definition | named_block | compound_statement | statement <<statementSemi>>
  private static boolean namespace_element_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_element_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sub_definition(b, l + 1);
    if (!r) r = named_block(b, l + 1);
    if (!r) r = compound_statement(b, l + 1);
    if (!r) r = namespace_element_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // statement <<statementSemi>>
  private static boolean namespace_element_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_element_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    r = r && statementSemi(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PERL_SEMI*
  private static boolean namespace_element_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_element_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, PERL_SEMI)) break;
      if (!empty_element_parsed_guard_(b, "namespace_element_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // "{" PERL_BAREWORD  "}"
  //     | brack_expr_term
  //     | brace_expr_term
  static boolean nested_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nested_element")) return false;
    if (!nextTokenIs(b, "", PERL_LBRACK, PERL_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = nested_element_0(b, l + 1);
    if (!r) r = brack_expr_term(b, l + 1);
    if (!r) r = brace_expr_term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "{" PERL_BAREWORD  "}"
  private static boolean nested_element_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nested_element_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_LBRACE);
    r = r && consumeToken(b, PERL_BAREWORD);
    r = r && consumeToken(b, PERL_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // nested_element
  //     | paren_expr_term    // function call like $var->()
  //     | scalar_call
  //     | function_call
  //     | rightward_call_expr
  static boolean nested_element_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nested_element_expr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = nested_element(b, l + 1);
    if (!r) r = paren_expr_term(b, l + 1);
    if (!r) r = scalar_call(b, l + 1);
    if (!r) r = function_call(b, l + 1);
    if (!r) r = rightward_call_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'next' [lnr_param]
  public static boolean next_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "next_term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<next term>");
    r = consumeToken(b, "next");
    r = r && next_term_1(b, l + 1);
    exit_section_(b, l, m, NEXT_TERM, r, false, null);
    return r;
  }

  // [lnr_param]
  private static boolean next_term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "next_term_1")) return false;
    lnr_param(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'no' <<parseNoStatement>>
  public static boolean no_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "no_statement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<no statement>");
    r = consumeToken(b, "no");
    p = r; // pin = 1
    r = r && parseNoStatement(b, l + 1);
    exit_section_(b, l, m, NO_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // open_handle [                       // open FILEHANDLE
  //         "," (
  //             open_mode "," (
  //                 open_ref                // open FILEHANDLE,MODE,REFERENCE
  //                 | open_file ["," expr]  // open FILEHANDLE,MODE,EXPR,LIST ?
  //             )
  //             | open_file                 // open FILEHANDLE,EXPR
  //         )
  //     ]
  static boolean open_arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "open_arguments")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = open_handle(b, l + 1);
    r = r && open_arguments_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [                       // open FILEHANDLE
  //         "," (
  //             open_mode "," (
  //                 open_ref                // open FILEHANDLE,MODE,REFERENCE
  //                 | open_file ["," expr]  // open FILEHANDLE,MODE,EXPR,LIST ?
  //             )
  //             | open_file                 // open FILEHANDLE,EXPR
  //         )
  //     ]
  private static boolean open_arguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "open_arguments_1")) return false;
    open_arguments_1_0(b, l + 1);
    return true;
  }

  // "," (
  //             open_mode "," (
  //                 open_ref                // open FILEHANDLE,MODE,REFERENCE
  //                 | open_file ["," expr]  // open FILEHANDLE,MODE,EXPR,LIST ?
  //             )
  //             | open_file                 // open FILEHANDLE,EXPR
  //         )
  private static boolean open_arguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "open_arguments_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_COMMA);
    r = r && open_arguments_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // open_mode "," (
  //                 open_ref                // open FILEHANDLE,MODE,REFERENCE
  //                 | open_file ["," expr]  // open FILEHANDLE,MODE,EXPR,LIST ?
  //             )
  //             | open_file
  private static boolean open_arguments_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "open_arguments_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = open_arguments_1_0_1_0(b, l + 1);
    if (!r) r = open_file(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // open_mode "," (
  //                 open_ref                // open FILEHANDLE,MODE,REFERENCE
  //                 | open_file ["," expr]  // open FILEHANDLE,MODE,EXPR,LIST ?
  //             )
  private static boolean open_arguments_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "open_arguments_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = open_mode(b, l + 1);
    r = r && consumeToken(b, PERL_COMMA);
    r = r && open_arguments_1_0_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // open_ref                // open FILEHANDLE,MODE,REFERENCE
  //                 | open_file ["," expr]
  private static boolean open_arguments_1_0_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "open_arguments_1_0_1_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = open_ref(b, l + 1);
    if (!r) r = open_arguments_1_0_1_0_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // open_file ["," expr]
  private static boolean open_arguments_1_0_1_0_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "open_arguments_1_0_1_0_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = open_file(b, l + 1);
    r = r && open_arguments_1_0_1_0_2_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ["," expr]
  private static boolean open_arguments_1_0_1_0_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "open_arguments_1_0_1_0_2_1_1")) return false;
    open_arguments_1_0_1_0_2_1_1_0(b, l + 1);
    return true;
  }

  // "," expr
  private static boolean open_arguments_1_0_1_0_2_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "open_arguments_1_0_1_0_2_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_COMMA);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // perl_handle | scalar_expr
  public static boolean open_file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "open_file")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<open file>");
    r = perl_handle(b, l + 1);
    if (!r) r = scalar_expr(b, l + 1);
    exit_section_(b, l, m, OPEN_FILE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // variable_declaration | perl_handle
  public static boolean open_handle(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "open_handle")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<open handle>");
    r = variable_declaration(b, l + 1);
    if (!r) r = perl_handle(b, l + 1);
    exit_section_(b, l, m, OPEN_HANDLE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // scalar_expr
  public static boolean open_mode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "open_mode")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<open mode>");
    r = scalar_expr(b, l + 1);
    exit_section_(b, l, m, OPEN_MODE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ref_expr
  public static boolean open_ref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "open_ref")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<open ref>");
    r = ref_expr(b, l + 1);
    exit_section_(b, l, m, OPEN_REF, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "open" ( "(" open_arguments ")" | open_arguments )
  public static boolean open_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "open_term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<open term>");
    r = consumeToken(b, "open");
    r = r && open_term_1(b, l + 1);
    exit_section_(b, l, m, OPEN_TERM, r, false, null);
    return r;
  }

  // "(" open_arguments ")" | open_arguments
  private static boolean open_term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "open_term_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = open_term_1_0(b, l + 1);
    if (!r) r = open_arguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" open_arguments ")"
  private static boolean open_term_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "open_term_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_LPAREN);
    r = r && open_arguments(b, l + 1);
    r = r && consumeToken(b, PERL_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "(" [expr] ")"
  static boolean paren_expr_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expr_term")) return false;
    if (!nextTokenIs(b, PERL_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, PERL_LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, paren_expr_term_1(b, l + 1));
    r = p && consumeToken(b, PERL_RPAREN) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  // [expr]
  private static boolean paren_expr_term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expr_term_1")) return false;
    expr(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // <<parseFile>> <<eof>>
  static boolean perlFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perlFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseFile(b, l + 1);
    r = r && eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // perl_array_built_in
  //     | PERL_SIGIL_ARRAY PERL_BAREWORD ("::" PERL_BAREWORD) *
  public static boolean perl_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_array")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<perl array>");
    r = perl_array_built_in(b, l + 1);
    if (!r) r = perl_array_1(b, l + 1);
    exit_section_(b, l, m, PERL_ARRAY, r, false, null);
    return r;
  }

  // PERL_SIGIL_ARRAY PERL_BAREWORD ("::" PERL_BAREWORD) *
  private static boolean perl_array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_array_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PERL_SIGIL_ARRAY, PERL_BAREWORD);
    r = r && perl_array_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("::" PERL_BAREWORD) *
  private static boolean perl_array_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_array_1_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!perl_array_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "perl_array_1_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "::" PERL_BAREWORD
  private static boolean perl_array_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_array_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_DEPACKAGE);
    r = r && consumeToken(b, PERL_BAREWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "@_" | "@!" | "@+" | "@-" | "@^H"
  static boolean perl_array_built_in(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_array_built_in")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "@_");
    if (!r) r = consumeToken(b, "@!");
    if (!r) r = consumeToken(b, "@+");
    if (!r) r = consumeToken(b, "@-");
    if (!r) r = consumeToken(b, "@^H");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "*" PERL_BAREWORD ("::" PERL_BAREWORD) *
  public static boolean perl_glob(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_glob")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<perl glob>");
    r = consumeToken(b, "*");
    r = r && consumeToken(b, PERL_BAREWORD);
    r = r && perl_glob_2(b, l + 1);
    exit_section_(b, l, m, PERL_GLOB, r, false, null);
    return r;
  }

  // ("::" PERL_BAREWORD) *
  private static boolean perl_glob_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_glob_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!perl_glob_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "perl_glob_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "::" PERL_BAREWORD
  private static boolean perl_glob_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_glob_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_DEPACKAGE);
    r = r && consumeToken(b, PERL_BAREWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<parseBarewordHandle>> | perl_scalar !PERL_OPERATOR | "{" scalar "}"
  static boolean perl_handle(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_handle")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseBarewordHandle(b, l + 1);
    if (!r) r = perl_handle_1(b, l + 1);
    if (!r) r = perl_handle_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // perl_scalar !PERL_OPERATOR
  private static boolean perl_handle_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_handle_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = perl_scalar(b, l + 1);
    r = r && perl_handle_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !PERL_OPERATOR
  private static boolean perl_handle_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_handle_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !consumeToken(b, PERL_OPERATOR);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // "{" scalar "}"
  private static boolean perl_handle_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_handle_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_LBRACE);
    r = r && scalar(b, l + 1);
    r = r && consumeToken(b, PERL_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // perl_hash_built_in
  //     | PERL_SIGIL_HASH PERL_BAREWORD ("::" PERL_BAREWORD) *
  public static boolean perl_hash(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_hash")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<perl hash>");
    r = perl_hash_built_in(b, l + 1);
    if (!r) r = perl_hash_1(b, l + 1);
    exit_section_(b, l, m, PERL_HASH, r, false, null);
    return r;
  }

  // PERL_SIGIL_HASH PERL_BAREWORD ("::" PERL_BAREWORD) *
  private static boolean perl_hash_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_hash_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PERL_SIGIL_HASH, PERL_BAREWORD);
    r = r && perl_hash_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("::" PERL_BAREWORD) *
  private static boolean perl_hash_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_hash_1_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!perl_hash_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "perl_hash_1_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "::" PERL_BAREWORD
  private static boolean perl_hash_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_hash_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_DEPACKAGE);
    r = r && consumeToken(b, PERL_BAREWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "%!" | "%+" | "%-" | "%^H"
  static boolean perl_hash_built_in(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_hash_built_in")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "%!");
    if (!r) r = consumeToken(b, "%+");
    if (!r) r = consumeToken(b, "%-");
    if (!r) r = consumeToken(b, "%^H");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<parseBarewordPackage>>
  static boolean perl_package(PsiBuilder b, int l) {
    return parseBarewordPackage(b, l + 1);
  }

  /* ********************************************************** */
  // PERL_REGEX_TOKEN +
  public static boolean perl_regex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_regex")) return false;
    if (!nextTokenIs(b, PERL_REGEX_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_REGEX_TOKEN);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, PERL_REGEX_TOKEN)) break;
      if (!empty_element_parsed_guard_(b, "perl_regex", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, PERL_REGEX, r);
    return r;
  }

  /* ********************************************************** */
  // PERL_REGEX_MODIFIER +
  public static boolean perl_regex_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_regex_modifiers")) return false;
    if (!nextTokenIs(b, PERL_REGEX_MODIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_REGEX_MODIFIER);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, PERL_REGEX_MODIFIER)) break;
      if (!empty_element_parsed_guard_(b, "perl_regex_modifiers", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, PERL_REGEX_MODIFIERS, r);
    return r;
  }

  /* ********************************************************** */
  // (PERL_SIGIL_SCALAR_INDEX | PERL_SIGIL_SCALAR) PERL_SIGIL_SCALAR * PERL_BAREWORD ("::" PERL_BAREWORD) *
  //     | perl_scalar_built_in
  public static boolean perl_scalar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_scalar")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<perl scalar>");
    r = perl_scalar_0(b, l + 1);
    if (!r) r = perl_scalar_built_in(b, l + 1);
    exit_section_(b, l, m, PERL_SCALAR, r, false, null);
    return r;
  }

  // (PERL_SIGIL_SCALAR_INDEX | PERL_SIGIL_SCALAR) PERL_SIGIL_SCALAR * PERL_BAREWORD ("::" PERL_BAREWORD) *
  private static boolean perl_scalar_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_scalar_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = perl_scalar_0_0(b, l + 1);
    r = r && perl_scalar_0_1(b, l + 1);
    r = r && consumeToken(b, PERL_BAREWORD);
    r = r && perl_scalar_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PERL_SIGIL_SCALAR_INDEX | PERL_SIGIL_SCALAR
  private static boolean perl_scalar_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_scalar_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_SIGIL_SCALAR_INDEX);
    if (!r) r = consumeToken(b, PERL_SIGIL_SCALAR);
    exit_section_(b, m, null, r);
    return r;
  }

  // PERL_SIGIL_SCALAR *
  private static boolean perl_scalar_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_scalar_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, PERL_SIGIL_SCALAR)) break;
      if (!empty_element_parsed_guard_(b, "perl_scalar_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ("::" PERL_BAREWORD) *
  private static boolean perl_scalar_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_scalar_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!perl_scalar_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "perl_scalar_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "::" PERL_BAREWORD
  private static boolean perl_scalar_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_scalar_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_DEPACKAGE);
    r = r && consumeToken(b, PERL_BAREWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "$^WARNING_BITS" | "$^WIDE_SYSTEM_CALLS" | "$^UNICODE" | "$^TAINT" | "$^UTF8LOCALE" | "$^RE_TRIE_MAXBUF" | "$^CHILD_ERROR_NATIVE" | "$^ENCODING" | "$^OPEN" | "$^RE_DEBUG_FLAGS" | "$^A" | "$^C" | "$^T" | "$^S" | "$^V" | "$^W" | "$^X" | "$^D" | "$^E" | "$^F" | "$^H" | "$^I" | "$^L" | "$^M" | "$^N" | "$^O" | "$^P" | "$^R" | "$^H" | "$!" | "$\"" | "$#" | "$$" | "$%" | "$&" | "$'" | "$(" | "$)" | "$*" | "$+" | "$," | "$_" | "$-" | "$`" | "$." | "$a" | "$/" | "$0" | "$:" | "$;" | "$<" | "$=" | "$>" | "$?" | "$@" | "$[" | "$]" | "$|" | "$^" | "$~"
  //     | PERL_SIGIL_SCALAR PERL_NUMBER
  static boolean perl_scalar_built_in(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perl_scalar_built_in")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "$^WARNING_BITS");
    if (!r) r = consumeToken(b, "$^WIDE_SYSTEM_CALLS");
    if (!r) r = consumeToken(b, "$^UNICODE");
    if (!r) r = consumeToken(b, "$^TAINT");
    if (!r) r = consumeToken(b, "$^UTF8LOCALE");
    if (!r) r = consumeToken(b, "$^RE_TRIE_MAXBUF");
    if (!r) r = consumeToken(b, "$^CHILD_ERROR_NATIVE");
    if (!r) r = consumeToken(b, "$^ENCODING");
    if (!r) r = consumeToken(b, "$^OPEN");
    if (!r) r = consumeToken(b, "$^RE_DEBUG_FLAGS");
    if (!r) r = consumeToken(b, "$^A");
    if (!r) r = consumeToken(b, "$^C");
    if (!r) r = consumeToken(b, "$^T");
    if (!r) r = consumeToken(b, "$^S");
    if (!r) r = consumeToken(b, "$^V");
    if (!r) r = consumeToken(b, "$^W");
    if (!r) r = consumeToken(b, "$^X");
    if (!r) r = consumeToken(b, "$^D");
    if (!r) r = consumeToken(b, "$^E");
    if (!r) r = consumeToken(b, "$^F");
    if (!r) r = consumeToken(b, "$^H");
    if (!r) r = consumeToken(b, "$^I");
    if (!r) r = consumeToken(b, "$^L");
    if (!r) r = consumeToken(b, "$^M");
    if (!r) r = consumeToken(b, "$^N");
    if (!r) r = consumeToken(b, "$^O");
    if (!r) r = consumeToken(b, "$^P");
    if (!r) r = consumeToken(b, "$^R");
    if (!r) r = consumeToken(b, "$^H");
    if (!r) r = consumeToken(b, "$!");
    if (!r) r = consumeToken(b, "$\"");
    if (!r) r = consumeToken(b, PERL_SIGIL_SCALAR_INDEX);
    if (!r) r = consumeToken(b, "$$");
    if (!r) r = consumeToken(b, "$%");
    if (!r) r = consumeToken(b, "$&");
    if (!r) r = consumeToken(b, "$'");
    if (!r) r = consumeToken(b, "$(");
    if (!r) r = consumeToken(b, "$)");
    if (!r) r = consumeToken(b, "$*");
    if (!r) r = consumeToken(b, "$+");
    if (!r) r = consumeToken(b, "$,");
    if (!r) r = consumeToken(b, "$_");
    if (!r) r = consumeToken(b, "$-");
    if (!r) r = consumeToken(b, "$`");
    if (!r) r = consumeToken(b, "$.");
    if (!r) r = consumeToken(b, "$a");
    if (!r) r = consumeToken(b, "$/");
    if (!r) r = consumeToken(b, "$0");
    if (!r) r = consumeToken(b, "$:");
    if (!r) r = consumeToken(b, "$;");
    if (!r) r = consumeToken(b, "$<");
    if (!r) r = consumeToken(b, "$=");
    if (!r) r = consumeToken(b, "$>");
    if (!r) r = consumeToken(b, "$?");
    if (!r) r = consumeToken(b, "$@");
    if (!r) r = consumeToken(b, "$[");
    if (!r) r = consumeToken(b, "$]");
    if (!r) r = consumeToken(b, "$|");
    if (!r) r = consumeToken(b, "$^");
    if (!r) r = consumeToken(b, "$~");
    if (!r) r = parseTokens(b, 0, PERL_SIGIL_SCALAR, PERL_NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<parseVersion>>
  static boolean perl_version(PsiBuilder b, int l) {
    return parseVersion(b, l + 1);
  }

  /* ********************************************************** */
  // perl_handle expr | expr
  static boolean print_arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "print_arguments")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = print_arguments_0(b, l + 1);
    if (!r) r = expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // perl_handle expr
  private static boolean print_arguments_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "print_arguments_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = perl_handle(b, l + 1);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ("print"|"say") ( "(" [print_arguments] ")" | [print_arguments] )
  public static boolean print_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "print_term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<print term>");
    r = print_term_0(b, l + 1);
    r = r && print_term_1(b, l + 1);
    exit_section_(b, l, m, PRINT_TERM, r, false, null);
    return r;
  }

  // "print"|"say"
  private static boolean print_term_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "print_term_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "print");
    if (!r) r = consumeToken(b, "say");
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" [print_arguments] ")" | [print_arguments]
  private static boolean print_term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "print_term_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = print_term_1_0(b, l + 1);
    if (!r) r = print_term_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" [print_arguments] ")"
  private static boolean print_term_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "print_term_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_LPAREN);
    r = r && print_term_1_0_1(b, l + 1);
    r = r && consumeToken(b, PERL_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // [print_arguments]
  private static boolean print_term_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "print_term_1_0_1")) return false;
    print_arguments(b, l + 1);
    return true;
  }

  // [print_arguments]
  private static boolean print_term_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "print_term_1_1")) return false;
    print_arguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // !(PERL_RANGLE | <<eof>>)
  static boolean recover_angle(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_angle")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !recover_angle_0(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // PERL_RANGLE | <<eof>>
  private static boolean recover_angle_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_angle_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_RANGLE);
    if (!r) r = eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !(PERL_RBRACE | <<eof>>)
  static boolean recover_brace(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_brace")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !recover_brace_0(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // PERL_RBRACE | <<eof>>
  private static boolean recover_brace_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_brace_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_RBRACE);
    if (!r) r = eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !(PERL_RBRACK | <<eof>>)
  static boolean recover_brack(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_brack")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !recover_brack_0(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // PERL_RBRACK | <<eof>>
  private static boolean recover_brack_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_brack_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_RBRACK);
    if (!r) r = eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !(PERL_RPAREN | <<eof>>)
  static boolean recover_paren(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_paren")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !recover_paren_0(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // PERL_RPAREN | <<eof>>
  private static boolean recover_paren_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_paren_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_RPAREN);
    if (!r) r = eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !(PERL_SEMI  | <<eof>>)
  static boolean recover_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !recover_statement_0(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // PERL_SEMI  | <<eof>>
  private static boolean recover_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_SEMI);
    if (!r) r = eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'redo' [lnr_param]
  public static boolean redo_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "redo_term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<redo term>");
    r = consumeToken(b, "redo");
    r = r && redo_term_1(b, l + 1);
    exit_section_(b, l, m, REDO_TERM, r, false, null);
    return r;
  }

  // [lnr_param]
  private static boolean redo_term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "redo_term_1")) return false;
    lnr_param(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '&'
  //     (
  //         <<guessBarewordCallable>>
  //         | {expr}
  //         | scalar
  //     )
  static boolean referencable_method(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "referencable_method")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "&");
    r = r && referencable_method_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<guessBarewordCallable>>
  //         | {expr}
  //         | scalar
  private static boolean referencable_method_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "referencable_method_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = guessBarewordCallable(b, l + 1);
    if (!r) r = referencable_method_1_1(b, l + 1);
    if (!r) r = scalar(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {expr}
  private static boolean referencable_method_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "referencable_method_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // anon_array_ref
  //     | anon_hash_ref
  //     | code_ref
  //     | glob_item_ref
  public static boolean reference_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "reference_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<reference value>");
    r = anon_array_ref(b, l + 1);
    if (!r) r = anon_hash_ref(b, l + 1);
    if (!r) r = code_ref(b, l + 1);
    if (!r) r = glob_item_ref(b, l + 1);
    exit_section_(b, l, m, REFERENCE_VALUE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PERL_REGEX_QUOTE [perl_regex] PERL_REGEX_QUOTE
  //     | [perl_regex] PERL_REGEX_QUOTE
  static boolean regex_replacement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regex_replacement")) return false;
    if (!nextTokenIs(b, "", PERL_REGEX_QUOTE, PERL_REGEX_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = regex_replacement_0(b, l + 1);
    if (!r) r = regex_replacement_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PERL_REGEX_QUOTE [perl_regex] PERL_REGEX_QUOTE
  private static boolean regex_replacement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regex_replacement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_REGEX_QUOTE);
    r = r && regex_replacement_0_1(b, l + 1);
    r = r && consumeToken(b, PERL_REGEX_QUOTE);
    exit_section_(b, m, null, r);
    return r;
  }

  // [perl_regex]
  private static boolean regex_replacement_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regex_replacement_0_1")) return false;
    perl_regex(b, l + 1);
    return true;
  }

  // [perl_regex] PERL_REGEX_QUOTE
  private static boolean regex_replacement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regex_replacement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = regex_replacement_1_0(b, l + 1);
    r = r && consumeToken(b, PERL_REGEX_QUOTE);
    exit_section_(b, m, null, r);
    return r;
  }

  // [perl_regex]
  private static boolean regex_replacement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regex_replacement_1_0")) return false;
    perl_regex(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // compile_regex
  //     | replacement_regex
  //     | tr_regex
  //     | match_regex
  static boolean regex_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regex_term")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = compile_regex(b, l + 1);
    if (!r) r = replacement_regex(b, l + 1);
    if (!r) r = tr_regex(b, l + 1);
    if (!r) r = match_regex(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 's' PERL_REGEX_QUOTE [perl_regex] PERL_REGEX_QUOTE regex_replacement [perl_regex_modifiers]
  public static boolean replacement_regex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "replacement_regex")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<replacement regex>");
    r = consumeToken(b, "s");
    r = r && consumeToken(b, PERL_REGEX_QUOTE);
    r = r && replacement_regex_2(b, l + 1);
    r = r && consumeToken(b, PERL_REGEX_QUOTE);
    r = r && regex_replacement(b, l + 1);
    r = r && replacement_regex_5(b, l + 1);
    exit_section_(b, l, m, REPLACEMENT_REGEX, r, false, null);
    return r;
  }

  // [perl_regex]
  private static boolean replacement_regex_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "replacement_regex_2")) return false;
    perl_regex(b, l + 1);
    return true;
  }

  // [perl_regex_modifiers]
  private static boolean replacement_regex_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "replacement_regex_5")) return false;
    perl_regex_modifiers(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'require' (perl_package | perl_version | string)
  public static boolean require_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "require_term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<require term>");
    r = consumeToken(b, "require");
    r = r && require_term_1(b, l + 1);
    exit_section_(b, l, m, REQUIRE_TERM, r, false, null);
    return r;
  }

  // perl_package | perl_version | string
  private static boolean require_term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "require_term_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = perl_package(b, l + 1);
    if (!r) r = perl_version(b, l + 1);
    if (!r) r = string(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // perl_scalar nested_element    // hash or array item
  //     | perl_scalar
  //     | PERL_SIGIL_SCALAR "{" PERL_BAREWORD "}"
  //     | paren_expr_term nested_element
  //     | 'undef'
  static boolean scalar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scalar")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = scalar_0(b, l + 1);
    if (!r) r = perl_scalar(b, l + 1);
    if (!r) r = scalar_2(b, l + 1);
    if (!r) r = scalar_3(b, l + 1);
    if (!r) r = consumeToken(b, "undef");
    exit_section_(b, m, null, r);
    return r;
  }

  // perl_scalar nested_element
  private static boolean scalar_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scalar_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = perl_scalar(b, l + 1);
    r = r && nested_element(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PERL_SIGIL_SCALAR "{" PERL_BAREWORD "}"
  private static boolean scalar_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scalar_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_SIGIL_SCALAR);
    r = r && consumeToken(b, PERL_LBRACE);
    r = r && consumeToken(b, PERL_BAREWORD);
    r = r && consumeToken(b, PERL_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // paren_expr_term nested_element
  private static boolean scalar_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scalar_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = paren_expr_term(b, l + 1);
    r = r && nested_element(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // perl_scalar paren_expr_term
  public static boolean scalar_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scalar_call")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<scalar call>");
    r = perl_scalar(b, l + 1);
    r = r && paren_expr_term(b, l + 1);
    exit_section_(b, l, m, SCALAR_CALL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<parseExpressionLevel 4>>
  static boolean scalar_expr(PsiBuilder b, int l) {
    return parseExpressionLevel(b, l + 1, 4);
  }

  /* ********************************************************** */
  // PERL_NUMBER
  //     | PERL_TAG  // __PACKAGE__ etc.
  //     | string
  static boolean scalar_primitive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scalar_primitive")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_NUMBER);
    if (!r) r = consumeToken(b, PERL_TAG);
    if (!r) r = string(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<parseBarewordFunction>> expr
  //     | block_safe expr
  //     | expr
  static boolean sort_op_arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sort_op_arguments")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sort_op_arguments_0(b, l + 1);
    if (!r) r = sort_op_arguments_1(b, l + 1);
    if (!r) r = expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<parseBarewordFunction>> expr
  private static boolean sort_op_arguments_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sort_op_arguments_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseBarewordFunction(b, l + 1);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // block_safe expr
  private static boolean sort_op_arguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sort_op_arguments_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block_safe(b, l + 1);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'sort' sort_op_arguments
  public static boolean sort_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sort_term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<sort term>");
    r = consumeToken(b, "sort");
    r = r && sort_op_arguments(b, l + 1);
    exit_section_(b, l, m, SORT_TERM, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // statement_variation [statement_modifier]
  static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = statement_variation(b, l + 1);
    r = r && statement_1(b, l + 1);
    exit_section_(b, l, m, null, r, false, recover_statement_parser_);
    return r;
  }

  // [statement_modifier]
  private static boolean statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_1")) return false;
    statement_modifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // if_statement_modifier
  //     | unless_statement_modifier
  //     | while_statement_modifier
  //     | until_statement_modifier
  //     | for_statement_modifier
  //     | foreach_statement_modifier
  //     | when_statement_modifier
  static boolean statement_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = if_statement_modifier(b, l + 1);
    if (!r) r = unless_statement_modifier(b, l + 1);
    if (!r) r = while_statement_modifier(b, l + 1);
    if (!r) r = until_statement_modifier(b, l + 1);
    if (!r) r = for_statement_modifier(b, l + 1);
    if (!r) r = foreach_statement_modifier(b, l + 1);
    if (!r) r = when_statement_modifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // use_statement
  //     | no_statement
  //     | sub_declaration
  //     | expr
  static boolean statement_variation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_variation")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = use_statement(b, l + 1);
    if (!r) r = no_statement(b, l + 1);
    if (!r) r = sub_declaration(b, l + 1);
    if (!r) r = expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // string_quoted | multiline_marker | <<parseBarewordString>>
  public static boolean string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<string>");
    r = string_quoted(b, l + 1);
    if (!r) r = multiline_marker(b, l + 1);
    if (!r) r = parseBarewordString(b, l + 1);
    exit_section_(b, l, m, STRING, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'qw' PERL_QUOTE <<parseBarewordString>> * PERL_QUOTE
  static boolean string_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "qw");
    r = r && consumeToken(b, PERL_QUOTE);
    r = r && string_list_2(b, l + 1);
    r = r && consumeToken(b, PERL_QUOTE);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<parseBarewordString>> *
  private static boolean string_list_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_list_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!parseBarewordString(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "string_list_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // ['qq' | 'qx' | 'q'] PERL_QUOTE <<parseBarewordString>> PERL_QUOTE
  static boolean string_quoted(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_quoted")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = string_quoted_0(b, l + 1);
    r = r && consumeToken(b, PERL_QUOTE);
    r = r && parseBarewordString(b, l + 1);
    r = r && consumeToken(b, PERL_QUOTE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['qq' | 'qx' | 'q']
  private static boolean string_quoted_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_quoted_0")) return false;
    string_quoted_0_0(b, l + 1);
    return true;
  }

  // 'qq' | 'qx' | 'q'
  private static boolean string_quoted_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_quoted_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "qq");
    if (!r) r = consumeToken(b, "qx");
    if (!r) r = consumeToken(b, "q");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ":" <<parseSubAttributes>>
  static boolean sub_attributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sub_attributes")) return false;
    if (!nextTokenIs(b, PERL_COLON)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, PERL_COLON);
    p = r; // pin = 1
    r = r && parseSubAttributes(b, l + 1);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'sub' <<parseSubDeclaration>>
  public static boolean sub_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sub_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<sub declaration>");
    r = consumeToken(b, "sub");
    r = r && parseSubDeclaration(b, l + 1);
    exit_section_(b, l, m, SUB_DECLARATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [sub_prototype] [sub_attributes]
  static boolean sub_declaration_parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sub_declaration_parameters")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sub_declaration_parameters_0(b, l + 1);
    r = r && sub_declaration_parameters_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [sub_prototype]
  private static boolean sub_declaration_parameters_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sub_declaration_parameters_0")) return false;
    sub_prototype(b, l + 1);
    return true;
  }

  // [sub_attributes]
  private static boolean sub_declaration_parameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sub_declaration_parameters_1")) return false;
    sub_attributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'sub' <<parseSubDefinition>>
  public static boolean sub_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sub_definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<sub definition>");
    r = consumeToken(b, "sub");
    r = r && parseSubDefinition(b, l + 1);
    exit_section_(b, l, m, SUB_DEFINITION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // sub_prototype [sub_attributes]
  //     | sub_attributes [sub_signature]
  //     | sub_signature
  static boolean sub_definition_parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sub_definition_parameters")) return false;
    if (!nextTokenIs(b, "", PERL_LPAREN, PERL_COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sub_definition_parameters_0(b, l + 1);
    if (!r) r = sub_definition_parameters_1(b, l + 1);
    if (!r) r = sub_signature(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // sub_prototype [sub_attributes]
  private static boolean sub_definition_parameters_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sub_definition_parameters_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sub_prototype(b, l + 1);
    r = r && sub_definition_parameters_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [sub_attributes]
  private static boolean sub_definition_parameters_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sub_definition_parameters_0_1")) return false;
    sub_attributes(b, l + 1);
    return true;
  }

  // sub_attributes [sub_signature]
  private static boolean sub_definition_parameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sub_definition_parameters_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sub_attributes(b, l + 1);
    r = r && sub_definition_parameters_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [sub_signature]
  private static boolean sub_definition_parameters_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sub_definition_parameters_1_1")) return false;
    sub_signature(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "(" [<<parseSubPrototype>>] ")"
  static boolean sub_prototype(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sub_prototype")) return false;
    if (!nextTokenIs(b, PERL_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, PERL_LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, sub_prototype_1(b, l + 1));
    r = p && consumeToken(b, PERL_RPAREN) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  // [<<parseSubPrototype>>]
  private static boolean sub_prototype_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sub_prototype_1")) return false;
    parseSubPrototype(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "(" [<<parseSubSignature>>] ")"
  static boolean sub_signature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sub_signature")) return false;
    if (!nextTokenIs(b, PERL_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, PERL_LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, sub_signature_1(b, l + 1));
    r = p && consumeToken(b, PERL_RPAREN) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  // [<<parseSubSignature>>]
  private static boolean sub_signature_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sub_signature_1")) return false;
    parseSubSignature(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'sub' sub_definition_parameters block_safe
  public static boolean sub_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sub_term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<sub term>");
    r = consumeToken(b, "sub");
    r = r && sub_definition_parameters(b, l + 1);
    r = r && block_safe(b, l + 1);
    exit_section_(b, l, m, SUB_TERM, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PERL_REGEX_MODIFIER +
  public static boolean tr_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tr_modifiers")) return false;
    if (!nextTokenIs(b, PERL_REGEX_MODIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_REGEX_MODIFIER);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, PERL_REGEX_MODIFIER)) break;
      if (!empty_element_parsed_guard_(b, "tr_modifiers", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, TR_MODIFIERS, r);
    return r;
  }

  /* ********************************************************** */
  // ('tr'|'y') PERL_REGEX_QUOTE tr_searchlist PERL_REGEX_QUOTE [PERL_REGEX_QUOTE] tr_replacementlist PERL_REGEX_QUOTE [tr_modifiers]
  public static boolean tr_regex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tr_regex")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<tr regex>");
    r = tr_regex_0(b, l + 1);
    r = r && consumeToken(b, PERL_REGEX_QUOTE);
    r = r && tr_searchlist(b, l + 1);
    r = r && consumeToken(b, PERL_REGEX_QUOTE);
    r = r && tr_regex_4(b, l + 1);
    r = r && tr_replacementlist(b, l + 1);
    r = r && consumeToken(b, PERL_REGEX_QUOTE);
    r = r && tr_regex_7(b, l + 1);
    exit_section_(b, l, m, TR_REGEX, r, false, null);
    return r;
  }

  // 'tr'|'y'
  private static boolean tr_regex_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tr_regex_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "tr");
    if (!r) r = consumeToken(b, "y");
    exit_section_(b, m, null, r);
    return r;
  }

  // [PERL_REGEX_QUOTE]
  private static boolean tr_regex_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tr_regex_4")) return false;
    consumeToken(b, PERL_REGEX_QUOTE);
    return true;
  }

  // [tr_modifiers]
  private static boolean tr_regex_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tr_regex_7")) return false;
    tr_modifiers(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // PERL_STRING_CONTENT
  public static boolean tr_replacementlist(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tr_replacementlist")) return false;
    if (!nextTokenIs(b, PERL_STRING_CONTENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_STRING_CONTENT);
    exit_section_(b, m, TR_REPLACEMENTLIST, r);
    return r;
  }

  /* ********************************************************** */
  // PERL_STRING_CONTENT
  public static boolean tr_searchlist(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tr_searchlist")) return false;
    if (!nextTokenIs(b, PERL_STRING_CONTENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_STRING_CONTENT);
    exit_section_(b, m, TR_SEARCHLIST, r);
    return r;
  }

  /* ********************************************************** */
  // "undef" variable
  public static boolean undef_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "undef_term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<undef term>");
    r = consumeToken(b, "undef");
    r = r && variable(b, l + 1);
    exit_section_(b, l, m, UNDEF_TERM, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'unless' compound_conditional_block if_compound_elsif * [if_compound_else]
  public static boolean unless_compound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unless_compound")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<unless compound>");
    r = consumeToken(b, "unless");
    r = r && compound_conditional_block(b, l + 1);
    r = r && unless_compound_2(b, l + 1);
    r = r && unless_compound_3(b, l + 1);
    exit_section_(b, l, m, UNLESS_COMPOUND, r, false, null);
    return r;
  }

  // if_compound_elsif *
  private static boolean unless_compound_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unless_compound_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!if_compound_elsif(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "unless_compound_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // [if_compound_else]
  private static boolean unless_compound_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unless_compound_3")) return false;
    if_compound_else(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'unless' expr
  public static boolean unless_statement_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unless_statement_modifier")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<unless statement modifier>");
    r = consumeToken(b, "unless");
    p = r; // pin = 1
    r = r && expr(b, l + 1, -1);
    exit_section_(b, l, m, UNLESS_STATEMENT_MODIFIER, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'until' compound_conditional_block [compound_continue_block]
  public static boolean until_compound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "until_compound")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<until compound>");
    r = consumeToken(b, "until");
    r = r && compound_conditional_block(b, l + 1);
    r = r && until_compound_2(b, l + 1);
    exit_section_(b, l, m, UNTIL_COMPOUND, r, false, null);
    return r;
  }

  // [compound_continue_block]
  private static boolean until_compound_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "until_compound_2")) return false;
    compound_continue_block(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'until' expr
  public static boolean until_statement_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "until_statement_modifier")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<until statement modifier>");
    r = consumeToken(b, "until");
    p = r; // pin = 1
    r = r && expr(b, l + 1, -1);
    exit_section_(b, l, m, UNTIL_STATEMENT_MODIFIER, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'use' <<parseUseStatement>>
  public static boolean use_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_statement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<use statement>");
    r = consumeToken(b, "use");
    p = r; // pin = 1
    r = r && parseUseStatement(b, l + 1);
    exit_section_(b, l, m, USE_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // scalar | array | hash | perl_glob
  static boolean variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = scalar(b, l + 1);
    if (!r) r = array(b, l + 1);
    if (!r) r = hash(b, l + 1);
    if (!r) r = perl_glob(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // variable_declaration_global
  //     | variable_declaration_lexical
  //     | variable_declaration_local
  static boolean variable_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_declaration_global(b, l + 1);
    if (!r) r = variable_declaration_lexical(b, l + 1);
    if (!r) r = variable_declaration_local(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'our' [perl_package] variable_definition_variation
  public static boolean variable_declaration_global(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_global")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<variable declaration global>");
    r = consumeToken(b, "our");
    p = r; // pin = 1
    r = r && report_error_(b, variable_declaration_global_1(b, l + 1));
    r = p && variable_definition_variation(b, l + 1) && r;
    exit_section_(b, l, m, VARIABLE_DECLARATION_GLOBAL, r, p, null);
    return r || p;
  }

  // [perl_package]
  private static boolean variable_declaration_global_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_global_1")) return false;
    perl_package(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ('my' | 'state') [perl_package] variable_definition_variation
  public static boolean variable_declaration_lexical(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_lexical")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<variable declaration lexical>");
    r = variable_declaration_lexical_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, variable_declaration_lexical_1(b, l + 1));
    r = p && variable_definition_variation(b, l + 1) && r;
    exit_section_(b, l, m, VARIABLE_DECLARATION_LEXICAL, r, p, null);
    return r || p;
  }

  // 'my' | 'state'
  private static boolean variable_declaration_lexical_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_lexical_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "my");
    if (!r) r = consumeToken(b, "state");
    exit_section_(b, m, null, r);
    return r;
  }

  // [perl_package]
  private static boolean variable_declaration_lexical_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_lexical_1")) return false;
    perl_package(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'local' [perl_package]  variable_definition_variation
  public static boolean variable_declaration_local(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_local")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<variable declaration local>");
    r = consumeToken(b, "local");
    p = r; // pin = 1
    r = r && report_error_(b, variable_declaration_local_1(b, l + 1));
    r = p && variable_definition_variation(b, l + 1) && r;
    exit_section_(b, l, m, VARIABLE_DECLARATION_LOCAL, r, p, null);
    return r || p;
  }

  // [perl_package]
  private static boolean variable_declaration_local_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_local_1")) return false;
    perl_package(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '(' variable (',' variable ) * ')'
  static boolean variable_definition_paren(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_definition_paren")) return false;
    if (!nextTokenIs(b, PERL_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, PERL_LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, variable(b, l + 1));
    r = p && report_error_(b, variable_definition_paren_2(b, l + 1)) && r;
    r = p && consumeToken(b, PERL_RPAREN) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  // (',' variable ) *
  private static boolean variable_definition_paren_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_definition_paren_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!variable_definition_paren_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variable_definition_paren_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' variable
  private static boolean variable_definition_paren_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_definition_paren_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_COMMA);
    r = r && variable(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // variable_definition_paren | variable
  static boolean variable_definition_variation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_definition_variation")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_definition_paren(b, l + 1);
    if (!r) r = variable(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'when' expr
  public static boolean when_statement_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_statement_modifier")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<when statement modifier>");
    r = consumeToken(b, "when");
    p = r; // pin = 1
    r = r && expr(b, l + 1, -1);
    exit_section_(b, l, m, WHEN_STATEMENT_MODIFIER, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'while' compound_conditional_block [compound_continue_block]
  public static boolean while_compound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_compound")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<while compound>");
    r = consumeToken(b, "while");
    r = r && compound_conditional_block(b, l + 1);
    r = r && while_compound_2(b, l + 1);
    exit_section_(b, l, m, WHILE_COMPOUND, r, false, null);
    return r;
  }

  // [compound_continue_block]
  private static boolean while_compound_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_compound_2")) return false;
    compound_continue_block(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'while' expr
  public static boolean while_statement_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement_modifier")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<while statement modifier>");
    r = consumeToken(b, "while");
    p = r; // pin = 1
    r = r && expr(b, l + 1, -1);
    exit_section_(b, l, m, WHILE_STATEMENT_MODIFIER, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // Expression root: expr
  // Operator priority table:
  // 0: BINARY(lp_or_xor_expr)
  // 1: BINARY(lp_and_expr)
  // 2: PREFIX(lp_not_expr)
  // 3: ATOM(rightward_call_expr)
  // 4: POSTFIX(comma_expr)
  // 5: BINARY(assign_expr)
  // 6: BINARY(trenar_expr)
  // 7: BINARY(flipflop_expr)
  // 8: BINARY(or_expr)
  // 9: BINARY(and_expr)
  // 10: BINARY(bitwise_or_xor_expr)
  // 11: BINARY(bitwise_and_expr)
  // 12: BINARY(equal_expr)
  // 13: BINARY(compare_expr)
  // 14: PREFIX(named_unary_expr) ATOM(filetest_expr)
  // 15: BINARY(shift_expr)
  // 16: BINARY(add_expr)
  // 17: BINARY(mul_expr)
  // 18: BINARY(regex_expr)
  // 19: PREFIX(ref_expr) ATOM(bareword_expr) PREFIX(prefix_unary_expr)
  // 20: N_ARY(pow_expr)
  // 21: PREFIX(pref_pp_expr) POSTFIX(suff_pp_expr)
  // 22: POSTFIX(deref_expr)
  // 23: ATOM(term_expr)
  public static boolean expr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr")) return false;
    addVariant(b, "<expr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expr>");
    r = lp_not_expr(b, l + 1);
    if (!r) r = rightward_call_expr(b, l + 1);
    if (!r) r = named_unary_expr(b, l + 1);
    if (!r) r = filetest_expr(b, l + 1);
    if (!r) r = ref_expr(b, l + 1);
    if (!r) r = bareword_expr(b, l + 1);
    if (!r) r = prefix_unary_expr(b, l + 1);
    if (!r) r = pref_pp_expr(b, l + 1);
    if (!r) r = term_expr(b, l + 1);
    p = r;
    r = r && expr_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean expr_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && lp_or_xor_expr_0(b, l + 1)) {
        r = expr(b, l, 0);
        exit_section_(b, l, m, LP_OR_XOR_EXPR, r, true, null);
      }
      else if (g < 1 && consumeTokenSmart(b, "and")) {
        r = expr(b, l, 1);
        exit_section_(b, l, m, LP_AND_EXPR, r, true, null);
      }
      else if (g < 4 && comma_expr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, COMMA_EXPR, r, true, null);
      }
      else if (g < 5 && assign_expr_0(b, l + 1)) {
        r = expr(b, l, 4);
        exit_section_(b, l, m, ASSIGN_EXPR, r, true, null);
      }
      else if (g < 6 && consumeTokenSmart(b, "?")) {
        r = report_error_(b, expr(b, l, 5));
        r = trenar_expr_1(b, l + 1) && r;
        exit_section_(b, l, m, TRENAR_EXPR, r, true, null);
      }
      else if (g < 7 && flipflop_expr_0(b, l + 1)) {
        r = expr(b, l, 7);
        exit_section_(b, l, m, FLIPFLOP_EXPR, r, true, null);
      }
      else if (g < 8 && or_expr_0(b, l + 1)) {
        r = expr(b, l, 8);
        exit_section_(b, l, m, OR_EXPR, r, true, null);
      }
      else if (g < 9 && consumeTokenSmart(b, "&&")) {
        r = expr(b, l, 9);
        exit_section_(b, l, m, AND_EXPR, r, true, null);
      }
      else if (g < 10 && bitwise_or_xor_expr_0(b, l + 1)) {
        r = expr(b, l, 10);
        exit_section_(b, l, m, BITWISE_OR_XOR_EXPR, r, true, null);
      }
      else if (g < 11 && consumeTokenSmart(b, "&")) {
        r = expr(b, l, 11);
        exit_section_(b, l, m, BITWISE_AND_EXPR, r, true, null);
      }
      else if (g < 12 && equal_expr_0(b, l + 1)) {
        r = expr(b, l, 12);
        exit_section_(b, l, m, EQUAL_EXPR, r, true, null);
      }
      else if (g < 13 && compare_expr_0(b, l + 1)) {
        r = expr(b, l, 13);
        exit_section_(b, l, m, COMPARE_EXPR, r, true, null);
      }
      else if (g < 15 && shift_expr_0(b, l + 1)) {
        r = expr(b, l, 15);
        exit_section_(b, l, m, SHIFT_EXPR, r, true, null);
      }
      else if (g < 16 && add_expr_0(b, l + 1)) {
        r = expr(b, l, 16);
        exit_section_(b, l, m, ADD_EXPR, r, true, null);
      }
      else if (g < 17 && mul_expr_0(b, l + 1)) {
        r = expr(b, l, 17);
        exit_section_(b, l, m, MUL_EXPR, r, true, null);
      }
      else if (g < 18 && regex_expr_0(b, l + 1)) {
        r = expr(b, l, 18);
        exit_section_(b, l, m, REGEX_EXPR, r, true, null);
      }
      else if (g < 20 && consumeTokenSmart(b, "**")) {
        while (true) {
          r = report_error_(b, expr(b, l, 20));
          if (!consumeTokenSmart(b, "**")) break;
        }
        exit_section_(b, l, m, POW_EXPR, r, true, null);
      }
      else if (g < 21 && suff_pp_expr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, SUFF_PP_EXPR, r, true, null);
      }
      else if (g < 22 && deref_expr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, DEREF_EXPR, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // 'or'|'xor'
  private static boolean lp_or_xor_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lp_or_xor_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "or");
    if (!r) r = consumeTokenSmart(b, "xor");
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean lp_not_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lp_not_expr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, "not");
    p = r;
    r = p && expr(b, l, 2);
    exit_section_(b, l, m, LP_NOT_EXPR, r, p, null);
    return r || p;
  }

  // callable <<parseRightwardCallParameters>>
  public static boolean rightward_call_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rightward_call_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<rightward call expr>");
    r = callable(b, l + 1);
    r = r && parseRightwardCallParameters(b, l + 1);
    exit_section_(b, l, m, RIGHTWARD_CALL_EXPR, r, false, null);
    return r;
  }

  // (','|'=>') [scalar_expr]
  private static boolean comma_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comma_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma_expr_0_0(b, l + 1);
    r = r && comma_expr_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','|'=>'
  private static boolean comma_expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comma_expr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, PERL_COMMA);
    if (!r) r = consumeTokenSmart(b, PERL_ARROW_COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // [scalar_expr]
  private static boolean comma_expr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comma_expr_0_1")) return false;
    scalar_expr(b, l + 1);
    return true;
  }

  // '=' | '**='|'+='|'-='| '*='|'/='|'x='| '&='|'|='|'.='| '<<='|'>>='|'%='| '&&='|'||='|'^='| '//='
  private static boolean assign_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "=");
    if (!r) r = consumeTokenSmart(b, "**=");
    if (!r) r = consumeTokenSmart(b, "+=");
    if (!r) r = consumeTokenSmart(b, "-=");
    if (!r) r = consumeTokenSmart(b, "*=");
    if (!r) r = consumeTokenSmart(b, "/=");
    if (!r) r = consumeTokenSmart(b, "x=");
    if (!r) r = consumeTokenSmart(b, "&=");
    if (!r) r = consumeTokenSmart(b, "|=");
    if (!r) r = consumeTokenSmart(b, ".=");
    if (!r) r = consumeTokenSmart(b, "<<=");
    if (!r) r = consumeTokenSmart(b, ">>=");
    if (!r) r = consumeTokenSmart(b, "%=");
    if (!r) r = consumeTokenSmart(b, "&&=");
    if (!r) r = consumeTokenSmart(b, "||=");
    if (!r) r = consumeTokenSmart(b, "^=");
    if (!r) r = consumeTokenSmart(b, "//=");
    exit_section_(b, m, null, r);
    return r;
  }

  // ':' expr
  private static boolean trenar_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trenar_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERL_COLON);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '..'|'...'
  private static boolean flipflop_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flipflop_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "..");
    if (!r) r = consumeTokenSmart(b, "...");
    exit_section_(b, m, null, r);
    return r;
  }

  // '||'|'//'
  private static boolean or_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "||");
    if (!r) r = consumeTokenSmart(b, "//");
    exit_section_(b, m, null, r);
    return r;
  }

  // '|'|'^'
  private static boolean bitwise_or_xor_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitwise_or_xor_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "|");
    if (!r) r = consumeTokenSmart(b, "^");
    exit_section_(b, m, null, r);
    return r;
  }

  // '=='|'!='|'<=>'|'eq'|'ne'|'cmp'|'~~'
  private static boolean equal_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equal_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "==");
    if (!r) r = consumeTokenSmart(b, "!=");
    if (!r) r = consumeTokenSmart(b, "<=>");
    if (!r) r = consumeTokenSmart(b, "eq");
    if (!r) r = consumeTokenSmart(b, "ne");
    if (!r) r = consumeTokenSmart(b, "cmp");
    if (!r) r = consumeTokenSmart(b, "~~");
    exit_section_(b, m, null, r);
    return r;
  }

  // '>='|'<='|'<'|'>'|'lt'|'gt'|'le'|'ge'
  private static boolean compare_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compare_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, ">=");
    if (!r) r = consumeTokenSmart(b, "<=");
    if (!r) r = consumeTokenSmart(b, PERL_LANGLE);
    if (!r) r = consumeTokenSmart(b, PERL_RANGLE);
    if (!r) r = consumeTokenSmart(b, "lt");
    if (!r) r = consumeTokenSmart(b, "gt");
    if (!r) r = consumeTokenSmart(b, "le");
    if (!r) r = consumeTokenSmart(b, "ge");
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean named_unary_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_unary_expr")) return false;
    if (!nextTokenIsFast(b, PERL_OPERATOR_UNARY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = named_unary_expr_0(b, l + 1);
    p = r;
    r = p && expr(b, l, 14);
    exit_section_(b, l, m, NAMED_UNARY_EXPR, r, p, null);
    return r || p;
  }

  // PERL_OPERATOR_UNARY !"("
  private static boolean named_unary_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_unary_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, PERL_OPERATOR_UNARY);
    r = r && named_unary_expr_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !"("
  private static boolean named_unary_expr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_unary_expr_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !consumeTokenSmart(b, PERL_LPAREN);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // PERL_OPERATOR_FILETEST (<<parseBarewordHandle>> | expr )
  public static boolean filetest_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "filetest_expr")) return false;
    if (!nextTokenIsFast(b, PERL_OPERATOR_FILETEST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, PERL_OPERATOR_FILETEST);
    r = r && filetest_expr_1(b, l + 1);
    exit_section_(b, m, FILETEST_EXPR, r);
    return r;
  }

  // <<parseBarewordHandle>> | expr
  private static boolean filetest_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "filetest_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseBarewordHandle(b, l + 1);
    if (!r) r = expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '<<'|'>>'
  private static boolean shift_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "<<");
    if (!r) r = consumeTokenSmart(b, ">>");
    exit_section_(b, m, null, r);
    return r;
  }

  // '+'|'-'|'.'
  private static boolean add_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "add_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "+");
    if (!r) r = consumeTokenSmart(b, "-");
    if (!r) r = consumeTokenSmart(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  // '*'|'/'|'%'|'x'
  private static boolean mul_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mul_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "*");
    if (!r) r = consumeTokenSmart(b, "/");
    if (!r) r = consumeTokenSmart(b, PERL_SIGIL_HASH);
    if (!r) r = consumeTokenSmart(b, "x");
    exit_section_(b, m, null, r);
    return r;
  }

  // '=~'|'!~'
  private static boolean regex_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regex_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "=~");
    if (!r) r = consumeTokenSmart(b, "!~");
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean ref_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ref_expr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, "\\");
    p = r;
    r = p && expr(b, l, 19);
    exit_section_(b, l, m, REF_EXPR, r, p, null);
    return r || p;
  }

  // <<parseBarewordStringMinus>>
  public static boolean bareword_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bareword_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<bareword expr>");
    r = parseBarewordStringMinus(b, l + 1);
    exit_section_(b, l, m, BAREWORD_EXPR, r, false, null);
    return r;
  }

  public static boolean prefix_unary_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix_unary_expr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = prefix_unary_expr_0(b, l + 1);
    p = r;
    r = p && expr(b, l, 19);
    exit_section_(b, l, m, PREFIX_UNARY_EXPR, r, p, null);
    return r || p;
  }

  // '~'| '!'| '+' | '-'
  private static boolean prefix_unary_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix_unary_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "~");
    if (!r) r = consumeTokenSmart(b, "!");
    if (!r) r = consumeTokenSmart(b, "+");
    if (!r) r = consumeTokenSmart(b, "-");
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean pref_pp_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pref_pp_expr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = pref_pp_expr_0(b, l + 1);
    p = r;
    r = p && expr(b, l, 21);
    exit_section_(b, l, m, PREF_PP_EXPR, r, p, null);
    return r || p;
  }

  // '++'|'--'
  private static boolean pref_pp_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pref_pp_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "++");
    if (!r) r = consumeTokenSmart(b, "--");
    exit_section_(b, m, null, r);
    return r;
  }

  // '++'|'--'
  private static boolean suff_pp_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suff_pp_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "++");
    if (!r) r = consumeTokenSmart(b, "--");
    exit_section_(b, m, null, r);
    return r;
  }

  // <<parseArrowSmart>> nested_element_expr
  private static boolean deref_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deref_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseArrowSmart(b, l + 1);
    r = r && nested_element_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // variable
  //     | variable_declaration
  //     | PERL_OPERATOR_UNARY paren_expr_term // named operators as functions
  //     | paren_expr_term
  //     | scalar_primitive
  //     | do_term
  //     | sub_term
  //     | eval_term
  //     | regex_term
  //     | file_read_term
  //     | reference_value
  //     | print_term
  //     | open_term
  //     | close_term
  //     | grep_term
  //     | sort_term
  //     | map_term
  //     | require_term
  //     | undef_term
  //     | last_term
  //     | next_term
  //     | redo_term
  //     | function_call
  public static boolean term_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<term expr>");
    r = variable(b, l + 1);
    if (!r) r = variable_declaration(b, l + 1);
    if (!r) r = term_expr_2(b, l + 1);
    if (!r) r = paren_expr_term(b, l + 1);
    if (!r) r = scalar_primitive(b, l + 1);
    if (!r) r = do_term(b, l + 1);
    if (!r) r = sub_term(b, l + 1);
    if (!r) r = eval_term(b, l + 1);
    if (!r) r = regex_term(b, l + 1);
    if (!r) r = file_read_term(b, l + 1);
    if (!r) r = reference_value(b, l + 1);
    if (!r) r = print_term(b, l + 1);
    if (!r) r = open_term(b, l + 1);
    if (!r) r = close_term(b, l + 1);
    if (!r) r = grep_term(b, l + 1);
    if (!r) r = sort_term(b, l + 1);
    if (!r) r = map_term(b, l + 1);
    if (!r) r = require_term(b, l + 1);
    if (!r) r = undef_term(b, l + 1);
    if (!r) r = last_term(b, l + 1);
    if (!r) r = next_term(b, l + 1);
    if (!r) r = redo_term(b, l + 1);
    if (!r) r = function_call(b, l + 1);
    exit_section_(b, l, m, TERM_EXPR, r, false, null);
    return r;
  }

  // PERL_OPERATOR_UNARY paren_expr_term
  private static boolean term_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_expr_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, PERL_OPERATOR_UNARY);
    r = r && paren_expr_term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  final static Parser recover_statement_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return recover_statement(b, l + 1);
    }
  };
}
