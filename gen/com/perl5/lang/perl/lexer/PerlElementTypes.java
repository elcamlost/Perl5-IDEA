// This is a generated file. Not intended for manual editing.
package com.perl5.lang.perl.lexer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.perl5.lang.perl.PerlElementType;
import com.perl5.lang.perl.PerlTokenType;
import com.perl5.lang.perl.psi.impl.*;

public interface PerlElementTypes {

  IElementType ADD_EXPR = new PerlElementType("ADD_EXPR");
  IElementType AND_EXPR = new PerlElementType("AND_EXPR");
  IElementType ASSIGN_EXPR = new PerlElementType("ASSIGN_EXPR");
  IElementType BAREWORD_EXPR = new PerlElementType("BAREWORD_EXPR");
  IElementType BITWISE_AND_EXPR = new PerlElementType("BITWISE_AND_EXPR");
  IElementType BITWISE_OR_XOR_EXPR = new PerlElementType("BITWISE_OR_XOR_EXPR");
  IElementType BLOCK = new PerlElementType("BLOCK");
  IElementType BLOCK_COMPOUND = new PerlElementType("BLOCK_COMPOUND");
  IElementType CALLABLE = new PerlElementType("CALLABLE");
  IElementType CLOSE_TERM = new PerlElementType("CLOSE_TERM");
  IElementType COMMA_EXPR = new PerlElementType("COMMA_EXPR");
  IElementType COMPARE_EXPR = new PerlElementType("COMPARE_EXPR");
  IElementType COMPILE_REGEX = new PerlElementType("COMPILE_REGEX");
  IElementType DEREF_EXPR = new PerlElementType("DEREF_EXPR");
  IElementType DO_TERM = new PerlElementType("DO_TERM");
  IElementType EQUAL_EXPR = new PerlElementType("EQUAL_EXPR");
  IElementType EVAL_TERM = new PerlElementType("EVAL_TERM");
  IElementType EXPR = new PerlElementType("EXPR");
  IElementType FILETEST_EXPR = new PerlElementType("FILETEST_EXPR");
  IElementType FILE_READ_TERM = new PerlElementType("FILE_READ_TERM");
  IElementType FLIPFLOP_EXPR = new PerlElementType("FLIPFLOP_EXPR");
  IElementType FOREACH_COMPOUND = new PerlElementType("FOREACH_COMPOUND");
  IElementType FOREACH_STATEMENT_MODIFIER = new PerlElementType("FOREACH_STATEMENT_MODIFIER");
  IElementType FOR_COMPOUND = new PerlElementType("FOR_COMPOUND");
  IElementType FOR_STATEMENT_MODIFIER = new PerlElementType("FOR_STATEMENT_MODIFIER");
  IElementType GIVEN_COMPOUND = new PerlElementType("GIVEN_COMPOUND");
  IElementType GREP_TERM = new PerlElementType("GREP_TERM");
  IElementType IF_COMPOUND = new PerlElementType("IF_COMPOUND");
  IElementType IF_STATEMENT_MODIFIER = new PerlElementType("IF_STATEMENT_MODIFIER");
  IElementType LABEL = new PerlElementType("LABEL");
  IElementType LABEL_DECLARATION = new PerlElementType("LABEL_DECLARATION");
  IElementType LAST_TERM = new PerlElementType("LAST_TERM");
  IElementType LP_AND_EXPR = new PerlElementType("LP_AND_EXPR");
  IElementType LP_NOT_EXPR = new PerlElementType("LP_NOT_EXPR");
  IElementType LP_OR_XOR_EXPR = new PerlElementType("LP_OR_XOR_EXPR");
  IElementType MAP_TERM = new PerlElementType("MAP_TERM");
  IElementType MATCH_REGEX = new PerlElementType("MATCH_REGEX");
  IElementType MUL_EXPR = new PerlElementType("MUL_EXPR");
  IElementType NAMED_BLOCK = new PerlElementType("NAMED_BLOCK");
  IElementType NAMED_UNARY_EXPR = new PerlElementType("NAMED_UNARY_EXPR");
  IElementType NAMESPACE = new PerlElementType("NAMESPACE");
  IElementType NEXT_TERM = new PerlElementType("NEXT_TERM");
  IElementType NO_STATEMENT = new PerlElementType("NO_STATEMENT");
  IElementType OPEN_FILE = new PerlElementType("OPEN_FILE");
  IElementType OPEN_HANDLE = new PerlElementType("OPEN_HANDLE");
  IElementType OPEN_MODE = new PerlElementType("OPEN_MODE");
  IElementType OPEN_REF = new PerlElementType("OPEN_REF");
  IElementType OPEN_TERM = new PerlElementType("OPEN_TERM");
  IElementType OR_EXPR = new PerlElementType("OR_EXPR");
  IElementType PERL_ARRAY = new PerlElementType("PERL_ARRAY");
  IElementType PERL_GLOB = new PerlElementType("PERL_GLOB");
  IElementType PERL_HASH = new PerlElementType("PERL_HASH");
  IElementType PERL_REGEX = new PerlElementType("PERL_REGEX");
  IElementType PERL_REGEX_MODIFIERS = new PerlElementType("PERL_REGEX_MODIFIERS");
  IElementType PERL_SCALAR = new PerlElementType("PERL_SCALAR");
  IElementType POW_EXPR = new PerlElementType("POW_EXPR");
  IElementType PREFIX_UNARY_EXPR = new PerlElementType("PREFIX_UNARY_EXPR");
  IElementType PREF_PP_EXPR = new PerlElementType("PREF_PP_EXPR");
  IElementType PRINT_TERM = new PerlElementType("PRINT_TERM");
  IElementType REDO_TERM = new PerlElementType("REDO_TERM");
  IElementType REFERENCE_VALUE = new PerlElementType("REFERENCE_VALUE");
  IElementType REF_EXPR = new PerlElementType("REF_EXPR");
  IElementType REGEX_EXPR = new PerlElementType("REGEX_EXPR");
  IElementType REPLACEMENT_REGEX = new PerlElementType("REPLACEMENT_REGEX");
  IElementType REQUIRE_TERM = new PerlElementType("REQUIRE_TERM");
  IElementType RIGHTWARD_CALL_EXPR = new PerlElementType("RIGHTWARD_CALL_EXPR");
  IElementType SCALAR_CALL = new PerlElementType("SCALAR_CALL");
  IElementType SHIFT_EXPR = new PerlElementType("SHIFT_EXPR");
  IElementType SORT_TERM = new PerlElementType("SORT_TERM");
  IElementType STRING = new PerlElementType("STRING");
  IElementType SUB_DECLARATION = new PerlElementType("SUB_DECLARATION");
  IElementType SUB_DEFINITION = new PerlElementType("SUB_DEFINITION");
  IElementType SUB_TERM = new PerlElementType("SUB_TERM");
  IElementType SUFF_PP_EXPR = new PerlElementType("SUFF_PP_EXPR");
  IElementType TERM_EXPR = new PerlElementType("TERM_EXPR");
  IElementType TRENAR_EXPR = new PerlElementType("TRENAR_EXPR");
  IElementType TR_MODIFIERS = new PerlElementType("TR_MODIFIERS");
  IElementType TR_REGEX = new PerlElementType("TR_REGEX");
  IElementType TR_REPLACEMENTLIST = new PerlElementType("TR_REPLACEMENTLIST");
  IElementType TR_SEARCHLIST = new PerlElementType("TR_SEARCHLIST");
  IElementType UNDEF_TERM = new PerlElementType("UNDEF_TERM");
  IElementType UNLESS_COMPOUND = new PerlElementType("UNLESS_COMPOUND");
  IElementType UNLESS_STATEMENT_MODIFIER = new PerlElementType("UNLESS_STATEMENT_MODIFIER");
  IElementType UNTIL_COMPOUND = new PerlElementType("UNTIL_COMPOUND");
  IElementType UNTIL_STATEMENT_MODIFIER = new PerlElementType("UNTIL_STATEMENT_MODIFIER");
  IElementType USE_STATEMENT = new PerlElementType("USE_STATEMENT");
  IElementType VARIABLE_DECLARATION_GLOBAL = new PerlElementType("VARIABLE_DECLARATION_GLOBAL");
  IElementType VARIABLE_DECLARATION_LEXICAL = new PerlElementType("VARIABLE_DECLARATION_LEXICAL");
  IElementType VARIABLE_DECLARATION_LOCAL = new PerlElementType("VARIABLE_DECLARATION_LOCAL");
  IElementType WHEN_STATEMENT_MODIFIER = new PerlElementType("WHEN_STATEMENT_MODIFIER");
  IElementType WHILE_COMPOUND = new PerlElementType("WHILE_COMPOUND");
  IElementType WHILE_STATEMENT_MODIFIER = new PerlElementType("WHILE_STATEMENT_MODIFIER");

  IElementType PERL_ARROW_COMMA = new PerlTokenType("=>");
  IElementType PERL_BAREWORD = new PerlTokenType("PERL_BAREWORD");
  IElementType PERL_BLOCK_NAME = new PerlTokenType("PERL_BLOCK_NAME");
  IElementType PERL_COLON = new PerlTokenType(":");
  IElementType PERL_COMMA = new PerlTokenType(",");
  IElementType PERL_COMMENT = new PerlTokenType("PERL_COMMENT");
  IElementType PERL_COMMENT_BLOCK = new PerlTokenType("PERL_COMMENT_BLOCK");
  IElementType PERL_DEPACKAGE = new PerlTokenType("::");
  IElementType PERL_DEREFERENCE = new PerlTokenType("->");
  IElementType PERL_FUNCTION = new PerlTokenType("PERL_FUNCTION");
  IElementType PERL_HANDLE = new PerlTokenType("PERL_HANDLE");
  IElementType PERL_KEYWORD = new PerlTokenType("PERL_KEYWORD");
  IElementType PERL_LANGLE = new PerlTokenType("<");
  IElementType PERL_LBRACE = new PerlTokenType("{");
  IElementType PERL_LBRACK = new PerlTokenType("[");
  IElementType PERL_LPAREN = new PerlTokenType("(");
  IElementType PERL_NUMBER = new PerlTokenType("PERL_NUMBER");
  IElementType PERL_NUMBER_VERSION = new PerlTokenType("PERL_NUMBER_VERSION");
  IElementType PERL_OPERATOR = new PerlTokenType("PERL_OPERATOR");
  IElementType PERL_OPERATOR_FILETEST = new PerlTokenType("PERL_OPERATOR_FILETEST");
  IElementType PERL_OPERATOR_UNARY = new PerlTokenType("PERL_OPERATOR_UNARY");
  IElementType PERL_PACKAGE = new PerlTokenType("PERL_PACKAGE");
  IElementType PERL_POD = new PerlTokenType("PERL_POD");
  IElementType PERL_QUOTE = new PerlTokenType("\"");
  IElementType PERL_RANGLE = new PerlTokenType(">");
  IElementType PERL_RBRACE = new PerlTokenType("}");
  IElementType PERL_RBRACK = new PerlTokenType("]");
  IElementType PERL_REGEX_MODIFIER = new PerlTokenType("PERL_REGEX_MODIFIER");
  IElementType PERL_REGEX_QUOTE = new PerlTokenType("PERL_REGEX_QUOTE");
  IElementType PERL_REGEX_TOKEN = new PerlTokenType("PERL_REGEX_TOKEN");
  IElementType PERL_RPAREN = new PerlTokenType(")");
  IElementType PERL_SEMI = new PerlTokenType(";");
  IElementType PERL_SIGIL_ARRAY = new PerlTokenType("@");
  IElementType PERL_SIGIL_HASH = new PerlTokenType("%");
  IElementType PERL_SIGIL_SCALAR = new PerlTokenType("$");
  IElementType PERL_SIGIL_SCALAR_INDEX = new PerlTokenType("$#");
  IElementType PERL_STRING = new PerlTokenType("PERL_STRING");
  IElementType PERL_STRING_CONTENT = new PerlTokenType("PERL_STRING_CONTENT");
  IElementType PERL_STRING_MULTILINE = new PerlTokenType("PERL_STRING_MULTILINE");
  IElementType PERL_STRING_MULTILINE_END = new PerlTokenType("PERL_STRING_MULTILINE_END");
  IElementType PERL_TAG = new PerlTokenType("PERL_TAG");
  IElementType PERL_VERSION = new PerlTokenType("PERL_VERSION");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ADD_EXPR) {
        return new PerlAddExprImpl(node);
      }
      else if (type == AND_EXPR) {
        return new PerlAndExprImpl(node);
      }
      else if (type == ASSIGN_EXPR) {
        return new PerlAssignExprImpl(node);
      }
      else if (type == BAREWORD_EXPR) {
        return new PerlBarewordExprImpl(node);
      }
      else if (type == BITWISE_AND_EXPR) {
        return new PerlBitwiseAndExprImpl(node);
      }
      else if (type == BITWISE_OR_XOR_EXPR) {
        return new PerlBitwiseOrXorExprImpl(node);
      }
      else if (type == BLOCK) {
        return new PerlBlockImpl(node);
      }
      else if (type == BLOCK_COMPOUND) {
        return new PerlBlockCompoundImpl(node);
      }
      else if (type == CALLABLE) {
        return new PerlCallableImpl(node);
      }
      else if (type == CLOSE_TERM) {
        return new PerlCloseTermImpl(node);
      }
      else if (type == COMMA_EXPR) {
        return new PerlCommaExprImpl(node);
      }
      else if (type == COMPARE_EXPR) {
        return new PerlCompareExprImpl(node);
      }
      else if (type == COMPILE_REGEX) {
        return new PerlCompileRegexImpl(node);
      }
      else if (type == DEREF_EXPR) {
        return new PerlDerefExprImpl(node);
      }
      else if (type == DO_TERM) {
        return new PerlDoTermImpl(node);
      }
      else if (type == EQUAL_EXPR) {
        return new PerlEqualExprImpl(node);
      }
      else if (type == EVAL_TERM) {
        return new PerlEvalTermImpl(node);
      }
      else if (type == EXPR) {
        return new PerlExprImpl(node);
      }
      else if (type == FILETEST_EXPR) {
        return new PerlFiletestExprImpl(node);
      }
      else if (type == FILE_READ_TERM) {
        return new PerlFileReadTermImpl(node);
      }
      else if (type == FLIPFLOP_EXPR) {
        return new PerlFlipflopExprImpl(node);
      }
      else if (type == FOREACH_COMPOUND) {
        return new PerlForeachCompoundImpl(node);
      }
      else if (type == FOREACH_STATEMENT_MODIFIER) {
        return new PerlForeachStatementModifierImpl(node);
      }
      else if (type == FOR_COMPOUND) {
        return new PerlForCompoundImpl(node);
      }
      else if (type == FOR_STATEMENT_MODIFIER) {
        return new PerlForStatementModifierImpl(node);
      }
      else if (type == GIVEN_COMPOUND) {
        return new PerlGivenCompoundImpl(node);
      }
      else if (type == GREP_TERM) {
        return new PerlGrepTermImpl(node);
      }
      else if (type == IF_COMPOUND) {
        return new PerlIfCompoundImpl(node);
      }
      else if (type == IF_STATEMENT_MODIFIER) {
        return new PerlIfStatementModifierImpl(node);
      }
      else if (type == LABEL) {
        return new PerlLabelImpl(node);
      }
      else if (type == LABEL_DECLARATION) {
        return new PerlLabelDeclarationImpl(node);
      }
      else if (type == LAST_TERM) {
        return new PerlLastTermImpl(node);
      }
      else if (type == LP_AND_EXPR) {
        return new PerlLpAndExprImpl(node);
      }
      else if (type == LP_NOT_EXPR) {
        return new PerlLpNotExprImpl(node);
      }
      else if (type == LP_OR_XOR_EXPR) {
        return new PerlLpOrXorExprImpl(node);
      }
      else if (type == MAP_TERM) {
        return new PerlMapTermImpl(node);
      }
      else if (type == MATCH_REGEX) {
        return new PerlMatchRegexImpl(node);
      }
      else if (type == MUL_EXPR) {
        return new PerlMulExprImpl(node);
      }
      else if (type == NAMED_BLOCK) {
        return new PerlNamedBlockImpl(node);
      }
      else if (type == NAMED_UNARY_EXPR) {
        return new PerlNamedUnaryExprImpl(node);
      }
      else if (type == NAMESPACE) {
        return new PerlNamespaceImpl(node);
      }
      else if (type == NEXT_TERM) {
        return new PerlNextTermImpl(node);
      }
      else if (type == NO_STATEMENT) {
        return new PerlNoStatementImpl(node);
      }
      else if (type == OPEN_FILE) {
        return new PerlOpenFileImpl(node);
      }
      else if (type == OPEN_HANDLE) {
        return new PerlOpenHandleImpl(node);
      }
      else if (type == OPEN_MODE) {
        return new PerlOpenModeImpl(node);
      }
      else if (type == OPEN_REF) {
        return new PerlOpenRefImpl(node);
      }
      else if (type == OPEN_TERM) {
        return new PerlOpenTermImpl(node);
      }
      else if (type == OR_EXPR) {
        return new PerlOrExprImpl(node);
      }
      else if (type == PERL_ARRAY) {
        return new PerlPerlArrayImpl(node);
      }
      else if (type == PERL_GLOB) {
        return new PerlPerlGlobImpl(node);
      }
      else if (type == PERL_HASH) {
        return new PerlPerlHashImpl(node);
      }
      else if (type == PERL_REGEX) {
        return new PerlPerlRegexImpl(node);
      }
      else if (type == PERL_REGEX_MODIFIERS) {
        return new PerlPerlRegexModifiersImpl(node);
      }
      else if (type == PERL_SCALAR) {
        return new PerlPerlScalarImpl(node);
      }
      else if (type == POW_EXPR) {
        return new PerlPowExprImpl(node);
      }
      else if (type == PREFIX_UNARY_EXPR) {
        return new PerlPrefixUnaryExprImpl(node);
      }
      else if (type == PREF_PP_EXPR) {
        return new PerlPrefPpExprImpl(node);
      }
      else if (type == PRINT_TERM) {
        return new PerlPrintTermImpl(node);
      }
      else if (type == REDO_TERM) {
        return new PerlRedoTermImpl(node);
      }
      else if (type == REFERENCE_VALUE) {
        return new PerlReferenceValueImpl(node);
      }
      else if (type == REF_EXPR) {
        return new PerlRefExprImpl(node);
      }
      else if (type == REGEX_EXPR) {
        return new PerlRegexExprImpl(node);
      }
      else if (type == REPLACEMENT_REGEX) {
        return new PerlReplacementRegexImpl(node);
      }
      else if (type == REQUIRE_TERM) {
        return new PerlRequireTermImpl(node);
      }
      else if (type == RIGHTWARD_CALL_EXPR) {
        return new PerlRightwardCallExprImpl(node);
      }
      else if (type == SCALAR_CALL) {
        return new PerlScalarCallImpl(node);
      }
      else if (type == SHIFT_EXPR) {
        return new PerlShiftExprImpl(node);
      }
      else if (type == SORT_TERM) {
        return new PerlSortTermImpl(node);
      }
      else if (type == STRING) {
        return new PerlStringImpl(node);
      }
      else if (type == SUB_DECLARATION) {
        return new PerlSubDeclarationImpl(node);
      }
      else if (type == SUB_DEFINITION) {
        return new PerlSubDefinitionImpl(node);
      }
      else if (type == SUB_TERM) {
        return new PerlSubTermImpl(node);
      }
      else if (type == SUFF_PP_EXPR) {
        return new PerlSuffPpExprImpl(node);
      }
      else if (type == TERM_EXPR) {
        return new PerlTermExprImpl(node);
      }
      else if (type == TRENAR_EXPR) {
        return new PerlTrenarExprImpl(node);
      }
      else if (type == TR_MODIFIERS) {
        return new PerlTrModifiersImpl(node);
      }
      else if (type == TR_REGEX) {
        return new PerlTrRegexImpl(node);
      }
      else if (type == TR_REPLACEMENTLIST) {
        return new PerlTrReplacementlistImpl(node);
      }
      else if (type == TR_SEARCHLIST) {
        return new PerlTrSearchlistImpl(node);
      }
      else if (type == UNDEF_TERM) {
        return new PerlUndefTermImpl(node);
      }
      else if (type == UNLESS_COMPOUND) {
        return new PerlUnlessCompoundImpl(node);
      }
      else if (type == UNLESS_STATEMENT_MODIFIER) {
        return new PerlUnlessStatementModifierImpl(node);
      }
      else if (type == UNTIL_COMPOUND) {
        return new PerlUntilCompoundImpl(node);
      }
      else if (type == UNTIL_STATEMENT_MODIFIER) {
        return new PerlUntilStatementModifierImpl(node);
      }
      else if (type == USE_STATEMENT) {
        return new PerlUseStatementImpl(node);
      }
      else if (type == VARIABLE_DECLARATION_GLOBAL) {
        return new PerlVariableDeclarationGlobalImpl(node);
      }
      else if (type == VARIABLE_DECLARATION_LEXICAL) {
        return new PerlVariableDeclarationLexicalImpl(node);
      }
      else if (type == VARIABLE_DECLARATION_LOCAL) {
        return new PerlVariableDeclarationLocalImpl(node);
      }
      else if (type == WHEN_STATEMENT_MODIFIER) {
        return new PerlWhenStatementModifierImpl(node);
      }
      else if (type == WHILE_COMPOUND) {
        return new PerlWhileCompoundImpl(node);
      }
      else if (type == WHILE_STATEMENT_MODIFIER) {
        return new PerlWhileStatementModifierImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
