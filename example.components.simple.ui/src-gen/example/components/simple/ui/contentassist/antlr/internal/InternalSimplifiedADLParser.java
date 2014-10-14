package example.components.simple.ui.contentassist.antlr.internal; 

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
import example.components.simple.services.SimplifiedADLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimplifiedADLParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g"; }


     
     	private SimplifiedADLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SimplifiedADLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleDefinition"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:60:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:61:1: ( ruleDefinition EOF )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:62:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition61);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition68); 

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:69:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:73:2: ( ( ( rule__Definition__Group__0 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:74:1: ( ( rule__Definition__Group__0 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:74:1: ( ( rule__Definition__Group__0 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:75:1: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:76:1: ( rule__Definition__Group__0 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:76:2: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_rule__Definition__Group__0_in_ruleDefinition94);
            rule__Definition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleImports"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:88:1: entryRuleImports : ruleImports EOF ;
    public final void entryRuleImports() throws RecognitionException {
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:89:1: ( ruleImports EOF )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:90:1: ruleImports EOF
            {
             before(grammarAccess.getImportsRule()); 
            pushFollow(FOLLOW_ruleImports_in_entryRuleImports121);
            ruleImports();

            state._fsp--;

             after(grammarAccess.getImportsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImports128); 

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
    // $ANTLR end "entryRuleImports"


    // $ANTLR start "ruleImports"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:97:1: ruleImports : ( ( rule__Imports__Group__0 ) ) ;
    public final void ruleImports() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:101:2: ( ( ( rule__Imports__Group__0 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:102:1: ( ( rule__Imports__Group__0 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:102:1: ( ( rule__Imports__Group__0 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:103:1: ( rule__Imports__Group__0 )
            {
             before(grammarAccess.getImportsAccess().getGroup()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:104:1: ( rule__Imports__Group__0 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:104:2: rule__Imports__Group__0
            {
            pushFollow(FOLLOW_rule__Imports__Group__0_in_ruleImports154);
            rule__Imports__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportsAccess().getGroup()); 

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
    // $ANTLR end "ruleImports"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:116:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:117:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:118:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard181);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard188); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:125:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:129:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:130:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:130:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:131:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:132:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:132:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard214);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleArchitecture"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:144:1: entryRuleArchitecture : ruleArchitecture EOF ;
    public final void entryRuleArchitecture() throws RecognitionException {
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:145:1: ( ruleArchitecture EOF )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:146:1: ruleArchitecture EOF
            {
             before(grammarAccess.getArchitectureRule()); 
            pushFollow(FOLLOW_ruleArchitecture_in_entryRuleArchitecture241);
            ruleArchitecture();

            state._fsp--;

             after(grammarAccess.getArchitectureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArchitecture248); 

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
    // $ANTLR end "entryRuleArchitecture"


    // $ANTLR start "ruleArchitecture"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:153:1: ruleArchitecture : ( ( rule__Architecture__Group__0 ) ) ;
    public final void ruleArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:157:2: ( ( ( rule__Architecture__Group__0 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:158:1: ( ( rule__Architecture__Group__0 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:158:1: ( ( rule__Architecture__Group__0 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:159:1: ( rule__Architecture__Group__0 )
            {
             before(grammarAccess.getArchitectureAccess().getGroup()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:160:1: ( rule__Architecture__Group__0 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:160:2: rule__Architecture__Group__0
            {
            pushFollow(FOLLOW_rule__Architecture__Group__0_in_ruleArchitecture274);
            rule__Architecture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getGroup()); 

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
    // $ANTLR end "ruleArchitecture"


    // $ANTLR start "entryRuleRequiredInterface"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:172:1: entryRuleRequiredInterface : ruleRequiredInterface EOF ;
    public final void entryRuleRequiredInterface() throws RecognitionException {
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:173:1: ( ruleRequiredInterface EOF )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:174:1: ruleRequiredInterface EOF
            {
             before(grammarAccess.getRequiredInterfaceRule()); 
            pushFollow(FOLLOW_ruleRequiredInterface_in_entryRuleRequiredInterface301);
            ruleRequiredInterface();

            state._fsp--;

             after(grammarAccess.getRequiredInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredInterface308); 

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
    // $ANTLR end "entryRuleRequiredInterface"


    // $ANTLR start "ruleRequiredInterface"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:181:1: ruleRequiredInterface : ( ( rule__RequiredInterface__Group__0 ) ) ;
    public final void ruleRequiredInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:185:2: ( ( ( rule__RequiredInterface__Group__0 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:186:1: ( ( rule__RequiredInterface__Group__0 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:186:1: ( ( rule__RequiredInterface__Group__0 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:187:1: ( rule__RequiredInterface__Group__0 )
            {
             before(grammarAccess.getRequiredInterfaceAccess().getGroup()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:188:1: ( rule__RequiredInterface__Group__0 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:188:2: rule__RequiredInterface__Group__0
            {
            pushFollow(FOLLOW_rule__RequiredInterface__Group__0_in_ruleRequiredInterface334);
            rule__RequiredInterface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequiredInterfaceAccess().getGroup()); 

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
    // $ANTLR end "ruleRequiredInterface"


    // $ANTLR start "entryRuleProvidedInterface"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:200:1: entryRuleProvidedInterface : ruleProvidedInterface EOF ;
    public final void entryRuleProvidedInterface() throws RecognitionException {
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:201:1: ( ruleProvidedInterface EOF )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:202:1: ruleProvidedInterface EOF
            {
             before(grammarAccess.getProvidedInterfaceRule()); 
            pushFollow(FOLLOW_ruleProvidedInterface_in_entryRuleProvidedInterface361);
            ruleProvidedInterface();

            state._fsp--;

             after(grammarAccess.getProvidedInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvidedInterface368); 

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
    // $ANTLR end "entryRuleProvidedInterface"


    // $ANTLR start "ruleProvidedInterface"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:209:1: ruleProvidedInterface : ( ( rule__ProvidedInterface__Group__0 ) ) ;
    public final void ruleProvidedInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:213:2: ( ( ( rule__ProvidedInterface__Group__0 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:214:1: ( ( rule__ProvidedInterface__Group__0 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:214:1: ( ( rule__ProvidedInterface__Group__0 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:215:1: ( rule__ProvidedInterface__Group__0 )
            {
             before(grammarAccess.getProvidedInterfaceAccess().getGroup()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:216:1: ( rule__ProvidedInterface__Group__0 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:216:2: rule__ProvidedInterface__Group__0
            {
            pushFollow(FOLLOW_rule__ProvidedInterface__Group__0_in_ruleProvidedInterface394);
            rule__ProvidedInterface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProvidedInterfaceAccess().getGroup()); 

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
    // $ANTLR end "ruleProvidedInterface"


    // $ANTLR start "entryRuleComponent"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:228:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:229:1: ( ruleComponent EOF )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:230:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent421);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent428); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:237:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:241:2: ( ( ( rule__Component__Group__0 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:242:1: ( ( rule__Component__Group__0 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:242:1: ( ( rule__Component__Group__0 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:243:1: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:244:1: ( rule__Component__Group__0 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:244:2: rule__Component__Group__0
            {
            pushFollow(FOLLOW_rule__Component__Group__0_in_ruleComponent454);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleBinding"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:256:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:257:1: ( ruleBinding EOF )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:258:1: ruleBinding EOF
            {
             before(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_ruleBinding_in_entryRuleBinding481);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getBindingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinding488); 

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
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:265:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:269:2: ( ( ( rule__Binding__Group__0 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:270:1: ( ( rule__Binding__Group__0 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:270:1: ( ( rule__Binding__Group__0 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:271:1: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:272:1: ( rule__Binding__Group__0 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:272:2: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_rule__Binding__Group__0_in_ruleBinding514);
            rule__Binding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getGroup()); 

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
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleQualifiedName"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:284:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:285:1: ( ruleQualifiedName EOF )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:286:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName541);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName548); 

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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:293:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:297:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:298:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:298:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:299:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:300:1: ( rule__QualifiedName__Group__0 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:300:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName574);
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


    // $ANTLR start "rule__Architecture__ElementsAlternatives_3_0"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:312:1: rule__Architecture__ElementsAlternatives_3_0 : ( ( ruleComponent ) | ( ruleProvidedInterface ) | ( ruleRequiredInterface ) | ( ruleBinding ) );
    public final void rule__Architecture__ElementsAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:316:1: ( ( ruleComponent ) | ( ruleProvidedInterface ) | ( ruleRequiredInterface ) | ( ruleBinding ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 17:
                {
                alt1=3;
                }
                break;
            case 21:
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
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:317:1: ( ruleComponent )
                    {
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:317:1: ( ruleComponent )
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:318:1: ruleComponent
                    {
                     before(grammarAccess.getArchitectureAccess().getElementsComponentParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_ruleComponent_in_rule__Architecture__ElementsAlternatives_3_0610);
                    ruleComponent();

                    state._fsp--;

                     after(grammarAccess.getArchitectureAccess().getElementsComponentParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:323:6: ( ruleProvidedInterface )
                    {
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:323:6: ( ruleProvidedInterface )
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:324:1: ruleProvidedInterface
                    {
                     before(grammarAccess.getArchitectureAccess().getElementsProvidedInterfaceParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_ruleProvidedInterface_in_rule__Architecture__ElementsAlternatives_3_0627);
                    ruleProvidedInterface();

                    state._fsp--;

                     after(grammarAccess.getArchitectureAccess().getElementsProvidedInterfaceParserRuleCall_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:329:6: ( ruleRequiredInterface )
                    {
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:329:6: ( ruleRequiredInterface )
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:330:1: ruleRequiredInterface
                    {
                     before(grammarAccess.getArchitectureAccess().getElementsRequiredInterfaceParserRuleCall_3_0_2()); 
                    pushFollow(FOLLOW_ruleRequiredInterface_in_rule__Architecture__ElementsAlternatives_3_0644);
                    ruleRequiredInterface();

                    state._fsp--;

                     after(grammarAccess.getArchitectureAccess().getElementsRequiredInterfaceParserRuleCall_3_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:335:6: ( ruleBinding )
                    {
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:335:6: ( ruleBinding )
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:336:1: ruleBinding
                    {
                     before(grammarAccess.getArchitectureAccess().getElementsBindingParserRuleCall_3_0_3()); 
                    pushFollow(FOLLOW_ruleBinding_in_rule__Architecture__ElementsAlternatives_3_0661);
                    ruleBinding();

                    state._fsp--;

                     after(grammarAccess.getArchitectureAccess().getElementsBindingParserRuleCall_3_0_3()); 

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
    // $ANTLR end "rule__Architecture__ElementsAlternatives_3_0"


    // $ANTLR start "rule__Definition__Group__0"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:348:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:352:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:353:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__0691);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__0694);
            rule__Definition__Group__1();

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
    // $ANTLR end "rule__Definition__Group__0"


    // $ANTLR start "rule__Definition__Group__0__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:360:1: rule__Definition__Group__0__Impl : ( ( rule__Definition__ImportsAssignment_0 )* ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:364:1: ( ( ( rule__Definition__ImportsAssignment_0 )* ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:365:1: ( ( rule__Definition__ImportsAssignment_0 )* )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:365:1: ( ( rule__Definition__ImportsAssignment_0 )* )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:366:1: ( rule__Definition__ImportsAssignment_0 )*
            {
             before(grammarAccess.getDefinitionAccess().getImportsAssignment_0()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:367:1: ( rule__Definition__ImportsAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:367:2: rule__Definition__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Definition__ImportsAssignment_0_in_rule__Definition__Group__0__Impl721);
            	    rule__Definition__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getDefinitionAccess().getImportsAssignment_0()); 

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
    // $ANTLR end "rule__Definition__Group__0__Impl"


    // $ANTLR start "rule__Definition__Group__1"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:377:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:381:1: ( rule__Definition__Group__1__Impl )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:382:2: rule__Definition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__1752);
            rule__Definition__Group__1__Impl();

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
    // $ANTLR end "rule__Definition__Group__1"


    // $ANTLR start "rule__Definition__Group__1__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:388:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__ArchitectureAssignment_1 ) ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:392:1: ( ( ( rule__Definition__ArchitectureAssignment_1 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:393:1: ( ( rule__Definition__ArchitectureAssignment_1 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:393:1: ( ( rule__Definition__ArchitectureAssignment_1 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:394:1: ( rule__Definition__ArchitectureAssignment_1 )
            {
             before(grammarAccess.getDefinitionAccess().getArchitectureAssignment_1()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:395:1: ( rule__Definition__ArchitectureAssignment_1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:395:2: rule__Definition__ArchitectureAssignment_1
            {
            pushFollow(FOLLOW_rule__Definition__ArchitectureAssignment_1_in_rule__Definition__Group__1__Impl779);
            rule__Definition__ArchitectureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getArchitectureAssignment_1()); 

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
    // $ANTLR end "rule__Definition__Group__1__Impl"


    // $ANTLR start "rule__Imports__Group__0"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:409:1: rule__Imports__Group__0 : rule__Imports__Group__0__Impl rule__Imports__Group__1 ;
    public final void rule__Imports__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:413:1: ( rule__Imports__Group__0__Impl rule__Imports__Group__1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:414:2: rule__Imports__Group__0__Impl rule__Imports__Group__1
            {
            pushFollow(FOLLOW_rule__Imports__Group__0__Impl_in_rule__Imports__Group__0813);
            rule__Imports__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Imports__Group__1_in_rule__Imports__Group__0816);
            rule__Imports__Group__1();

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
    // $ANTLR end "rule__Imports__Group__0"


    // $ANTLR start "rule__Imports__Group__0__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:421:1: rule__Imports__Group__0__Impl : ( 'import' ) ;
    public final void rule__Imports__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:425:1: ( ( 'import' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:426:1: ( 'import' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:426:1: ( 'import' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:427:1: 'import'
            {
             before(grammarAccess.getImportsAccess().getImportKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Imports__Group__0__Impl844); 
             after(grammarAccess.getImportsAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Imports__Group__0__Impl"


    // $ANTLR start "rule__Imports__Group__1"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:440:1: rule__Imports__Group__1 : rule__Imports__Group__1__Impl rule__Imports__Group__2 ;
    public final void rule__Imports__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:444:1: ( rule__Imports__Group__1__Impl rule__Imports__Group__2 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:445:2: rule__Imports__Group__1__Impl rule__Imports__Group__2
            {
            pushFollow(FOLLOW_rule__Imports__Group__1__Impl_in_rule__Imports__Group__1875);
            rule__Imports__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Imports__Group__2_in_rule__Imports__Group__1878);
            rule__Imports__Group__2();

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
    // $ANTLR end "rule__Imports__Group__1"


    // $ANTLR start "rule__Imports__Group__1__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:452:1: rule__Imports__Group__1__Impl : ( ( rule__Imports__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Imports__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:456:1: ( ( ( rule__Imports__ImportedNamespaceAssignment_1 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:457:1: ( ( rule__Imports__ImportedNamespaceAssignment_1 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:457:1: ( ( rule__Imports__ImportedNamespaceAssignment_1 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:458:1: ( rule__Imports__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportsAccess().getImportedNamespaceAssignment_1()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:459:1: ( rule__Imports__ImportedNamespaceAssignment_1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:459:2: rule__Imports__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Imports__ImportedNamespaceAssignment_1_in_rule__Imports__Group__1__Impl905);
            rule__Imports__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportsAccess().getImportedNamespaceAssignment_1()); 

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
    // $ANTLR end "rule__Imports__Group__1__Impl"


    // $ANTLR start "rule__Imports__Group__2"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:469:1: rule__Imports__Group__2 : rule__Imports__Group__2__Impl ;
    public final void rule__Imports__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:473:1: ( rule__Imports__Group__2__Impl )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:474:2: rule__Imports__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Imports__Group__2__Impl_in_rule__Imports__Group__2935);
            rule__Imports__Group__2__Impl();

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
    // $ANTLR end "rule__Imports__Group__2"


    // $ANTLR start "rule__Imports__Group__2__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:480:1: rule__Imports__Group__2__Impl : ( ';' ) ;
    public final void rule__Imports__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:484:1: ( ( ';' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:485:1: ( ';' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:485:1: ( ';' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:486:1: ';'
            {
             before(grammarAccess.getImportsAccess().getSemicolonKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Imports__Group__2__Impl963); 
             after(grammarAccess.getImportsAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__Imports__Group__2__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:505:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:509:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:510:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__01000);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__01003);
            rule__QualifiedNameWithWildcard__Group__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:517:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:521:1: ( ( ruleQualifiedName ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:522:1: ( ruleQualifiedName )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:522:1: ( ruleQualifiedName )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:523:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl1030);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:534:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:538:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:539:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__11059);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:545:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:549:1: ( ( ( '.*' )? ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:550:1: ( ( '.*' )? )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:550:1: ( ( '.*' )? )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:551:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:552:1: ( '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:553:2: '.*'
                    {
                    match(input,13,FOLLOW_13_in_rule__QualifiedNameWithWildcard__Group__1__Impl1088); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__Architecture__Group__0"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:568:1: rule__Architecture__Group__0 : rule__Architecture__Group__0__Impl rule__Architecture__Group__1 ;
    public final void rule__Architecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:572:1: ( rule__Architecture__Group__0__Impl rule__Architecture__Group__1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:573:2: rule__Architecture__Group__0__Impl rule__Architecture__Group__1
            {
            pushFollow(FOLLOW_rule__Architecture__Group__0__Impl_in_rule__Architecture__Group__01125);
            rule__Architecture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Architecture__Group__1_in_rule__Architecture__Group__01128);
            rule__Architecture__Group__1();

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
    // $ANTLR end "rule__Architecture__Group__0"


    // $ANTLR start "rule__Architecture__Group__0__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:580:1: rule__Architecture__Group__0__Impl : ( 'component' ) ;
    public final void rule__Architecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:584:1: ( ( 'component' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:585:1: ( 'component' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:585:1: ( 'component' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:586:1: 'component'
            {
             before(grammarAccess.getArchitectureAccess().getComponentKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Architecture__Group__0__Impl1156); 
             after(grammarAccess.getArchitectureAccess().getComponentKeyword_0()); 

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
    // $ANTLR end "rule__Architecture__Group__0__Impl"


    // $ANTLR start "rule__Architecture__Group__1"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:599:1: rule__Architecture__Group__1 : rule__Architecture__Group__1__Impl rule__Architecture__Group__2 ;
    public final void rule__Architecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:603:1: ( rule__Architecture__Group__1__Impl rule__Architecture__Group__2 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:604:2: rule__Architecture__Group__1__Impl rule__Architecture__Group__2
            {
            pushFollow(FOLLOW_rule__Architecture__Group__1__Impl_in_rule__Architecture__Group__11187);
            rule__Architecture__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Architecture__Group__2_in_rule__Architecture__Group__11190);
            rule__Architecture__Group__2();

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
    // $ANTLR end "rule__Architecture__Group__1"


    // $ANTLR start "rule__Architecture__Group__1__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:611:1: rule__Architecture__Group__1__Impl : ( ( rule__Architecture__NameAssignment_1 ) ) ;
    public final void rule__Architecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:615:1: ( ( ( rule__Architecture__NameAssignment_1 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:616:1: ( ( rule__Architecture__NameAssignment_1 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:616:1: ( ( rule__Architecture__NameAssignment_1 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:617:1: ( rule__Architecture__NameAssignment_1 )
            {
             before(grammarAccess.getArchitectureAccess().getNameAssignment_1()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:618:1: ( rule__Architecture__NameAssignment_1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:618:2: rule__Architecture__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Architecture__NameAssignment_1_in_rule__Architecture__Group__1__Impl1217);
            rule__Architecture__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Architecture__Group__1__Impl"


    // $ANTLR start "rule__Architecture__Group__2"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:628:1: rule__Architecture__Group__2 : rule__Architecture__Group__2__Impl rule__Architecture__Group__3 ;
    public final void rule__Architecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:632:1: ( rule__Architecture__Group__2__Impl rule__Architecture__Group__3 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:633:2: rule__Architecture__Group__2__Impl rule__Architecture__Group__3
            {
            pushFollow(FOLLOW_rule__Architecture__Group__2__Impl_in_rule__Architecture__Group__21247);
            rule__Architecture__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Architecture__Group__3_in_rule__Architecture__Group__21250);
            rule__Architecture__Group__3();

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
    // $ANTLR end "rule__Architecture__Group__2"


    // $ANTLR start "rule__Architecture__Group__2__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:640:1: rule__Architecture__Group__2__Impl : ( '{' ) ;
    public final void rule__Architecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:644:1: ( ( '{' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:645:1: ( '{' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:645:1: ( '{' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:646:1: '{'
            {
             before(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Architecture__Group__2__Impl1278); 
             after(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Architecture__Group__2__Impl"


    // $ANTLR start "rule__Architecture__Group__3"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:659:1: rule__Architecture__Group__3 : rule__Architecture__Group__3__Impl rule__Architecture__Group__4 ;
    public final void rule__Architecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:663:1: ( rule__Architecture__Group__3__Impl rule__Architecture__Group__4 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:664:2: rule__Architecture__Group__3__Impl rule__Architecture__Group__4
            {
            pushFollow(FOLLOW_rule__Architecture__Group__3__Impl_in_rule__Architecture__Group__31309);
            rule__Architecture__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Architecture__Group__4_in_rule__Architecture__Group__31312);
            rule__Architecture__Group__4();

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
    // $ANTLR end "rule__Architecture__Group__3"


    // $ANTLR start "rule__Architecture__Group__3__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:671:1: rule__Architecture__Group__3__Impl : ( ( rule__Architecture__ElementsAssignment_3 )* ) ;
    public final void rule__Architecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:675:1: ( ( ( rule__Architecture__ElementsAssignment_3 )* ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:676:1: ( ( rule__Architecture__ElementsAssignment_3 )* )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:676:1: ( ( rule__Architecture__ElementsAssignment_3 )* )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:677:1: ( rule__Architecture__ElementsAssignment_3 )*
            {
             before(grammarAccess.getArchitectureAccess().getElementsAssignment_3()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:678:1: ( rule__Architecture__ElementsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17||(LA4_0>=19 && LA4_0<=21)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:678:2: rule__Architecture__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Architecture__ElementsAssignment_3_in_rule__Architecture__Group__3__Impl1339);
            	    rule__Architecture__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getArchitectureAccess().getElementsAssignment_3()); 

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
    // $ANTLR end "rule__Architecture__Group__3__Impl"


    // $ANTLR start "rule__Architecture__Group__4"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:688:1: rule__Architecture__Group__4 : rule__Architecture__Group__4__Impl ;
    public final void rule__Architecture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:692:1: ( rule__Architecture__Group__4__Impl )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:693:2: rule__Architecture__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Architecture__Group__4__Impl_in_rule__Architecture__Group__41370);
            rule__Architecture__Group__4__Impl();

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
    // $ANTLR end "rule__Architecture__Group__4"


    // $ANTLR start "rule__Architecture__Group__4__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:699:1: rule__Architecture__Group__4__Impl : ( '}' ) ;
    public final void rule__Architecture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:703:1: ( ( '}' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:704:1: ( '}' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:704:1: ( '}' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:705:1: '}'
            {
             before(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Architecture__Group__4__Impl1398); 
             after(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Architecture__Group__4__Impl"


    // $ANTLR start "rule__RequiredInterface__Group__0"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:728:1: rule__RequiredInterface__Group__0 : rule__RequiredInterface__Group__0__Impl rule__RequiredInterface__Group__1 ;
    public final void rule__RequiredInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:732:1: ( rule__RequiredInterface__Group__0__Impl rule__RequiredInterface__Group__1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:733:2: rule__RequiredInterface__Group__0__Impl rule__RequiredInterface__Group__1
            {
            pushFollow(FOLLOW_rule__RequiredInterface__Group__0__Impl_in_rule__RequiredInterface__Group__01439);
            rule__RequiredInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredInterface__Group__1_in_rule__RequiredInterface__Group__01442);
            rule__RequiredInterface__Group__1();

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
    // $ANTLR end "rule__RequiredInterface__Group__0"


    // $ANTLR start "rule__RequiredInterface__Group__0__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:740:1: rule__RequiredInterface__Group__0__Impl : ( 'requires' ) ;
    public final void rule__RequiredInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:744:1: ( ( 'requires' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:745:1: ( 'requires' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:745:1: ( 'requires' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:746:1: 'requires'
            {
             before(grammarAccess.getRequiredInterfaceAccess().getRequiresKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__RequiredInterface__Group__0__Impl1470); 
             after(grammarAccess.getRequiredInterfaceAccess().getRequiresKeyword_0()); 

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
    // $ANTLR end "rule__RequiredInterface__Group__0__Impl"


    // $ANTLR start "rule__RequiredInterface__Group__1"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:759:1: rule__RequiredInterface__Group__1 : rule__RequiredInterface__Group__1__Impl rule__RequiredInterface__Group__2 ;
    public final void rule__RequiredInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:763:1: ( rule__RequiredInterface__Group__1__Impl rule__RequiredInterface__Group__2 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:764:2: rule__RequiredInterface__Group__1__Impl rule__RequiredInterface__Group__2
            {
            pushFollow(FOLLOW_rule__RequiredInterface__Group__1__Impl_in_rule__RequiredInterface__Group__11501);
            rule__RequiredInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredInterface__Group__2_in_rule__RequiredInterface__Group__11504);
            rule__RequiredInterface__Group__2();

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
    // $ANTLR end "rule__RequiredInterface__Group__1"


    // $ANTLR start "rule__RequiredInterface__Group__1__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:771:1: rule__RequiredInterface__Group__1__Impl : ( ( rule__RequiredInterface__TypeAssignment_1 ) ) ;
    public final void rule__RequiredInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:775:1: ( ( ( rule__RequiredInterface__TypeAssignment_1 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:776:1: ( ( rule__RequiredInterface__TypeAssignment_1 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:776:1: ( ( rule__RequiredInterface__TypeAssignment_1 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:777:1: ( rule__RequiredInterface__TypeAssignment_1 )
            {
             before(grammarAccess.getRequiredInterfaceAccess().getTypeAssignment_1()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:778:1: ( rule__RequiredInterface__TypeAssignment_1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:778:2: rule__RequiredInterface__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__RequiredInterface__TypeAssignment_1_in_rule__RequiredInterface__Group__1__Impl1531);
            rule__RequiredInterface__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequiredInterfaceAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__RequiredInterface__Group__1__Impl"


    // $ANTLR start "rule__RequiredInterface__Group__2"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:788:1: rule__RequiredInterface__Group__2 : rule__RequiredInterface__Group__2__Impl rule__RequiredInterface__Group__3 ;
    public final void rule__RequiredInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:792:1: ( rule__RequiredInterface__Group__2__Impl rule__RequiredInterface__Group__3 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:793:2: rule__RequiredInterface__Group__2__Impl rule__RequiredInterface__Group__3
            {
            pushFollow(FOLLOW_rule__RequiredInterface__Group__2__Impl_in_rule__RequiredInterface__Group__21561);
            rule__RequiredInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredInterface__Group__3_in_rule__RequiredInterface__Group__21564);
            rule__RequiredInterface__Group__3();

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
    // $ANTLR end "rule__RequiredInterface__Group__2"


    // $ANTLR start "rule__RequiredInterface__Group__2__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:800:1: rule__RequiredInterface__Group__2__Impl : ( 'as' ) ;
    public final void rule__RequiredInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:804:1: ( ( 'as' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:805:1: ( 'as' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:805:1: ( 'as' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:806:1: 'as'
            {
             before(grammarAccess.getRequiredInterfaceAccess().getAsKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__RequiredInterface__Group__2__Impl1592); 
             after(grammarAccess.getRequiredInterfaceAccess().getAsKeyword_2()); 

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
    // $ANTLR end "rule__RequiredInterface__Group__2__Impl"


    // $ANTLR start "rule__RequiredInterface__Group__3"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:819:1: rule__RequiredInterface__Group__3 : rule__RequiredInterface__Group__3__Impl rule__RequiredInterface__Group__4 ;
    public final void rule__RequiredInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:823:1: ( rule__RequiredInterface__Group__3__Impl rule__RequiredInterface__Group__4 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:824:2: rule__RequiredInterface__Group__3__Impl rule__RequiredInterface__Group__4
            {
            pushFollow(FOLLOW_rule__RequiredInterface__Group__3__Impl_in_rule__RequiredInterface__Group__31623);
            rule__RequiredInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredInterface__Group__4_in_rule__RequiredInterface__Group__31626);
            rule__RequiredInterface__Group__4();

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
    // $ANTLR end "rule__RequiredInterface__Group__3"


    // $ANTLR start "rule__RequiredInterface__Group__3__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:831:1: rule__RequiredInterface__Group__3__Impl : ( ( rule__RequiredInterface__NameAssignment_3 ) ) ;
    public final void rule__RequiredInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:835:1: ( ( ( rule__RequiredInterface__NameAssignment_3 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:836:1: ( ( rule__RequiredInterface__NameAssignment_3 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:836:1: ( ( rule__RequiredInterface__NameAssignment_3 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:837:1: ( rule__RequiredInterface__NameAssignment_3 )
            {
             before(grammarAccess.getRequiredInterfaceAccess().getNameAssignment_3()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:838:1: ( rule__RequiredInterface__NameAssignment_3 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:838:2: rule__RequiredInterface__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__RequiredInterface__NameAssignment_3_in_rule__RequiredInterface__Group__3__Impl1653);
            rule__RequiredInterface__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRequiredInterfaceAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__RequiredInterface__Group__3__Impl"


    // $ANTLR start "rule__RequiredInterface__Group__4"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:848:1: rule__RequiredInterface__Group__4 : rule__RequiredInterface__Group__4__Impl ;
    public final void rule__RequiredInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:852:1: ( rule__RequiredInterface__Group__4__Impl )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:853:2: rule__RequiredInterface__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RequiredInterface__Group__4__Impl_in_rule__RequiredInterface__Group__41683);
            rule__RequiredInterface__Group__4__Impl();

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
    // $ANTLR end "rule__RequiredInterface__Group__4"


    // $ANTLR start "rule__RequiredInterface__Group__4__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:859:1: rule__RequiredInterface__Group__4__Impl : ( ';' ) ;
    public final void rule__RequiredInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:863:1: ( ( ';' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:864:1: ( ';' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:864:1: ( ';' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:865:1: ';'
            {
             before(grammarAccess.getRequiredInterfaceAccess().getSemicolonKeyword_4()); 
            match(input,12,FOLLOW_12_in_rule__RequiredInterface__Group__4__Impl1711); 
             after(grammarAccess.getRequiredInterfaceAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__RequiredInterface__Group__4__Impl"


    // $ANTLR start "rule__ProvidedInterface__Group__0"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:888:1: rule__ProvidedInterface__Group__0 : rule__ProvidedInterface__Group__0__Impl rule__ProvidedInterface__Group__1 ;
    public final void rule__ProvidedInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:892:1: ( rule__ProvidedInterface__Group__0__Impl rule__ProvidedInterface__Group__1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:893:2: rule__ProvidedInterface__Group__0__Impl rule__ProvidedInterface__Group__1
            {
            pushFollow(FOLLOW_rule__ProvidedInterface__Group__0__Impl_in_rule__ProvidedInterface__Group__01752);
            rule__ProvidedInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProvidedInterface__Group__1_in_rule__ProvidedInterface__Group__01755);
            rule__ProvidedInterface__Group__1();

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
    // $ANTLR end "rule__ProvidedInterface__Group__0"


    // $ANTLR start "rule__ProvidedInterface__Group__0__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:900:1: rule__ProvidedInterface__Group__0__Impl : ( 'provides' ) ;
    public final void rule__ProvidedInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:904:1: ( ( 'provides' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:905:1: ( 'provides' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:905:1: ( 'provides' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:906:1: 'provides'
            {
             before(grammarAccess.getProvidedInterfaceAccess().getProvidesKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__ProvidedInterface__Group__0__Impl1783); 
             after(grammarAccess.getProvidedInterfaceAccess().getProvidesKeyword_0()); 

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
    // $ANTLR end "rule__ProvidedInterface__Group__0__Impl"


    // $ANTLR start "rule__ProvidedInterface__Group__1"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:919:1: rule__ProvidedInterface__Group__1 : rule__ProvidedInterface__Group__1__Impl rule__ProvidedInterface__Group__2 ;
    public final void rule__ProvidedInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:923:1: ( rule__ProvidedInterface__Group__1__Impl rule__ProvidedInterface__Group__2 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:924:2: rule__ProvidedInterface__Group__1__Impl rule__ProvidedInterface__Group__2
            {
            pushFollow(FOLLOW_rule__ProvidedInterface__Group__1__Impl_in_rule__ProvidedInterface__Group__11814);
            rule__ProvidedInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProvidedInterface__Group__2_in_rule__ProvidedInterface__Group__11817);
            rule__ProvidedInterface__Group__2();

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
    // $ANTLR end "rule__ProvidedInterface__Group__1"


    // $ANTLR start "rule__ProvidedInterface__Group__1__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:931:1: rule__ProvidedInterface__Group__1__Impl : ( ( rule__ProvidedInterface__TypeAssignment_1 ) ) ;
    public final void rule__ProvidedInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:935:1: ( ( ( rule__ProvidedInterface__TypeAssignment_1 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:936:1: ( ( rule__ProvidedInterface__TypeAssignment_1 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:936:1: ( ( rule__ProvidedInterface__TypeAssignment_1 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:937:1: ( rule__ProvidedInterface__TypeAssignment_1 )
            {
             before(grammarAccess.getProvidedInterfaceAccess().getTypeAssignment_1()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:938:1: ( rule__ProvidedInterface__TypeAssignment_1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:938:2: rule__ProvidedInterface__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__ProvidedInterface__TypeAssignment_1_in_rule__ProvidedInterface__Group__1__Impl1844);
            rule__ProvidedInterface__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProvidedInterfaceAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__ProvidedInterface__Group__1__Impl"


    // $ANTLR start "rule__ProvidedInterface__Group__2"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:948:1: rule__ProvidedInterface__Group__2 : rule__ProvidedInterface__Group__2__Impl rule__ProvidedInterface__Group__3 ;
    public final void rule__ProvidedInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:952:1: ( rule__ProvidedInterface__Group__2__Impl rule__ProvidedInterface__Group__3 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:953:2: rule__ProvidedInterface__Group__2__Impl rule__ProvidedInterface__Group__3
            {
            pushFollow(FOLLOW_rule__ProvidedInterface__Group__2__Impl_in_rule__ProvidedInterface__Group__21874);
            rule__ProvidedInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProvidedInterface__Group__3_in_rule__ProvidedInterface__Group__21877);
            rule__ProvidedInterface__Group__3();

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
    // $ANTLR end "rule__ProvidedInterface__Group__2"


    // $ANTLR start "rule__ProvidedInterface__Group__2__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:960:1: rule__ProvidedInterface__Group__2__Impl : ( 'as' ) ;
    public final void rule__ProvidedInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:964:1: ( ( 'as' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:965:1: ( 'as' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:965:1: ( 'as' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:966:1: 'as'
            {
             before(grammarAccess.getProvidedInterfaceAccess().getAsKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__ProvidedInterface__Group__2__Impl1905); 
             after(grammarAccess.getProvidedInterfaceAccess().getAsKeyword_2()); 

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
    // $ANTLR end "rule__ProvidedInterface__Group__2__Impl"


    // $ANTLR start "rule__ProvidedInterface__Group__3"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:979:1: rule__ProvidedInterface__Group__3 : rule__ProvidedInterface__Group__3__Impl rule__ProvidedInterface__Group__4 ;
    public final void rule__ProvidedInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:983:1: ( rule__ProvidedInterface__Group__3__Impl rule__ProvidedInterface__Group__4 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:984:2: rule__ProvidedInterface__Group__3__Impl rule__ProvidedInterface__Group__4
            {
            pushFollow(FOLLOW_rule__ProvidedInterface__Group__3__Impl_in_rule__ProvidedInterface__Group__31936);
            rule__ProvidedInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProvidedInterface__Group__4_in_rule__ProvidedInterface__Group__31939);
            rule__ProvidedInterface__Group__4();

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
    // $ANTLR end "rule__ProvidedInterface__Group__3"


    // $ANTLR start "rule__ProvidedInterface__Group__3__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:991:1: rule__ProvidedInterface__Group__3__Impl : ( ( rule__ProvidedInterface__NameAssignment_3 ) ) ;
    public final void rule__ProvidedInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:995:1: ( ( ( rule__ProvidedInterface__NameAssignment_3 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:996:1: ( ( rule__ProvidedInterface__NameAssignment_3 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:996:1: ( ( rule__ProvidedInterface__NameAssignment_3 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:997:1: ( rule__ProvidedInterface__NameAssignment_3 )
            {
             before(grammarAccess.getProvidedInterfaceAccess().getNameAssignment_3()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:998:1: ( rule__ProvidedInterface__NameAssignment_3 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:998:2: rule__ProvidedInterface__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ProvidedInterface__NameAssignment_3_in_rule__ProvidedInterface__Group__3__Impl1966);
            rule__ProvidedInterface__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProvidedInterfaceAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__ProvidedInterface__Group__3__Impl"


    // $ANTLR start "rule__ProvidedInterface__Group__4"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1008:1: rule__ProvidedInterface__Group__4 : rule__ProvidedInterface__Group__4__Impl ;
    public final void rule__ProvidedInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1012:1: ( rule__ProvidedInterface__Group__4__Impl )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1013:2: rule__ProvidedInterface__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ProvidedInterface__Group__4__Impl_in_rule__ProvidedInterface__Group__41996);
            rule__ProvidedInterface__Group__4__Impl();

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
    // $ANTLR end "rule__ProvidedInterface__Group__4"


    // $ANTLR start "rule__ProvidedInterface__Group__4__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1019:1: rule__ProvidedInterface__Group__4__Impl : ( ';' ) ;
    public final void rule__ProvidedInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1023:1: ( ( ';' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1024:1: ( ';' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1024:1: ( ';' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1025:1: ';'
            {
             before(grammarAccess.getProvidedInterfaceAccess().getSemicolonKeyword_4()); 
            match(input,12,FOLLOW_12_in_rule__ProvidedInterface__Group__4__Impl2024); 
             after(grammarAccess.getProvidedInterfaceAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__ProvidedInterface__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1048:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1052:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1053:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__02065);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__1_in_rule__Component__Group__02068);
            rule__Component__Group__1();

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
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1060:1: rule__Component__Group__0__Impl : ( 'contains' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1064:1: ( ( 'contains' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1065:1: ( 'contains' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1065:1: ( 'contains' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1066:1: 'contains'
            {
             before(grammarAccess.getComponentAccess().getContainsKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Component__Group__0__Impl2096); 
             after(grammarAccess.getComponentAccess().getContainsKeyword_0()); 

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
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1079:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1083:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1084:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__12127);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__2_in_rule__Component__Group__12130);
            rule__Component__Group__2();

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
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1091:1: rule__Component__Group__1__Impl : ( ( rule__Component__TypeAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1095:1: ( ( ( rule__Component__TypeAssignment_1 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1096:1: ( ( rule__Component__TypeAssignment_1 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1096:1: ( ( rule__Component__TypeAssignment_1 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1097:1: ( rule__Component__TypeAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getTypeAssignment_1()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1098:1: ( rule__Component__TypeAssignment_1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1098:2: rule__Component__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Component__TypeAssignment_1_in_rule__Component__Group__1__Impl2157);
            rule__Component__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1108:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1112:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1113:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__22187);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__3_in_rule__Component__Group__22190);
            rule__Component__Group__3();

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
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1120:1: rule__Component__Group__2__Impl : ( 'as' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1124:1: ( ( 'as' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1125:1: ( 'as' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1125:1: ( 'as' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1126:1: 'as'
            {
             before(grammarAccess.getComponentAccess().getAsKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Component__Group__2__Impl2218); 
             after(grammarAccess.getComponentAccess().getAsKeyword_2()); 

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
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1139:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1143:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1144:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__32249);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__4_in_rule__Component__Group__32252);
            rule__Component__Group__4();

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
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1151:1: rule__Component__Group__3__Impl : ( ( rule__Component__NameAssignment_3 ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1155:1: ( ( ( rule__Component__NameAssignment_3 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1156:1: ( ( rule__Component__NameAssignment_3 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1156:1: ( ( rule__Component__NameAssignment_3 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1157:1: ( rule__Component__NameAssignment_3 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_3()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1158:1: ( rule__Component__NameAssignment_3 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1158:2: rule__Component__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Component__NameAssignment_3_in_rule__Component__Group__3__Impl2279);
            rule__Component__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1168:1: rule__Component__Group__4 : rule__Component__Group__4__Impl ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1172:1: ( rule__Component__Group__4__Impl )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1173:2: rule__Component__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__42309);
            rule__Component__Group__4__Impl();

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
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1179:1: rule__Component__Group__4__Impl : ( ';' ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1183:1: ( ( ';' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1184:1: ( ';' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1184:1: ( ';' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1185:1: ';'
            {
             before(grammarAccess.getComponentAccess().getSemicolonKeyword_4()); 
            match(input,12,FOLLOW_12_in_rule__Component__Group__4__Impl2337); 
             after(grammarAccess.getComponentAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1208:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1212:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1213:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_rule__Binding__Group__0__Impl_in_rule__Binding__Group__02378);
            rule__Binding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__1_in_rule__Binding__Group__02381);
            rule__Binding__Group__1();

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
    // $ANTLR end "rule__Binding__Group__0"


    // $ANTLR start "rule__Binding__Group__0__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1220:1: rule__Binding__Group__0__Impl : ( 'binds' ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1224:1: ( ( 'binds' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1225:1: ( 'binds' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1225:1: ( 'binds' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1226:1: 'binds'
            {
             before(grammarAccess.getBindingAccess().getBindsKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Binding__Group__0__Impl2409); 
             after(grammarAccess.getBindingAccess().getBindsKeyword_0()); 

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
    // $ANTLR end "rule__Binding__Group__0__Impl"


    // $ANTLR start "rule__Binding__Group__1"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1239:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1243:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1244:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_rule__Binding__Group__1__Impl_in_rule__Binding__Group__12440);
            rule__Binding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__2_in_rule__Binding__Group__12443);
            rule__Binding__Group__2();

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
    // $ANTLR end "rule__Binding__Group__1"


    // $ANTLR start "rule__Binding__Group__1__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1251:1: rule__Binding__Group__1__Impl : ( ( rule__Binding__SourceComponentAssignment_1 ) ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1255:1: ( ( ( rule__Binding__SourceComponentAssignment_1 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1256:1: ( ( rule__Binding__SourceComponentAssignment_1 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1256:1: ( ( rule__Binding__SourceComponentAssignment_1 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1257:1: ( rule__Binding__SourceComponentAssignment_1 )
            {
             before(grammarAccess.getBindingAccess().getSourceComponentAssignment_1()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1258:1: ( rule__Binding__SourceComponentAssignment_1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1258:2: rule__Binding__SourceComponentAssignment_1
            {
            pushFollow(FOLLOW_rule__Binding__SourceComponentAssignment_1_in_rule__Binding__Group__1__Impl2470);
            rule__Binding__SourceComponentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getSourceComponentAssignment_1()); 

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
    // $ANTLR end "rule__Binding__Group__1__Impl"


    // $ANTLR start "rule__Binding__Group__2"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1268:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1272:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1273:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
            {
            pushFollow(FOLLOW_rule__Binding__Group__2__Impl_in_rule__Binding__Group__22500);
            rule__Binding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__3_in_rule__Binding__Group__22503);
            rule__Binding__Group__3();

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
    // $ANTLR end "rule__Binding__Group__2"


    // $ANTLR start "rule__Binding__Group__2__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1280:1: rule__Binding__Group__2__Impl : ( '.' ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1284:1: ( ( '.' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1285:1: ( '.' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1285:1: ( '.' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1286:1: '.'
            {
             before(grammarAccess.getBindingAccess().getFullStopKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Binding__Group__2__Impl2531); 
             after(grammarAccess.getBindingAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__Binding__Group__2__Impl"


    // $ANTLR start "rule__Binding__Group__3"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1299:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl rule__Binding__Group__4 ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1303:1: ( rule__Binding__Group__3__Impl rule__Binding__Group__4 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1304:2: rule__Binding__Group__3__Impl rule__Binding__Group__4
            {
            pushFollow(FOLLOW_rule__Binding__Group__3__Impl_in_rule__Binding__Group__32562);
            rule__Binding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__4_in_rule__Binding__Group__32565);
            rule__Binding__Group__4();

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
    // $ANTLR end "rule__Binding__Group__3"


    // $ANTLR start "rule__Binding__Group__3__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1311:1: rule__Binding__Group__3__Impl : ( ( rule__Binding__SourceInterfaceAssignment_3 ) ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1315:1: ( ( ( rule__Binding__SourceInterfaceAssignment_3 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1316:1: ( ( rule__Binding__SourceInterfaceAssignment_3 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1316:1: ( ( rule__Binding__SourceInterfaceAssignment_3 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1317:1: ( rule__Binding__SourceInterfaceAssignment_3 )
            {
             before(grammarAccess.getBindingAccess().getSourceInterfaceAssignment_3()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1318:1: ( rule__Binding__SourceInterfaceAssignment_3 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1318:2: rule__Binding__SourceInterfaceAssignment_3
            {
            pushFollow(FOLLOW_rule__Binding__SourceInterfaceAssignment_3_in_rule__Binding__Group__3__Impl2592);
            rule__Binding__SourceInterfaceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getSourceInterfaceAssignment_3()); 

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
    // $ANTLR end "rule__Binding__Group__3__Impl"


    // $ANTLR start "rule__Binding__Group__4"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1328:1: rule__Binding__Group__4 : rule__Binding__Group__4__Impl rule__Binding__Group__5 ;
    public final void rule__Binding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1332:1: ( rule__Binding__Group__4__Impl rule__Binding__Group__5 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1333:2: rule__Binding__Group__4__Impl rule__Binding__Group__5
            {
            pushFollow(FOLLOW_rule__Binding__Group__4__Impl_in_rule__Binding__Group__42622);
            rule__Binding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__5_in_rule__Binding__Group__42625);
            rule__Binding__Group__5();

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
    // $ANTLR end "rule__Binding__Group__4"


    // $ANTLR start "rule__Binding__Group__4__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1340:1: rule__Binding__Group__4__Impl : ( 'to' ) ;
    public final void rule__Binding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1344:1: ( ( 'to' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1345:1: ( 'to' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1345:1: ( 'to' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1346:1: 'to'
            {
             before(grammarAccess.getBindingAccess().getToKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__Binding__Group__4__Impl2653); 
             after(grammarAccess.getBindingAccess().getToKeyword_4()); 

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
    // $ANTLR end "rule__Binding__Group__4__Impl"


    // $ANTLR start "rule__Binding__Group__5"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1359:1: rule__Binding__Group__5 : rule__Binding__Group__5__Impl rule__Binding__Group__6 ;
    public final void rule__Binding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1363:1: ( rule__Binding__Group__5__Impl rule__Binding__Group__6 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1364:2: rule__Binding__Group__5__Impl rule__Binding__Group__6
            {
            pushFollow(FOLLOW_rule__Binding__Group__5__Impl_in_rule__Binding__Group__52684);
            rule__Binding__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__6_in_rule__Binding__Group__52687);
            rule__Binding__Group__6();

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
    // $ANTLR end "rule__Binding__Group__5"


    // $ANTLR start "rule__Binding__Group__5__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1371:1: rule__Binding__Group__5__Impl : ( ( rule__Binding__TargetComponentAssignment_5 ) ) ;
    public final void rule__Binding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1375:1: ( ( ( rule__Binding__TargetComponentAssignment_5 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1376:1: ( ( rule__Binding__TargetComponentAssignment_5 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1376:1: ( ( rule__Binding__TargetComponentAssignment_5 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1377:1: ( rule__Binding__TargetComponentAssignment_5 )
            {
             before(grammarAccess.getBindingAccess().getTargetComponentAssignment_5()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1378:1: ( rule__Binding__TargetComponentAssignment_5 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1378:2: rule__Binding__TargetComponentAssignment_5
            {
            pushFollow(FOLLOW_rule__Binding__TargetComponentAssignment_5_in_rule__Binding__Group__5__Impl2714);
            rule__Binding__TargetComponentAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getTargetComponentAssignment_5()); 

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
    // $ANTLR end "rule__Binding__Group__5__Impl"


    // $ANTLR start "rule__Binding__Group__6"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1388:1: rule__Binding__Group__6 : rule__Binding__Group__6__Impl rule__Binding__Group__7 ;
    public final void rule__Binding__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1392:1: ( rule__Binding__Group__6__Impl rule__Binding__Group__7 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1393:2: rule__Binding__Group__6__Impl rule__Binding__Group__7
            {
            pushFollow(FOLLOW_rule__Binding__Group__6__Impl_in_rule__Binding__Group__62744);
            rule__Binding__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__7_in_rule__Binding__Group__62747);
            rule__Binding__Group__7();

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
    // $ANTLR end "rule__Binding__Group__6"


    // $ANTLR start "rule__Binding__Group__6__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1400:1: rule__Binding__Group__6__Impl : ( '.' ) ;
    public final void rule__Binding__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1404:1: ( ( '.' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1405:1: ( '.' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1405:1: ( '.' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1406:1: '.'
            {
             before(grammarAccess.getBindingAccess().getFullStopKeyword_6()); 
            match(input,22,FOLLOW_22_in_rule__Binding__Group__6__Impl2775); 
             after(grammarAccess.getBindingAccess().getFullStopKeyword_6()); 

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
    // $ANTLR end "rule__Binding__Group__6__Impl"


    // $ANTLR start "rule__Binding__Group__7"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1419:1: rule__Binding__Group__7 : rule__Binding__Group__7__Impl rule__Binding__Group__8 ;
    public final void rule__Binding__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1423:1: ( rule__Binding__Group__7__Impl rule__Binding__Group__8 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1424:2: rule__Binding__Group__7__Impl rule__Binding__Group__8
            {
            pushFollow(FOLLOW_rule__Binding__Group__7__Impl_in_rule__Binding__Group__72806);
            rule__Binding__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__8_in_rule__Binding__Group__72809);
            rule__Binding__Group__8();

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
    // $ANTLR end "rule__Binding__Group__7"


    // $ANTLR start "rule__Binding__Group__7__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1431:1: rule__Binding__Group__7__Impl : ( ( rule__Binding__TargetInterfaceAssignment_7 ) ) ;
    public final void rule__Binding__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1435:1: ( ( ( rule__Binding__TargetInterfaceAssignment_7 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1436:1: ( ( rule__Binding__TargetInterfaceAssignment_7 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1436:1: ( ( rule__Binding__TargetInterfaceAssignment_7 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1437:1: ( rule__Binding__TargetInterfaceAssignment_7 )
            {
             before(grammarAccess.getBindingAccess().getTargetInterfaceAssignment_7()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1438:1: ( rule__Binding__TargetInterfaceAssignment_7 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1438:2: rule__Binding__TargetInterfaceAssignment_7
            {
            pushFollow(FOLLOW_rule__Binding__TargetInterfaceAssignment_7_in_rule__Binding__Group__7__Impl2836);
            rule__Binding__TargetInterfaceAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getTargetInterfaceAssignment_7()); 

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
    // $ANTLR end "rule__Binding__Group__7__Impl"


    // $ANTLR start "rule__Binding__Group__8"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1448:1: rule__Binding__Group__8 : rule__Binding__Group__8__Impl ;
    public final void rule__Binding__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1452:1: ( rule__Binding__Group__8__Impl )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1453:2: rule__Binding__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Binding__Group__8__Impl_in_rule__Binding__Group__82866);
            rule__Binding__Group__8__Impl();

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
    // $ANTLR end "rule__Binding__Group__8"


    // $ANTLR start "rule__Binding__Group__8__Impl"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1459:1: rule__Binding__Group__8__Impl : ( ';' ) ;
    public final void rule__Binding__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1463:1: ( ( ';' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1464:1: ( ';' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1464:1: ( ';' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1465:1: ';'
            {
             before(grammarAccess.getBindingAccess().getSemicolonKeyword_8()); 
            match(input,12,FOLLOW_12_in_rule__Binding__Group__8__Impl2894); 
             after(grammarAccess.getBindingAccess().getSemicolonKeyword_8()); 

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
    // $ANTLR end "rule__Binding__Group__8__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1496:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1500:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1501:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02943);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02946);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1508:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1512:1: ( ( RULE_ID ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1513:1: ( RULE_ID )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1513:1: ( RULE_ID )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1514:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2973); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1525:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1529:1: ( rule__QualifiedName__Group__1__Impl )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1530:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13002);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1536:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1540:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1541:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1541:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1542:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1543:1: ( rule__QualifiedName__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1543:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3029);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1557:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1561:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1562:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03064);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03067);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1569:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1573:1: ( ( '.' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1574:1: ( '.' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1574:1: ( '.' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1575:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__QualifiedName__Group_1__0__Impl3095); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1588:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1592:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1593:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13126);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1599:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1603:1: ( ( RULE_ID ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1604:1: ( RULE_ID )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1604:1: ( RULE_ID )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1605:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3153); 
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


    // $ANTLR start "rule__Definition__ImportsAssignment_0"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1621:1: rule__Definition__ImportsAssignment_0 : ( ruleImports ) ;
    public final void rule__Definition__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1625:1: ( ( ruleImports ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1626:1: ( ruleImports )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1626:1: ( ruleImports )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1627:1: ruleImports
            {
             before(grammarAccess.getDefinitionAccess().getImportsImportsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImports_in_rule__Definition__ImportsAssignment_03191);
            ruleImports();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getImportsImportsParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Definition__ImportsAssignment_0"


    // $ANTLR start "rule__Definition__ArchitectureAssignment_1"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1636:1: rule__Definition__ArchitectureAssignment_1 : ( ruleArchitecture ) ;
    public final void rule__Definition__ArchitectureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1640:1: ( ( ruleArchitecture ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1641:1: ( ruleArchitecture )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1641:1: ( ruleArchitecture )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1642:1: ruleArchitecture
            {
             before(grammarAccess.getDefinitionAccess().getArchitectureArchitectureParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleArchitecture_in_rule__Definition__ArchitectureAssignment_13222);
            ruleArchitecture();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getArchitectureArchitectureParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Definition__ArchitectureAssignment_1"


    // $ANTLR start "rule__Imports__ImportedNamespaceAssignment_1"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1651:1: rule__Imports__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Imports__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1655:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1656:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1656:1: ( ruleQualifiedNameWithWildcard )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1657:1: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportsAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Imports__ImportedNamespaceAssignment_13253);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportsAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Imports__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Architecture__NameAssignment_1"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1666:1: rule__Architecture__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Architecture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1670:1: ( ( ruleQualifiedName ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1671:1: ( ruleQualifiedName )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1671:1: ( ruleQualifiedName )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1672:1: ruleQualifiedName
            {
             before(grammarAccess.getArchitectureAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Architecture__NameAssignment_13284);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getArchitectureAccess().getNameQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Architecture__NameAssignment_1"


    // $ANTLR start "rule__Architecture__ElementsAssignment_3"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1681:1: rule__Architecture__ElementsAssignment_3 : ( ( rule__Architecture__ElementsAlternatives_3_0 ) ) ;
    public final void rule__Architecture__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1685:1: ( ( ( rule__Architecture__ElementsAlternatives_3_0 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1686:1: ( ( rule__Architecture__ElementsAlternatives_3_0 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1686:1: ( ( rule__Architecture__ElementsAlternatives_3_0 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1687:1: ( rule__Architecture__ElementsAlternatives_3_0 )
            {
             before(grammarAccess.getArchitectureAccess().getElementsAlternatives_3_0()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1688:1: ( rule__Architecture__ElementsAlternatives_3_0 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1688:2: rule__Architecture__ElementsAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Architecture__ElementsAlternatives_3_0_in_rule__Architecture__ElementsAssignment_33315);
            rule__Architecture__ElementsAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getElementsAlternatives_3_0()); 

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
    // $ANTLR end "rule__Architecture__ElementsAssignment_3"


    // $ANTLR start "rule__RequiredInterface__TypeAssignment_1"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1697:1: rule__RequiredInterface__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RequiredInterface__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1701:1: ( ( ( RULE_ID ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1702:1: ( ( RULE_ID ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1702:1: ( ( RULE_ID ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1703:1: ( RULE_ID )
            {
             before(grammarAccess.getRequiredInterfaceAccess().getTypeInterfaceDefinitionCrossReference_1_0()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1704:1: ( RULE_ID )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1705:1: RULE_ID
            {
             before(grammarAccess.getRequiredInterfaceAccess().getTypeInterfaceDefinitionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RequiredInterface__TypeAssignment_13352); 
             after(grammarAccess.getRequiredInterfaceAccess().getTypeInterfaceDefinitionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRequiredInterfaceAccess().getTypeInterfaceDefinitionCrossReference_1_0()); 

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
    // $ANTLR end "rule__RequiredInterface__TypeAssignment_1"


    // $ANTLR start "rule__RequiredInterface__NameAssignment_3"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1716:1: rule__RequiredInterface__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__RequiredInterface__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1720:1: ( ( RULE_ID ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1721:1: ( RULE_ID )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1721:1: ( RULE_ID )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1722:1: RULE_ID
            {
             before(grammarAccess.getRequiredInterfaceAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RequiredInterface__NameAssignment_33387); 
             after(grammarAccess.getRequiredInterfaceAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__RequiredInterface__NameAssignment_3"


    // $ANTLR start "rule__ProvidedInterface__TypeAssignment_1"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1731:1: rule__ProvidedInterface__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ProvidedInterface__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1735:1: ( ( ( RULE_ID ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1736:1: ( ( RULE_ID ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1736:1: ( ( RULE_ID ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1737:1: ( RULE_ID )
            {
             before(grammarAccess.getProvidedInterfaceAccess().getTypeInterfaceDefinitionCrossReference_1_0()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1738:1: ( RULE_ID )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1739:1: RULE_ID
            {
             before(grammarAccess.getProvidedInterfaceAccess().getTypeInterfaceDefinitionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProvidedInterface__TypeAssignment_13422); 
             after(grammarAccess.getProvidedInterfaceAccess().getTypeInterfaceDefinitionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getProvidedInterfaceAccess().getTypeInterfaceDefinitionCrossReference_1_0()); 

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
    // $ANTLR end "rule__ProvidedInterface__TypeAssignment_1"


    // $ANTLR start "rule__ProvidedInterface__NameAssignment_3"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1750:1: rule__ProvidedInterface__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ProvidedInterface__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1754:1: ( ( RULE_ID ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1755:1: ( RULE_ID )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1755:1: ( RULE_ID )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1756:1: RULE_ID
            {
             before(grammarAccess.getProvidedInterfaceAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProvidedInterface__NameAssignment_33457); 
             after(grammarAccess.getProvidedInterfaceAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__ProvidedInterface__NameAssignment_3"


    // $ANTLR start "rule__Component__TypeAssignment_1"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1765:1: rule__Component__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Component__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1769:1: ( ( ( ruleQualifiedName ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1770:1: ( ( ruleQualifiedName ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1770:1: ( ( ruleQualifiedName ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1771:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getComponentAccess().getTypeArchitectureCrossReference_1_0()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1772:1: ( ruleQualifiedName )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1773:1: ruleQualifiedName
            {
             before(grammarAccess.getComponentAccess().getTypeArchitectureQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Component__TypeAssignment_13492);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getTypeArchitectureQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getTypeArchitectureCrossReference_1_0()); 

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
    // $ANTLR end "rule__Component__TypeAssignment_1"


    // $ANTLR start "rule__Component__NameAssignment_3"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1784:1: rule__Component__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1788:1: ( ( RULE_ID ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1789:1: ( RULE_ID )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1789:1: ( RULE_ID )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1790:1: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Component__NameAssignment_33527); 
             after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Component__NameAssignment_3"


    // $ANTLR start "rule__Binding__SourceComponentAssignment_1"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1799:1: rule__Binding__SourceComponentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__SourceComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1803:1: ( ( ( RULE_ID ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1804:1: ( ( RULE_ID ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1804:1: ( ( RULE_ID ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1805:1: ( RULE_ID )
            {
             before(grammarAccess.getBindingAccess().getSourceComponentComponentCrossReference_1_0()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1806:1: ( RULE_ID )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1807:1: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getSourceComponentComponentIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Binding__SourceComponentAssignment_13562); 
             after(grammarAccess.getBindingAccess().getSourceComponentComponentIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getBindingAccess().getSourceComponentComponentCrossReference_1_0()); 

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
    // $ANTLR end "rule__Binding__SourceComponentAssignment_1"


    // $ANTLR start "rule__Binding__SourceInterfaceAssignment_3"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1818:1: rule__Binding__SourceInterfaceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__SourceInterfaceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1822:1: ( ( ( RULE_ID ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1823:1: ( ( RULE_ID ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1823:1: ( ( RULE_ID ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1824:1: ( RULE_ID )
            {
             before(grammarAccess.getBindingAccess().getSourceInterfaceRequiredInterfaceCrossReference_3_0()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1825:1: ( RULE_ID )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1826:1: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getSourceInterfaceRequiredInterfaceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Binding__SourceInterfaceAssignment_33601); 
             after(grammarAccess.getBindingAccess().getSourceInterfaceRequiredInterfaceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getBindingAccess().getSourceInterfaceRequiredInterfaceCrossReference_3_0()); 

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
    // $ANTLR end "rule__Binding__SourceInterfaceAssignment_3"


    // $ANTLR start "rule__Binding__TargetComponentAssignment_5"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1837:1: rule__Binding__TargetComponentAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__TargetComponentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1841:1: ( ( ( RULE_ID ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1842:1: ( ( RULE_ID ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1842:1: ( ( RULE_ID ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1843:1: ( RULE_ID )
            {
             before(grammarAccess.getBindingAccess().getTargetComponentComponentCrossReference_5_0()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1844:1: ( RULE_ID )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1845:1: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getTargetComponentComponentIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Binding__TargetComponentAssignment_53640); 
             after(grammarAccess.getBindingAccess().getTargetComponentComponentIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getBindingAccess().getTargetComponentComponentCrossReference_5_0()); 

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
    // $ANTLR end "rule__Binding__TargetComponentAssignment_5"


    // $ANTLR start "rule__Binding__TargetInterfaceAssignment_7"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1856:1: rule__Binding__TargetInterfaceAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__TargetInterfaceAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1860:1: ( ( ( RULE_ID ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1861:1: ( ( RULE_ID ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1861:1: ( ( RULE_ID ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1862:1: ( RULE_ID )
            {
             before(grammarAccess.getBindingAccess().getTargetInterfaceProvidedInterfaceCrossReference_7_0()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1863:1: ( RULE_ID )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1864:1: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getTargetInterfaceProvidedInterfaceIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Binding__TargetInterfaceAssignment_73679); 
             after(grammarAccess.getBindingAccess().getTargetInterfaceProvidedInterfaceIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getBindingAccess().getTargetInterfaceProvidedInterfaceCrossReference_7_0()); 

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
    // $ANTLR end "rule__Binding__TargetInterfaceAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0_in_ruleDefinition94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImports_in_entryRuleImports121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImports128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Imports__Group__0_in_ruleImports154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitecture_in_entryRuleArchitecture241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchitecture248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__Group__0_in_ruleArchitecture274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterface_in_entryRuleRequiredInterface301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredInterface308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredInterface__Group__0_in_ruleRequiredInterface334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterface_in_entryRuleProvidedInterface361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvidedInterface368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedInterface__Group__0_in_ruleProvidedInterface394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0_in_ruleComponent454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_entryRuleBinding481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinding488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__0_in_ruleBinding514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__Architecture__ElementsAlternatives_3_0610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterface_in_rule__Architecture__ElementsAlternatives_3_0627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterface_in_rule__Architecture__ElementsAlternatives_3_0644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_rule__Architecture__ElementsAlternatives_3_0661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__0691 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__0694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__ImportsAssignment_0_in_rule__Definition__Group__0__Impl721 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__ArchitectureAssignment_1_in_rule__Definition__Group__1__Impl779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Imports__Group__0__Impl_in_rule__Imports__Group__0813 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Imports__Group__1_in_rule__Imports__Group__0816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Imports__Group__0__Impl844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Imports__Group__1__Impl_in_rule__Imports__Group__1875 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Imports__Group__2_in_rule__Imports__Group__1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Imports__ImportedNamespaceAssignment_1_in_rule__Imports__Group__1__Impl905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Imports__Group__2__Impl_in_rule__Imports__Group__2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Imports__Group__2__Impl963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__01000 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__01003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__11059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__QualifiedNameWithWildcard__Group__1__Impl1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__Group__0__Impl_in_rule__Architecture__Group__01125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Architecture__Group__1_in_rule__Architecture__Group__01128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Architecture__Group__0__Impl1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__Group__1__Impl_in_rule__Architecture__Group__11187 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Architecture__Group__2_in_rule__Architecture__Group__11190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__NameAssignment_1_in_rule__Architecture__Group__1__Impl1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__Group__2__Impl_in_rule__Architecture__Group__21247 = new BitSet(new long[]{0x00000000003B0000L});
    public static final BitSet FOLLOW_rule__Architecture__Group__3_in_rule__Architecture__Group__21250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Architecture__Group__2__Impl1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__Group__3__Impl_in_rule__Architecture__Group__31309 = new BitSet(new long[]{0x00000000003B0000L});
    public static final BitSet FOLLOW_rule__Architecture__Group__4_in_rule__Architecture__Group__31312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__ElementsAssignment_3_in_rule__Architecture__Group__3__Impl1339 = new BitSet(new long[]{0x00000000003A0002L});
    public static final BitSet FOLLOW_rule__Architecture__Group__4__Impl_in_rule__Architecture__Group__41370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Architecture__Group__4__Impl1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredInterface__Group__0__Impl_in_rule__RequiredInterface__Group__01439 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RequiredInterface__Group__1_in_rule__RequiredInterface__Group__01442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RequiredInterface__Group__0__Impl1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredInterface__Group__1__Impl_in_rule__RequiredInterface__Group__11501 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__RequiredInterface__Group__2_in_rule__RequiredInterface__Group__11504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredInterface__TypeAssignment_1_in_rule__RequiredInterface__Group__1__Impl1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredInterface__Group__2__Impl_in_rule__RequiredInterface__Group__21561 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RequiredInterface__Group__3_in_rule__RequiredInterface__Group__21564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RequiredInterface__Group__2__Impl1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredInterface__Group__3__Impl_in_rule__RequiredInterface__Group__31623 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RequiredInterface__Group__4_in_rule__RequiredInterface__Group__31626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredInterface__NameAssignment_3_in_rule__RequiredInterface__Group__3__Impl1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredInterface__Group__4__Impl_in_rule__RequiredInterface__Group__41683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RequiredInterface__Group__4__Impl1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedInterface__Group__0__Impl_in_rule__ProvidedInterface__Group__01752 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProvidedInterface__Group__1_in_rule__ProvidedInterface__Group__01755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ProvidedInterface__Group__0__Impl1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedInterface__Group__1__Impl_in_rule__ProvidedInterface__Group__11814 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ProvidedInterface__Group__2_in_rule__ProvidedInterface__Group__11817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedInterface__TypeAssignment_1_in_rule__ProvidedInterface__Group__1__Impl1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedInterface__Group__2__Impl_in_rule__ProvidedInterface__Group__21874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProvidedInterface__Group__3_in_rule__ProvidedInterface__Group__21877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ProvidedInterface__Group__2__Impl1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedInterface__Group__3__Impl_in_rule__ProvidedInterface__Group__31936 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ProvidedInterface__Group__4_in_rule__ProvidedInterface__Group__31939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedInterface__NameAssignment_3_in_rule__ProvidedInterface__Group__3__Impl1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedInterface__Group__4__Impl_in_rule__ProvidedInterface__Group__41996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ProvidedInterface__Group__4__Impl2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__02065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Component__Group__1_in_rule__Component__Group__02068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Component__Group__0__Impl2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__12127 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Component__Group__2_in_rule__Component__Group__12130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__TypeAssignment_1_in_rule__Component__Group__1__Impl2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__22187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Component__Group__3_in_rule__Component__Group__22190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Component__Group__2__Impl2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__32249 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Component__Group__4_in_rule__Component__Group__32252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__NameAssignment_3_in_rule__Component__Group__3__Impl2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__42309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Component__Group__4__Impl2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__0__Impl_in_rule__Binding__Group__02378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Binding__Group__1_in_rule__Binding__Group__02381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Binding__Group__0__Impl2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__1__Impl_in_rule__Binding__Group__12440 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Binding__Group__2_in_rule__Binding__Group__12443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__SourceComponentAssignment_1_in_rule__Binding__Group__1__Impl2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__2__Impl_in_rule__Binding__Group__22500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Binding__Group__3_in_rule__Binding__Group__22503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Binding__Group__2__Impl2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__3__Impl_in_rule__Binding__Group__32562 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Binding__Group__4_in_rule__Binding__Group__32565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__SourceInterfaceAssignment_3_in_rule__Binding__Group__3__Impl2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__4__Impl_in_rule__Binding__Group__42622 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Binding__Group__5_in_rule__Binding__Group__42625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Binding__Group__4__Impl2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__5__Impl_in_rule__Binding__Group__52684 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Binding__Group__6_in_rule__Binding__Group__52687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__TargetComponentAssignment_5_in_rule__Binding__Group__5__Impl2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__6__Impl_in_rule__Binding__Group__62744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Binding__Group__7_in_rule__Binding__Group__62747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Binding__Group__6__Impl2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__7__Impl_in_rule__Binding__Group__72806 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Binding__Group__8_in_rule__Binding__Group__72809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__TargetInterfaceAssignment_7_in_rule__Binding__Group__7__Impl2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__8__Impl_in_rule__Binding__Group__82866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Binding__Group__8__Impl2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02943 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3029 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03064 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__QualifiedName__Group_1__0__Impl3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImports_in_rule__Definition__ImportsAssignment_03191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitecture_in_rule__Definition__ArchitectureAssignment_13222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Imports__ImportedNamespaceAssignment_13253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Architecture__NameAssignment_13284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__ElementsAlternatives_3_0_in_rule__Architecture__ElementsAssignment_33315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RequiredInterface__TypeAssignment_13352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RequiredInterface__NameAssignment_33387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProvidedInterface__TypeAssignment_13422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProvidedInterface__NameAssignment_33457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Component__TypeAssignment_13492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Component__NameAssignment_33527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Binding__SourceComponentAssignment_13562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Binding__SourceInterfaceAssignment_33601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Binding__TargetComponentAssignment_53640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Binding__TargetInterfaceAssignment_73679 = new BitSet(new long[]{0x0000000000000002L});

}