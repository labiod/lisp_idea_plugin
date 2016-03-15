/* The following code was generated by JFlex 1.4.3 on 3/15/16 4:07 PM */

package com.kgb.lisp.lexer;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.kgb.lisp.psi.LispTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 3/15/16 4:07 PM from the specification file
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
    "\11\0\1\4\1\2\1\0\1\1\1\1\22\0\1\1\1\23\1\10"+
    "\4\0\1\26\1\16\1\17\1\22\1\20\1\0\1\21\1\7\1\5"+
    "\12\6\1\34\1\14\1\25\1\15\1\24\2\0\4\12\1\30\1\12"+
    "\1\31\10\12\1\33\1\12\1\27\5\12\1\32\2\12\1\0\1\11"+
    "\2\0\1\13\1\0\1\36\1\12\1\35\1\41\1\52\1\45\2\12"+
    "\1\46\2\12\1\42\1\50\1\47\1\43\1\44\1\12\1\37\1\3"+
    "\1\51\1\53\5\12\1\0\1\40\uff83\0";

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
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\10\6\1\3\1\22\1\5"+
    "\1\0\1\23\1\0\2\6\1\24\5\6\1\25\1\26"+
    "\2\6\1\27\4\6\1\30\1\6\1\31\1\32\4\6"+
    "\1\33\1\34\1\35\2\6\1\36\2\6\1\0\1\37"+
    "\12\0\1\40";

  private static int [] zzUnpackAction() {
    int [] result = new int[80];
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
    "\0\0\0\54\0\130\0\204\0\260\0\334\0\u0108\0\u0134"+
    "\0\u0160\0\54\0\54\0\54\0\54\0\54\0\54\0\54"+
    "\0\54\0\54\0\54\0\54\0\u018c\0\u01b8\0\u01e4\0\u0210"+
    "\0\u023c\0\u0268\0\u0294\0\u02c0\0\u02ec\0\u0318\0\u0344\0\u0134"+
    "\0\54\0\u0370\0\u039c\0\u03c8\0\u0160\0\u03f4\0\u0420\0\u044c"+
    "\0\u0478\0\u04a4\0\u0160\0\u0160\0\u04d0\0\u04fc\0\u0160\0\u0528"+
    "\0\u0554\0\u0580\0\u05ac\0\u0160\0\u05d8\0\u0160\0\u0160\0\u0604"+
    "\0\u0630\0\u065c\0\u0688\0\u0160\0\u0160\0\u0160\0\u06b4\0\u06e0"+
    "\0\u0160\0\u070c\0\u0738\0\u0764\0\u0160\0\u0790\0\u07bc\0\u07e8"+
    "\0\u0814\0\u0840\0\u086c\0\u0898\0\u08c4\0\u08f0\0\u091c\0\54";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[80];
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
    "\1\2\1\11\1\2\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\4\11"+
    "\1\2\1\26\2\11\1\2\1\27\1\30\2\11\1\31"+
    "\1\32\1\33\1\11\1\34\2\11\55\0\2\3\1\0"+
    "\1\3\52\0\1\4\1\35\1\0\1\11\3\0\2\11"+
    "\5\0\1\11\5\0\5\11\1\0\3\11\1\0\13\11"+
    "\1\0\2\3\1\35\1\5\54\0\1\36\54\0\1\7"+
    "\1\37\44\0\10\40\1\41\1\42\42\40\3\0\1\11"+
    "\2\0\1\11\3\0\2\11\5\0\1\11\5\0\5\11"+
    "\1\0\3\11\1\0\13\11\3\0\1\11\2\0\1\11"+
    "\3\0\2\11\5\0\1\11\5\0\1\11\1\43\3\11"+
    "\1\0\3\11\1\0\13\11\3\0\1\11\2\0\1\11"+
    "\3\0\2\11\5\0\1\11\5\0\5\11\1\0\3\11"+
    "\1\0\2\11\1\44\10\11\3\0\1\11\2\0\1\11"+
    "\3\0\2\11\5\0\1\11\5\0\5\11\1\0\3\11"+
    "\1\0\2\11\1\45\6\11\1\46\1\11\3\0\1\11"+
    "\2\0\1\11\3\0\2\11\5\0\1\11\5\0\5\11"+
    "\1\0\3\11\1\0\2\11\1\47\6\11\1\50\1\11"+
    "\3\0\1\11\2\0\1\11\3\0\2\11\5\0\1\11"+
    "\5\0\5\11\1\0\2\11\1\51\1\0\2\11\1\52"+
    "\10\11\3\0\1\11\2\0\1\11\3\0\2\11\5\0"+
    "\1\11\5\0\5\11\1\0\3\11\1\0\4\11\1\53"+
    "\1\11\1\54\4\11\3\0\1\11\2\0\1\11\3\0"+
    "\2\11\5\0\1\11\5\0\5\11\1\0\3\11\1\0"+
    "\5\11\1\55\4\11\1\56\3\0\1\11\2\0\1\11"+
    "\3\0\2\11\5\0\1\11\5\0\5\11\1\0\3\11"+
    "\1\0\2\11\1\57\10\11\3\0\2\35\47\0\2\36"+
    "\1\0\51\36\6\0\1\37\45\0\2\40\1\0\51\40"+
    "\3\0\1\11\2\0\1\11\3\0\2\11\5\0\1\11"+
    "\5\0\2\11\1\60\2\11\1\0\3\11\1\0\13\11"+
    "\3\0\1\11\2\0\1\11\3\0\2\11\5\0\1\11"+
    "\5\0\5\11\1\0\3\11\1\0\1\11\1\61\11\11"+
    "\3\0\1\11\2\0\1\11\3\0\2\11\5\0\1\11"+
    "\5\0\5\11\1\0\3\11\1\0\4\11\1\62\6\11"+
    "\3\0\1\11\2\0\1\11\3\0\2\11\5\0\1\11"+
    "\5\0\5\11\1\0\3\11\1\0\2\11\1\63\10\11"+
    "\3\0\1\11\2\0\1\11\3\0\2\11\5\0\1\11"+
    "\5\0\5\11\1\0\3\11\1\0\10\11\1\64\2\11"+
    "\3\0\1\11\2\0\1\11\3\0\2\11\5\0\1\11"+
    "\5\0\5\11\1\0\3\11\1\0\2\11\1\65\10\11"+
    "\3\0\1\11\2\0\1\11\3\0\2\11\5\0\1\11"+
    "\5\0\5\11\1\0\2\11\1\66\1\0\13\11\3\0"+
    "\1\11\2\0\1\11\3\0\2\11\5\0\1\11\5\0"+
    "\5\11\1\0\3\11\1\0\1\11\1\67\11\11\3\0"+
    "\1\11\2\0\1\11\3\0\2\11\5\0\1\11\5\0"+
    "\5\11\1\0\3\11\1\0\1\11\1\70\11\11\3\0"+
    "\1\11\2\0\1\11\3\0\2\11\5\0\1\11\5\0"+
    "\1\11\1\71\3\11\1\0\3\11\1\0\13\11\3\0"+
    "\1\11\2\0\1\11\3\0\2\11\5\0\1\11\5\0"+
    "\5\11\1\0\3\11\1\0\1\11\1\72\11\11\3\0"+
    "\1\11\2\0\1\11\3\0\2\11\5\0\1\11\5\0"+
    "\5\11\1\0\3\11\1\0\12\11\1\73\3\0\1\11"+
    "\2\0\1\11\3\0\2\11\5\0\1\11\5\0\5\11"+
    "\1\0\3\11\1\0\3\11\1\74\7\11\3\0\1\11"+
    "\2\0\1\11\3\0\2\11\5\0\1\11\5\0\5\11"+
    "\1\0\3\11\1\0\7\11\1\75\3\11\3\0\1\11"+
    "\2\0\1\11\3\0\2\11\5\0\1\11\5\0\5\11"+
    "\1\0\3\11\1\0\1\11\1\76\11\11\3\0\1\11"+
    "\2\0\1\11\3\0\2\11\5\0\1\11\5\0\3\11"+
    "\1\77\1\11\1\0\3\11\1\0\13\11\3\0\1\11"+
    "\2\0\1\11\3\0\2\11\5\0\1\11\5\0\5\11"+
    "\1\0\3\11\1\0\11\11\1\100\1\11\3\0\1\11"+
    "\2\0\1\11\3\0\2\11\5\0\1\11\5\0\5\11"+
    "\1\0\3\11\1\0\6\11\1\101\4\11\3\0\1\11"+
    "\2\0\1\11\3\0\2\11\5\0\1\11\5\0\4\11"+
    "\1\102\1\0\3\11\1\0\13\11\3\0\1\11\2\0"+
    "\1\11\3\0\2\11\5\0\1\11\5\0\5\11\1\0"+
    "\1\103\2\11\1\0\13\11\3\0\1\11\2\0\1\11"+
    "\3\0\2\11\5\0\1\11\5\0\5\11\1\104\3\11"+
    "\1\0\13\11\3\0\1\11\2\0\1\11\3\0\2\11"+
    "\5\0\1\11\5\0\5\11\1\0\3\11\1\0\10\11"+
    "\1\105\2\11\16\0\1\106\72\0\1\107\54\0\1\110"+
    "\54\0\1\111\33\0\1\112\74\0\1\113\31\0\1\114"+
    "\72\0\1\115\57\0\1\116\51\0\1\117\33\0\1\120"+
    "\34\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2376];
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
    "\1\0\1\11\7\1\13\11\13\1\1\0\1\11\1\0"+
    "\41\1\1\0\1\1\12\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[80];
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
    while (i < 132) {
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
        case 26: 
          { return NULL;
          }
        case 33: break;
        case 18: 
          { return COMMENT;
          }
        case 34: break;
        case 21: 
          { return IF;
          }
        case 35: break;
        case 9: 
          { return LP;
          }
        case 36: break;
        case 31: 
          { return COLLECT;
          }
        case 37: break;
        case 11: 
          { return OP_1;
          }
        case 38: break;
        case 1: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 39: break;
        case 4: 
          { return OP_4;
          }
        case 40: break;
        case 23: 
          { return TO;
          }
        case 41: break;
        case 16: 
          { return OP_7;
          }
        case 42: break;
        case 7: 
          { return SEMI;
          }
        case 43: break;
        case 20: 
          { return DO;
          }
        case 44: break;
        case 25: 
          { return FOR;
          }
        case 45: break;
        case 17: 
          { return QUICK_LIST;
          }
        case 46: break;
        case 24: 
          { return LET;
          }
        case 47: break;
        case 10: 
          { return RP;
          }
        case 48: break;
        case 12: 
          { return OP_2;
          }
        case 49: break;
        case 14: 
          { return OP_5;
          }
        case 50: break;
        case 29: 
          { return IF_NULL;
          }
        case 51: break;
        case 28: 
          { return FROM;
          }
        case 52: break;
        case 8: 
          { return EQ;
          }
        case 53: break;
        case 32: 
          { return KEYWORD;
          }
        case 54: break;
        case 3: 
          { return SPACE;
          }
        case 55: break;
        case 19: 
          { return STRING;
          }
        case 56: break;
        case 30: 
          { return DEFUN;
          }
        case 57: break;
        case 6: 
          { return PF_NAME;
          }
        case 58: break;
        case 5: 
          { return NUMBER;
          }
        case 59: break;
        case 22: 
          { return IN;
          }
        case 60: break;
        case 2: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 61: break;
        case 13: 
          { return OP_3;
          }
        case 62: break;
        case 27: 
          { return LOOP;
          }
        case 63: break;
        case 15: 
          { return OP_6;
          }
        case 64: break;
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
