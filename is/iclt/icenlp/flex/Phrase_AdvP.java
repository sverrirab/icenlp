/* The following code was generated by JFlex 1.4.1 on 6.8.2009 21:40 */

/*
 * Copyright (C) 2009 Hrafn Loftsson
 *
 * This file is part of the IceNLP toolkit.
 * IceNLP is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * IceNLP is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with IceNLP. If not,  see <http://www.gnu.org/licenses/>.
 *
 * Contact information:
 * Hrafn Loftsson, School of Computer Science, Reykjavik University.
 * hrafn@ru.is
 */
 
/* This transducer marks adverb phrases, conjunction phrases and interjection phrases */
package is.iclt.icenlp.flex.iceparser;
import java.io.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 6.8.2009 21:40 from the specification file
 * <tt>Phrase_AdvP.flex</tt>
 */
public class Phrase_AdvP {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\35\1\0\1\1\1\2\22\0\1\1\13\0\1\0"+
    "\1\0\3\0\3\0\15\0\1\17\1\0\1\23\1\0\1\26\2\0"+
    "\1\33\4\0\1\24\1\22\1\3\1\20\2\0\1\0\2\0\1\0"+
    "\1\25\3\0\1\16\1\0\1\21\1\0\1\27\1\0\1\12\1\0"+
    "\1\14\1\6\1\4\1\0\1\11\1\33\1\0\1\0\1\0\1\13"+
    "\1\10\1\5\1\3\1\0\1\0\1\32\1\0\1\15\1\30\1\7"+
    "\1\0\1\0\160\0\1\34\6\0\1\31\5\0\1\0\7\0\1\0"+
    "\uff01\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\10\1\1\2\25\0\1\3\5\0\1\4\1\0"+
    "\1\5\1\6\46\0\1\3\5\0\1\3\5\0\1\3"+
    "\7\0\1\4\1\0\1\5\2\0\1\4\1\0\1\5"+
    "\2\0\1\4\1\0\1\5\4\0\1\3\11\0\1\4"+
    "\1\0\1\5\24\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[149];
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
    "\0\0\0\36\0\74\0\132\0\170\0\226\0\264\0\322"+
    "\0\360\0\132\0\36\0\u010e\0\74\0\170\0\226\0\264"+
    "\0\360\0\u012c\0\u014a\0\u0168\0\u0186\0\u01a4\0\u01c2\0\u01e0"+
    "\0\u01fe\0\u021c\0\u023a\0\u0258\0\u0276\0\u0294\0\u02b2\0\u02d0"+
    "\0\u02d0\0\u02ee\0\u030c\0\u032a\0\u0348\0\u0366\0\u0366\0\u02b2"+
    "\0\u0384\0\u03a2\0\u03c0\0\u03de\0\u03fc\0\u041a\0\u0438\0\u0456"+
    "\0\u0474\0\u0492\0\u04b0\0\u04ce\0\u04ec\0\u050a\0\u0528\0\u0546"+
    "\0\u0564\0\u0582\0\u05a0\0\u05be\0\u05dc\0\u05fa\0\u0618\0\u0636"+
    "\0\u0654\0\u0672\0\u0690\0\u06ae\0\u06cc\0\u06ea\0\u0708\0\u0726"+
    "\0\u0744\0\u0762\0\u0780\0\u079e\0\u07bc\0\u07da\0\u07f8\0\u0816"+
    "\0\u0816\0\u0834\0\u0852\0\u0870\0\u088e\0\u08ac\0\u08ac\0\u08ca"+
    "\0\u08e8\0\u0906\0\u0924\0\u0942\0\u0942\0\u0960\0\u097e\0\u099c"+
    "\0\u09ba\0\u09d8\0\u09f6\0\u0a14\0\u0a14\0\u07f8\0\u0a32\0\u0a50"+
    "\0\u0a6e\0\u0a6e\0\u088e\0\u0a8c\0\u0aaa\0\u0ac8\0\u0ac8\0\u0924"+
    "\0\u0ae6\0\u0b04\0\u0b22\0\u0b40\0\u0b5e\0\u0b5e\0\u0b7c\0\u0b9a"+
    "\0\u0bb8\0\u0bd6\0\u0bf4\0\u0c12\0\u0c30\0\u0c4e\0\u0c6c\0\u0c6c"+
    "\0\u0b40\0\u0c8a\0\u0ca8\0\u0cc6\0\u0ce4\0\u0d02\0\u0d20\0\u0d3e"+
    "\0\u0d5c\0\u0d7a\0\u0d98\0\u0db6\0\u0dd4\0\u0df2\0\u0e10\0\u0e2e"+
    "\0\u0e4c\0\u0e6a\0\u0e88\0\u0ea6\0\u0ec4";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[149];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\10\2\1\10"+
    "\3\2\1\7\3\2\1\6\4\2\1\11\1\2\1\12"+
    "\1\13\1\14\1\0\32\13\1\0\1\13\1\15\1\0"+
    "\1\16\1\17\1\20\14\13\1\20\3\13\1\17\4\13"+
    "\1\21\1\13\37\0\1\13\1\14\1\0\6\13\1\22"+
    "\23\13\1\0\1\13\1\14\1\0\2\13\1\23\5\13"+
    "\1\24\15\13\1\25\3\13\1\0\1\13\1\14\1\0"+
    "\31\13\1\22\1\0\1\13\1\14\1\0\21\13\1\26"+
    "\10\13\1\0\1\13\1\14\1\0\1\13\1\27\30\13"+
    "\2\0\1\14\10\0\1\30\1\0\1\31\21\0\1\13"+
    "\1\32\1\0\32\13\1\0\1\13\1\32\1\0\3\13"+
    "\1\25\26\13\1\0\1\13\1\14\1\0\10\13\1\33"+
    "\21\13\1\0\1\13\1\14\1\0\7\13\1\22\22\13"+
    "\1\0\1\13\1\14\1\0\22\13\1\34\7\13\1\0"+
    "\1\13\1\14\1\0\10\13\1\35\21\13\13\0\1\36"+
    "\15\0\1\37\6\0\1\40\13\0\1\41\21\0\1\32"+
    "\10\0\1\30\1\0\1\42\21\0\1\13\1\14\1\0"+
    "\1\13\1\43\30\13\1\0\1\13\1\14\1\0\23\13"+
    "\1\44\6\13\1\0\1\13\1\14\1\0\3\13\1\45"+
    "\26\13\2\0\1\46\2\0\1\47\3\0\1\47\26\0"+
    "\1\50\35\0\1\40\35\0\1\51\13\0\1\41\20\0"+
    "\1\13\1\14\1\0\6\13\1\52\23\13\1\0\1\13"+
    "\1\14\1\0\24\13\1\53\5\13\1\0\1\13\1\14"+
    "\1\0\25\13\1\54\4\13\2\0\1\46\35\0\1\51"+
    "\34\0\1\13\1\14\1\0\7\13\1\54\22\13\1\0"+
    "\1\13\1\14\1\0\14\13\1\55\1\56\2\13\1\57"+
    "\11\13\1\0\1\13\1\14\1\0\27\13\1\22\2\13"+
    "\1\0\1\13\1\14\1\0\3\13\1\60\11\13\1\61"+
    "\14\13\1\0\1\13\1\14\1\0\15\13\1\62\14\13"+
    "\1\0\1\13\1\14\1\0\15\13\1\63\14\13\1\0"+
    "\1\13\1\14\1\0\4\13\1\64\25\13\1\0\1\61"+
    "\1\65\1\66\21\61\1\67\10\61\1\66\1\62\1\70"+
    "\1\71\21\62\1\72\10\62\1\71\1\63\1\73\1\74"+
    "\21\63\1\75\10\63\1\74\1\13\1\14\1\0\15\13"+
    "\1\76\14\13\1\0\1\66\1\65\10\66\1\77\1\66"+
    "\1\100\7\66\1\101\35\66\1\101\11\66\1\61\1\65"+
    "\1\66\21\61\1\67\1\102\7\61\1\66\1\71\1\70"+
    "\10\71\1\103\1\71\1\104\7\71\1\105\35\71\1\105"+
    "\11\71\1\62\1\70\1\71\21\62\1\72\1\106\7\62"+
    "\1\71\1\74\1\73\10\74\1\107\1\74\1\110\7\74"+
    "\1\111\35\74\1\111\11\74\1\63\1\73\1\74\21\63"+
    "\1\75\1\112\7\63\1\74\1\76\1\113\1\114\21\76"+
    "\1\115\10\76\1\114\12\66\1\116\11\66\1\101\3\66"+
    "\1\117\6\66\1\120\13\66\1\121\6\66\1\101\35\66"+
    "\1\101\1\122\10\66\1\61\1\65\1\66\21\61\1\67"+
    "\1\61\1\123\6\61\1\66\12\71\1\124\11\71\1\105"+
    "\3\71\1\125\6\71\1\126\13\71\1\127\6\71\1\105"+
    "\35\71\1\105\1\130\10\71\1\62\1\70\1\71\21\62"+
    "\1\72\1\62\1\131\6\62\1\71\12\74\1\132\11\74"+
    "\1\111\3\74\1\133\6\74\1\134\13\74\1\135\6\74"+
    "\1\111\35\74\1\111\1\136\10\74\1\63\1\73\1\74"+
    "\21\63\1\75\1\63\1\137\6\63\1\74\1\114\1\113"+
    "\10\114\1\140\1\114\1\141\7\114\1\142\35\114\1\142"+
    "\11\114\1\76\1\113\1\114\21\76\1\115\1\143\7\76"+
    "\1\114\1\66\1\144\2\66\1\145\3\66\1\145\13\66"+
    "\1\101\12\66\1\146\22\66\1\101\12\66\1\120\22\66"+
    "\1\101\35\66\1\101\1\66\1\147\7\66\1\61\1\65"+
    "\1\66\21\61\1\67\2\61\1\150\5\61\1\66\1\71"+
    "\1\151\2\71\1\152\3\71\1\152\13\71\1\105\12\71"+
    "\1\153\22\71\1\105\12\71\1\126\22\71\1\105\35\71"+
    "\1\105\1\71\1\154\7\71\1\62\1\70\1\71\21\62"+
    "\1\72\2\62\1\155\5\62\1\71\1\74\1\156\2\74"+
    "\1\157\3\74\1\157\13\74\1\111\12\74\1\160\22\74"+
    "\1\111\12\74\1\134\22\74\1\111\35\74\1\111\1\74"+
    "\1\161\7\74\1\63\1\73\1\74\21\63\1\75\2\63"+
    "\1\162\5\63\1\74\12\114\1\163\11\114\1\142\3\114"+
    "\1\164\6\114\1\165\13\114\1\166\6\114\1\142\35\114"+
    "\1\142\1\167\10\114\1\76\1\113\1\114\21\76\1\115"+
    "\1\76\1\170\6\76\1\114\1\66\1\144\22\66\1\101"+
    "\35\66\1\101\2\66\1\171\6\66\1\61\1\65\1\66"+
    "\14\61\1\172\4\61\1\67\10\61\1\66\1\71\1\151"+
    "\22\71\1\105\35\71\1\105\2\71\1\173\6\71\1\62"+
    "\1\70\1\71\15\62\1\174\3\62\1\72\10\62\1\71"+
    "\1\74\1\156\22\74\1\111\35\74\1\111\2\74\1\175"+
    "\6\74\1\63\1\73\1\74\20\63\1\176\1\75\10\63"+
    "\1\74\1\114\1\177\2\114\1\200\3\114\1\200\13\114"+
    "\1\142\12\114\1\201\22\114\1\142\12\114\1\165\22\114"+
    "\1\142\35\114\1\142\1\114\1\202\7\114\1\76\1\113"+
    "\1\114\21\76\1\115\2\76\1\203\5\76\1\114\17\66"+
    "\1\204\4\66\1\101\11\66\1\61\1\65\1\66\15\61"+
    "\1\205\3\61\1\67\10\61\1\66\20\71\1\206\3\71"+
    "\1\105\11\71\1\62\1\70\1\71\15\62\1\207\3\62"+
    "\1\72\10\62\1\71\23\74\1\210\1\111\11\74\1\63"+
    "\1\73\1\74\15\63\1\211\3\63\1\75\10\63\1\74"+
    "\1\114\1\177\22\114\1\142\35\114\1\142\2\114\1\212"+
    "\6\114\1\76\1\113\1\114\14\76\1\213\4\76\1\115"+
    "\10\76\1\114\20\66\1\214\3\66\1\101\11\66\1\61"+
    "\1\65\1\66\16\61\1\2\2\61\1\67\10\61\1\66"+
    "\20\71\1\215\3\71\1\105\11\71\1\62\1\70\1\71"+
    "\16\62\1\2\2\62\1\72\10\62\1\71\20\74\1\216"+
    "\3\74\1\111\11\74\1\63\1\73\1\74\16\63\1\2"+
    "\2\63\1\75\10\63\1\74\17\114\1\217\4\114\1\142"+
    "\11\114\1\76\1\113\1\114\3\76\1\220\15\76\1\115"+
    "\10\76\1\114\21\66\1\4\2\66\1\101\11\66\21\71"+
    "\1\4\2\71\1\105\11\71\21\74\1\4\2\74\1\111"+
    "\11\74\6\114\1\221\15\114\1\142\11\114\1\76\1\113"+
    "\1\114\4\76\1\222\14\76\1\115\10\76\10\114\1\223"+
    "\14\114\1\142\11\114\1\76\1\113\1\114\15\76\1\224"+
    "\3\76\1\115\10\76\21\114\1\225\3\114\1\142\11\114"+
    "\1\76\1\113\1\114\16\76\1\2\2\76\1\115\10\76"+
    "\22\114\1\4\2\114\1\142\11\114";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3810];
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
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\1\1\11\5\1\1\11\25\0\1\1\5\0"+
    "\1\1\1\0\2\1\46\0\1\1\5\0\1\1\5\0"+
    "\1\1\7\0\1\1\1\0\1\1\2\0\1\1\1\0"+
    "\1\1\2\0\1\1\1\0\1\1\4\0\1\1\11\0"+
    "\1\1\1\0\1\1\24\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[149];
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

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

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

  /* user code: */
  String APOpen=" [AdvP ";
  String APClose=" AdvP] ";
  String CPOpen=" [CP ";
  String CPClose=" CP] ";
  String SCPOpen=" [SCP ";
  String SCPClose=" SCP] ";
  String InjOpen=" [InjP ";
  String InjClose=" InjP] ";
  
  //java.io.Writer out = new BufferedWriter(new OutputStreamWriter(System.out, "UTF-8"));
  java.io.Writer out = new BufferedWriter(new OutputStreamWriter(System.out));
      
  public void parse(java.io.Writer _out) throws java.io.IOException
  {
      	out = _out;
      	while (!zzAtEOF) 
      	    yylex();
  }
  


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Phrase_AdvP(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Phrase_AdvP(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
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
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
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
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    	try {
	  out.flush();	
	} 
	catch (IOException e) {
            e.printStackTrace();
        }

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
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
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
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
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
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
        case 4: 
          { out.write(APOpen+yytext()+APClose);
          }
        case 7: break;
        case 5: 
          { out.write(InjOpen+yytext()+InjClose);
          }
        case 8: break;
        case 1: 
          { out.write(yytext());
          }
        case 9: break;
        case 3: 
          { out.write(SCPOpen+yytext()+SCPClose);
          }
        case 10: break;
        case 6: 
          { out.write(CPOpen+yytext()+CPClose);
          }
        case 11: break;
        case 2: 
          { //System.err.print("Reading line: " + Integer.toString(yyline+1) + "\r"); 
			out.write("\n");
          }
        case 12: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return YYEOF;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java Phrase_AdvP <inputfile>");
    }
    else {
      for (int i = 0; i < argv.length; i++) {
        Phrase_AdvP scanner = null;
        try {
          scanner = new Phrase_AdvP( new java.io.FileReader(argv[i]) );
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}