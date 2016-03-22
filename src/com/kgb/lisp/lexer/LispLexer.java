/* The following code was generated by JFlex 1.4.3 on 3/22/16 4:47 PM */

package com.kgb.lisp.lexer;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.kgb.lisp.psi.LispTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 3/22/16 4:47 PM from the specification file
 * <tt>/home/k.betlej/workspace/idea-plugins/LispPlugin/src/com/kgb/lisp/lisp.flex</tt>
 */
public class LispLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\4\1\2\1\0\1\1\1\1\22\0\1\1\1\37\1\10"+
    "\3\0\1\54\1\42\1\23\1\24\1\35\1\34\1\0\1\16\1\7"+
    "\1\36\12\6\1\21\1\5\1\41\1\22\1\40\2\0\1\60\1\62"+
    "\1\65\1\63\1\64\6\17\1\57\1\61\4\17\1\66\10\17\1\0"+
    "\1\11\2\0\1\20\1\0\1\13\1\51\1\47\1\45\1\15\1\30"+
    "\1\17\1\56\1\33\1\52\1\14\1\31\1\12\1\32\1\43\1\44"+
    "\1\50\1\26\1\3\1\25\1\27\1\17\1\46\1\55\1\53\1\17"+
    "\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\2\1\4\1\5\1\1"+
    "\2\6\1\7\1\1\1\10\1\11\1\12\6\6\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\5\6\1\1"+
    "\2\6\2\3\1\6\1\5\1\0\1\22\1\0\1\6"+
    "\11\23\1\6\1\24\10\6\1\25\1\26\3\6\1\27"+
    "\4\6\4\0\4\6\10\23\4\6\1\30\1\31\2\6"+
    "\1\32\5\6\1\33\3\6\1\34\5\0\2\6\1\35"+
    "\1\6\13\23\1\36\1\37\1\6\1\40\1\41\1\42"+
    "\7\6\1\43\1\6\1\44\1\0\1\45\2\0\3\6"+
    "\1\23\1\46\12\23\1\47\1\6\1\50\1\6\1\51"+
    "\2\6\1\52\2\6\1\0\1\53\1\0\2\6\1\54"+
    "\3\23\1\55\7\23\1\56\1\6\1\57\2\6\1\60"+
    "\2\0\1\61\1\6\11\23\1\62\2\6\1\63\2\0"+
    "\1\64\4\23\1\65\5\23\1\6\1\66\2\0\12\23"+
    "\1\67\1\0\1\70\1\23\1\71\4\23\1\72\3\23"+
    "\1\73\1\0\10\23\1\0\7\23\1\74\1\0\1\75"+
    "\1\76\4\23\1\77\1\0\4\23\1\0\1\100\2\23"+
    "\1\101\1\0\1\102\1\23\1\103\1\104";

  private static int [] zzUnpackAction() {
    int [] result = new int[295];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\67\0\156\0\245\0\334\0\u0113\0\u014a\0\u0181"+
    "\0\u01b8\0\u01ef\0\67\0\u0226\0\67\0\67\0\67\0\u025d"+
    "\0\u0294\0\u02cb\0\u0302\0\u0339\0\u0370\0\67\0\67\0\67"+
    "\0\67\0\67\0\67\0\67\0\u03a7\0\u03de\0\u0415\0\u044c"+
    "\0\u0483\0\u04ba\0\u04f1\0\u0528\0\u055f\0\u0596\0\u05cd\0\u0604"+
    "\0\u0181\0\67\0\u063b\0\u0672\0\u06a9\0\u06e0\0\u0717\0\u074e"+
    "\0\u0785\0\u07bc\0\u07f3\0\u082a\0\u0861\0\u0898\0\u01ef\0\u08cf"+
    "\0\u0906\0\u093d\0\u0974\0\u09ab\0\u09e2\0\u0a19\0\u0a50\0\u01ef"+
    "\0\u01ef\0\u0a87\0\u0abe\0\u0af5\0\u0b2c\0\u0b63\0\u0b9a\0\u0bd1"+
    "\0\u0c08\0\u0c3f\0\u0c76\0\u0cad\0\u0ce4\0\u0d1b\0\u0d52\0\u0d89"+
    "\0\u0dc0\0\u0df7\0\u0e2e\0\u0e65\0\u0e9c\0\u0ed3\0\u0f0a\0\u0f41"+
    "\0\u0f78\0\u0faf\0\u0fe6\0\u101d\0\u1054\0\u01ef\0\u01ef\0\u108b"+
    "\0\u10c2\0\u01ef\0\u10f9\0\u1130\0\u1167\0\u119e\0\u11d5\0\u01ef"+
    "\0\u120c\0\u1243\0\u127a\0\u01ef\0\u12b1\0\u12e8\0\u131f\0\u1356"+
    "\0\u138d\0\u13c4\0\u13fb\0\u01ef\0\u1432\0\u1469\0\u14a0\0\u14d7"+
    "\0\u150e\0\u1545\0\u157c\0\u15b3\0\u15ea\0\u1621\0\u1658\0\u168f"+
    "\0\u01ef\0\u01ef\0\u16c6\0\u01ef\0\u01ef\0\u01ef\0\u16fd\0\u1734"+
    "\0\u176b\0\u17a2\0\u17d9\0\u1810\0\u1847\0\u01ef\0\u187e\0\67"+
    "\0\u18b5\0\67\0\u18ec\0\u1923\0\u195a\0\u1991\0\u19c8\0\u19ff"+
    "\0\u06a9\0\u1a36\0\u1a6d\0\u1aa4\0\u1adb\0\u1b12\0\u1b49\0\u1b80"+
    "\0\u1bb7\0\u1bee\0\u1c25\0\u01ef\0\u1c5c\0\u01ef\0\u1c93\0\u01ef"+
    "\0\u1cca\0\u1d01\0\u01ef\0\u1d38\0\u1d6f\0\u1da6\0\67\0\u1ddd"+
    "\0\u1e14\0\u1e4b\0\u1e82\0\u1eb9\0\u1ef0\0\u1f27\0\u06a9\0\u1f5e"+
    "\0\u1f95\0\u1fcc\0\u2003\0\u203a\0\u2071\0\u20a8\0\u01ef\0\u20df"+
    "\0\u01ef\0\u2116\0\u214d\0\u01ef\0\u2184\0\u21bb\0\u01ef\0\u21f2"+
    "\0\u2229\0\u2260\0\u2297\0\u22ce\0\u2305\0\u233c\0\u2373\0\u23aa"+
    "\0\u23e1\0\u06a9\0\u2418\0\u244f\0\u01ef\0\u2486\0\u24bd\0\u01ef"+
    "\0\u24f4\0\u252b\0\u2562\0\u2599\0\u06a9\0\u25d0\0\u2607\0\u263e"+
    "\0\u2675\0\u26ac\0\u26e3\0\u01ef\0\u271a\0\u2751\0\u2788\0\u27bf"+
    "\0\u27f6\0\u282d\0\u2864\0\u289b\0\u28d2\0\u2909\0\u2940\0\u2977"+
    "\0\u01ef\0\u29ae\0\67\0\u29e5\0\u06a9\0\u2a1c\0\u2a53\0\u2a8a"+
    "\0\u2ac1\0\u06a9\0\u2af8\0\u2b2f\0\u2b66\0\u06a9\0\u2b9d\0\u2bd4"+
    "\0\u2c0b\0\u2c42\0\u2c79\0\u2cb0\0\u2ce7\0\u2d1e\0\u2d55\0\u2d8c"+
    "\0\u2dc3\0\u2dfa\0\u2e31\0\u2e68\0\u2e9f\0\u2ed6\0\u2f0d\0\u06a9"+
    "\0\u2f44\0\u06a9\0\u06a9\0\u2f7b\0\u2fb2\0\u2fe9\0\u3020\0\u06a9"+
    "\0\u3057\0\u308e\0\u30c5\0\u30fc\0\u3133\0\u316a\0\u06a9\0\u31a1"+
    "\0\u31d8\0\u06a9\0\u320f\0\u06a9\0\u3246\0\67\0\u06a9";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[295];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\2\1\10"+
    "\1\2\1\11\3\12\1\13\1\12\1\2\1\14\1\15"+
    "\1\16\1\17\1\20\1\12\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\4\12\1\42\2\12"+
    "\1\43\3\12\1\44\3\12\70\0\2\3\1\0\1\3"+
    "\65\0\1\45\1\46\1\0\1\12\3\0\3\12\1\47"+
    "\3\12\4\0\7\12\7\0\11\12\1\0\12\12\1\0"+
    "\2\3\1\46\1\5\62\0\2\6\1\0\64\6\6\0"+
    "\1\7\1\50\57\0\10\51\1\52\1\53\55\51\3\0"+
    "\1\12\2\0\1\12\3\0\1\12\1\54\5\12\4\0"+
    "\7\12\7\0\11\12\1\0\12\12\3\0\1\12\2\0"+
    "\1\12\3\0\7\12\4\0\7\12\7\0\11\12\1\0"+
    "\12\12\3\0\1\55\6\0\3\55\1\56\1\0\1\55"+
    "\5\0\1\57\1\60\1\55\1\61\1\55\1\62\1\63"+
    "\7\0\1\55\1\64\2\55\1\65\4\55\1\0\12\55"+
    "\3\0\1\12\2\0\1\12\3\0\7\12\4\0\1\12"+
    "\1\66\5\12\7\0\1\67\10\12\1\0\12\12\3\0"+
    "\1\12\2\0\1\12\3\0\7\12\4\0\7\12\7\0"+
    "\1\12\1\70\7\12\1\0\12\12\3\0\1\12\2\0"+
    "\1\12\3\0\1\12\1\71\5\12\4\0\1\12\1\72"+
    "\5\12\7\0\1\73\10\12\1\0\12\12\3\0\1\12"+
    "\2\0\1\12\3\0\3\12\1\74\3\12\4\0\7\12"+
    "\7\0\1\75\10\12\1\0\12\12\3\0\1\12\2\0"+
    "\1\12\3\0\7\12\4\0\2\12\1\76\3\12\1\77"+
    "\7\0\11\12\1\0\12\12\3\0\1\12\2\0\1\12"+
    "\3\0\7\12\4\0\3\12\1\100\1\12\1\101\1\12"+
    "\7\0\11\12\1\0\12\12\3\0\1\12\2\0\1\12"+
    "\3\0\7\12\4\0\7\12\7\0\6\12\1\102\2\12"+
    "\1\0\12\12\3\0\1\12\2\0\1\12\3\0\7\12"+
    "\4\0\1\12\1\103\5\12\7\0\11\12\1\0\12\12"+
    "\3\0\1\12\2\0\1\12\3\0\3\12\1\104\3\12"+
    "\4\0\7\12\7\0\1\105\10\12\1\0\12\12\3\0"+
    "\1\12\2\0\1\12\3\0\7\12\4\0\1\12\1\106"+
    "\5\12\7\0\11\12\1\0\12\12\3\0\1\12\2\0"+
    "\1\12\3\0\1\12\1\107\5\12\4\0\7\12\7\0"+
    "\1\110\1\12\1\111\6\12\1\0\12\12\13\0\1\112"+
    "\1\113\11\0\1\114\14\0\1\115\26\0\1\12\2\0"+
    "\1\12\3\0\7\12\4\0\7\12\7\0\11\12\1\0"+
    "\3\12\1\116\6\12\3\0\1\12\2\0\1\12\3\0"+
    "\7\12\4\0\7\12\7\0\11\12\1\0\7\12\1\117"+
    "\2\12\3\0\1\45\1\46\1\0\1\12\3\0\7\12"+
    "\4\0\7\12\7\0\11\12\1\0\12\12\3\0\2\46"+
    "\65\0\1\12\2\0\1\12\3\0\7\12\4\0\1\120"+
    "\6\12\7\0\11\12\1\0\12\12\6\0\1\50\60\0"+
    "\2\51\1\0\64\51\3\0\1\12\2\0\1\12\3\0"+
    "\2\12\1\121\4\12\4\0\7\12\7\0\11\12\1\0"+
    "\12\12\3\0\1\55\2\0\1\55\3\0\7\55\4\0"+
    "\7\55\7\0\11\55\1\0\12\55\3\0\1\55\2\0"+
    "\1\55\3\0\7\55\4\0\4\55\1\122\2\55\7\0"+
    "\11\55\1\0\12\55\3\0\1\55\2\0\1\55\3\0"+
    "\7\55\4\0\7\55\7\0\10\55\1\123\1\0\12\55"+
    "\3\0\1\55\2\0\1\55\3\0\3\55\1\124\3\55"+
    "\4\0\7\55\7\0\11\55\1\0\12\55\3\0\1\55"+
    "\2\0\1\55\3\0\7\55\4\0\6\55\1\125\7\0"+
    "\11\55\1\0\12\55\3\0\1\55\2\0\1\55\3\0"+
    "\1\55\1\126\5\55\4\0\7\55\7\0\11\55\1\0"+
    "\12\55\3\0\1\55\2\0\1\55\3\0\7\55\4\0"+
    "\5\55\1\127\1\55\7\0\11\55\1\0\12\55\3\0"+
    "\1\55\2\0\1\55\3\0\7\55\4\0\1\55\1\130"+
    "\5\55\7\0\11\55\1\0\12\55\3\0\1\55\2\0"+
    "\1\55\3\0\7\55\4\0\7\55\7\0\1\131\10\55"+
    "\1\0\12\55\3\0\1\12\2\0\1\12\3\0\7\12"+
    "\4\0\2\12\1\132\4\12\7\0\11\12\1\0\12\12"+
    "\3\0\1\12\2\0\1\12\3\0\7\12\4\0\1\133"+
    "\6\12\7\0\11\12\1\0\12\12\3\0\1\12\2\0"+
    "\1\12\3\0\7\12\4\0\4\12\1\134\2\12\7\0"+
    "\11\12\1\0\12\12\3\0\1\12\2\0\1\12\3\0"+
    "\7\12\4\0\7\12\7\0\1\135\10\12\1\0\12\12"+
    "\3\0\1\12\2\0\1\12\3\0\7\12\4\0\1\12"+
    "\1\136\5\12\7\0\11\12\1\0\12\12\3\0\1\12"+
    "\2\0\1\12\3\0\7\12\4\0\1\137\6\12\7\0"+
    "\11\12\1\0\12\12\3\0\1\12\2\0\1\12\3\0"+
    "\7\12\4\0\7\12\7\0\1\140\10\12\1\0\12\12"+
    "\3\0\1\12\2\0\1\12\3\0\7\12\4\0\4\12"+
    "\1\141\2\12\7\0\11\12\1\0\12\12\3\0\1\12"+
    "\2\0\1\12\3\0\7\12\4\0\4\12\1\142\2\12"+
    "\7\0\11\12\1\0\12\12\3\0\1\12\2\0\1\12"+
    "\3\0\7\12\4\0\7\12\7\0\7\12\1\143\1\12"+
    "\1\0\12\12\3\0\1\12\2\0\1\12\3\0\7\12"+
    "\4\0\6\12\1\144\7\0\11\12\1\0\12\12\3\0"+
    "\1\12\2\0\1\12\3\0\7\12\4\0\3\12\1\145"+
    "\3\12\7\0\11\12\1\0\12\12\3\0\1\12\2\0"+
    "\1\12\3\0\7\12\4\0\7\12\7\0\3\12\1\146"+
    "\5\12\1\0\12\12\3\0\1\12\2\0\1\12\3\0"+
    "\7\12\4\0\6\12\1\147\7\0\11\12\1\0\12\12"+
    "\3\0\1\12\2\0\1\12\3\0\7\12\4\0\1\12"+
    "\1\150\5\12\7\0\11\12\1\0\12\12\3\0\1\12"+
    "\2\0\1\12\3\0\7\12\4\0\4\12\1\151\1\152"+
    "\1\12\7\0\1\12\1\153\7\12\1\0\12\12\3\0"+
    "\1\12\2\0\1\12\3\0\7\12\4\0\1\12\1\154"+
    "\5\12\7\0\11\12\1\0\12\12\27\0\1\155\1\0"+
    "\1\156\52\0\1\157\66\0\1\160\115\0\1\161\25\0"+
    "\1\12\2\0\1\12\3\0\7\12\4\0\7\12\7\0"+
    "\11\12\1\0\4\12\1\162\5\12\3\0\1\12\2\0"+
    "\1\12\3\0\7\12\4\0\7\12\7\0\11\12\1\0"+
    "\10\12\1\163\1\12\3\0\1\12\2\0\1\12\3\0"+
    "\7\12\4\0\7\12\7\0\5\12\1\164\3\12\1\0"+
    "\12\12\3\0\1\12\2\0\1\12\3\0\3\12\1\165"+
    "\3\12\4\0\7\12\7\0\11\12\1\0\12\12\3\0"+
    "\1\55\2\0\1\55\3\0\3\55\1\166\3\55\4\0"+
    "\7\55\7\0\11\55\1\0\12\55\3\0\1\55\2\0"+
    "\1\55\3\0\7\55\4\0\7\55\7\0\1\55\1\167"+
    "\7\55\1\0\12\55\3\0\1\55\2\0\1\55\3\0"+
    "\1\55\1\170\5\55\4\0\7\55\7\0\11\55\1\0"+
    "\12\55\3\0\1\55\2\0\1\55\3\0\7\55\4\0"+
    "\4\55\1\171\2\55\7\0\11\55\1\0\12\55\3\0"+
    "\1\55\2\0\1\55\3\0\1\172\6\55\4\0\7\55"+
    "\7\0\11\55\1\0\12\55\3\0\1\55\2\0\1\55"+
    "\3\0\7\55\4\0\6\55\1\173\7\0\4\55\1\174"+
    "\4\55\1\0\12\55\3\0\1\55\2\0\1\55\3\0"+
    "\3\55\1\175\3\55\4\0\6\55\1\176\7\0\11\55"+
    "\1\0\12\55\3\0\1\55\2\0\1\55\3\0\7\55"+
    "\4\0\5\55\1\177\1\55\7\0\1\55\1\200\7\55"+
    "\1\0\12\55\3\0\1\12\2\0\1\12\3\0\3\12"+
    "\1\201\3\12\4\0\7\12\7\0\11\12\1\0\12\12"+
    "\3\0\1\12\2\0\1\12\3\0\7\12\4\0\7\12"+
    "\7\0\1\202\10\12\1\0\12\12\3\0\1\203\2\0"+
    "\1\12\3\0\7\12\4\0\7\12\7\0\11\12\1\0"+
    "\12\12\3\0\1\12\2\0\1\12\3\0\1\204\6\12"+
    "\4\0\7\12\7\0\11\12\1\0\12\12\3\0\1\12"+
    "\2\0\1\12\3\0\7\12\4\0\7\12\7\0\1\12"+
    "\1\205\7\12\1\0\12\12\3\0\1\12\2\0\1\12"+
    "\3\0\7\12\4\0\4\12\1\206\2\12\7\0\11\12"+
    "\1\0\12\12\3\0\1\12\2\0\1\12\3\0\3\12"+
    "\1\207\3\12\4\0\7\12\7\0\11\12\1\0\12\12"+
    "\3\0\1\12\2\0\1\12\3\0\7\12\4\0\5\12"+
    "\1\210\1\12\7\0\11\12\1\0\12\12\3\0\1\211"+
    "\2\0\1\12\3\0\7\12\4\0\2\12\1\212\4\12"+
    "\7\0\11\12\1\0\12\12\3\0\1\12\2\0\1\12"+
    "\3\0\7\12\4\0\5\12\1\213\1\12\7\0\11\12"+
    "\1\0\12\12\3\0\1\12\2\0\1\12\3\0\7\12"+
    "\4\0\1\214\6\12\7\0\11\12\1\0\12\12\3\0"+
    "\1\12\2\0\1\12\3\0\7\12\4\0\4\12\1\215"+
    "\2\12\7\0\11\12\1\0\12\12\3\0\1\216\2\0"+
    "\1\12\3\0\7\12\4\0\7\12\7\0\11\12\1\0"+
    "\12\12\3\0\1\12\2\0\1\12\3\0\7\12\4\0"+
    "\6\12\1\217\7\0\11\12\1\0\12\12\55\0\1\220"+
    "\42\0\1\221\110\0\1\222\16\0\1\223\110\0\1\224"+
    "\44\0\1\12\2\0\1\12\3\0\7\12\4\0\7\12"+
    "\7\0\11\12\1\0\5\12\1\225\4\12\3\0\1\12"+
    "\2\0\1\12\3\0\7\12\4\0\7\12\7\0\11\12"+
    "\1\0\2\12\1\226\7\12\3\0\1\12\2\0\1\12"+
    "\3\0\4\12\1\227\2\12\4\0\7\12\7\0\11\12"+
    "\1\0\12\12\3\0\1\55\2\0\1\55\3\0\1\230"+
    "\6\55\4\0\7\55\7\0\11\55\1\0\12\55\3\0"+
    "\1\55\2\0\1\55\3\0\3\55\1\231\3\55\4\0"+
    "\7\55\7\0\11\55\1\0\12\55\3\0\1\55\2\0"+
    "\1\55\3\0\7\55\4\0\7\55\7\0\2\55\1\232"+
    "\6\55\1\0\12\55\3\0\1\55\2\0\1\55\3\0"+
    "\7\55\4\0\4\55\1\233\2\55\7\0\11\55\1\0"+
    "\12\55\3\0\1\55\2\0\1\55\3\0\3\55\1\234"+
    "\3\55\4\0\7\55\7\0\11\55\1\0\12\55\3\0"+
    "\1\55\2\0\1\55\3\0\7\55\4\0\1\235\6\55"+
    "\7\0\11\55\1\0\12\55\3\0\1\55\2\0\1\55"+
    "\3\0\7\55\4\0\4\55\1\236\2\55\7\0\11\55"+
    "\1\0\12\55\3\0\1\55\2\0\1\55\3\0\7\55"+
    "\4\0\7\55\7\0\2\55\1\237\6\55\1\0\12\55"+
    "\3\0\1\55\2\0\1\55\3\0\7\55\4\0\5\55"+
    "\1\240\1\55\7\0\11\55\1\0\12\55\3\0\1\241"+
    "\2\0\1\55\3\0\7\55\4\0\7\55\7\0\4\55"+
    "\1\242\4\55\1\0\12\55\3\0\1\55\2\0\1\55"+
    "\3\0\7\55\4\0\6\55\1\243\7\0\11\55\1\0"+
    "\12\55\3\0\1\12\2\0\1\12\3\0\3\12\1\244"+
    "\3\12\4\0\7\12\7\0\11\12\1\0\12\12\3\0"+
    "\1\12\2\0\1\12\3\0\7\12\4\0\7\12\7\0"+
    "\4\12\1\245\4\12\1\0\12\12\3\0\1\12\2\0"+
    "\1\12\3\0\7\12\4\0\1\246\6\12\7\0\11\12"+
    "\1\0\12\12\3\0\1\12\2\0\1\12\3\0\7\12"+
    "\4\0\1\247\6\12\7\0\11\12\1\0\12\12\3\0"+
    "\1\12\2\0\1\12\3\0\7\12\4\0\5\12\1\250"+
    "\1\12\7\0\11\12\1\0\12\12\3\0\1\12\2\0"+
    "\1\12\3\0\7\12\4\0\1\251\2\12\1\252\3\12"+
    "\7\0\11\12\1\0\12\12\3\0\1\12\2\0\1\12"+
    "\3\0\3\12\1\253\3\12\4\0\7\12\7\0\11\12"+
    "\1\0\12\12\3\0\1\12\2\0\1\12\3\0\3\12"+
    "\1\254\3\12\4\0\7\12\7\0\11\12\1\0\12\12"+
    "\3\0\1\12\2\0\1\12\3\0\3\12\1\255\3\12"+
    "\4\0\7\12\7\0\11\12\1\0\12\12\43\0\1\256"+
    "\50\0\1\257\74\0\1\260\36\0\1\12\2\0\1\12"+
    "\3\0\7\12\4\0\7\12\7\0\11\12\1\0\6\12"+
    "\1\261\3\12\3\0\1\12\2\0\1\12\3\0\7\12"+
    "\4\0\7\12\7\0\11\12\1\0\3\12\1\262\6\12"+
    "\3\0\1\263\2\0\1\12\3\0\4\263\1\12\1\263"+
    "\1\12\4\0\7\263\7\0\11\263\1\0\12\263\3\0"+
    "\1\55\2\0\1\55\3\0\3\55\1\264\3\55\4\0"+
    "\7\55\7\0\11\55\1\0\12\55\3\0\1\55\2\0"+
    "\1\55\3\0\6\55\1\265\4\0\7\55\7\0\11\55"+
    "\1\0\12\55\3\0\1\55\2\0\1\55\3\0\6\55"+
    "\1\266\4\0\7\55\7\0\11\55\1\0\12\55\3\0"+
    "\1\55\2\0\1\55\3\0\7\55\4\0\7\55\7\0"+
    "\2\55\1\267\6\55\1\0\12\55\3\0\1\55\2\0"+
    "\1\55\3\0\7\55\4\0\6\55\1\270\7\0\11\55"+
    "\1\0\12\55\3\0\1\55\2\0\1\55\3\0\7\55"+
    "\4\0\2\55\1\271\4\55\7\0\11\55\1\0\12\55"+
    "\3\0\1\55\2\0\1\55\3\0\7\55\4\0\6\55"+
    "\1\272\7\0\11\55\1\0\12\55\3\0\1\55\2\0"+
    "\1\55\3\0\7\55\4\0\1\273\6\55\7\0\11\55"+
    "\1\0\12\55\3\0\1\55\2\0\1\55\3\0\7\55"+
    "\4\0\1\274\6\55\7\0\11\55\1\0\12\55\3\0"+
    "\1\55\2\0\1\55\3\0\4\55\1\275\2\55\4\0"+
    "\7\55\7\0\11\55\1\0\12\55\3\0\1\55\2\0"+
    "\1\55\3\0\3\55\1\276\3\55\4\0\7\55\7\0"+
    "\11\55\1\0\12\55\3\0\1\12\2\0\1\12\3\0"+
    "\7\12\4\0\1\277\6\12\7\0\11\12\1\0\12\12"+
    "\3\0\1\12\2\0\1\12\3\0\7\12\4\0\1\12"+
    "\1\300\5\12\7\0\11\12\1\0\12\12\3\0\1\12"+
    "\2\0\1\12\3\0\7\12\4\0\7\12\7\0\1\301"+
    "\10\12\1\0\12\12\3\0\1\12\2\0\1\12\3\0"+
    "\7\12\4\0\1\12\1\302\5\12\7\0\11\12\1\0"+
    "\12\12\3\0\1\12\2\0\1\12\3\0\7\12\4\0"+
    "\7\12\7\0\4\12\1\303\4\12\1\0\12\12\3\0"+
    "\1\12\2\0\1\12\3\0\7\12\4\0\1\12\1\304"+
    "\5\12\7\0\11\12\1\0\12\12\46\0\1\305\63\0"+
    "\1\306\26\0\1\12\2\0\1\12\3\0\7\12\4\0"+
    "\7\12\7\0\11\12\1\0\3\12\1\307\6\12\3\0"+
    "\1\12\2\0\1\12\3\0\7\12\4\0\7\12\7\0"+
    "\11\12\1\0\11\12\1\310\3\0\1\263\2\0\1\263"+
    "\3\0\7\263\4\0\7\263\7\0\11\263\1\0\12\263"+
    "\3\0\1\55\2\0\1\55\3\0\7\55\4\0\5\55"+
    "\1\311\1\55\7\0\11\55\1\0\12\55\3\0\1\55"+
    "\2\0\1\55\3\0\7\55\4\0\7\55\7\0\1\312"+
    "\10\55\1\0\12\55\3\0\1\55\2\0\1\55\3\0"+
    "\7\55\4\0\7\55\7\0\1\55\1\313\7\55\1\0"+
    "\12\55\3\0\1\55\2\0\1\55\3\0\1\55\1\314"+
    "\5\55\4\0\7\55\7\0\11\55\1\0\12\55\3\0"+
    "\1\55\2\0\1\55\3\0\7\55\4\0\7\55\7\0"+
    "\2\55\1\315\6\55\1\0\12\55\3\0\1\55\2\0"+
    "\1\55\3\0\7\55\4\0\7\55\7\0\4\55\1\316"+
    "\4\55\1\0\12\55\3\0\1\55\2\0\1\55\3\0"+
    "\4\55\1\317\2\55\4\0\7\55\7\0\11\55\1\0"+
    "\12\55\3\0\1\55\2\0\1\55\3\0\7\55\4\0"+
    "\1\55\1\320\5\55\7\0\11\55\1\0\12\55\3\0"+
    "\1\55\2\0\1\55\3\0\7\55\4\0\5\55\1\321"+
    "\1\55\7\0\11\55\1\0\12\55\3\0\1\55\2\0"+
    "\1\55\3\0\7\55\4\0\1\55\1\322\5\55\7\0"+
    "\11\55\1\0\12\55\3\0\1\12\2\0\1\12\3\0"+
    "\7\12\4\0\2\12\1\323\4\12\7\0\11\12\1\0"+
    "\12\12\3\0\1\12\2\0\1\12\3\0\7\12\4\0"+
    "\7\12\7\0\1\324\10\12\1\0\12\12\3\0\1\12"+
    "\2\0\1\12\3\0\7\12\4\0\1\325\6\12\7\0"+
    "\11\12\1\0\12\12\16\0\1\326\102\0\1\327\37\0"+
    "\1\12\2\0\1\12\3\0\7\12\4\0\7\12\7\0"+
    "\11\12\1\0\7\12\1\330\2\12\3\0\1\55\2\0"+
    "\1\55\3\0\7\55\4\0\1\331\6\55\7\0\11\55"+
    "\1\0\12\55\3\0\1\55\2\0\1\55\3\0\7\55"+
    "\4\0\5\55\1\332\1\55\7\0\11\55\1\0\12\55"+
    "\3\0\1\55\2\0\1\55\3\0\7\55\4\0\7\55"+
    "\7\0\1\333\10\55\1\0\12\55\3\0\1\55\2\0"+
    "\1\55\3\0\7\55\4\0\4\55\1\334\2\55\7\0"+
    "\11\55\1\0\12\55\3\0\1\55\2\0\1\55\3\0"+
    "\3\55\1\335\3\55\4\0\7\55\7\0\11\55\1\0"+
    "\12\55\3\0\1\55\2\0\1\55\3\0\1\55\1\336"+
    "\5\55\4\0\7\55\7\0\11\55\1\0\12\55\3\0"+
    "\1\55\2\0\1\55\3\0\7\55\4\0\3\55\1\337"+
    "\3\55\7\0\1\340\10\55\1\0\12\55\3\0\1\55"+
    "\2\0\1\55\3\0\7\55\4\0\2\55\1\341\4\55"+
    "\7\0\11\55\1\0\12\55\3\0\1\55\2\0\1\55"+
    "\3\0\1\55\1\342\5\55\4\0\7\55\7\0\11\55"+
    "\1\0\12\55\3\0\1\12\2\0\1\12\3\0\7\12"+
    "\4\0\7\12\7\0\4\12\1\343\4\12\1\0\12\12"+
    "\3\0\1\12\2\0\1\12\3\0\1\344\6\12\4\0"+
    "\7\12\7\0\11\12\1\0\12\12\43\0\1\345\36\0"+
    "\1\346\56\0\1\55\2\0\1\55\3\0\4\55\1\347"+
    "\2\55\4\0\7\55\7\0\11\55\1\0\12\55\3\0"+
    "\1\55\2\0\1\55\3\0\7\55\4\0\4\55\1\350"+
    "\2\55\7\0\11\55\1\0\12\55\3\0\1\55\2\0"+
    "\1\55\3\0\7\55\4\0\6\55\1\351\7\0\11\55"+
    "\1\0\12\55\3\0\1\55\2\0\1\55\3\0\4\55"+
    "\1\352\1\55\1\353\4\0\7\55\7\0\11\55\1\0"+
    "\12\55\3\0\1\55\2\0\1\55\3\0\7\55\4\0"+
    "\1\354\6\55\7\0\11\55\1\0\12\55\3\0\1\55"+
    "\2\0\1\55\3\0\7\55\4\0\2\55\1\355\4\55"+
    "\7\0\11\55\1\0\12\55\3\0\1\55\2\0\1\55"+
    "\3\0\7\55\4\0\7\55\7\0\6\55\1\356\2\55"+
    "\1\0\12\55\3\0\1\55\2\0\1\55\3\0\7\55"+
    "\4\0\7\55\7\0\4\55\1\357\4\55\1\0\12\55"+
    "\3\0\1\55\2\0\1\55\3\0\1\360\6\55\4\0"+
    "\7\55\7\0\11\55\1\0\12\55\3\0\1\12\2\0"+
    "\1\12\3\0\7\12\4\0\1\361\6\12\7\0\11\12"+
    "\1\0\12\12\25\0\1\362\72\0\1\363\40\0\1\55"+
    "\2\0\1\55\3\0\7\55\4\0\1\364\6\55\7\0"+
    "\11\55\1\0\12\55\3\0\1\55\2\0\1\55\3\0"+
    "\7\55\4\0\7\55\7\0\10\55\1\365\1\0\12\55"+
    "\3\0\1\55\2\0\1\55\3\0\7\55\4\0\5\55"+
    "\1\366\1\55\7\0\11\55\1\0\12\55\3\0\1\55"+
    "\2\0\1\55\3\0\7\55\4\0\7\55\7\0\1\367"+
    "\10\55\1\0\12\55\3\0\1\55\2\0\1\55\3\0"+
    "\3\55\1\370\3\55\4\0\7\55\7\0\4\55\1\371"+
    "\4\55\1\0\12\55\3\0\1\55\2\0\1\55\3\0"+
    "\3\55\1\372\3\55\4\0\7\55\7\0\11\55\1\0"+
    "\12\55\3\0\1\55\2\0\1\55\3\0\7\55\4\0"+
    "\5\55\1\373\1\55\7\0\11\55\1\0\12\55\3\0"+
    "\1\55\2\0\1\55\3\0\7\55\4\0\7\55\7\0"+
    "\7\55\1\374\1\55\1\0\12\55\3\0\1\55\2\0"+
    "\1\55\3\0\7\55\4\0\1\375\6\55\7\0\11\55"+
    "\1\0\12\55\3\0\1\55\2\0\1\55\3\0\3\55"+
    "\1\376\3\55\4\0\7\55\7\0\11\55\1\0\12\55"+
    "\56\0\1\377\13\0\1\55\2\0\1\55\3\0\7\55"+
    "\4\0\7\55\7\0\10\55\1\u0100\1\0\12\55\3\0"+
    "\1\55\2\0\1\55\3\0\7\55\4\0\1\u0101\6\55"+
    "\7\0\11\55\1\0\12\55\3\0\1\55\2\0\1\55"+
    "\3\0\7\55\4\0\3\55\1\u0102\3\55\7\0\11\55"+
    "\1\0\12\55\3\0\1\55\2\0\1\55\3\0\7\55"+
    "\4\0\4\55\1\u0103\2\55\7\0\11\55\1\0\12\55"+
    "\3\0\1\55\2\0\1\55\3\0\7\55\4\0\7\55"+
    "\7\0\1\u0104\10\55\1\0\12\55\3\0\1\55\2\0"+
    "\1\55\3\0\7\55\4\0\7\55\7\0\4\55\1\u0105"+
    "\4\55\1\0\12\55\3\0\1\55\2\0\1\55\3\0"+
    "\3\55\1\u0106\3\55\4\0\7\55\7\0\11\55\1\0"+
    "\12\55\3\0\1\55\2\0\1\55\3\0\7\55\4\0"+
    "\7\55\7\0\1\u0107\10\55\1\0\12\55\26\0\1\u0108"+
    "\43\0\1\55\2\0\1\55\3\0\7\55\4\0\7\55"+
    "\7\0\1\55\1\u0109\7\55\1\0\12\55\3\0\1\55"+
    "\2\0\1\55\3\0\3\55\1\u010a\3\55\4\0\7\55"+
    "\7\0\11\55\1\0\12\55\3\0\1\55\2\0\1\55"+
    "\3\0\7\55\4\0\3\55\1\u010b\3\55\7\0\11\55"+
    "\1\0\12\55\3\0\1\55\2\0\1\55\3\0\3\55"+
    "\1\u010c\3\55\4\0\7\55\7\0\11\55\1\0\12\55"+
    "\3\0\1\55\2\0\1\55\3\0\7\55\4\0\5\55"+
    "\1\u010d\1\55\7\0\11\55\1\0\12\55\3\0\1\55"+
    "\2\0\1\55\3\0\7\55\4\0\1\u010e\6\55\7\0"+
    "\11\55\1\0\12\55\3\0\1\55\2\0\1\55\3\0"+
    "\7\55\4\0\7\55\7\0\4\55\1\u010f\4\55\1\0"+
    "\12\55\3\0\1\55\2\0\1\55\3\0\7\55\4\0"+
    "\1\55\1\u0110\5\55\7\0\11\55\1\0\12\55\16\0"+
    "\1\u0111\53\0\1\55\2\0\1\55\3\0\3\55\1\u0112"+
    "\3\55\4\0\7\55\7\0\11\55\1\0\12\55\3\0"+
    "\1\55\2\0\1\55\3\0\7\55\4\0\1\55\1\u0113"+
    "\5\55\7\0\11\55\1\0\12\55\3\0\1\u0114\2\0"+
    "\1\55\3\0\7\55\4\0\7\55\7\0\11\55\1\0"+
    "\12\55\3\0\1\55\2\0\1\55\3\0\1\u0115\6\55"+
    "\4\0\7\55\7\0\11\55\1\0\12\55\3\0\1\55"+
    "\2\0\1\55\3\0\7\55\4\0\1\u0116\6\55\7\0"+
    "\11\55\1\0\12\55\3\0\1\55\2\0\1\55\3\0"+
    "\7\55\4\0\6\55\1\u0117\7\0\11\55\1\0\12\55"+
    "\3\0\1\55\2\0\1\55\3\0\7\55\4\0\1\u0118"+
    "\6\55\7\0\11\55\1\0\12\55\14\0\1\u0119\55\0"+
    "\1\55\2\0\1\55\3\0\3\55\1\u011a\3\55\4\0"+
    "\7\55\7\0\11\55\1\0\12\55\3\0\1\55\2\0"+
    "\1\55\3\0\3\55\1\u011b\3\55\4\0\7\55\7\0"+
    "\11\55\1\0\12\55\3\0\1\55\2\0\1\55\3\0"+
    "\3\55\1\u011c\3\55\4\0\7\55\7\0\11\55\1\0"+
    "\12\55\3\0\1\55\2\0\1\55\3\0\7\55\4\0"+
    "\7\55\7\0\1\u011d\10\55\1\0\12\55\15\0\1\u011e"+
    "\54\0\1\55\2\0\1\55\3\0\7\55\4\0\1\u011f"+
    "\6\55\7\0\11\55\1\0\12\55\3\0\1\55\2\0"+
    "\1\55\3\0\7\55\4\0\5\55\1\u0120\1\55\7\0"+
    "\11\55\1\0\12\55\3\0\1\55\2\0\1\55\3\0"+
    "\7\55\4\0\5\55\1\u0121\1\55\7\0\11\55\1\0"+
    "\12\55\3\0\1\55\2\0\1\55\3\0\7\55\4\0"+
    "\5\55\1\u0122\1\55\7\0\11\55\1\0\12\55\53\0"+
    "\1\u0123\16\0\1\55\2\0\1\55\3\0\7\55\4\0"+
    "\1\u0124\6\55\7\0\11\55\1\0\12\55\3\0\1\55"+
    "\2\0\1\55\3\0\7\55\4\0\1\u0125\6\55\7\0"+
    "\11\55\1\0\12\55\3\0\1\u0126\66\0\1\u0127\2\0"+
    "\1\55\3\0\7\55\4\0\7\55\7\0\11\55\1\0"+
    "\12\55";

  private static int [] zzUnpackTrans() {
    int [] result = new int[12925];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\10\1\1\11\1\1\3\11\6\1\7\11"+
    "\14\1\1\0\1\11\1\0\36\1\4\0\37\1\5\0"+
    "\36\1\1\11\1\0\1\11\2\0\31\1\1\0\1\11"+
    "\1\0\24\1\2\0\17\1\2\0\15\1\2\0\13\1"+
    "\1\0\1\11\13\1\1\0\10\1\1\0\10\1\1\0"+
    "\7\1\1\0\4\1\1\0\4\1\1\0\2\1\1\11"+
    "\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[295];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
  public LispLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LispLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 142) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 65: 
          { return PRINT_FUNCTION_KEY;
          }
        case 69: break;
        case 21: 
          { return IF;
          }
        case 70: break;
        case 62: 
          { return FILL_POINTER_KEY;
          }
        case 71: break;
        case 66: 
          { return INITIAL_ELEMENT_KEY;
          }
        case 72: break;
        case 68: 
          { return INITIAL_CONTENTS_KEY;
          }
        case 73: break;
        case 42: 
          { return WRITE;
          }
        case 74: break;
        case 46: 
          { return OBJECT;
          }
        case 75: break;
        case 12: 
          { return OP_3;
          }
        case 76: break;
        case 15: 
          { return OP_6;
          }
        case 77: break;
        case 50: 
          { return COPIER_KEY;
          }
        case 78: break;
        case 6: 
          { return SYMBOL;
          }
        case 79: break;
        case 48: 
          { return COPIER;
          }
        case 80: break;
        case 36: 
          { return LIST_KEYWORDS_3;
          }
        case 81: break;
        case 34: 
          { return IF_NULL;
          }
        case 82: break;
        case 27: 
          { return CAR;
          }
        case 83: break;
        case 63: 
          { return PRINT_OBJECT_KEY;
          }
        case 84: break;
        case 3: 
          { return SPACE;
          }
        case 85: break;
        case 58: 
          { return PREDICATE_KEY;
          }
        case 86: break;
        case 54: 
          { return DOWNFROM;
          }
        case 87: break;
        case 40: 
          { return PRINT;
          }
        case 88: break;
        case 5: 
          { return NUMBER;
          }
        case 89: break;
        case 61: 
          { return ELEMENT_TYPE_KEY;
          }
        case 90: break;
        case 52: 
          { return DECLARE;
          }
        case 91: break;
        case 39: 
          { return FALSE;
          }
        case 92: break;
        case 59: 
          { return CONC_NAME_KEY;
          }
        case 93: break;
        case 4: 
          { return COMMENT;
          }
        case 94: break;
        case 51: 
          { return COLLECT;
          }
        case 95: break;
        case 22: 
          { return IN;
          }
        case 96: break;
        case 9: 
          { return LP;
          }
        case 97: break;
        case 45: 
          { return NAMED_OPTION_KEY;
          }
        case 98: break;
        case 7: 
          { return OP_2;
          }
        case 99: break;
        case 14: 
          { return OP_5;
          }
        case 100: break;
        case 57: 
          { return READ_ONLY_KEY;
          }
        case 101: break;
        case 26: 
          { return NULL;
          }
        case 102: break;
        case 35: 
          { return CONS;
          }
        case 103: break;
        case 53: 
          { return INCLUDE_KEY;
          }
        case 104: break;
        case 55: 
          { return DEFSTRUCT;
          }
        case 105: break;
        case 43: 
          { return LIST_KEYWORDS_2;
          }
        case 106: break;
        case 41: 
          { return DEFUN;
          }
        case 107: break;
        case 19: 
          { return OBJECT_FIELD;
          }
        case 108: break;
        case 67: 
          { return LIST_KEYWORDS_5;
          }
        case 109: break;
        case 47: 
          { return DOWNTO;
          }
        case 110: break;
        case 31: 
          { return UPTO;
          }
        case 111: break;
        case 49: 
          { return LAMBDA;
          }
        case 112: break;
        case 23: 
          { return DO;
          }
        case 113: break;
        case 60: 
          { return CONSTRUCTOR_KEY;
          }
        case 114: break;
        case 10: 
          { return RP;
          }
        case 115: break;
        case 38: 
          { return TYPE_KEY;
          }
        case 116: break;
        case 32: 
          { return FROM;
          }
        case 117: break;
        case 11: 
          { return OP_1;
          }
        case 118: break;
        case 13: 
          { return OP_4;
          }
        case 119: break;
        case 16: 
          { return OP_7;
          }
        case 120: break;
        case 20: 
          { return TO;
          }
        case 121: break;
        case 25: 
          { return LET;
          }
        case 122: break;
        case 18: 
          { return STRING;
          }
        case 123: break;
        case 2: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 124: break;
        case 30: 
          { return TRUE;
          }
        case 125: break;
        case 24: 
          { return FOR;
          }
        case 126: break;
        case 17: 
          { return QV;
          }
        case 127: break;
        case 56: 
          { return LIST_KEYWORDS_1;
          }
        case 128: break;
        case 28: 
          { return CDR;
          }
        case 129: break;
        case 8: 
          { return EQ;
          }
        case 130: break;
        case 37: 
          { return LIST_KEYWORDS_4;
          }
        case 131: break;
        case 33: 
          { return LOOP;
          }
        case 132: break;
        case 64: 
          { return INITIAL_OFFSET_KEY;
          }
        case 133: break;
        case 44: 
          { return MAKE;
          }
        case 134: break;
        case 1: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 135: break;
        case 29: 
          { return SETQ;
          }
        case 136: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
