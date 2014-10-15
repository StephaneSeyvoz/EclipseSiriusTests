package example.components.simple.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import example.components.simple.services.SimplifiedADLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimplifiedADLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'.*'", "'component'", "'{'", "'}'", "'requires'", "'as'", "'provides'", "'contains'", "'binds'", "'.'", "'to'"
    };
    public static final int RULE_ID=4;
    public static final int T__23=23;
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


        public InternalSimplifiedADLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimplifiedADLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimplifiedADLParser.tokenNames; }
    public String getGrammarFileName() { return "../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g"; }



     	private SimplifiedADLGrammarAccess grammarAccess;
     	
        public InternalSimplifiedADLParser(TokenStream input, SimplifiedADLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Definition";	
       	}
       	
       	@Override
       	protected SimplifiedADLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDefinition"
    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:67:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:68:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:69:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition75);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition85); 

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:76:1: ruleDefinition returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImports ) )* ( (lv_architecture_1_0= ruleArchitecture ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_architecture_1_0 = null;


         enterRule(); 
            
        try {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:79:28: ( ( ( (lv_imports_0_0= ruleImports ) )* ( (lv_architecture_1_0= ruleArchitecture ) ) ) )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:80:1: ( ( (lv_imports_0_0= ruleImports ) )* ( (lv_architecture_1_0= ruleArchitecture ) ) )
            {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:80:1: ( ( (lv_imports_0_0= ruleImports ) )* ( (lv_architecture_1_0= ruleArchitecture ) ) )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:80:2: ( (lv_imports_0_0= ruleImports ) )* ( (lv_architecture_1_0= ruleArchitecture ) )
            {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:80:2: ( (lv_imports_0_0= ruleImports ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:81:1: (lv_imports_0_0= ruleImports )
            	    {
            	    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:81:1: (lv_imports_0_0= ruleImports )
            	    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:82:3: lv_imports_0_0= ruleImports
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDefinitionAccess().getImportsImportsParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImports_in_ruleDefinition131);
            	    lv_imports_0_0=ruleImports();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_0_0, 
            	            		"Imports");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:98:3: ( (lv_architecture_1_0= ruleArchitecture ) )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:99:1: (lv_architecture_1_0= ruleArchitecture )
            {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:99:1: (lv_architecture_1_0= ruleArchitecture )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:100:3: lv_architecture_1_0= ruleArchitecture
            {
             
            	        newCompositeNode(grammarAccess.getDefinitionAccess().getArchitectureArchitectureParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleArchitecture_in_ruleDefinition153);
            lv_architecture_1_0=ruleArchitecture();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"architecture",
                    		lv_architecture_1_0, 
                    		"Architecture");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleImports"
    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:124:1: entryRuleImports returns [EObject current=null] : iv_ruleImports= ruleImports EOF ;
    public final EObject entryRuleImports() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImports = null;


        try {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:125:2: (iv_ruleImports= ruleImports EOF )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:126:2: iv_ruleImports= ruleImports EOF
            {
             newCompositeNode(grammarAccess.getImportsRule()); 
            pushFollow(FOLLOW_ruleImports_in_entryRuleImports189);
            iv_ruleImports=ruleImports();

            state._fsp--;

             current =iv_ruleImports; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImports199); 

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
    // $ANTLR end "entryRuleImports"


    // $ANTLR start "ruleImports"
    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:133:1: ruleImports returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) ;
    public final EObject ruleImports() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:136:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:137:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImports236); 

                	newLeafNode(otherlv_0, grammarAccess.getImportsAccess().getImportKeyword_0());
                
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:141:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:143:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportsAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImports257);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportsRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedNameWithWildcard");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleImports269); 

                	newLeafNode(otherlv_2, grammarAccess.getImportsAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleImports"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:171:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:172:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:173:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard306);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard317); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:180:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:183:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:184:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:184:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:185:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard364);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:195:1: (kw= '.*' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:196:2: kw= '.*'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedNameWithWildcard383); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

            }


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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleArchitecture"
    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:209:1: entryRuleArchitecture returns [EObject current=null] : iv_ruleArchitecture= ruleArchitecture EOF ;
    public final EObject entryRuleArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitecture = null;


        try {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:210:2: (iv_ruleArchitecture= ruleArchitecture EOF )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:211:2: iv_ruleArchitecture= ruleArchitecture EOF
            {
             newCompositeNode(grammarAccess.getArchitectureRule()); 
            pushFollow(FOLLOW_ruleArchitecture_in_entryRuleArchitecture425);
            iv_ruleArchitecture=ruleArchitecture();

            state._fsp--;

             current =iv_ruleArchitecture; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArchitecture435); 

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
    // $ANTLR end "entryRuleArchitecture"


    // $ANTLR start "ruleArchitecture"
    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:218:1: ruleArchitecture returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleArchitectureElements ) )* otherlv_4= '}' ) ;
    public final EObject ruleArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:221:28: ( (otherlv_0= 'component' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleArchitectureElements ) )* otherlv_4= '}' ) )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:222:1: (otherlv_0= 'component' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleArchitectureElements ) )* otherlv_4= '}' )
            {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:222:1: (otherlv_0= 'component' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleArchitectureElements ) )* otherlv_4= '}' )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:222:3: otherlv_0= 'component' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleArchitectureElements ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleArchitecture472); 

                	newLeafNode(otherlv_0, grammarAccess.getArchitectureAccess().getComponentKeyword_0());
                
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:226:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:227:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:227:1: (lv_name_1_0= ruleQualifiedName )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:228:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getArchitectureAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleArchitecture493);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArchitectureRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleArchitecture505); 

                	newLeafNode(otherlv_2, grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_2());
                
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:248:1: ( (lv_elements_3_0= ruleArchitectureElements ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17||(LA3_0>=19 && LA3_0<=21)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:249:1: (lv_elements_3_0= ruleArchitectureElements )
            	    {
            	    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:249:1: (lv_elements_3_0= ruleArchitectureElements )
            	    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:250:3: lv_elements_3_0= ruleArchitectureElements
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArchitectureAccess().getElementsArchitectureElementsParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleArchitectureElements_in_ruleArchitecture526);
            	    lv_elements_3_0=ruleArchitectureElements();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArchitectureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"ArchitectureElements");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleArchitecture539); 

                	newLeafNode(otherlv_4, grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleArchitecture"


    // $ANTLR start "entryRuleArchitectureElements"
    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:278:1: entryRuleArchitectureElements returns [EObject current=null] : iv_ruleArchitectureElements= ruleArchitectureElements EOF ;
    public final EObject entryRuleArchitectureElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureElements = null;


        try {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:279:2: (iv_ruleArchitectureElements= ruleArchitectureElements EOF )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:280:2: iv_ruleArchitectureElements= ruleArchitectureElements EOF
            {
             newCompositeNode(grammarAccess.getArchitectureElementsRule()); 
            pushFollow(FOLLOW_ruleArchitectureElements_in_entryRuleArchitectureElements575);
            iv_ruleArchitectureElements=ruleArchitectureElements();

            state._fsp--;

             current =iv_ruleArchitectureElements; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArchitectureElements585); 

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
    // $ANTLR end "entryRuleArchitectureElements"


    // $ANTLR start "ruleArchitectureElements"
    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:287:1: ruleArchitectureElements returns [EObject current=null] : (this_Component_0= ruleComponent | this_ProvidedInterface_1= ruleProvidedInterface | this_RequiredInterface_2= ruleRequiredInterface | this_Binding_3= ruleBinding ) ;
    public final EObject ruleArchitectureElements() throws RecognitionException {
        EObject current = null;

        EObject this_Component_0 = null;

        EObject this_ProvidedInterface_1 = null;

        EObject this_RequiredInterface_2 = null;

        EObject this_Binding_3 = null;


         enterRule(); 
            
        try {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:290:28: ( (this_Component_0= ruleComponent | this_ProvidedInterface_1= ruleProvidedInterface | this_RequiredInterface_2= ruleRequiredInterface | this_Binding_3= ruleBinding ) )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:291:1: (this_Component_0= ruleComponent | this_ProvidedInterface_1= ruleProvidedInterface | this_RequiredInterface_2= ruleRequiredInterface | this_Binding_3= ruleBinding )
            {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:291:1: (this_Component_0= ruleComponent | this_ProvidedInterface_1= ruleProvidedInterface | this_RequiredInterface_2= ruleRequiredInterface | this_Binding_3= ruleBinding )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 21:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:292:5: this_Component_0= ruleComponent
                    {
                     
                            newCompositeNode(grammarAccess.getArchitectureElementsAccess().getComponentParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleComponent_in_ruleArchitectureElements632);
                    this_Component_0=ruleComponent();

                    state._fsp--;

                     
                            current = this_Component_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:302:5: this_ProvidedInterface_1= ruleProvidedInterface
                    {
                     
                            newCompositeNode(grammarAccess.getArchitectureElementsAccess().getProvidedInterfaceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleProvidedInterface_in_ruleArchitectureElements659);
                    this_ProvidedInterface_1=ruleProvidedInterface();

                    state._fsp--;

                     
                            current = this_ProvidedInterface_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:312:5: this_RequiredInterface_2= ruleRequiredInterface
                    {
                     
                            newCompositeNode(grammarAccess.getArchitectureElementsAccess().getRequiredInterfaceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRequiredInterface_in_ruleArchitectureElements686);
                    this_RequiredInterface_2=ruleRequiredInterface();

                    state._fsp--;

                     
                            current = this_RequiredInterface_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:322:5: this_Binding_3= ruleBinding
                    {
                     
                            newCompositeNode(grammarAccess.getArchitectureElementsAccess().getBindingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleBinding_in_ruleArchitectureElements713);
                    this_Binding_3=ruleBinding();

                    state._fsp--;

                     
                            current = this_Binding_3; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleArchitectureElements"


    // $ANTLR start "entryRuleRequiredInterface"
    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:338:1: entryRuleRequiredInterface returns [EObject current=null] : iv_ruleRequiredInterface= ruleRequiredInterface EOF ;
    public final EObject entryRuleRequiredInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredInterface = null;


        try {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:339:2: (iv_ruleRequiredInterface= ruleRequiredInterface EOF )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:340:2: iv_ruleRequiredInterface= ruleRequiredInterface EOF
            {
             newCompositeNode(grammarAccess.getRequiredInterfaceRule()); 
            pushFollow(FOLLOW_ruleRequiredInterface_in_entryRuleRequiredInterface748);
            iv_ruleRequiredInterface=ruleRequiredInterface();

            state._fsp--;

             current =iv_ruleRequiredInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredInterface758); 

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
    // $ANTLR end "entryRuleRequiredInterface"


    // $ANTLR start "ruleRequiredInterface"
    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:347:1: ruleRequiredInterface returns [EObject current=null] : (otherlv_0= 'requires' ( ( ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleRequiredInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:350:28: ( (otherlv_0= 'requires' ( ( ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:351:1: (otherlv_0= 'requires' ( ( ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:351:1: (otherlv_0= 'requires' ( ( ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:351:3: otherlv_0= 'requires' ( ( ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleRequiredInterface795); 

                	newLeafNode(otherlv_0, grammarAccess.getRequiredInterfaceAccess().getRequiresKeyword_0());
                
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:355:1: ( ( ruleQualifiedName ) )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:356:1: ( ruleQualifiedName )
            {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:356:1: ( ruleQualifiedName )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:357:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRequiredInterfaceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRequiredInterfaceAccess().getTypeInterfaceDefinitionCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRequiredInterface818);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleRequiredInterface830); 

                	newLeafNode(otherlv_2, grammarAccess.getRequiredInterfaceAccess().getAsKeyword_2());
                
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:374:1: ( (lv_name_3_0= RULE_ID ) )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:375:1: (lv_name_3_0= RULE_ID )
            {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:375:1: (lv_name_3_0= RULE_ID )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:376:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequiredInterface847); 

            			newLeafNode(lv_name_3_0, grammarAccess.getRequiredInterfaceAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRequiredInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleRequiredInterface864); 

                	newLeafNode(otherlv_4, grammarAccess.getRequiredInterfaceAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleRequiredInterface"


    // $ANTLR start "entryRuleProvidedInterface"
    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:404:1: entryRuleProvidedInterface returns [EObject current=null] : iv_ruleProvidedInterface= ruleProvidedInterface EOF ;
    public final EObject entryRuleProvidedInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedInterface = null;


        try {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:405:2: (iv_ruleProvidedInterface= ruleProvidedInterface EOF )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:406:2: iv_ruleProvidedInterface= ruleProvidedInterface EOF
            {
             newCompositeNode(grammarAccess.getProvidedInterfaceRule()); 
            pushFollow(FOLLOW_ruleProvidedInterface_in_entryRuleProvidedInterface900);
            iv_ruleProvidedInterface=ruleProvidedInterface();

            state._fsp--;

             current =iv_ruleProvidedInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvidedInterface910); 

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
    // $ANTLR end "entryRuleProvidedInterface"


    // $ANTLR start "ruleProvidedInterface"
    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:413:1: ruleProvidedInterface returns [EObject current=null] : (otherlv_0= 'provides' ( ( ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleProvidedInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:416:28: ( (otherlv_0= 'provides' ( ( ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:417:1: (otherlv_0= 'provides' ( ( ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:417:1: (otherlv_0= 'provides' ( ( ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:417:3: otherlv_0= 'provides' ( ( ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleProvidedInterface947); 

                	newLeafNode(otherlv_0, grammarAccess.getProvidedInterfaceAccess().getProvidesKeyword_0());
                
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:421:1: ( ( ruleQualifiedName ) )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:422:1: ( ruleQualifiedName )
            {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:422:1: ( ruleQualifiedName )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:423:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getProvidedInterfaceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getProvidedInterfaceAccess().getTypeInterfaceDefinitionCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleProvidedInterface970);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleProvidedInterface982); 

                	newLeafNode(otherlv_2, grammarAccess.getProvidedInterfaceAccess().getAsKeyword_2());
                
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:440:1: ( (lv_name_3_0= RULE_ID ) )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:441:1: (lv_name_3_0= RULE_ID )
            {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:441:1: (lv_name_3_0= RULE_ID )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:442:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvidedInterface999); 

            			newLeafNode(lv_name_3_0, grammarAccess.getProvidedInterfaceAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProvidedInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleProvidedInterface1016); 

                	newLeafNode(otherlv_4, grammarAccess.getProvidedInterfaceAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleProvidedInterface"


    // $ANTLR start "entryRuleComponent"
    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:470:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:471:2: (iv_ruleComponent= ruleComponent EOF )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:472:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent1052);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent1062); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:479:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:482:28: ( (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:483:1: (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:483:1: (otherlv_0= 'contains' ( ( ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:483:3: otherlv_0= 'contains' ( ( ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleComponent1099); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getContainsKeyword_0());
                
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:487:1: ( ( ruleQualifiedName ) )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:488:1: ( ruleQualifiedName )
            {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:488:1: ( ruleQualifiedName )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:489:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getComponentAccess().getTypeArchitectureCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleComponent1122);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleComponent1134); 

                	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getAsKeyword_2());
                
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:506:1: ( (lv_name_3_0= RULE_ID ) )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:507:1: (lv_name_3_0= RULE_ID )
            {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:507:1: (lv_name_3_0= RULE_ID )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:508:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponent1151); 

            			newLeafNode(lv_name_3_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleComponent1168); 

                	newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleBinding"
    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:536:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:537:2: (iv_ruleBinding= ruleBinding EOF )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:538:2: iv_ruleBinding= ruleBinding EOF
            {
             newCompositeNode(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_ruleBinding_in_entryRuleBinding1204);
            iv_ruleBinding=ruleBinding();

            state._fsp--;

             current =iv_ruleBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinding1214); 

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
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:545:1: ruleBinding returns [EObject current=null] : (otherlv_0= 'binds' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:548:28: ( (otherlv_0= 'binds' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' ) )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:549:1: (otherlv_0= 'binds' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' )
            {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:549:1: (otherlv_0= 'binds' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:549:3: otherlv_0= 'binds' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleBinding1251); 

                	newLeafNode(otherlv_0, grammarAccess.getBindingAccess().getBindsKeyword_0());
                
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:553:1: ( (otherlv_1= RULE_ID ) )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:554:1: (otherlv_1= RULE_ID )
            {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:554:1: (otherlv_1= RULE_ID )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:555:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBindingRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBinding1271); 

            		newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getSourceComponentComponentCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleBinding1283); 

                	newLeafNode(otherlv_2, grammarAccess.getBindingAccess().getFullStopKeyword_2());
                
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:570:1: ( (otherlv_3= RULE_ID ) )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:571:1: (otherlv_3= RULE_ID )
            {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:571:1: (otherlv_3= RULE_ID )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:572:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBindingRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBinding1303); 

            		newLeafNode(otherlv_3, grammarAccess.getBindingAccess().getSourceInterfaceRequiredInterfaceCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleBinding1315); 

                	newLeafNode(otherlv_4, grammarAccess.getBindingAccess().getToKeyword_4());
                
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:587:1: ( (otherlv_5= RULE_ID ) )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:588:1: (otherlv_5= RULE_ID )
            {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:588:1: (otherlv_5= RULE_ID )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:589:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBindingRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBinding1335); 

            		newLeafNode(otherlv_5, grammarAccess.getBindingAccess().getTargetComponentComponentCrossReference_5_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleBinding1347); 

                	newLeafNode(otherlv_6, grammarAccess.getBindingAccess().getFullStopKeyword_6());
                
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:604:1: ( (otherlv_7= RULE_ID ) )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:605:1: (otherlv_7= RULE_ID )
            {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:605:1: (otherlv_7= RULE_ID )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:606:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBindingRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBinding1367); 

            		newLeafNode(otherlv_7, grammarAccess.getBindingAccess().getTargetInterfaceProvidedInterfaceCrossReference_7_0()); 
            	

            }


            }

            otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleBinding1379); 

                	newLeafNode(otherlv_8, grammarAccess.getBindingAccess().getSemicolonKeyword_8());
                

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
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleQualifiedName"
    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:629:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:630:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:631:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1416);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1427); 

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
    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:638:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:641:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:642:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:642:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:642:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1467); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:649:1: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../example.components.simple/src-gen/example/components/simple/parser/antlr/internal/InternalSimplifiedADL.g:650:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,22,FOLLOW_22_in_ruleQualifiedName1486); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1501); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
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


 

    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImports_in_ruleDefinition131 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_ruleArchitecture_in_ruleDefinition153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImports_in_entryRuleImports189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImports199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImports236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImports257 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImports269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard364 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedNameWithWildcard383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitecture_in_entryRuleArchitecture425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchitecture435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleArchitecture472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleArchitecture493 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleArchitecture505 = new BitSet(new long[]{0x00000000003B0000L});
    public static final BitSet FOLLOW_ruleArchitectureElements_in_ruleArchitecture526 = new BitSet(new long[]{0x00000000003B0000L});
    public static final BitSet FOLLOW_16_in_ruleArchitecture539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitectureElements_in_entryRuleArchitectureElements575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchitectureElements585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleArchitectureElements632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterface_in_ruleArchitectureElements659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterface_in_ruleArchitectureElements686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_ruleArchitectureElements713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterface_in_entryRuleRequiredInterface748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredInterface758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleRequiredInterface795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRequiredInterface818 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRequiredInterface830 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequiredInterface847 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRequiredInterface864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterface_in_entryRuleProvidedInterface900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvidedInterface910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleProvidedInterface947 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProvidedInterface970 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleProvidedInterface982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvidedInterface999 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProvidedInterface1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent1052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleComponent1099 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleComponent1122 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleComponent1134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent1151 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleComponent1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_entryRuleBinding1204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinding1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBinding1251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBinding1271 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBinding1283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBinding1303 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBinding1315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBinding1335 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBinding1347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBinding1367 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBinding1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1467 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleQualifiedName1486 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1501 = new BitSet(new long[]{0x0000000000400002L});

}