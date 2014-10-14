package example.interfaces.simple.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import example.interfaces.simple.services.SimplifiedItfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimplifiedItfParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interface'", "'{'", "'}'", "'('", "','", "')'", "';'", "'int'", "'void'", "'boolean'", "'float'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSimplifiedItfParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimplifiedItfParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimplifiedItfParser.tokenNames; }
    public String getGrammarFileName() { return "../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g"; }



     	private SimplifiedItfGrammarAccess grammarAccess;
     	
        public InternalSimplifiedItfParser(TokenStream input, SimplifiedItfGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "InterfaceDefinition";	
       	}
       	
       	@Override
       	protected SimplifiedItfGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleInterfaceDefinition"
    // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:67:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:68:2: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:69:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
            {
             newCompositeNode(grammarAccess.getInterfaceDefinitionRule()); 
            pushFollow(FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition75);
            iv_ruleInterfaceDefinition=ruleInterfaceDefinition();

            state._fsp--;

             current =iv_ruleInterfaceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceDefinition85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaceDefinition"


    // $ANTLR start "ruleInterfaceDefinition"
    // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:76:1: ruleInterfaceDefinition returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleMethod ) )* otherlv_4= '}' ) ;
    public final EObject ruleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_methods_3_0 = null;


         enterRule(); 
            
        try {
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:79:28: ( (otherlv_0= 'interface' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleMethod ) )* otherlv_4= '}' ) )
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:80:1: (otherlv_0= 'interface' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleMethod ) )* otherlv_4= '}' )
            {
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:80:1: (otherlv_0= 'interface' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleMethod ) )* otherlv_4= '}' )
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:80:3: otherlv_0= 'interface' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleMethod ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleInterfaceDefinition122); 

                	newLeafNode(otherlv_0, grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_0());
                
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:84:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:85:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:85:1: (lv_name_1_0= ruleQualifiedName )
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:86:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInterfaceDefinition143);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInterfaceDefinition155); 

                	newLeafNode(otherlv_2, grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:106:1: ( (lv_methods_3_0= ruleMethod ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=18 && LA1_0<=21)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:107:1: (lv_methods_3_0= ruleMethod )
            	    {
            	    // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:107:1: (lv_methods_3_0= ruleMethod )
            	    // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:108:3: lv_methods_3_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getMethodsMethodParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleInterfaceDefinition176);
            	    lv_methods_3_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_3_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleInterfaceDefinition189); 

                	newLeafNode(otherlv_4, grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceDefinition"


    // $ANTLR start "entryRuleMethod"
    // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:136:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:137:2: (iv_ruleMethod= ruleMethod EOF )
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:138:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod225);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod235); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:145:1: ruleMethod returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_typesList_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_typesList_5_0= ruleType ) ) )* otherlv_6= ')' otherlv_7= ';' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_returnType_0_0 = null;

        AntlrDatatypeRuleToken lv_typesList_3_0 = null;

        AntlrDatatypeRuleToken lv_typesList_5_0 = null;


         enterRule(); 
            
        try {
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:148:28: ( ( ( (lv_returnType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_typesList_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_typesList_5_0= ruleType ) ) )* otherlv_6= ')' otherlv_7= ';' ) )
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:149:1: ( ( (lv_returnType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_typesList_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_typesList_5_0= ruleType ) ) )* otherlv_6= ')' otherlv_7= ';' )
            {
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:149:1: ( ( (lv_returnType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_typesList_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_typesList_5_0= ruleType ) ) )* otherlv_6= ')' otherlv_7= ';' )
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:149:2: ( (lv_returnType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_typesList_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_typesList_5_0= ruleType ) ) )* otherlv_6= ')' otherlv_7= ';'
            {
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:149:2: ( (lv_returnType_0_0= ruleType ) )
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:150:1: (lv_returnType_0_0= ruleType )
            {
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:150:1: (lv_returnType_0_0= ruleType )
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:151:3: lv_returnType_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getMethodAccess().getReturnTypeTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleMethod281);
            lv_returnType_0_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMethodRule());
            	        }
                   		set(
                   			current, 
                   			"returnType",
                    		lv_returnType_0_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:167:2: ( (lv_name_1_0= RULE_ID ) )
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:168:1: (lv_name_1_0= RULE_ID )
            {
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:168:1: (lv_name_1_0= RULE_ID )
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:169:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod298); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleMethod315); 

                	newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
                
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:189:1: ( (lv_typesList_3_0= ruleType ) )
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:190:1: (lv_typesList_3_0= ruleType )
            {
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:190:1: (lv_typesList_3_0= ruleType )
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:191:3: lv_typesList_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getMethodAccess().getTypesListTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleMethod336);
            lv_typesList_3_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMethodRule());
            	        }
                   		add(
                   			current, 
                   			"typesList",
                    		lv_typesList_3_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:207:2: (otherlv_4= ',' ( (lv_typesList_5_0= ruleType ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:207:4: otherlv_4= ',' ( (lv_typesList_5_0= ruleType ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleMethod349); 

            	        	newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_4_0());
            	        
            	    // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:211:1: ( (lv_typesList_5_0= ruleType ) )
            	    // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:212:1: (lv_typesList_5_0= ruleType )
            	    {
            	    // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:212:1: (lv_typesList_5_0= ruleType )
            	    // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:213:3: lv_typesList_5_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getTypesListTypeParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleMethod370);
            	    lv_typesList_5_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"typesList",
            	            		lv_typesList_5_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleMethod384); 

                	newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getRightParenthesisKeyword_5());
                
            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleMethod396); 

                	newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleType"
    // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:245:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:246:2: (iv_ruleType= ruleType EOF )
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:247:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType433);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType444); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:254:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'void' | kw= 'boolean' | kw= 'float' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:257:28: ( (kw= 'int' | kw= 'void' | kw= 'boolean' | kw= 'float' ) )
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:258:1: (kw= 'int' | kw= 'void' | kw= 'boolean' | kw= 'float' )
            {
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:258:1: (kw= 'int' | kw= 'void' | kw= 'boolean' | kw= 'float' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 21:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:259:2: kw= 'int'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleType482); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:266:2: kw= 'void'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleType501); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getVoidKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:273:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleType520); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getBooleanKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:280:2: kw= 'float'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleType539); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getFloatKeyword_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleQualifiedName"
    // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:293:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:294:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:295:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName580);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName591); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:302:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:305:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:306:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:306:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:306:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName631); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:313:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../example.interfaces.simple/src-gen/example/interfaces/simple/parser/antlr/internal/InternalSimplifiedItf.g:314:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,22,FOLLOW_22_in_ruleQualifiedName650); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName665); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleInterfaceDefinition122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterfaceDefinition143 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInterfaceDefinition155 = new BitSet(new long[]{0x00000000003C2000L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleInterfaceDefinition176 = new BitSet(new long[]{0x00000000003C2000L});
    public static final BitSet FOLLOW_13_in_ruleInterfaceDefinition189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleMethod281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod298 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMethod315 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_ruleType_in_ruleMethod336 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleMethod349 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_ruleType_in_ruleMethod370 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleMethod384 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMethod396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleType482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleType501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleType520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleType539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName631 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleQualifiedName650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName665 = new BitSet(new long[]{0x0000000000400002L});

}