// $ANTLR 2.7.7 (20060906): "groovy.g" -> "GroovyRecognizer.java"$

package org.codehaus.groovy.antlr.parser;
import org.codehaus.groovy.antlr.*;
import java.util.*;
import java.io.InputStream;
import java.io.Reader;
import groovyjarjarantlr.InputBuffer;
import groovyjarjarantlr.LexerSharedInputState;
import groovyjarjarantlr.CommonToken;
import org.codehaus.groovy.GroovyBugError;
import groovyjarjarantlr.TokenStreamRecognitionException;
import org.codehaus.groovy.ast.Comment;

public interface GroovyTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int BLOCK = 4;
	int MODIFIERS = 5;
	int OBJBLOCK = 6;
	int SLIST = 7;
	int METHOD_DEF = 8;
	int VARIABLE_DEF = 9;
	int INSTANCE_INIT = 10;
	int STATIC_INIT = 11;
	int TYPE = 12;
	int CLASS_DEF = 13;
	int INTERFACE_DEF = 14;
	int TRAIT_DEF = 15;
	int PACKAGE_DEF = 16;
	int ARRAY_DECLARATOR = 17;
	int EXTENDS_CLAUSE = 18;
	int IMPLEMENTS_CLAUSE = 19;
	int PARAMETERS = 20;
	int PARAMETER_DEF = 21;
	int LABELED_STAT = 22;
	int TYPECAST = 23;
	int INDEX_OP = 24;
	int POST_INC = 25;
	int POST_DEC = 26;
	int METHOD_CALL = 27;
	int EXPR = 28;
	int IMPORT = 29;
	int UNARY_MINUS = 30;
	int UNARY_PLUS = 31;
	int CASE_GROUP = 32;
	int ELIST = 33;
	int FOR_INIT = 34;
	int FOR_CONDITION = 35;
	int FOR_ITERATOR = 36;
	int EMPTY_STAT = 37;
	int FINAL = 38;
	int ABSTRACT = 39;
	int UNUSED_GOTO = 40;
	int UNUSED_CONST = 41;
	int UNUSED_DO = 42;
	int STRICTFP = 43;
	int SUPER_CTOR_CALL = 44;
	int CTOR_CALL = 45;
	int CTOR_IDENT = 46;
	int VARIABLE_PARAMETER_DEF = 47;
	int STRING_CONSTRUCTOR = 48;
	int STRING_CTOR_MIDDLE = 49;
	int CLOSABLE_BLOCK = 50;
	int IMPLICIT_PARAMETERS = 51;
	int SELECT_SLOT = 52;
	int DYNAMIC_MEMBER = 53;
	int LABELED_ARG = 54;
	int SPREAD_ARG = 55;
	int SPREAD_MAP_ARG = 56;
	int LIST_CONSTRUCTOR = 57;
	int MAP_CONSTRUCTOR = 58;
	int FOR_IN_ITERABLE = 59;
	int STATIC_IMPORT = 60;
	int ENUM_DEF = 61;
	int ENUM_CONSTANT_DEF = 62;
	int FOR_EACH_CLAUSE = 63;
	int ANNOTATION_DEF = 64;
	int ANNOTATIONS = 65;
	int ANNOTATION = 66;
	int ANNOTATION_MEMBER_VALUE_PAIR = 67;
	int ANNOTATION_FIELD_DEF = 68;
	int ANNOTATION_ARRAY_INIT = 69;
	int TYPE_ARGUMENTS = 70;
	int TYPE_ARGUMENT = 71;
	int TYPE_PARAMETERS = 72;
	int TYPE_PARAMETER = 73;
	int WILDCARD_TYPE = 74;
	int TYPE_UPPER_BOUNDS = 75;
	int TYPE_LOWER_BOUNDS = 76;
	int CLOSURE_LIST = 77;
	int MULTICATCH = 78;
	int MULTICATCH_TYPES = 79;
	int SH_COMMENT = 80;
	int LITERAL_package = 81;
	int LITERAL_import = 82;
	int LITERAL_static = 83;
	int LITERAL_def = 84;
	int LBRACK = 85;
	int RBRACK = 86;
	int IDENT = 87;
	int STRING_LITERAL = 88;
	int LT = 89;
	int DOT = 90;
	int LPAREN = 91;
	int LITERAL_class = 92;
	int LITERAL_interface = 93;
	int LITERAL_enum = 94;
	int LITERAL_trait = 95;
	int AT = 96;
	int QUESTION = 97;
	int LITERAL_extends = 98;
	int LITERAL_super = 99;
	int GT = 100;
	int COMMA = 101;
	int SR = 102;
	int BSR = 103;
	int LITERAL_void = 104;
	int LITERAL_boolean = 105;
	int LITERAL_byte = 106;
	int LITERAL_char = 107;
	int LITERAL_short = 108;
	int LITERAL_int = 109;
	int LITERAL_float = 110;
	int LITERAL_long = 111;
	int LITERAL_double = 112;
	int STAR = 113;
	int LITERAL_as = 114;
	int LITERAL_private = 115;
	int LITERAL_public = 116;
	int LITERAL_protected = 117;
	int LITERAL_transient = 118;
	int LITERAL_native = 119;
	int LITERAL_threadsafe = 120;
	int LITERAL_synchronized = 121;
	int LITERAL_volatile = 122;
	int RPAREN = 123;
	int ASSIGN = 124;
	int BAND = 125;
	int LCURLY = 126;
	int RCURLY = 127;
	int SEMI = 128;
	int LITERAL_default = 129;
	int LITERAL_throws = 130;
	int LITERAL_implements = 131;
	int LITERAL_this = 132;
	int TRIPLE_DOT = 133;
	int BOR = 134;
	int CLOSABLE_BLOCK_OP = 135;
	int COLON = 136;
	int LITERAL_if = 137;
	int LITERAL_else = 138;
	int LITERAL_while = 139;
	int LITERAL_switch = 140;
	int LITERAL_for = 141;
	int LITERAL_in = 142;
	int LITERAL_return = 143;
	int LITERAL_break = 144;
	int LITERAL_continue = 145;
	int LITERAL_throw = 146;
	int LITERAL_assert = 147;
	int PLUS = 148;
	int MINUS = 149;
	int LITERAL_case = 150;
	int LITERAL_try = 151;
	int LITERAL_finally = 152;
	int LITERAL_catch = 153;
	int SPREAD_DOT = 154;
	int OPTIONAL_DOT = 155;
	int MEMBER_POINTER = 156;
	int LITERAL_false = 157;
	int LITERAL_instanceof = 158;
	int LITERAL_new = 159;
	int LITERAL_null = 160;
	int LITERAL_true = 161;
	int PLUS_ASSIGN = 162;
	int MINUS_ASSIGN = 163;
	int STAR_ASSIGN = 164;
	int DIV_ASSIGN = 165;
	int MOD_ASSIGN = 166;
	int SR_ASSIGN = 167;
	int BSR_ASSIGN = 168;
	int SL_ASSIGN = 169;
	int BAND_ASSIGN = 170;
	int BXOR_ASSIGN = 171;
	int BOR_ASSIGN = 172;
	int STAR_STAR_ASSIGN = 173;
	int ELVIS_OPERATOR = 174;
	int LOR = 175;
	int LAND = 176;
	int BXOR = 177;
	int REGEX_FIND = 178;
	int REGEX_MATCH = 179;
	int NOT_EQUAL = 180;
	int EQUAL = 181;
	int IDENTICAL = 182;
	int NOT_IDENTICAL = 183;
	int COMPARE_TO = 184;
	int LE = 185;
	int GE = 186;
	int SL = 187;
	int RANGE_INCLUSIVE = 188;
	int RANGE_EXCLUSIVE = 189;
	int INC = 190;
	int DIV = 191;
	int MOD = 192;
	int DEC = 193;
	int STAR_STAR = 194;
	int BNOT = 195;
	int LNOT = 196;
	int STRING_CTOR_START = 197;
	int STRING_CTOR_END = 198;
	int NUM_INT = 199;
	int NUM_FLOAT = 200;
	int NUM_LONG = 201;
	int NUM_DOUBLE = 202;
	int NUM_BIG_INT = 203;
	int NUM_BIG_DECIMAL = 204;
	int NLS = 205;
	int DOLLAR = 206;
	int WS = 207;
	int ONE_NL = 208;
	int ONE_NL_KEEP = 209;
	int SL_COMMENT = 210;
	int ML_COMMENT = 211;
	int STRING_CH = 212;
	int REGEXP_LITERAL = 213;
	int DOLLAR_REGEXP_LITERAL = 214;
	int REGEXP_CTOR_END = 215;
	int DOLLAR_REGEXP_CTOR_END = 216;
	int ESCAPED_SLASH = 217;
	int ESCAPED_DOLLAR = 218;
	int REGEXP_SYMBOL = 219;
	int DOLLAR_REGEXP_SYMBOL = 220;
	int ESC = 221;
	int STRING_NL = 222;
	int HEX_DIGIT = 223;
	int VOCAB = 224;
	int LETTER = 225;
	int DIGIT = 226;
	int DIGITS_WITH_UNDERSCORE = 227;
	int DIGITS_WITH_UNDERSCORE_OPT = 228;
	int EXPONENT = 229;
	int FLOAT_SUFFIX = 230;
	int BIG_SUFFIX = 231;
}
