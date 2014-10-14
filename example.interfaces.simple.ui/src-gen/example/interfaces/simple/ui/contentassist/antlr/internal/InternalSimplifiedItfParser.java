package example.interfaces.simple.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import example.interfaces.simple.services.SimplifiedItfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimplifiedItfParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'void'", "'boolean'", "'float'", "'interface'", "'{'", "'}'", "'('", "')'", "';'", "','", "'.'"
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
    public String getGrammarFileName() { return "../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g"; }


     
     	private SimplifiedItfGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SimplifiedItfGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleInterfaceDefinition"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:60:1: entryRuleInterfaceDefinition : ruleInterfaceDefinition EOF ;
    public final void entryRuleInterfaceDefinition() throws RecognitionException {
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:61:1: ( ruleInterfaceDefinition EOF )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:62:1: ruleInterfaceDefinition EOF
            {
             before(grammarAccess.getInterfaceDefinitionRule()); 
            pushFollow(FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition61);
            ruleInterfaceDefinition();

            state._fsp--;

             after(grammarAccess.getInterfaceDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceDefinition68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterfaceDefinition"


    // $ANTLR start "ruleInterfaceDefinition"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:69:1: ruleInterfaceDefinition : ( ( rule__InterfaceDefinition__Group__0 ) ) ;
    public final void ruleInterfaceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:73:2: ( ( ( rule__InterfaceDefinition__Group__0 ) ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:74:1: ( ( rule__InterfaceDefinition__Group__0 ) )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:74:1: ( ( rule__InterfaceDefinition__Group__0 ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:75:1: ( rule__InterfaceDefinition__Group__0 )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getGroup()); 
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:76:1: ( rule__InterfaceDefinition__Group__0 )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:76:2: rule__InterfaceDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__0_in_ruleInterfaceDefinition94);
            rule__InterfaceDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfaceDefinition"


    // $ANTLR start "entryRuleMethod"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:88:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:89:1: ( ruleMethod EOF )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:90:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod121);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:97:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:101:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:102:1: ( ( rule__Method__Group__0 ) )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:102:1: ( ( rule__Method__Group__0 ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:103:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:104:1: ( rule__Method__Group__0 )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:104:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_rule__Method__Group__0_in_ruleMethod154);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleType"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:116:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:117:1: ( ruleType EOF )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:118:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType181);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:125:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:129:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:130:1: ( ( rule__Type__Alternatives ) )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:130:1: ( ( rule__Type__Alternatives ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:131:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:132:1: ( rule__Type__Alternatives )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:132:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType214);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleQualifiedName"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:144:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:145:1: ( ruleQualifiedName EOF )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:146:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName241);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:153:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:157:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:158:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:158:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:159:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:160:1: ( rule__QualifiedName__Group__0 )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:160:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName274);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__Type__Alternatives"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:172:1: rule__Type__Alternatives : ( ( 'int' ) | ( 'void' ) | ( 'boolean' ) | ( 'float' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:176:1: ( ( 'int' ) | ( 'void' ) | ( 'boolean' ) | ( 'float' ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:177:1: ( 'int' )
                    {
                    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:177:1: ( 'int' )
                    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:178:1: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Type__Alternatives311); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:185:6: ( 'void' )
                    {
                    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:185:6: ( 'void' )
                    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:186:1: 'void'
                    {
                     before(grammarAccess.getTypeAccess().getVoidKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Type__Alternatives331); 
                     after(grammarAccess.getTypeAccess().getVoidKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:193:6: ( 'boolean' )
                    {
                    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:193:6: ( 'boolean' )
                    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:194:1: 'boolean'
                    {
                     before(grammarAccess.getTypeAccess().getBooleanKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Type__Alternatives351); 
                     after(grammarAccess.getTypeAccess().getBooleanKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:201:6: ( 'float' )
                    {
                    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:201:6: ( 'float' )
                    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:202:1: 'float'
                    {
                     before(grammarAccess.getTypeAccess().getFloatKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__Type__Alternatives371); 
                     after(grammarAccess.getTypeAccess().getFloatKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__InterfaceDefinition__Group__0"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:216:1: rule__InterfaceDefinition__Group__0 : rule__InterfaceDefinition__Group__0__Impl rule__InterfaceDefinition__Group__1 ;
    public final void rule__InterfaceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:220:1: ( rule__InterfaceDefinition__Group__0__Impl rule__InterfaceDefinition__Group__1 )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:221:2: rule__InterfaceDefinition__Group__0__Impl rule__InterfaceDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__0__Impl_in_rule__InterfaceDefinition__Group__0403);
            rule__InterfaceDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__1_in_rule__InterfaceDefinition__Group__0406);
            rule__InterfaceDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group__0"


    // $ANTLR start "rule__InterfaceDefinition__Group__0__Impl"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:228:1: rule__InterfaceDefinition__Group__0__Impl : ( 'interface' ) ;
    public final void rule__InterfaceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:232:1: ( ( 'interface' ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:233:1: ( 'interface' )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:233:1: ( 'interface' )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:234:1: 'interface'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__InterfaceDefinition__Group__0__Impl434); 
             after(grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group__0__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group__1"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:247:1: rule__InterfaceDefinition__Group__1 : rule__InterfaceDefinition__Group__1__Impl rule__InterfaceDefinition__Group__2 ;
    public final void rule__InterfaceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:251:1: ( rule__InterfaceDefinition__Group__1__Impl rule__InterfaceDefinition__Group__2 )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:252:2: rule__InterfaceDefinition__Group__1__Impl rule__InterfaceDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__1__Impl_in_rule__InterfaceDefinition__Group__1465);
            rule__InterfaceDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__2_in_rule__InterfaceDefinition__Group__1468);
            rule__InterfaceDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group__1"


    // $ANTLR start "rule__InterfaceDefinition__Group__1__Impl"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:259:1: rule__InterfaceDefinition__Group__1__Impl : ( ( rule__InterfaceDefinition__NameAssignment_1 ) ) ;
    public final void rule__InterfaceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:263:1: ( ( ( rule__InterfaceDefinition__NameAssignment_1 ) ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:264:1: ( ( rule__InterfaceDefinition__NameAssignment_1 ) )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:264:1: ( ( rule__InterfaceDefinition__NameAssignment_1 ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:265:1: ( rule__InterfaceDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getNameAssignment_1()); 
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:266:1: ( rule__InterfaceDefinition__NameAssignment_1 )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:266:2: rule__InterfaceDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__InterfaceDefinition__NameAssignment_1_in_rule__InterfaceDefinition__Group__1__Impl495);
            rule__InterfaceDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group__1__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group__2"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:276:1: rule__InterfaceDefinition__Group__2 : rule__InterfaceDefinition__Group__2__Impl rule__InterfaceDefinition__Group__3 ;
    public final void rule__InterfaceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:280:1: ( rule__InterfaceDefinition__Group__2__Impl rule__InterfaceDefinition__Group__3 )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:281:2: rule__InterfaceDefinition__Group__2__Impl rule__InterfaceDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__2__Impl_in_rule__InterfaceDefinition__Group__2525);
            rule__InterfaceDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__3_in_rule__InterfaceDefinition__Group__2528);
            rule__InterfaceDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group__2"


    // $ANTLR start "rule__InterfaceDefinition__Group__2__Impl"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:288:1: rule__InterfaceDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__InterfaceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:292:1: ( ( '{' ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:293:1: ( '{' )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:293:1: ( '{' )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:294:1: '{'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__InterfaceDefinition__Group__2__Impl556); 
             after(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group__2__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group__3"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:307:1: rule__InterfaceDefinition__Group__3 : rule__InterfaceDefinition__Group__3__Impl rule__InterfaceDefinition__Group__4 ;
    public final void rule__InterfaceDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:311:1: ( rule__InterfaceDefinition__Group__3__Impl rule__InterfaceDefinition__Group__4 )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:312:2: rule__InterfaceDefinition__Group__3__Impl rule__InterfaceDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__3__Impl_in_rule__InterfaceDefinition__Group__3587);
            rule__InterfaceDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__4_in_rule__InterfaceDefinition__Group__3590);
            rule__InterfaceDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group__3"


    // $ANTLR start "rule__InterfaceDefinition__Group__3__Impl"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:319:1: rule__InterfaceDefinition__Group__3__Impl : ( ( rule__InterfaceDefinition__MethodsAssignment_3 )* ) ;
    public final void rule__InterfaceDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:323:1: ( ( ( rule__InterfaceDefinition__MethodsAssignment_3 )* ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:324:1: ( ( rule__InterfaceDefinition__MethodsAssignment_3 )* )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:324:1: ( ( rule__InterfaceDefinition__MethodsAssignment_3 )* )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:325:1: ( rule__InterfaceDefinition__MethodsAssignment_3 )*
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getMethodsAssignment_3()); 
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:326:1: ( rule__InterfaceDefinition__MethodsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=11 && LA2_0<=14)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:326:2: rule__InterfaceDefinition__MethodsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__InterfaceDefinition__MethodsAssignment_3_in_rule__InterfaceDefinition__Group__3__Impl617);
            	    rule__InterfaceDefinition__MethodsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getInterfaceDefinitionAccess().getMethodsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group__3__Impl"


    // $ANTLR start "rule__InterfaceDefinition__Group__4"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:336:1: rule__InterfaceDefinition__Group__4 : rule__InterfaceDefinition__Group__4__Impl ;
    public final void rule__InterfaceDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:340:1: ( rule__InterfaceDefinition__Group__4__Impl )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:341:2: rule__InterfaceDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__4__Impl_in_rule__InterfaceDefinition__Group__4648);
            rule__InterfaceDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group__4"


    // $ANTLR start "rule__InterfaceDefinition__Group__4__Impl"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:347:1: rule__InterfaceDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__InterfaceDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:351:1: ( ( '}' ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:352:1: ( '}' )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:352:1: ( '}' )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:353:1: '}'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__InterfaceDefinition__Group__4__Impl676); 
             after(grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:376:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:380:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:381:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__0717);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__0720);
            rule__Method__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:388:1: rule__Method__Group__0__Impl : ( ( rule__Method__ReturnTypeAssignment_0 ) ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:392:1: ( ( ( rule__Method__ReturnTypeAssignment_0 ) ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:393:1: ( ( rule__Method__ReturnTypeAssignment_0 ) )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:393:1: ( ( rule__Method__ReturnTypeAssignment_0 ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:394:1: ( rule__Method__ReturnTypeAssignment_0 )
            {
             before(grammarAccess.getMethodAccess().getReturnTypeAssignment_0()); 
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:395:1: ( rule__Method__ReturnTypeAssignment_0 )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:395:2: rule__Method__ReturnTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Method__ReturnTypeAssignment_0_in_rule__Method__Group__0__Impl747);
            rule__Method__ReturnTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getReturnTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:405:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:409:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:410:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__1777);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__1780);
            rule__Method__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:417:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:421:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:422:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:422:1: ( ( rule__Method__NameAssignment_1 ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:423:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:424:1: ( rule__Method__NameAssignment_1 )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:424:2: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl807);
            rule__Method__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:434:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:438:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:439:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__2837);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__2840);
            rule__Method__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:446:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:450:1: ( ( '(' ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:451:1: ( '(' )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:451:1: ( '(' )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:452:1: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Method__Group__2__Impl868); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:465:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:469:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:470:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__3899);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__3902);
            rule__Method__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:477:1: rule__Method__Group__3__Impl : ( ( rule__Method__TypesListAssignment_3 ) ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:481:1: ( ( ( rule__Method__TypesListAssignment_3 ) ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:482:1: ( ( rule__Method__TypesListAssignment_3 ) )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:482:1: ( ( rule__Method__TypesListAssignment_3 ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:483:1: ( rule__Method__TypesListAssignment_3 )
            {
             before(grammarAccess.getMethodAccess().getTypesListAssignment_3()); 
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:484:1: ( rule__Method__TypesListAssignment_3 )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:484:2: rule__Method__TypesListAssignment_3
            {
            pushFollow(FOLLOW_rule__Method__TypesListAssignment_3_in_rule__Method__Group__3__Impl929);
            rule__Method__TypesListAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getTypesListAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:494:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:498:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:499:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__4959);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__5_in_rule__Method__Group__4962);
            rule__Method__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:506:1: rule__Method__Group__4__Impl : ( ( rule__Method__Group_4__0 )* ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:510:1: ( ( ( rule__Method__Group_4__0 )* ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:511:1: ( ( rule__Method__Group_4__0 )* )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:511:1: ( ( rule__Method__Group_4__0 )* )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:512:1: ( rule__Method__Group_4__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_4()); 
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:513:1: ( rule__Method__Group_4__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:513:2: rule__Method__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Method__Group_4__0_in_rule__Method__Group__4__Impl989);
            	    rule__Method__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:523:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:527:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:528:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__51020);
            rule__Method__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__6_in_rule__Method__Group__51023);
            rule__Method__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:535:1: rule__Method__Group__5__Impl : ( ')' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:539:1: ( ( ')' ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:540:1: ( ')' )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:540:1: ( ')' )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:541:1: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Method__Group__5__Impl1051); 
             after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group__6"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:554:1: rule__Method__Group__6 : rule__Method__Group__6__Impl ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:558:1: ( rule__Method__Group__6__Impl )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:559:2: rule__Method__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group__6__Impl_in_rule__Method__Group__61082);
            rule__Method__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6"


    // $ANTLR start "rule__Method__Group__6__Impl"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:565:1: rule__Method__Group__6__Impl : ( ';' ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:569:1: ( ( ';' ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:570:1: ( ';' )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:570:1: ( ';' )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:571:1: ';'
            {
             before(grammarAccess.getMethodAccess().getSemicolonKeyword_6()); 
            match(input,20,FOLLOW_20_in_rule__Method__Group__6__Impl1110); 
             after(grammarAccess.getMethodAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6__Impl"


    // $ANTLR start "rule__Method__Group_4__0"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:598:1: rule__Method__Group_4__0 : rule__Method__Group_4__0__Impl rule__Method__Group_4__1 ;
    public final void rule__Method__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:602:1: ( rule__Method__Group_4__0__Impl rule__Method__Group_4__1 )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:603:2: rule__Method__Group_4__0__Impl rule__Method__Group_4__1
            {
            pushFollow(FOLLOW_rule__Method__Group_4__0__Impl_in_rule__Method__Group_4__01155);
            rule__Method__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_4__1_in_rule__Method__Group_4__01158);
            rule__Method__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__0"


    // $ANTLR start "rule__Method__Group_4__0__Impl"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:610:1: rule__Method__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:614:1: ( ( ',' ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:615:1: ( ',' )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:615:1: ( ',' )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:616:1: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__Method__Group_4__0__Impl1186); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__0__Impl"


    // $ANTLR start "rule__Method__Group_4__1"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:629:1: rule__Method__Group_4__1 : rule__Method__Group_4__1__Impl ;
    public final void rule__Method__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:633:1: ( rule__Method__Group_4__1__Impl )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:634:2: rule__Method__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_4__1__Impl_in_rule__Method__Group_4__11217);
            rule__Method__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__1"


    // $ANTLR start "rule__Method__Group_4__1__Impl"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:640:1: rule__Method__Group_4__1__Impl : ( ( rule__Method__TypesListAssignment_4_1 ) ) ;
    public final void rule__Method__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:644:1: ( ( ( rule__Method__TypesListAssignment_4_1 ) ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:645:1: ( ( rule__Method__TypesListAssignment_4_1 ) )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:645:1: ( ( rule__Method__TypesListAssignment_4_1 ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:646:1: ( rule__Method__TypesListAssignment_4_1 )
            {
             before(grammarAccess.getMethodAccess().getTypesListAssignment_4_1()); 
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:647:1: ( rule__Method__TypesListAssignment_4_1 )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:647:2: rule__Method__TypesListAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Method__TypesListAssignment_4_1_in_rule__Method__Group_4__1__Impl1244);
            rule__Method__TypesListAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getTypesListAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:661:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:665:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:666:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01278);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01281);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:673:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:677:1: ( ( RULE_ID ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:678:1: ( RULE_ID )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:678:1: ( RULE_ID )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:679:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1308); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:690:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:694:1: ( rule__QualifiedName__Group__1__Impl )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:695:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11337);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:701:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:705:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:706:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:706:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:707:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:708:1: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:708:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1364);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:722:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:726:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:727:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01399);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01402);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:734:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:738:1: ( ( '.' ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:739:1: ( '.' )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:739:1: ( '.' )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:740:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__QualifiedName__Group_1__0__Impl1430); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:753:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:757:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:758:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11461);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:764:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:768:1: ( ( RULE_ID ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:769:1: ( RULE_ID )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:769:1: ( RULE_ID )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:770:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1488); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__InterfaceDefinition__NameAssignment_1"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:786:1: rule__InterfaceDefinition__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__InterfaceDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:790:1: ( ( ruleQualifiedName ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:791:1: ( ruleQualifiedName )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:791:1: ( ruleQualifiedName )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:792:1: ruleQualifiedName
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__InterfaceDefinition__NameAssignment_11526);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getInterfaceDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__NameAssignment_1"


    // $ANTLR start "rule__InterfaceDefinition__MethodsAssignment_3"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:801:1: rule__InterfaceDefinition__MethodsAssignment_3 : ( ruleMethod ) ;
    public final void rule__InterfaceDefinition__MethodsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:805:1: ( ( ruleMethod ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:806:1: ( ruleMethod )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:806:1: ( ruleMethod )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:807:1: ruleMethod
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getMethodsMethodParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__InterfaceDefinition__MethodsAssignment_31557);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getInterfaceDefinitionAccess().getMethodsMethodParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDefinition__MethodsAssignment_3"


    // $ANTLR start "rule__Method__ReturnTypeAssignment_0"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:816:1: rule__Method__ReturnTypeAssignment_0 : ( ruleType ) ;
    public final void rule__Method__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:820:1: ( ( ruleType ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:821:1: ( ruleType )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:821:1: ( ruleType )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:822:1: ruleType
            {
             before(grammarAccess.getMethodAccess().getReturnTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Method__ReturnTypeAssignment_01588);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getReturnTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ReturnTypeAssignment_0"


    // $ANTLR start "rule__Method__NameAssignment_1"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:831:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:835:1: ( ( RULE_ID ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:836:1: ( RULE_ID )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:836:1: ( RULE_ID )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:837:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__NameAssignment_11619); 
             after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_1"


    // $ANTLR start "rule__Method__TypesListAssignment_3"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:846:1: rule__Method__TypesListAssignment_3 : ( ruleType ) ;
    public final void rule__Method__TypesListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:850:1: ( ( ruleType ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:851:1: ( ruleType )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:851:1: ( ruleType )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:852:1: ruleType
            {
             before(grammarAccess.getMethodAccess().getTypesListTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Method__TypesListAssignment_31650);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getTypesListTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__TypesListAssignment_3"


    // $ANTLR start "rule__Method__TypesListAssignment_4_1"
    // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:861:1: rule__Method__TypesListAssignment_4_1 : ( ruleType ) ;
    public final void rule__Method__TypesListAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:865:1: ( ( ruleType ) )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:866:1: ( ruleType )
            {
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:866:1: ( ruleType )
            // ../example.interfaces.simple.ui/src-gen/example/interfaces/simple/ui/contentassist/antlr/internal/InternalSimplifiedItf.g:867:1: ruleType
            {
             before(grammarAccess.getMethodAccess().getTypesListTypeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Method__TypesListAssignment_4_11681);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getTypesListTypeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__TypesListAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__0_in_ruleInterfaceDefinition94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Type__Alternatives311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Type__Alternatives331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Type__Alternatives351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type__Alternatives371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__0__Impl_in_rule__InterfaceDefinition__Group__0403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__1_in_rule__InterfaceDefinition__Group__0406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__InterfaceDefinition__Group__0__Impl434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__1__Impl_in_rule__InterfaceDefinition__Group__1465 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__2_in_rule__InterfaceDefinition__Group__1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__NameAssignment_1_in_rule__InterfaceDefinition__Group__1__Impl495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__2__Impl_in_rule__InterfaceDefinition__Group__2525 = new BitSet(new long[]{0x0000000000027800L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__3_in_rule__InterfaceDefinition__Group__2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__InterfaceDefinition__Group__2__Impl556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__3__Impl_in_rule__InterfaceDefinition__Group__3587 = new BitSet(new long[]{0x0000000000027800L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__4_in_rule__InterfaceDefinition__Group__3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__MethodsAssignment_3_in_rule__InterfaceDefinition__Group__3__Impl617 = new BitSet(new long[]{0x0000000000007802L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__4__Impl_in_rule__InterfaceDefinition__Group__4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__InterfaceDefinition__Group__4__Impl676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__0717 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__0720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ReturnTypeAssignment_0_in_rule__Method__Group__0__Impl747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__1777 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__2837 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Method__Group__2__Impl868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__3899 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__TypesListAssignment_3_in_rule__Method__Group__3__Impl929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__4959 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Method__Group__5_in_rule__Method__Group__4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_4__0_in_rule__Method__Group__4__Impl989 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__51020 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Method__Group__6_in_rule__Method__Group__51023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Method__Group__5__Impl1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__6__Impl_in_rule__Method__Group__61082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Method__Group__6__Impl1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_4__0__Impl_in_rule__Method__Group_4__01155 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__Method__Group_4__1_in_rule__Method__Group_4__01158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Method__Group_4__0__Impl1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_4__1__Impl_in_rule__Method__Group_4__11217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__TypesListAssignment_4_1_in_rule__Method__Group_4__1__Impl1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01278 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1364 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__QualifiedName__Group_1__0__Impl1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__InterfaceDefinition__NameAssignment_11526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__InterfaceDefinition__MethodsAssignment_31557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Method__ReturnTypeAssignment_01588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__NameAssignment_11619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Method__TypesListAssignment_31650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Method__TypesListAssignment_4_11681 = new BitSet(new long[]{0x0000000000000002L});

}