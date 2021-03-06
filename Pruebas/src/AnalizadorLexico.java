/* The following code was generated by JFlex 1.6.1 */



import java_cup.runtime.*;

/*26-03*/
/*Información de versión: he modificado las palabras reservadas y se guarda la columna y la fila*/
/*He modficadfo comentario mal cerrado y constante literales mal cerradas y la acción que se leva a cabo*/

/*27-03*/
/*He añadido yytext() al crear todos los tokens*/
/*He modificado el mesaje que se muestra cuando no se reconoce un lexema*/





/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>PracticaObligatoria.flex</tt>
 */
class AnalizadorLexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

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
    "\11\0\1\2\1\5\1\67\1\67\1\2\22\0\1\2\3\0\1\64"+
    "\2\0\1\11\1\6\1\10\1\7\1\61\1\51\1\62\1\53\1\0"+
    "\12\1\1\63\1\52\1\56\1\57\1\60\2\0\1\45\1\65\1\47"+
    "\1\65\1\42\1\65\1\43\1\50\1\37\2\66\1\46\1\66\1\40"+
    "\3\66\1\44\1\66\1\41\6\66\1\54\1\0\1\55\1\0\1\66"+
    "\1\0\1\16\1\20\1\25\1\24\1\21\1\32\1\15\1\34\1\22"+
    "\2\66\1\35\1\17\1\23\1\14\1\12\1\66\1\13\1\26\1\27"+
    "\1\31\1\30\1\36\1\66\1\33\1\66\1\3\1\0\1\4\7\0"+
    "\1\67\u1fa2\0\1\67\1\67\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\1\23\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\1\1\0\1\24"+
    "\2\4\1\0\1\25\1\26\2\10\1\27\1\30\6\10"+
    "\1\31\1\10\1\32\3\10\1\33\11\10\1\34\1\35"+
    "\1\36\1\37\1\40\1\2\2\0\1\41\1\0\2\4"+
    "\2\0\3\10\1\42\1\43\1\10\1\44\1\10\1\45"+
    "\1\46\4\10\1\47\1\50\5\10\1\51\1\52\2\0"+
    "\1\4\5\10\1\53\1\10\1\54\1\55\1\56\3\10"+
    "\1\57\1\10\1\41\1\0\1\24\3\10\1\60\1\61"+
    "\1\62\1\10\1\63\2\10\1\24\2\10\1\64\3\10"+
    "\1\65\2\10\1\66\2\10\1\67\1\10\1\70\1\71";

  private static int [] zzUnpackAction() {
    int [] result = new int[158];
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
    "\0\0\0\70\0\160\0\70\0\250\0\340\0\70\0\70"+
    "\0\u0118\0\u0150\0\u0188\0\u01c0\0\u01f8\0\u0230\0\u0268\0\u02a0"+
    "\0\u02d8\0\u0310\0\u0348\0\u0380\0\u03b8\0\u03f0\0\u0428\0\u0460"+
    "\0\u0498\0\u04d0\0\u0508\0\u0540\0\70\0\70\0\u0578\0\70"+
    "\0\70\0\u05b0\0\70\0\u05e8\0\u0620\0\u0620\0\u0658\0\u0690"+
    "\0\u06c8\0\70\0\u0700\0\u0738\0\u0118\0\70\0\u0770\0\u07a8"+
    "\0\u07e0\0\u01f8\0\u01f8\0\u0818\0\u0850\0\u0888\0\u08c0\0\u08f8"+
    "\0\u0930\0\u01f8\0\u0968\0\u01f8\0\u09a0\0\u09d8\0\u0a10\0\u01f8"+
    "\0\u0a48\0\u0a80\0\u0ab8\0\u0af0\0\u0b28\0\u0b60\0\u0b98\0\u0bd0"+
    "\0\u0c08\0\70\0\70\0\70\0\70\0\70\0\u0c40\0\u0c78"+
    "\0\u0cb0\0\u06c8\0\u0700\0\u0ce8\0\u0d20\0\u0d58\0\u0d90\0\u0dc8"+
    "\0\u0e00\0\u0e38\0\u01f8\0\u01f8\0\u0e70\0\u01f8\0\u0ea8\0\u01f8"+
    "\0\u01f8\0\u0ee0\0\u0f18\0\u0f50\0\u0f88\0\u01f8\0\u01f8\0\u0fc0"+
    "\0\u0ff8\0\u1030\0\u1068\0\u10a0\0\u10d8\0\u0c78\0\u0d20\0\u1110"+
    "\0\u1148\0\u1180\0\u11b8\0\u11f0\0\u1228\0\u1260\0\u01f8\0\u1298"+
    "\0\u01f8\0\u01f8\0\u01f8\0\u12d0\0\u1308\0\u1340\0\u01f8\0\u1378"+
    "\0\u10d8\0\u13b0\0\u0d90\0\u13e8\0\u1420\0\u1458\0\u01f8\0\u01f8"+
    "\0\u01f8\0\u1490\0\u01f8\0\u14c8\0\u1500\0\u0d20\0\u1538\0\u1570"+
    "\0\u01f8\0\u15a8\0\u15e0\0\u1618\0\u01f8\0\u1650\0\u1688\0\u01f8"+
    "\0\u16c0\0\u16f8\0\u01f8\0\u1730\0\u01f8\0\u01f8";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[158];
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
    "\1\2\1\3\1\4\1\5\1\2\1\4\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\15\1\26"+
    "\1\27\1\15\1\30\3\15\1\31\1\32\4\15\1\33"+
    "\2\15\1\34\1\15\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\2\15"+
    "\72\0\1\3\51\0\1\51\14\0\4\5\1\52\1\53"+
    "\62\5\7\0\1\54\60\0\5\55\1\56\3\55\1\57"+
    "\56\55\1\0\1\15\10\0\1\15\1\60\35\15\14\0"+
    "\2\15\2\0\1\15\10\0\7\15\1\61\27\15\14\0"+
    "\2\15\2\0\1\15\10\0\1\15\1\62\16\15\1\63"+
    "\16\15\14\0\2\15\2\0\1\15\10\0\37\15\14\0"+
    "\2\15\2\0\1\15\10\0\1\15\1\64\7\15\1\65"+
    "\25\15\14\0\2\15\2\0\1\15\10\0\2\15\1\66"+
    "\34\15\14\0\2\15\2\0\1\15\10\0\7\15\1\67"+
    "\27\15\14\0\2\15\2\0\1\15\10\0\11\15\1\70"+
    "\11\15\1\71\13\15\14\0\2\15\2\0\1\15\10\0"+
    "\20\15\1\72\16\15\14\0\2\15\2\0\1\15\10\0"+
    "\2\15\1\73\34\15\14\0\2\15\2\0\1\15\10\0"+
    "\2\15\1\74\5\15\1\75\26\15\14\0\2\15\2\0"+
    "\1\15\10\0\2\15\1\76\1\15\1\77\32\15\14\0"+
    "\2\15\2\0\1\15\10\0\2\15\1\100\16\15\1\101"+
    "\1\102\14\15\14\0\2\15\2\0\1\15\10\0\4\15"+
    "\1\103\32\15\14\0\2\15\2\0\1\15\10\0\2\15"+
    "\1\104\14\15\1\105\17\15\14\0\2\15\2\0\1\15"+
    "\10\0\22\15\1\106\14\15\14\0\2\15\2\0\1\15"+
    "\10\0\26\15\1\107\10\15\14\0\2\15\2\0\1\15"+
    "\10\0\30\15\1\110\6\15\14\0\2\15\2\0\1\15"+
    "\10\0\36\15\1\111\14\0\2\15\54\0\1\112\73\0"+
    "\1\113\1\114\66\0\1\115\11\0\1\3\145\0\1\116"+
    "\11\0\1\117\40\0\1\117\2\0\1\117\1\0\1\117"+
    "\3\0\1\120\5\0\2\121\2\0\1\117\3\0\1\122"+
    "\66\0\4\123\1\52\63\123\5\124\1\125\1\124\1\126"+
    "\1\127\57\124\11\0\1\55\57\0\1\15\10\0\2\15"+
    "\1\130\34\15\14\0\2\15\2\0\1\15\10\0\13\15"+
    "\1\131\23\15\14\0\2\15\2\0\1\15\10\0\1\15"+
    "\1\132\35\15\14\0\2\15\2\0\1\15\10\0\12\15"+
    "\1\133\24\15\14\0\2\15\2\0\1\15\10\0\12\15"+
    "\1\134\24\15\14\0\2\15\2\0\1\15\10\0\3\15"+
    "\1\135\33\15\14\0\2\15\2\0\1\15\10\0\12\15"+
    "\1\136\24\15\14\0\2\15\2\0\1\15\10\0\14\15"+
    "\1\137\22\15\14\0\2\15\2\0\1\15\10\0\15\15"+
    "\1\140\21\15\14\0\2\15\2\0\1\15\10\0\16\15"+
    "\1\141\20\15\14\0\2\15\2\0\1\15\10\0\11\15"+
    "\1\142\25\15\14\0\2\15\2\0\1\15\10\0\14\15"+
    "\1\143\22\15\14\0\2\15\2\0\1\15\10\0\1\144"+
    "\36\15\14\0\2\15\2\0\1\15\10\0\7\15\1\145"+
    "\27\15\14\0\2\15\2\0\1\15\10\0\1\15\1\146"+
    "\35\15\14\0\2\15\2\0\1\15\10\0\1\15\1\147"+
    "\35\15\14\0\2\15\2\0\1\15\10\0\11\15\1\150"+
    "\25\15\14\0\2\15\2\0\1\15\10\0\10\15\1\151"+
    "\26\15\14\0\2\15\2\0\1\15\10\0\27\15\1\152"+
    "\7\15\14\0\2\15\2\0\1\15\10\0\33\15\1\153"+
    "\3\15\14\0\2\15\2\0\1\15\10\0\33\15\1\154"+
    "\3\15\14\0\2\15\2\0\1\117\40\0\1\117\2\0"+
    "\1\117\1\0\1\117\3\0\1\155\11\0\1\117\3\0"+
    "\1\156\40\0\1\156\2\0\1\156\1\0\1\156\15\0"+
    "\1\156\3\0\1\117\40\0\1\117\2\0\1\117\1\0"+
    "\1\117\15\0\1\117\2\0\5\124\1\125\1\124\1\126"+
    "\60\124\7\157\1\160\60\157\5\54\1\157\1\54\1\161"+
    "\1\52\57\54\7\157\1\160\1\54\57\157\1\0\1\15"+
    "\10\0\3\15\1\162\7\15\1\163\23\15\14\0\2\15"+
    "\2\0\1\15\10\0\2\15\1\164\34\15\14\0\2\15"+
    "\2\0\1\15\10\0\4\15\1\165\32\15\14\0\2\15"+
    "\2\0\1\15\10\0\10\15\1\166\26\15\14\0\2\15"+
    "\2\0\1\15\10\0\7\15\1\167\27\15\14\0\2\15"+
    "\2\0\1\15\10\0\14\15\1\170\22\15\14\0\2\15"+
    "\2\0\1\15\10\0\7\15\1\171\27\15\14\0\2\15"+
    "\2\0\1\15\10\0\7\15\1\172\27\15\14\0\2\15"+
    "\2\0\1\15\10\0\11\15\1\173\25\15\14\0\2\15"+
    "\2\0\1\15\10\0\13\15\1\174\23\15\14\0\2\15"+
    "\2\0\1\15\10\0\23\15\1\175\13\15\14\0\2\15"+
    "\2\0\1\15\10\0\30\15\1\176\6\15\14\0\2\15"+
    "\2\0\1\15\10\0\34\15\1\177\2\15\14\0\2\15"+
    "\2\0\1\15\10\0\32\15\1\200\4\15\14\0\2\15"+
    "\2\0\1\201\40\0\1\201\2\0\1\201\1\0\1\201"+
    "\15\0\1\201\2\0\7\157\1\202\1\52\57\157\5\124"+
    "\1\125\1\124\1\126\1\203\57\124\1\0\1\15\10\0"+
    "\1\15\1\204\35\15\14\0\2\15\2\0\1\15\10\0"+
    "\7\15\1\205\27\15\14\0\2\15\2\0\1\15\10\0"+
    "\1\15\1\206\35\15\14\0\2\15\2\0\1\15\10\0"+
    "\21\15\1\207\15\15\14\0\2\15\2\0\1\15\10\0"+
    "\11\15\1\210\25\15\14\0\2\15\2\0\1\15\10\0"+
    "\15\15\1\211\21\15\14\0\2\15\2\0\1\15\10\0"+
    "\15\15\1\212\21\15\14\0\2\15\2\0\1\15\10\0"+
    "\7\15\1\213\27\15\14\0\2\15\2\0\1\15\10\0"+
    "\31\15\1\214\5\15\14\0\2\15\2\0\1\15\10\0"+
    "\33\15\1\215\3\15\14\0\2\15\1\0\7\157\1\160"+
    "\1\216\57\157\1\0\1\15\10\0\4\15\1\217\32\15"+
    "\14\0\2\15\2\0\1\15\10\0\12\15\1\220\24\15"+
    "\14\0\2\15\2\0\1\15\10\0\12\15\1\221\24\15"+
    "\14\0\2\15\2\0\1\15\10\0\10\15\1\222\26\15"+
    "\14\0\2\15\2\0\1\15\10\0\30\15\1\223\6\15"+
    "\14\0\2\15\2\0\1\15\10\0\35\15\1\224\1\15"+
    "\14\0\2\15\2\0\1\15\10\0\5\15\1\225\31\15"+
    "\14\0\2\15\2\0\1\15\10\0\17\15\1\226\17\15"+
    "\14\0\2\15\2\0\1\15\10\0\2\15\1\227\34\15"+
    "\14\0\2\15\2\0\1\15\10\0\32\15\1\230\4\15"+
    "\14\0\2\15\2\0\1\15\10\0\27\15\1\231\7\15"+
    "\14\0\2\15\2\0\1\15\10\0\1\15\1\232\35\15"+
    "\14\0\2\15\2\0\1\15\10\0\11\15\1\233\25\15"+
    "\14\0\2\15\2\0\1\15\10\0\30\15\1\234\6\15"+
    "\14\0\2\15\2\0\1\15\10\0\7\15\1\235\27\15"+
    "\14\0\2\15\2\0\1\15\10\0\32\15\1\236\4\15"+
    "\14\0\2\15\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5992];
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

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\2\1\2\11\24\1\2\11"+
    "\1\1\2\11\1\1\1\11\5\1\1\0\1\11\2\1"+
    "\1\0\1\11\33\1\5\11\1\1\2\0\1\1\1\0"+
    "\2\1\2\0\27\1\2\0\21\1\1\0\34\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[158];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
        int cont = 1;
	ventanaNueva nuevaInterfaz;
        public void imprimirMensaje(String s){
		nuevaInterfaz.imprimirMensaje(s);
	}

        public void imprimirError(String s){
		nuevaInterfaz.imprimirError(s);
	}

        AnalizadorLexico(java.io.Reader in,ventanaNueva i){
            nuevaInterfaz = i;
            this.zzReader = in;
        }



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  AnalizadorLexico(java.io.Reader in) {
  
	

    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 202) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
    return zzBuffer[zzStartRead+pos];
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { imprimirError("Error léxico "+cont+" encontrado en "+yytext()+" en linea "+(yyline + 1)+" columna "+(yycolumn + 1)+"\n");cont++;
            }
          case 58: break;
          case 2: 
            { imprimirMensaje("Token "+"numeric_integer_const"+" reconocido= "+yytext());return new java_cup.runtime.Symbol(sym.numeric_integer_const, yyline+1, yycolumn+1, yytext());
            }
          case 59: break;
          case 3: 
            { 
            }
          case 60: break;
          case 4: 
            { imprimirError("Error léxico "+cont+"\nComentario sin cerrar en linea "+(yyline + 1)+" y columna "+(yycolumn + 1)+"\nSuponemos que el comentario '"+yytext()+"' acaba en el salto de linea."+"\n");cont++;
            }
          case 61: break;
          case 5: 
            { imprimirMensaje("Token "+"parentesisAbierto"+" reconocido.");return new java_cup.runtime.Symbol(sym.parentesisAbierto, yyline+1, yycolumn+1, yytext());
            }
          case 62: break;
          case 6: 
            { imprimirMensaje("Token "+"*"+" reconocido.");return new java_cup.runtime.Symbol(sym.asterisco, yyline+1, yycolumn+1, yytext());
            }
          case 63: break;
          case 7: 
            { imprimirMensaje("Token "+"parentesisCerrado"+" reconocido.");return new java_cup.runtime.Symbol(sym.parentesisCerrado, yyline+1, yycolumn+1, yytext());
            }
          case 64: break;
          case 8: 
            { imprimirMensaje("Token "+"Identificador"+" reconocido= "+yytext());return new java_cup.runtime.Symbol(sym.Identificador, yyline+1, yycolumn+1, yytext());
            }
          case 65: break;
          case 9: 
            { imprimirMensaje("Token "+"coma"+" reconocido.");return new java_cup.runtime.Symbol(sym.coma, yyline+1, yycolumn+1, yytext());
            }
          case 66: break;
          case 10: 
            { imprimirMensaje("Token "+"puntoComa"+" reconocido.");return new java_cup.runtime.Symbol(sym.puntoComa, yyline+1, yycolumn+1, yytext());
            }
          case 67: break;
          case 11: 
            { imprimirMensaje("Token "+"punto"+" reconocido.");return new java_cup.runtime.Symbol(sym.punto, yyline+1, yycolumn+1, yytext());
            }
          case 68: break;
          case 12: 
            { imprimirMensaje("Token "+"corcheteAb"+" reconocido.");return new java_cup.runtime.Symbol(sym.corcheteAb, yyline+1, yycolumn+1, yytext());
            }
          case 69: break;
          case 13: 
            { imprimirMensaje("Token "+"corcheteCe"+" reconocido.");return new java_cup.runtime.Symbol(sym.corcheteCe, yyline+1, yycolumn+1, yytext());
            }
          case 70: break;
          case 14: 
            { imprimirMensaje("Token "+"menor"+" reconocido.");return new java_cup.runtime.Symbol(sym.menor, yyline+1, yycolumn+1, yytext());
            }
          case 71: break;
          case 15: 
            { imprimirMensaje("Token "+"igual"+" reconocido.");return new java_cup.runtime.Symbol(sym.igual, yyline+1, yycolumn+1, yytext());
            }
          case 72: break;
          case 16: 
            { imprimirMensaje("Token "+"mayor"+" reconocido.");return new java_cup.runtime.Symbol(sym.mayor, yyline+1, yycolumn+1, yytext());
            }
          case 73: break;
          case 17: 
            { imprimirMensaje("Token "+"+"+" reconocido.");return new java_cup.runtime.Symbol(sym.suma, yyline+1, yycolumn+1, yytext());
            }
          case 74: break;
          case 18: 
            { imprimirMensaje("Token "+"-"+" reconocido.");return new java_cup.runtime.Symbol(sym.menos, yyline+1, yycolumn+1, yytext());
            }
          case 75: break;
          case 19: 
            { imprimirMensaje("Token "+"dosPuntos ':'"+" reconocido.");return new java_cup.runtime.Symbol(sym.dosPuntos, yyline+1, yycolumn+1, yytext());
            }
          case 76: break;
          case 20: 
            { imprimirMensaje("Reconocido comentario en linea "+(yyline + 1)+"y columna "+(yycolumn + 1 )+" '"+yytext()+"'");
            }
          case 77: break;
          case 21: 
            { imprimirError("Error léxico "+cont+"\nLiteral sin cerrar en linea "+(yyline + 1)+" y columna "+(yycolumn + 1)+"\nSuponemos que el literal '"+yytext()+"' acaba en el salto de linea."+"\n");cont++;
            }
          case 78: break;
          case 22: 
            { imprimirMensaje("Token "+"string_const"+" reconocido= "+yytext());return new java_cup.runtime.Symbol(sym.string_const, yyline+1, yycolumn+1, yytext());
            }
          case 79: break;
          case 23: 
            { imprimirMensaje("Token "+"or"+" reconocido.");return new java_cup.runtime.Symbol(sym.or, yyline+1, yycolumn+1, yytext());
            }
          case 80: break;
          case 24: 
            { imprimirMensaje("Token "+"of"+" reconocido.");return new java_cup.runtime.Symbol(sym.of, yyline+1, yycolumn+1, yytext());
            }
          case 81: break;
          case 25: 
            { imprimirMensaje("Token "+"if"+" reconocido.");return new java_cup.runtime.Symbol(sym.ident_if, yyline+1, yycolumn+1, yytext());
            }
          case 82: break;
          case 26: 
            { imprimirMensaje("Token "+"do"+" reconocido.");return new java_cup.runtime.Symbol(sym.ident_do, yyline+1, yycolumn+1, yytext());
            }
          case 83: break;
          case 27: 
            { imprimirMensaje("Token "+"to"+" reconocido.");return new java_cup.runtime.Symbol(sym.to, yyline+1, yycolumn+1, yytext());
            }
          case 84: break;
          case 28: 
            { imprimirMensaje("Token "+" puntosRango "+" reconocido.");return new java_cup.runtime.Symbol(sym.puntosRango, yyline+1, yycolumn+1, yytext());
            }
          case 85: break;
          case 29: 
            { imprimirMensaje("Token "+"menorIgual"+" reconocido.");return new java_cup.runtime.Symbol(sym.menorIgual, yyline+1, yycolumn+1, yytext());
            }
          case 86: break;
          case 30: 
            { imprimirMensaje("Token "+"distinto"+" reconocido.");return new java_cup.runtime.Symbol(sym.distinto, yyline+1, yycolumn+1, yytext());
            }
          case 87: break;
          case 31: 
            { imprimirMensaje("Token "+"mayorIgual"+" reconocido.");return new java_cup.runtime.Symbol(sym.mayorIgual, yyline+1, yycolumn+1, yytext());
            }
          case 88: break;
          case 32: 
            { imprimirMensaje("Token "+":="+" reconocido.");return new java_cup.runtime.Symbol(sym.dosPuntosIgual, yyline+1, yycolumn+1, yytext());
            }
          case 89: break;
          case 33: 
            { imprimirMensaje("Token "+"numeric_real_const"+" reconocido= "+yytext());return new java_cup.runtime.Symbol(sym.numeric_real_const, yyline+1, yycolumn+1, yytext());
            }
          case 90: break;
          case 34: 
            { imprimirMensaje("Token "+"and"+" reconocido.");return new java_cup.runtime.Symbol(sym.and, yyline+1, yycolumn+1, yytext());
            }
          case 91: break;
          case 35: 
            { imprimirMensaje("Token "+"mod"+" reconocido.");return new java_cup.runtime.Symbol(sym.mod, yyline+1, yycolumn+1, yytext());
            }
          case 92: break;
          case 36: 
            { imprimirMensaje("Token "+"end"+" reconocido.");return new java_cup.runtime.Symbol(sym.end, yyline+1, yycolumn+1, yytext());
            }
          case 93: break;
          case 37: 
            { imprimirMensaje("Token "+"not"+" reconocido.");return new java_cup.runtime.Symbol(sym.not, yyline+1, yycolumn+1, yytext());
            }
          case 94: break;
          case 38: 
            { imprimirMensaje("Token "+"div"+" reconocido.");return new java_cup.runtime.Symbol(sym.div, yyline+1, yycolumn+1, yytext());
            }
          case 95: break;
          case 39: 
            { imprimirMensaje("Token "+"var"+" reconocido.");return new java_cup.runtime.Symbol(sym.var, yyline+1, yycolumn+1, yytext());
            }
          case 96: break;
          case 40: 
            { imprimirMensaje("Token "+"for"+" reconocido.");return new java_cup.runtime.Symbol(sym.ident_for, yyline+1, yycolumn+1, yytext());
            }
          case 97: break;
          case 41: 
            { imprimirError("Error léxico "+cont+" en linea "+(yyline + 1)+"y columna "+(yycolumn + 1 )+" \nFalta parte decimal "+yytext()+""+"\n");cont++;
            }
          case 98: break;
          case 42: 
            { imprimirError("Error léxico "+cont+" en linea "+(yyline + 1)+"y columna "+(yycolumn + 1 )+" \nFalta parte entera "+yytext()+""+"\n");cont++;
            }
          case 99: break;
          case 43: 
            { imprimirMensaje("Token "+"else"+" reconocido.");return new java_cup.runtime.Symbol(sym.ident_else, yyline+1, yycolumn+1, yytext());
            }
          case 100: break;
          case 44: 
            { imprimirMensaje("Token "+"case"+" reconocido.");return new java_cup.runtime.Symbol(sym.ident_case, yyline+1, yycolumn+1, yytext());
            }
          case 101: break;
          case 45: 
            { imprimirMensaje("Token "+"type"+" reconocido.");return new java_cup.runtime.Symbol(sym.type, yyline+1, yycolumn+1, yytext());
            }
          case 102: break;
          case 46: 
            { imprimirMensaje("Token "+"then"+" reconocido.");return new java_cup.runtime.Symbol(sym.then, yyline+1, yycolumn+1, yytext());
            }
          case 103: break;
          case 47: 
            { imprimirMensaje("Token "+"REAL"+" reconocido.");return new java_cup.runtime.Symbol(sym.REAL, yyline+1, yycolumn+1, yytext());
            }
          case 104: break;
          case 48: 
            { imprimirMensaje("Token "+"array"+" reconocido.");return new java_cup.runtime.Symbol(sym.array, yyline+1, yycolumn+1, yytext());
            }
          case 105: break;
          case 49: 
            { imprimirMensaje("Token "+"begin"+" reconocido.");return new java_cup.runtime.Symbol(sym.begin, yyline+1, yycolumn+1, yytext());
            }
          case 106: break;
          case 50: 
            { imprimirMensaje("Token "+"const"+" reconocido.");return new java_cup.runtime.Symbol(sym.ident_const, yyline+1, yycolumn+1, yytext());
            }
          case 107: break;
          case 51: 
            { imprimirMensaje("Token "+"while"+" reconocido.");return new java_cup.runtime.Symbol(sym.ident_while, yyline+1, yycolumn+1, yytext());
            }
          case 108: break;
          case 52: 
            { imprimirMensaje("Token "+"record"+" reconocido.");return new java_cup.runtime.Symbol(sym.record, yyline+1, yycolumn+1, yytext());
            }
          case 109: break;
          case 53: 
            { imprimirMensaje("Token "+"programa"+" reconocido.");return new java_cup.runtime.Symbol(sym.program, yyline+1, yycolumn+1, yytext());
            }
          case 110: break;
          case 54: 
            { imprimirMensaje("Token "+"INTEGER"+" reconocido.");return new java_cup.runtime.Symbol(sym.INTEGER, yyline+1, yycolumn+1, yytext());
            }
          case 111: break;
          case 55: 
            { imprimirMensaje("Token "+"function"+" reconocido.");return new java_cup.runtime.Symbol(sym.function, yyline+1, yycolumn+1, yytext());
            }
          case 112: break;
          case 56: 
            { imprimirMensaje("Token "+"procedure"+" reconocido.");return new java_cup.runtime.Symbol(sym.procedure, yyline+1, yycolumn+1, yytext());
            }
          case 113: break;
          case 57: 
            { imprimirMensaje("Token "+"CHARACTER"+" reconocido.");return new java_cup.runtime.Symbol(sym.CHARACTER, yyline+1, yycolumn+1, yytext());
            }
          case 114: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
