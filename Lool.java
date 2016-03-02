// $ANTLR 3.5.2 Lool.g 2014-07-01 17:15:58

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Lool extends Lexer {
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ASSING=5;
	public static final int BOOL=6;
	public static final int BREAK=7;
	public static final int BraceEnd=8;
	public static final int BraceStart=9;
	public static final int BracketsEnd=10;
	public static final int BracketsStart=11;
	public static final int CHILDOF=12;
	public static final int CONTINUE=13;
	public static final int CREATE=14;
	public static final int Colon=15;
	public static final int Comma=16;
	public static final int DIV=17;
	public static final int Dot=18;
	public static final int ELSE=19;
	public static final int ENDIF=20;
	public static final int ENDLOOP=21;
	public static final int EQ=22;
	public static final int ERR2=23;
	public static final int ERROR1=24;
	public static final int ERROR3=25;
	public static final int ESC_SEQ=26;
	public static final int FALSE=27;
	public static final int GE=28;
	public static final int GR=29;
	public static final int ID=30;
	public static final int IF=31;
	public static final int INT=32;
	public static final int LOOP=33;
	public static final int MODULE=34;
	public static final int MULT=35;
	public static final int MULTICOMMENT=36;
	public static final int Minus=37;
	public static final int NE=38;
	public static final int NEWLINE=39;
	public static final int NOT=40;
	public static final int NUMBER=41;
	public static final int OR=42;
	public static final int ParenthesesEnd=43;
	public static final int ParenthesesStart=44;
	public static final int READ=45;
	public static final int RETURN=46;
	public static final int SE=47;
	public static final int SINLGECOMMENT=48;
	public static final int SM=49;
	public static final int STRING=50;
	public static final int STRINGLIT=51;
	public static final int SemiColon=52;
	public static final int Sum=53;
	public static final int THEN=54;
	public static final int TRUE=55;
	public static final int VIRTUAL=56;
	public static final int VOID=57;
	public static final int WHILE=58;
	public static final int WRITE=59;
	public static final int WS=60;
	public static final int ZERO=61;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public Lool() {} 
	public Lool(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public Lool(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Lool.g"; }

	// $ANTLR start "MODULE"
	public final void mMODULE() throws RecognitionException {
		try {
			int _type = MODULE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:7:8: ( 'module' )
			// Lool.g:7:10: 'module'
			{
			match("module"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MODULE"

	// $ANTLR start "CHILDOF"
	public final void mCHILDOF() throws RecognitionException {
		try {
			int _type = CHILDOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:8:9: ( 'childof' )
			// Lool.g:8:11: 'childof'
			{
			match("childof"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHILDOF"

	// $ANTLR start "VIRTUAL"
	public final void mVIRTUAL() throws RecognitionException {
		try {
			int _type = VIRTUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:9:9: ( 'virtual' )
			// Lool.g:9:11: 'virtual'
			{
			match("virtual"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VIRTUAL"

	// $ANTLR start "CREATE"
	public final void mCREATE() throws RecognitionException {
		try {
			int _type = CREATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:10:8: ( 'create' )
			// Lool.g:10:10: 'create'
			{
			match("create"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CREATE"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:11:5: ( 'int' )
			// Lool.g:11:7: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "BOOL"
	public final void mBOOL() throws RecognitionException {
		try {
			int _type = BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:12:6: ( 'bool' )
			// Lool.g:12:8: 'bool'
			{
			match("bool"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOL"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:13:8: ( 'string' )
			// Lool.g:13:10: 'string'
			{
			match("string"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:14:6: ( 'void' )
			// Lool.g:14:8: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:15:5: ( 'and' )
			// Lool.g:15:7: 'and'
			{
			match("and"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:16:4: ( 'or' )
			// Lool.g:16:6: 'or'
			{
			match("or"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:17:5: ( 'not' )
			// Lool.g:17:7: 'not'
			{
			match("not"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:18:6: ( 'true' )
			// Lool.g:18:8: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:19:7: ( 'false' )
			// Lool.g:19:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:20:8: ( 'return' )
			// Lool.g:20:10: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:21:4: ( 'if' )
			// Lool.g:21:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:22:6: ( 'then' )
			// Lool.g:22:8: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:23:6: ( 'else' )
			// Lool.g:23:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "ENDIF"
	public final void mENDIF() throws RecognitionException {
		try {
			int _type = ENDIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:24:7: ( 'endif' )
			// Lool.g:24:9: 'endif'
			{
			match("endif"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDIF"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:25:7: ( 'while' )
			// Lool.g:25:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "LOOP"
	public final void mLOOP() throws RecognitionException {
		try {
			int _type = LOOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:26:6: ( 'loop' )
			// Lool.g:26:8: 'loop'
			{
			match("loop"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOOP"

	// $ANTLR start "ENDLOOP"
	public final void mENDLOOP() throws RecognitionException {
		try {
			int _type = ENDLOOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:27:9: ( 'endloop' )
			// Lool.g:27:11: 'endloop'
			{
			match("endloop"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDLOOP"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:28:7: ( 'break' )
			// Lool.g:28:9: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK"

	// $ANTLR start "CONTINUE"
	public final void mCONTINUE() throws RecognitionException {
		try {
			int _type = CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:29:9: ( 'continue' )
			// Lool.g:29:12: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUE"

	// $ANTLR start "READ"
	public final void mREAD() throws RecognitionException {
		try {
			int _type = READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:30:6: ( 'read' )
			// Lool.g:30:8: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "READ"

	// $ANTLR start "WRITE"
	public final void mWRITE() throws RecognitionException {
		try {
			int _type = WRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:32:7: ( 'write' )
			// Lool.g:32:9: 'write'
			{
			match("write"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WRITE"

	// $ANTLR start "ERROR3"
	public final void mERROR3() throws RecognitionException {
		try {
			int _type = ERROR3;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:36:8: ( ( '0' )+ NUMBER )
			// Lool.g:36:10: ( '0' )+ NUMBER
			{
			// Lool.g:36:10: ( '0' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='0') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Lool.g:36:10: '0'
					{
					match('0'); 
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			mNUMBER(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ERROR3"

	// $ANTLR start "ERROR1"
	public final void mERROR1() throws RecognitionException {
		try {
			int _type = ERROR1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:37:8: ( NUMBER ID )
			// Lool.g:37:10: NUMBER ID
			{
			mNUMBER(); 

			mID(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ERROR1"

	// $ANTLR start "ZERO"
	public final void mZERO() throws RecognitionException {
		try {
			int _type = ZERO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:41:6: ( ( '+' | '-' )? ( '0' ) )
			// Lool.g:41:8: ( '+' | '-' )? ( '0' )
			{
			// Lool.g:41:8: ( '+' | '-' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='+'||LA2_0=='-') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// Lool.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// Lool.g:41:18: ( '0' )
			// Lool.g:41:19: '0'
			{
			match('0'); 
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ZERO"

	// $ANTLR start "ASSING"
	public final void mASSING() throws RecognitionException {
		try {
			int _type = ASSING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:42:9: ( ( ':=' ) )
			// Lool.g:42:11: ( ':=' )
			{
			// Lool.g:42:11: ( ':=' )
			// Lool.g:42:12: ':='
			{
			match(":="); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSING"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:43:4: ( '=' )
			// Lool.g:43:7: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "GR"
	public final void mGR() throws RecognitionException {
		try {
			int _type = GR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:44:5: ( '>' )
			// Lool.g:44:7: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GR"

	// $ANTLR start "SM"
	public final void mSM() throws RecognitionException {
		try {
			int _type = SM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:45:5: ( '<' )
			// Lool.g:45:8: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SM"

	// $ANTLR start "GE"
	public final void mGE() throws RecognitionException {
		try {
			int _type = GE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:46:5: ( '>=' )
			// Lool.g:46:8: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE"

	// $ANTLR start "SE"
	public final void mSE() throws RecognitionException {
		try {
			int _type = SE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:47:5: ( '<= ' )
			// Lool.g:47:8: '<= '
			{
			match("<= "); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SE"

	// $ANTLR start "NE"
	public final void mNE() throws RecognitionException {
		try {
			int _type = NE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:48:5: ( '!=' )
			// Lool.g:48:8: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE"

	// $ANTLR start "SemiColon"
	public final void mSemiColon() throws RecognitionException {
		try {
			int _type = SemiColon;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:50:11: ( ';' )
			// Lool.g:50:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SemiColon"

	// $ANTLR start "Dot"
	public final void mDot() throws RecognitionException {
		try {
			int _type = Dot;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:51:5: ( '.' )
			// Lool.g:51:7: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Dot"

	// $ANTLR start "Colon"
	public final void mColon() throws RecognitionException {
		try {
			int _type = Colon;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:52:7: ( ':' )
			// Lool.g:52:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Colon"

	// $ANTLR start "Comma"
	public final void mComma() throws RecognitionException {
		try {
			int _type = Comma;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:53:7: ( ',' )
			// Lool.g:53:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Comma"

	// $ANTLR start "BraceStart"
	public final void mBraceStart() throws RecognitionException {
		try {
			int _type = BraceStart;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:54:12: ( '{' )
			// Lool.g:54:14: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BraceStart"

	// $ANTLR start "BraceEnd"
	public final void mBraceEnd() throws RecognitionException {
		try {
			int _type = BraceEnd;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:55:10: ( '}' )
			// Lool.g:55:12: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BraceEnd"

	// $ANTLR start "BracketsStart"
	public final void mBracketsStart() throws RecognitionException {
		try {
			int _type = BracketsStart;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:56:14: ( '[' )
			// Lool.g:56:16: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BracketsStart"

	// $ANTLR start "BracketsEnd"
	public final void mBracketsEnd() throws RecognitionException {
		try {
			int _type = BracketsEnd;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:57:12: ( ']' )
			// Lool.g:57:14: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BracketsEnd"

	// $ANTLR start "ParenthesesStart"
	public final void mParenthesesStart() throws RecognitionException {
		try {
			int _type = ParenthesesStart;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:58:17: ( '(' )
			// Lool.g:58:19: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ParenthesesStart"

	// $ANTLR start "ParenthesesEnd"
	public final void mParenthesesEnd() throws RecognitionException {
		try {
			int _type = ParenthesesEnd;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:59:15: ( ')' )
			// Lool.g:59:17: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ParenthesesEnd"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:60:6: ( '*' )
			// Lool.g:60:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULT"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:61:5: ( '/' )
			// Lool.g:61:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "Sum"
	public final void mSum() throws RecognitionException {
		try {
			int _type = Sum;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:62:5: ( '+' )
			// Lool.g:62:7: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Sum"

	// $ANTLR start "Minus"
	public final void mMinus() throws RecognitionException {
		try {
			int _type = Minus;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:63:7: ( '-' )
			// Lool.g:63:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Minus"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:64:14: ( ( '+' | '-' )? ( '1' .. '9' ) ( '0' .. '9' )* )
			// Lool.g:64:19: ( '+' | '-' )? ( '1' .. '9' ) ( '0' .. '9' )*
			{
			// Lool.g:64:19: ( '+' | '-' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='+'||LA3_0=='-') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// Lool.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Lool.g:64:40: ( '0' .. '9' )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Lool.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:65:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// Lool.g:65:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Lool.g:65:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Lool.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:67:8: ( ( ' ' | '\\t' | '\\r' )* ( '\\n' )+ )
			// Lool.g:67:10: ( ' ' | '\\t' | '\\r' )* ( '\\n' )+
			{
			// Lool.g:67:10: ( ' ' | '\\t' | '\\r' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='\t'||LA6_0=='\r'||LA6_0==' ') ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Lool.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			// Lool.g:67:26: ( '\\n' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='\n') ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Lool.g:67:26: '\\n'
					{
					match('\n'); 
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:68:5: ( ( ' ' | '\\t' )+ )
			// Lool.g:68:7: ( ' ' | '\\t' )+
			{
			// Lool.g:68:7: ( ' ' | '\\t' )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='\t'||LA8_0==' ') ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Lool.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			_channel= HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "SINLGECOMMENT"
	public final void mSINLGECOMMENT() throws RecognitionException {
		try {
			int _type = SINLGECOMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:73:5: ( '%%' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// Lool.g:73:9: '%%' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("%%"); 

			// Lool.g:73:14: (~ ( '\\n' | '\\r' ) )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Lool.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop9;
				}
			}

			// Lool.g:73:28: ( '\\r' )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='\r') ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// Lool.g:73:28: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SINLGECOMMENT"

	// $ANTLR start "MULTICOMMENT"
	public final void mMULTICOMMENT() throws RecognitionException {
		try {
			int _type = MULTICOMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:77:2: ( '%%%' ( options {greedy=false; } : . )* ( '%%%' ) )
			// Lool.g:78:6: '%%%' ( options {greedy=false; } : . )* ( '%%%' )
			{
			match("%%%"); 

			// Lool.g:78:12: ( options {greedy=false; } : . )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0=='%') ) {
					int LA11_1 = input.LA(2);
					if ( (LA11_1=='%') ) {
						int LA11_3 = input.LA(3);
						if ( (LA11_3=='%') ) {
							alt11=2;
						}
						else if ( ((LA11_3 >= '\u0000' && LA11_3 <= '$')||(LA11_3 >= '&' && LA11_3 <= '\uFFFF')) ) {
							alt11=1;
						}

					}
					else if ( ((LA11_1 >= '\u0000' && LA11_1 <= '$')||(LA11_1 >= '&' && LA11_1 <= '\uFFFF')) ) {
						alt11=1;
					}

				}
				else if ( ((LA11_0 >= '\u0000' && LA11_0 <= '$')||(LA11_0 >= '&' && LA11_0 <= '\uFFFF')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// Lool.g:78:40: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop11;
				}
			}

			// Lool.g:78:45: ( '%%%' )
			// Lool.g:78:46: '%%%'
			{
			match("%%%"); 

			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTICOMMENT"

	// $ANTLR start "STRINGLIT"
	public final void mSTRINGLIT() throws RecognitionException {
		try {
			int _type = STRINGLIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:81:5: ( '\"' (~ ( '\\\\' | '\"' ) )* '\"' )
			// Lool.g:81:8: '\"' (~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// Lool.g:81:12: (~ ( '\\\\' | '\"' ) )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '\u0000' && LA12_0 <= '!')||(LA12_0 >= '#' && LA12_0 <= '[')||(LA12_0 >= ']' && LA12_0 <= '\uFFFF')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// Lool.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop12;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRINGLIT"

	// $ANTLR start "ERR2"
	public final void mERR2() throws RecognitionException {
		try {
			int _type = ERR2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:84:6: ( '!' | '@' | '#' | '$' | '%' | '^' | '&' | '*' | '?' )
			// Lool.g:
			{
			if ( input.LA(1)=='!'||(input.LA(1) >= '#' && input.LA(1) <= '&')||input.LA(1)=='*'||(input.LA(1) >= '?' && input.LA(1) <= '@')||input.LA(1)=='^' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ERR2"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			int _type = ESC_SEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lool.g:88:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
			// Lool.g:88:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
			{
			match('\\'); 
			if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	@Override
	public void mTokens() throws RecognitionException {
		// Lool.g:1:8: ( MODULE | CHILDOF | VIRTUAL | CREATE | INT | BOOL | STRING | VOID | AND | OR | NOT | TRUE | FALSE | RETURN | IF | THEN | ELSE | ENDIF | WHILE | LOOP | ENDLOOP | BREAK | CONTINUE | READ | WRITE | ERROR3 | ERROR1 | ZERO | ASSING | EQ | GR | SM | GE | SE | NE | SemiColon | Dot | Colon | Comma | BraceStart | BraceEnd | BracketsStart | BracketsEnd | ParenthesesStart | ParenthesesEnd | MULT | DIV | Sum | Minus | NUMBER | ID | NEWLINE | WS | SINLGECOMMENT | MULTICOMMENT | STRINGLIT | ERR2 | ESC_SEQ )
		int alt13=58;
		alt13 = dfa13.predict(input);
		switch (alt13) {
			case 1 :
				// Lool.g:1:10: MODULE
				{
				mMODULE(); 

				}
				break;
			case 2 :
				// Lool.g:1:17: CHILDOF
				{
				mCHILDOF(); 

				}
				break;
			case 3 :
				// Lool.g:1:25: VIRTUAL
				{
				mVIRTUAL(); 

				}
				break;
			case 4 :
				// Lool.g:1:33: CREATE
				{
				mCREATE(); 

				}
				break;
			case 5 :
				// Lool.g:1:40: INT
				{
				mINT(); 

				}
				break;
			case 6 :
				// Lool.g:1:44: BOOL
				{
				mBOOL(); 

				}
				break;
			case 7 :
				// Lool.g:1:49: STRING
				{
				mSTRING(); 

				}
				break;
			case 8 :
				// Lool.g:1:56: VOID
				{
				mVOID(); 

				}
				break;
			case 9 :
				// Lool.g:1:61: AND
				{
				mAND(); 

				}
				break;
			case 10 :
				// Lool.g:1:65: OR
				{
				mOR(); 

				}
				break;
			case 11 :
				// Lool.g:1:68: NOT
				{
				mNOT(); 

				}
				break;
			case 12 :
				// Lool.g:1:72: TRUE
				{
				mTRUE(); 

				}
				break;
			case 13 :
				// Lool.g:1:77: FALSE
				{
				mFALSE(); 

				}
				break;
			case 14 :
				// Lool.g:1:83: RETURN
				{
				mRETURN(); 

				}
				break;
			case 15 :
				// Lool.g:1:90: IF
				{
				mIF(); 

				}
				break;
			case 16 :
				// Lool.g:1:93: THEN
				{
				mTHEN(); 

				}
				break;
			case 17 :
				// Lool.g:1:98: ELSE
				{
				mELSE(); 

				}
				break;
			case 18 :
				// Lool.g:1:103: ENDIF
				{
				mENDIF(); 

				}
				break;
			case 19 :
				// Lool.g:1:109: WHILE
				{
				mWHILE(); 

				}
				break;
			case 20 :
				// Lool.g:1:115: LOOP
				{
				mLOOP(); 

				}
				break;
			case 21 :
				// Lool.g:1:120: ENDLOOP
				{
				mENDLOOP(); 

				}
				break;
			case 22 :
				// Lool.g:1:128: BREAK
				{
				mBREAK(); 

				}
				break;
			case 23 :
				// Lool.g:1:134: CONTINUE
				{
				mCONTINUE(); 

				}
				break;
			case 24 :
				// Lool.g:1:143: READ
				{
				mREAD(); 

				}
				break;
			case 25 :
				// Lool.g:1:148: WRITE
				{
				mWRITE(); 

				}
				break;
			case 26 :
				// Lool.g:1:154: ERROR3
				{
				mERROR3(); 

				}
				break;
			case 27 :
				// Lool.g:1:161: ERROR1
				{
				mERROR1(); 

				}
				break;
			case 28 :
				// Lool.g:1:168: ZERO
				{
				mZERO(); 

				}
				break;
			case 29 :
				// Lool.g:1:173: ASSING
				{
				mASSING(); 

				}
				break;
			case 30 :
				// Lool.g:1:180: EQ
				{
				mEQ(); 

				}
				break;
			case 31 :
				// Lool.g:1:183: GR
				{
				mGR(); 

				}
				break;
			case 32 :
				// Lool.g:1:186: SM
				{
				mSM(); 

				}
				break;
			case 33 :
				// Lool.g:1:189: GE
				{
				mGE(); 

				}
				break;
			case 34 :
				// Lool.g:1:192: SE
				{
				mSE(); 

				}
				break;
			case 35 :
				// Lool.g:1:195: NE
				{
				mNE(); 

				}
				break;
			case 36 :
				// Lool.g:1:198: SemiColon
				{
				mSemiColon(); 

				}
				break;
			case 37 :
				// Lool.g:1:208: Dot
				{
				mDot(); 

				}
				break;
			case 38 :
				// Lool.g:1:212: Colon
				{
				mColon(); 

				}
				break;
			case 39 :
				// Lool.g:1:218: Comma
				{
				mComma(); 

				}
				break;
			case 40 :
				// Lool.g:1:224: BraceStart
				{
				mBraceStart(); 

				}
				break;
			case 41 :
				// Lool.g:1:235: BraceEnd
				{
				mBraceEnd(); 

				}
				break;
			case 42 :
				// Lool.g:1:244: BracketsStart
				{
				mBracketsStart(); 

				}
				break;
			case 43 :
				// Lool.g:1:258: BracketsEnd
				{
				mBracketsEnd(); 

				}
				break;
			case 44 :
				// Lool.g:1:270: ParenthesesStart
				{
				mParenthesesStart(); 

				}
				break;
			case 45 :
				// Lool.g:1:287: ParenthesesEnd
				{
				mParenthesesEnd(); 

				}
				break;
			case 46 :
				// Lool.g:1:302: MULT
				{
				mMULT(); 

				}
				break;
			case 47 :
				// Lool.g:1:307: DIV
				{
				mDIV(); 

				}
				break;
			case 48 :
				// Lool.g:1:311: Sum
				{
				mSum(); 

				}
				break;
			case 49 :
				// Lool.g:1:315: Minus
				{
				mMinus(); 

				}
				break;
			case 50 :
				// Lool.g:1:321: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 51 :
				// Lool.g:1:328: ID
				{
				mID(); 

				}
				break;
			case 52 :
				// Lool.g:1:331: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 53 :
				// Lool.g:1:339: WS
				{
				mWS(); 

				}
				break;
			case 54 :
				// Lool.g:1:342: SINLGECOMMENT
				{
				mSINLGECOMMENT(); 

				}
				break;
			case 55 :
				// Lool.g:1:356: MULTICOMMENT
				{
				mMULTICOMMENT(); 

				}
				break;
			case 56 :
				// Lool.g:1:369: STRINGLIT
				{
				mSTRINGLIT(); 

				}
				break;
			case 57 :
				// Lool.g:1:379: ERR2
				{
				mERR2(); 

				}
				break;
			case 58 :
				// Lool.g:1:384: ESC_SEQ
				{
				mESC_SEQ(); 

				}
				break;

		}
	}


	protected DFA13 dfa13 = new DFA13(this);
	static final String DFA13_eotS =
		"\1\uffff\17\44\1\103\1\104\1\106\1\111\1\uffff\1\113\1\115\1\51\13\uffff"+
		"\1\120\1\uffff\1\121\1\uffff\1\51\3\uffff\7\44\1\132\4\44\1\137\12\44"+
		"\3\uffff\1\106\15\uffff\6\44\1\163\1\uffff\3\44\1\167\1\uffff\1\170\12"+
		"\44\2\uffff\5\44\1\u008d\1\uffff\1\u008e\2\44\2\uffff\1\u0091\1\u0092"+
		"\2\44\1\u0095\1\u0096\4\44\1\u009b\2\uffff\1\154\1\uffff\5\44\2\uffff"+
		"\1\u00a3\1\44\2\uffff\1\u00a5\1\44\2\uffff\1\u00a7\1\44\1\u00a9\1\u00aa"+
		"\3\uffff\1\u00ac\1\44\1\u00ae\2\44\1\uffff\1\u00b1\1\uffff\1\u00b2\1\uffff"+
		"\1\44\2\uffff\1\u009d\1\uffff\1\u00b4\1\uffff\1\44\1\u00b6\2\uffff\1\u00b7"+
		"\1\uffff\1\u00b8\3\uffff";
	static final String DFA13_eofS =
		"\u00b9\uffff";
	static final String DFA13_minS =
		"\1\11\1\157\1\150\1\151\1\146\1\157\1\164\1\156\1\162\1\157\1\150\1\141"+
		"\1\145\1\154\1\150\1\157\1\53\2\60\1\75\1\uffff\3\75\13\uffff\1\60\1\uffff"+
		"\1\11\1\uffff\1\45\3\uffff\1\144\1\151\1\145\1\156\1\162\1\151\1\164\1"+
		"\60\1\157\1\145\1\162\1\144\1\60\1\164\1\165\1\145\1\154\1\141\1\163\1"+
		"\144\2\151\1\157\3\uffff\1\60\14\uffff\1\0\1\165\1\154\1\141\2\164\1\144"+
		"\1\60\1\uffff\1\154\1\141\1\151\1\60\1\uffff\1\60\1\145\1\156\1\163\1"+
		"\165\1\144\1\145\1\151\1\154\1\164\1\160\1\0\1\uffff\1\154\1\144\1\164"+
		"\1\151\1\165\1\60\1\uffff\1\60\1\153\1\156\2\uffff\2\60\1\145\1\162\2"+
		"\60\1\146\1\157\2\145\1\60\4\0\1\145\1\157\1\145\1\156\1\141\2\uffff\1"+
		"\60\1\147\2\uffff\1\60\1\156\2\uffff\1\60\1\157\2\60\1\uffff\1\0\1\uffff"+
		"\1\60\1\146\1\60\1\165\1\154\1\uffff\1\60\1\uffff\1\60\1\uffff\1\160\2"+
		"\uffff\1\0\1\uffff\1\60\1\uffff\1\145\1\60\2\uffff\1\60\1\uffff\1\60\3"+
		"\uffff";
	static final String DFA13_maxS =
		"\1\175\1\157\1\162\1\157\1\156\1\162\1\164\1\156\1\162\1\157\1\162\1\141"+
		"\1\145\1\156\1\162\1\157\2\71\1\172\1\75\1\uffff\3\75\13\uffff\1\71\1"+
		"\uffff\1\40\1\uffff\1\45\3\uffff\1\144\1\151\1\145\1\156\1\162\1\151\1"+
		"\164\1\172\1\157\1\145\1\162\1\144\1\172\1\164\1\165\1\145\1\154\1\164"+
		"\1\163\1\144\2\151\1\157\3\uffff\1\172\14\uffff\1\uffff\1\165\1\154\1"+
		"\141\2\164\1\144\1\172\1\uffff\1\154\1\141\1\151\1\172\1\uffff\1\172\1"+
		"\145\1\156\1\163\1\165\1\144\1\145\2\154\1\164\1\160\1\uffff\1\uffff\1"+
		"\154\1\144\1\164\1\151\1\165\1\172\1\uffff\1\172\1\153\1\156\2\uffff\2"+
		"\172\1\145\1\162\2\172\1\146\1\157\2\145\1\172\4\uffff\1\145\1\157\1\145"+
		"\1\156\1\141\2\uffff\1\172\1\147\2\uffff\1\172\1\156\2\uffff\1\172\1\157"+
		"\2\172\1\uffff\1\uffff\1\uffff\1\172\1\146\1\172\1\165\1\154\1\uffff\1"+
		"\172\1\uffff\1\172\1\uffff\1\160\2\uffff\1\uffff\1\uffff\1\172\1\uffff"+
		"\1\145\1\172\2\uffff\1\172\1\uffff\1\172\3\uffff";
	static final String DFA13_acceptS =
		"\24\uffff\1\36\3\uffff\1\44\1\45\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1"+
		"\56\1\57\1\uffff\1\63\1\uffff\1\64\1\uffff\1\70\1\71\1\72\27\uffff\1\32"+
		"\1\34\1\60\1\uffff\1\62\1\33\1\35\1\46\1\41\1\37\1\42\1\40\1\43\1\56\1"+
		"\61\1\65\10\uffff\1\17\4\uffff\1\12\14\uffff\1\66\6\uffff\1\5\3\uffff"+
		"\1\11\1\13\24\uffff\1\10\1\6\2\uffff\1\14\1\20\2\uffff\1\30\1\21\4\uffff"+
		"\1\24\1\uffff\1\67\5\uffff\1\26\1\uffff\1\15\1\uffff\1\22\1\uffff\1\23"+
		"\1\31\1\uffff\1\1\1\uffff\1\4\2\uffff\1\7\1\16\1\uffff\1\2\1\uffff\1\3"+
		"\1\25\1\27";
	static final String DFA13_specialS =
		"\122\uffff\1\4\30\uffff\1\5\30\uffff\1\7\1\3\1\1\1\0\24\uffff\1\6\16\uffff"+
		"\1\2\15\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\45\1\46\2\uffff\1\46\22\uffff\1\45\1\27\1\50\2\51\1\47\1\51\1\uffff"+
			"\1\37\1\40\1\41\1\21\1\32\1\43\1\31\1\42\1\20\11\22\1\23\1\30\1\26\1"+
			"\24\1\25\2\51\32\44\1\35\1\52\1\36\1\51\1\44\1\uffff\1\7\1\5\1\2\1\44"+
			"\1\15\1\13\2\44\1\4\2\44\1\17\1\1\1\11\1\10\2\44\1\14\1\6\1\12\1\44\1"+
			"\3\1\16\3\44\1\33\1\uffff\1\34",
			"\1\53",
			"\1\54\6\uffff\1\56\2\uffff\1\55",
			"\1\57\5\uffff\1\60",
			"\1\62\7\uffff\1\61",
			"\1\63\2\uffff\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\72\11\uffff\1\71",
			"\1\73",
			"\1\74",
			"\1\75\1\uffff\1\76",
			"\1\77\11\uffff\1\100",
			"\1\101",
			"\1\102\1\uffff\1\102\2\uffff\12\102",
			"\1\103\11\22",
			"\12\105\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
			"\1\110",
			"",
			"\1\112",
			"\1\114",
			"\1\116",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\103\11\22",
			"",
			"\1\45\1\46\2\uffff\1\46\22\uffff\1\45",
			"",
			"\1\122",
			"",
			"",
			"",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\145\22\uffff\1\144",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"",
			"",
			"",
			"\12\105\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\45\154\1\153\uffda\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"",
			"\1\164",
			"\1\165",
			"\1\166",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177\2\uffff\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\12\u0087\1\u0086\2\u0087\1\u0085\27\u0087\1\u0084\uffda\u0087",
			"",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\u008f",
			"\1\u0090",
			"",
			"",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\u0093",
			"\1\u0094",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\12\u0087\1\u0086\2\u0087\1\u0085\27\u0087\1\u009c\uffda\u0087",
			"\12\u009d\1\u0086\ufff5\u009d",
			"\0\u009d",
			"\12\u0087\1\u0086\2\u0087\1\u0085\27\u0087\1\u0084\uffda\u0087",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"",
			"",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\u00a4",
			"",
			"",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\u00a6",
			"",
			"",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\u00a8",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"",
			"\12\u0087\1\u0086\2\u0087\1\u0085\27\u0087\1\u00ab\uffda\u0087",
			"",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\u00ad",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\u00af",
			"\1\u00b0",
			"",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"",
			"\1\u00b3",
			"",
			"",
			"\12\u0087\1\u0086\2\u0087\1\u0085\27\u0087\1\u00ab\uffda\u0087",
			"",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"",
			"\1\u00b5",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"",
			"",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"",
			"",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( MODULE | CHILDOF | VIRTUAL | CREATE | INT | BOOL | STRING | VOID | AND | OR | NOT | TRUE | FALSE | RETURN | IF | THEN | ELSE | ENDIF | WHILE | LOOP | ENDLOOP | BREAK | CONTINUE | READ | WRITE | ERROR3 | ERROR1 | ZERO | ASSING | EQ | GR | SM | GE | SE | NE | SemiColon | Dot | Colon | Comma | BraceStart | BraceEnd | BracketsStart | BracketsEnd | ParenthesesStart | ParenthesesEnd | MULT | DIV | Sum | Minus | NUMBER | ID | NEWLINE | WS | SINLGECOMMENT | MULTICOMMENT | STRINGLIT | ERR2 | ESC_SEQ );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA13_135 = input.LA(1);
						s = -1;
						if ( (LA13_135=='%') ) {s = 132;}
						else if ( (LA13_135=='\r') ) {s = 133;}
						else if ( (LA13_135=='\n') ) {s = 134;}
						else if ( ((LA13_135 >= '\u0000' && LA13_135 <= '\t')||(LA13_135 >= '\u000B' && LA13_135 <= '\f')||(LA13_135 >= '\u000E' && LA13_135 <= '$')||(LA13_135 >= '&' && LA13_135 <= '\uFFFF')) ) {s = 135;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA13_134 = input.LA(1);
						s = -1;
						if ( ((LA13_134 >= '\u0000' && LA13_134 <= '\uFFFF')) ) {s = 157;}
						else s = 108;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA13_171 = input.LA(1);
						s = -1;
						if ( (LA13_171=='%') ) {s = 171;}
						else if ( (LA13_171=='\r') ) {s = 133;}
						else if ( (LA13_171=='\n') ) {s = 134;}
						else if ( ((LA13_171 >= '\u0000' && LA13_171 <= '\t')||(LA13_171 >= '\u000B' && LA13_171 <= '\f')||(LA13_171 >= '\u000E' && LA13_171 <= '$')||(LA13_171 >= '&' && LA13_171 <= '\uFFFF')) ) {s = 135;}
						else s = 157;
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA13_133 = input.LA(1);
						s = -1;
						if ( ((LA13_133 >= '\u0000' && LA13_133 <= '\t')||(LA13_133 >= '\u000B' && LA13_133 <= '\uFFFF')) ) {s = 157;}
						else if ( (LA13_133=='\n') ) {s = 134;}
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA13_82 = input.LA(1);
						s = -1;
						if ( (LA13_82=='%') ) {s = 107;}
						else if ( ((LA13_82 >= '\u0000' && LA13_82 <= '$')||(LA13_82 >= '&' && LA13_82 <= '\uFFFF')) ) {s = 108;}
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA13_107 = input.LA(1);
						s = -1;
						if ( (LA13_107=='%') ) {s = 132;}
						else if ( (LA13_107=='\r') ) {s = 133;}
						else if ( (LA13_107=='\n') ) {s = 134;}
						else if ( ((LA13_107 >= '\u0000' && LA13_107 <= '\t')||(LA13_107 >= '\u000B' && LA13_107 <= '\f')||(LA13_107 >= '\u000E' && LA13_107 <= '$')||(LA13_107 >= '&' && LA13_107 <= '\uFFFF')) ) {s = 135;}
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA13_156 = input.LA(1);
						s = -1;
						if ( (LA13_156=='%') ) {s = 171;}
						else if ( (LA13_156=='\r') ) {s = 133;}
						else if ( (LA13_156=='\n') ) {s = 134;}
						else if ( ((LA13_156 >= '\u0000' && LA13_156 <= '\t')||(LA13_156 >= '\u000B' && LA13_156 <= '\f')||(LA13_156 >= '\u000E' && LA13_156 <= '$')||(LA13_156 >= '&' && LA13_156 <= '\uFFFF')) ) {s = 135;}
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA13_132 = input.LA(1);
						s = -1;
						if ( (LA13_132=='%') ) {s = 156;}
						else if ( (LA13_132=='\r') ) {s = 133;}
						else if ( (LA13_132=='\n') ) {s = 134;}
						else if ( ((LA13_132 >= '\u0000' && LA13_132 <= '\t')||(LA13_132 >= '\u000B' && LA13_132 <= '\f')||(LA13_132 >= '\u000E' && LA13_132 <= '$')||(LA13_132 >= '&' && LA13_132 <= '\uFFFF')) ) {s = 135;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 13, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
