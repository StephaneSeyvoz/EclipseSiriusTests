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


    // $ANTLR start "entryRuleArchitectureElements"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:172:1: entryRuleArchitectureElements : ruleArchitectureElements EOF ;
    public final void entryRuleArchitectureElements() throws RecognitionException {
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:173:1: ( ruleArchitectureElements EOF )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:174:1: ruleArchitectureElements EOF
            {
             before(grammarAccess.getArchitectureElementsRule()); 
            pushFollow(FOLLOW_ruleArchitectureElements_in_entryRuleArchitectureElements301);
            ruleArchitectureElements();

            state._fsp--;

             after(grammarAccess.getArchitectureElementsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArchitectureElements308); 

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
    // $ANTLR end "entryRuleArchitectureElements"


    // $ANTLR start "ruleArchitectureElements"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:181:1: ruleArchitectureElements : ( ( rule__ArchitectureElements__Alternatives ) ) ;
    public final void ruleArchitectureElements() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:185:2: ( ( ( rule__ArchitectureElements__Alternatives ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:186:1: ( ( rule__ArchitectureElements__Alternatives ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:186:1: ( ( rule__ArchitectureElements__Alternatives ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:187:1: ( rule__ArchitectureElements__Alternatives )
            {
             before(grammarAccess.getArchitectureElementsAccess().getAlternatives()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:188:1: ( rule__ArchitectureElements__Alternatives )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:188:2: rule__ArchitectureElements__Alternatives
            {
            pushFollow(FOLLOW_rule__ArchitectureElements__Alternatives_in_ruleArchitectureElements334);
            rule__ArchitectureElements__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureElementsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleArchitectureElements"


    // $ANTLR start "entryRuleRequiredInterface"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:200:1: entryRuleRequiredInterface : ruleRequiredInterface EOF ;
    public final void entryRuleRequiredInterface() throws RecognitionException {
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:201:1: ( ruleRequiredInterface EOF )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:202:1: ruleRequiredInterface EOF
            {
             before(grammarAccess.getRequiredInterfaceRule()); 
            pushFollow(FOLLOW_ruleRequiredInterface_in_entryRuleRequiredInterface361);
            ruleRequiredInterface();

            state._fsp--;

             after(grammarAccess.getRequiredInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredInterface368); 

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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:209:1: ruleRequiredInterface : ( ( rule__RequiredInterface__Group__0 ) ) ;
    public final void ruleRequiredInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:213:2: ( ( ( rule__RequiredInterface__Group__0 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:214:1: ( ( rule__RequiredInterface__Group__0 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:214:1: ( ( rule__RequiredInterface__Group__0 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:215:1: ( rule__RequiredInterface__Group__0 )
            {
             before(grammarAccess.getRequiredInterfaceAccess().getGroup()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:216:1: ( rule__RequiredInterface__Group__0 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:216:2: rule__RequiredInterface__Group__0
            {
            pushFollow(FOLLOW_rule__RequiredInterface__Group__0_in_ruleRequiredInterface394);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:228:1: entryRuleProvidedInterface : ruleProvidedInterface EOF ;
    public final void entryRuleProvidedInterface() throws RecognitionException {
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:229:1: ( ruleProvidedInterface EOF )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:230:1: ruleProvidedInterface EOF
            {
             before(grammarAccess.getProvidedInterfaceRule()); 
            pushFollow(FOLLOW_ruleProvidedInterface_in_entryRuleProvidedInterface421);
            ruleProvidedInterface();

            state._fsp--;

             after(grammarAccess.getProvidedInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvidedInterface428); 

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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:237:1: ruleProvidedInterface : ( ( rule__ProvidedInterface__Group__0 ) ) ;
    public final void ruleProvidedInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:241:2: ( ( ( rule__ProvidedInterface__Group__0 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:242:1: ( ( rule__ProvidedInterface__Group__0 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:242:1: ( ( rule__ProvidedInterface__Group__0 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:243:1: ( rule__ProvidedInterface__Group__0 )
            {
             before(grammarAccess.getProvidedInterfaceAccess().getGroup()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:244:1: ( rule__ProvidedInterface__Group__0 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:244:2: rule__ProvidedInterface__Group__0
            {
            pushFollow(FOLLOW_rule__ProvidedInterface__Group__0_in_ruleProvidedInterface454);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:256:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:257:1: ( ruleComponent EOF )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:258:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent481);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent488); 

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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:265:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:269:2: ( ( ( rule__Component__Group__0 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:270:1: ( ( rule__Component__Group__0 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:270:1: ( ( rule__Component__Group__0 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:271:1: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:272:1: ( rule__Component__Group__0 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:272:2: rule__Component__Group__0
            {
            pushFollow(FOLLOW_rule__Component__Group__0_in_ruleComponent514);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:284:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:285:1: ( ruleBinding EOF )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:286:1: ruleBinding EOF
            {
             before(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_ruleBinding_in_entryRuleBinding541);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getBindingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinding548); 

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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:293:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:297:2: ( ( ( rule__Binding__Group__0 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:298:1: ( ( rule__Binding__Group__0 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:298:1: ( ( rule__Binding__Group__0 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:299:1: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:300:1: ( rule__Binding__Group__0 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:300:2: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_rule__Binding__Group__0_in_ruleBinding574);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:312:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:313:1: ( ruleQualifiedName EOF )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:314:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName601);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName608); 

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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:321:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:325:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:326:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:326:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:327:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:328:1: ( rule__QualifiedName__Group__0 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:328:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName634);
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


    // $ANTLR start "rule__ArchitectureElements__Alternatives"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:340:1: rule__ArchitectureElements__Alternatives : ( ( ruleComponent ) | ( ruleProvidedInterface ) | ( ruleRequiredInterface ) | ( ruleBinding ) );
    public final void rule__ArchitectureElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:344:1: ( ( ruleComponent ) | ( ruleProvidedInterface ) | ( ruleRequiredInterface ) | ( ruleBinding ) )
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
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:345:1: ( ruleComponent )
                    {
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:345:1: ( ruleComponent )
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:346:1: ruleComponent
                    {
                     before(grammarAccess.getArchitectureElementsAccess().getComponentParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleComponent_in_rule__ArchitectureElements__Alternatives670);
                    ruleComponent();

                    state._fsp--;

                     after(grammarAccess.getArchitectureElementsAccess().getComponentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:351:6: ( ruleProvidedInterface )
                    {
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:351:6: ( ruleProvidedInterface )
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:352:1: ruleProvidedInterface
                    {
                     before(grammarAccess.getArchitectureElementsAccess().getProvidedInterfaceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleProvidedInterface_in_rule__ArchitectureElements__Alternatives687);
                    ruleProvidedInterface();

                    state._fsp--;

                     after(grammarAccess.getArchitectureElementsAccess().getProvidedInterfaceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:357:6: ( ruleRequiredInterface )
                    {
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:357:6: ( ruleRequiredInterface )
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:358:1: ruleRequiredInterface
                    {
                     before(grammarAccess.getArchitectureElementsAccess().getRequiredInterfaceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRequiredInterface_in_rule__ArchitectureElements__Alternatives704);
                    ruleRequiredInterface();

                    state._fsp--;

                     after(grammarAccess.getArchitectureElementsAccess().getRequiredInterfaceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:363:6: ( ruleBinding )
                    {
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:363:6: ( ruleBinding )
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:364:1: ruleBinding
                    {
                     before(grammarAccess.getArchitectureElementsAccess().getBindingParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleBinding_in_rule__ArchitectureElements__Alternatives721);
                    ruleBinding();

                    state._fsp--;

                     after(grammarAccess.getArchitectureElementsAccess().getBindingParserRuleCall_3()); 

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
    // $ANTLR end "rule__ArchitectureElements__Alternatives"


    // $ANTLR start "rule__Definition__Group__0"
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:376:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:380:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:381:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__0751);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__0754);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:388:1: rule__Definition__Group__0__Impl : ( ( rule__Definition__ImportsAssignment_0 )* ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:392:1: ( ( ( rule__Definition__ImportsAssignment_0 )* ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:393:1: ( ( rule__Definition__ImportsAssignment_0 )* )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:393:1: ( ( rule__Definition__ImportsAssignment_0 )* )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:394:1: ( rule__Definition__ImportsAssignment_0 )*
            {
             before(grammarAccess.getDefinitionAccess().getImportsAssignment_0()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:395:1: ( rule__Definition__ImportsAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:395:2: rule__Definition__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Definition__ImportsAssignment_0_in_rule__Definition__Group__0__Impl781);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:405:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:409:1: ( rule__Definition__Group__1__Impl )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:410:2: rule__Definition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__1812);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:416:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__ArchitectureAssignment_1 ) ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:420:1: ( ( ( rule__Definition__ArchitectureAssignment_1 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:421:1: ( ( rule__Definition__ArchitectureAssignment_1 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:421:1: ( ( rule__Definition__ArchitectureAssignment_1 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:422:1: ( rule__Definition__ArchitectureAssignment_1 )
            {
             before(grammarAccess.getDefinitionAccess().getArchitectureAssignment_1()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:423:1: ( rule__Definition__ArchitectureAssignment_1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:423:2: rule__Definition__ArchitectureAssignment_1
            {
            pushFollow(FOLLOW_rule__Definition__ArchitectureAssignment_1_in_rule__Definition__Group__1__Impl839);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:437:1: rule__Imports__Group__0 : rule__Imports__Group__0__Impl rule__Imports__Group__1 ;
    public final void rule__Imports__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:441:1: ( rule__Imports__Group__0__Impl rule__Imports__Group__1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:442:2: rule__Imports__Group__0__Impl rule__Imports__Group__1
            {
            pushFollow(FOLLOW_rule__Imports__Group__0__Impl_in_rule__Imports__Group__0873);
            rule__Imports__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Imports__Group__1_in_rule__Imports__Group__0876);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:449:1: rule__Imports__Group__0__Impl : ( 'import' ) ;
    public final void rule__Imports__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:453:1: ( ( 'import' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:454:1: ( 'import' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:454:1: ( 'import' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:455:1: 'import'
            {
             before(grammarAccess.getImportsAccess().getImportKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Imports__Group__0__Impl904); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:468:1: rule__Imports__Group__1 : rule__Imports__Group__1__Impl rule__Imports__Group__2 ;
    public final void rule__Imports__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:472:1: ( rule__Imports__Group__1__Impl rule__Imports__Group__2 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:473:2: rule__Imports__Group__1__Impl rule__Imports__Group__2
            {
            pushFollow(FOLLOW_rule__Imports__Group__1__Impl_in_rule__Imports__Group__1935);
            rule__Imports__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Imports__Group__2_in_rule__Imports__Group__1938);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:480:1: rule__Imports__Group__1__Impl : ( ( rule__Imports__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Imports__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:484:1: ( ( ( rule__Imports__ImportedNamespaceAssignment_1 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:485:1: ( ( rule__Imports__ImportedNamespaceAssignment_1 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:485:1: ( ( rule__Imports__ImportedNamespaceAssignment_1 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:486:1: ( rule__Imports__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportsAccess().getImportedNamespaceAssignment_1()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:487:1: ( rule__Imports__ImportedNamespaceAssignment_1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:487:2: rule__Imports__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Imports__ImportedNamespaceAssignment_1_in_rule__Imports__Group__1__Impl965);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:497:1: rule__Imports__Group__2 : rule__Imports__Group__2__Impl ;
    public final void rule__Imports__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:501:1: ( rule__Imports__Group__2__Impl )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:502:2: rule__Imports__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Imports__Group__2__Impl_in_rule__Imports__Group__2995);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:508:1: rule__Imports__Group__2__Impl : ( ';' ) ;
    public final void rule__Imports__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:512:1: ( ( ';' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:513:1: ( ';' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:513:1: ( ';' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:514:1: ';'
            {
             before(grammarAccess.getImportsAccess().getSemicolonKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Imports__Group__2__Impl1023); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:533:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:537:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:538:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__01060);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__01063);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:545:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:549:1: ( ( ruleQualifiedName ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:550:1: ( ruleQualifiedName )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:550:1: ( ruleQualifiedName )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:551:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl1090);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:562:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:566:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:567:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__11119);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:573:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:577:1: ( ( ( '.*' )? ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:578:1: ( ( '.*' )? )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:578:1: ( ( '.*' )? )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:579:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:580:1: ( '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:581:2: '.*'
                    {
                    match(input,13,FOLLOW_13_in_rule__QualifiedNameWithWildcard__Group__1__Impl1148); 

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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:596:1: rule__Architecture__Group__0 : rule__Architecture__Group__0__Impl rule__Architecture__Group__1 ;
    public final void rule__Architecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:600:1: ( rule__Architecture__Group__0__Impl rule__Architecture__Group__1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:601:2: rule__Architecture__Group__0__Impl rule__Architecture__Group__1
            {
            pushFollow(FOLLOW_rule__Architecture__Group__0__Impl_in_rule__Architecture__Group__01185);
            rule__Architecture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Architecture__Group__1_in_rule__Architecture__Group__01188);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:608:1: rule__Architecture__Group__0__Impl : ( 'component' ) ;
    public final void rule__Architecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:612:1: ( ( 'component' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:613:1: ( 'component' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:613:1: ( 'component' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:614:1: 'component'
            {
             before(grammarAccess.getArchitectureAccess().getComponentKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Architecture__Group__0__Impl1216); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:627:1: rule__Architecture__Group__1 : rule__Architecture__Group__1__Impl rule__Architecture__Group__2 ;
    public final void rule__Architecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:631:1: ( rule__Architecture__Group__1__Impl rule__Architecture__Group__2 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:632:2: rule__Architecture__Group__1__Impl rule__Architecture__Group__2
            {
            pushFollow(FOLLOW_rule__Architecture__Group__1__Impl_in_rule__Architecture__Group__11247);
            rule__Architecture__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Architecture__Group__2_in_rule__Architecture__Group__11250);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:639:1: rule__Architecture__Group__1__Impl : ( ( rule__Architecture__NameAssignment_1 ) ) ;
    public final void rule__Architecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:643:1: ( ( ( rule__Architecture__NameAssignment_1 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:644:1: ( ( rule__Architecture__NameAssignment_1 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:644:1: ( ( rule__Architecture__NameAssignment_1 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:645:1: ( rule__Architecture__NameAssignment_1 )
            {
             before(grammarAccess.getArchitectureAccess().getNameAssignment_1()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:646:1: ( rule__Architecture__NameAssignment_1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:646:2: rule__Architecture__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Architecture__NameAssignment_1_in_rule__Architecture__Group__1__Impl1277);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:656:1: rule__Architecture__Group__2 : rule__Architecture__Group__2__Impl rule__Architecture__Group__3 ;
    public final void rule__Architecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:660:1: ( rule__Architecture__Group__2__Impl rule__Architecture__Group__3 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:661:2: rule__Architecture__Group__2__Impl rule__Architecture__Group__3
            {
            pushFollow(FOLLOW_rule__Architecture__Group__2__Impl_in_rule__Architecture__Group__21307);
            rule__Architecture__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Architecture__Group__3_in_rule__Architecture__Group__21310);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:668:1: rule__Architecture__Group__2__Impl : ( '{' ) ;
    public final void rule__Architecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:672:1: ( ( '{' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:673:1: ( '{' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:673:1: ( '{' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:674:1: '{'
            {
             before(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Architecture__Group__2__Impl1338); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:687:1: rule__Architecture__Group__3 : rule__Architecture__Group__3__Impl rule__Architecture__Group__4 ;
    public final void rule__Architecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:691:1: ( rule__Architecture__Group__3__Impl rule__Architecture__Group__4 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:692:2: rule__Architecture__Group__3__Impl rule__Architecture__Group__4
            {
            pushFollow(FOLLOW_rule__Architecture__Group__3__Impl_in_rule__Architecture__Group__31369);
            rule__Architecture__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Architecture__Group__4_in_rule__Architecture__Group__31372);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:699:1: rule__Architecture__Group__3__Impl : ( ( rule__Architecture__ElementsAssignment_3 )* ) ;
    public final void rule__Architecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:703:1: ( ( ( rule__Architecture__ElementsAssignment_3 )* ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:704:1: ( ( rule__Architecture__ElementsAssignment_3 )* )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:704:1: ( ( rule__Architecture__ElementsAssignment_3 )* )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:705:1: ( rule__Architecture__ElementsAssignment_3 )*
            {
             before(grammarAccess.getArchitectureAccess().getElementsAssignment_3()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:706:1: ( rule__Architecture__ElementsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17||(LA4_0>=19 && LA4_0<=21)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:706:2: rule__Architecture__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Architecture__ElementsAssignment_3_in_rule__Architecture__Group__3__Impl1399);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:716:1: rule__Architecture__Group__4 : rule__Architecture__Group__4__Impl ;
    public final void rule__Architecture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:720:1: ( rule__Architecture__Group__4__Impl )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:721:2: rule__Architecture__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Architecture__Group__4__Impl_in_rule__Architecture__Group__41430);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:727:1: rule__Architecture__Group__4__Impl : ( '}' ) ;
    public final void rule__Architecture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:731:1: ( ( '}' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:732:1: ( '}' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:732:1: ( '}' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:733:1: '}'
            {
             before(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Architecture__Group__4__Impl1458); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:756:1: rule__RequiredInterface__Group__0 : rule__RequiredInterface__Group__0__Impl rule__RequiredInterface__Group__1 ;
    public final void rule__RequiredInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:760:1: ( rule__RequiredInterface__Group__0__Impl rule__RequiredInterface__Group__1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:761:2: rule__RequiredInterface__Group__0__Impl rule__RequiredInterface__Group__1
            {
            pushFollow(FOLLOW_rule__RequiredInterface__Group__0__Impl_in_rule__RequiredInterface__Group__01499);
            rule__RequiredInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredInterface__Group__1_in_rule__RequiredInterface__Group__01502);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:768:1: rule__RequiredInterface__Group__0__Impl : ( 'requires' ) ;
    public final void rule__RequiredInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:772:1: ( ( 'requires' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:773:1: ( 'requires' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:773:1: ( 'requires' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:774:1: 'requires'
            {
             before(grammarAccess.getRequiredInterfaceAccess().getRequiresKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__RequiredInterface__Group__0__Impl1530); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:787:1: rule__RequiredInterface__Group__1 : rule__RequiredInterface__Group__1__Impl rule__RequiredInterface__Group__2 ;
    public final void rule__RequiredInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:791:1: ( rule__RequiredInterface__Group__1__Impl rule__RequiredInterface__Group__2 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:792:2: rule__RequiredInterface__Group__1__Impl rule__RequiredInterface__Group__2
            {
            pushFollow(FOLLOW_rule__RequiredInterface__Group__1__Impl_in_rule__RequiredInterface__Group__11561);
            rule__RequiredInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredInterface__Group__2_in_rule__RequiredInterface__Group__11564);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:799:1: rule__RequiredInterface__Group__1__Impl : ( ( rule__RequiredInterface__TypeAssignment_1 ) ) ;
    public final void rule__RequiredInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:803:1: ( ( ( rule__RequiredInterface__TypeAssignment_1 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:804:1: ( ( rule__RequiredInterface__TypeAssignment_1 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:804:1: ( ( rule__RequiredInterface__TypeAssignment_1 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:805:1: ( rule__RequiredInterface__TypeAssignment_1 )
            {
             before(grammarAccess.getRequiredInterfaceAccess().getTypeAssignment_1()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:806:1: ( rule__RequiredInterface__TypeAssignment_1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:806:2: rule__RequiredInterface__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__RequiredInterface__TypeAssignment_1_in_rule__RequiredInterface__Group__1__Impl1591);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:816:1: rule__RequiredInterface__Group__2 : rule__RequiredInterface__Group__2__Impl rule__RequiredInterface__Group__3 ;
    public final void rule__RequiredInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:820:1: ( rule__RequiredInterface__Group__2__Impl rule__RequiredInterface__Group__3 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:821:2: rule__RequiredInterface__Group__2__Impl rule__RequiredInterface__Group__3
            {
            pushFollow(FOLLOW_rule__RequiredInterface__Group__2__Impl_in_rule__RequiredInterface__Group__21621);
            rule__RequiredInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredInterface__Group__3_in_rule__RequiredInterface__Group__21624);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:828:1: rule__RequiredInterface__Group__2__Impl : ( 'as' ) ;
    public final void rule__RequiredInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:832:1: ( ( 'as' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:833:1: ( 'as' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:833:1: ( 'as' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:834:1: 'as'
            {
             before(grammarAccess.getRequiredInterfaceAccess().getAsKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__RequiredInterface__Group__2__Impl1652); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:847:1: rule__RequiredInterface__Group__3 : rule__RequiredInterface__Group__3__Impl rule__RequiredInterface__Group__4 ;
    public final void rule__RequiredInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:851:1: ( rule__RequiredInterface__Group__3__Impl rule__RequiredInterface__Group__4 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:852:2: rule__RequiredInterface__Group__3__Impl rule__RequiredInterface__Group__4
            {
            pushFollow(FOLLOW_rule__RequiredInterface__Group__3__Impl_in_rule__RequiredInterface__Group__31683);
            rule__RequiredInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredInterface__Group__4_in_rule__RequiredInterface__Group__31686);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:859:1: rule__RequiredInterface__Group__3__Impl : ( ( rule__RequiredInterface__NameAssignment_3 ) ) ;
    public final void rule__RequiredInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:863:1: ( ( ( rule__RequiredInterface__NameAssignment_3 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:864:1: ( ( rule__RequiredInterface__NameAssignment_3 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:864:1: ( ( rule__RequiredInterface__NameAssignment_3 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:865:1: ( rule__RequiredInterface__NameAssignment_3 )
            {
             before(grammarAccess.getRequiredInterfaceAccess().getNameAssignment_3()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:866:1: ( rule__RequiredInterface__NameAssignment_3 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:866:2: rule__RequiredInterface__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__RequiredInterface__NameAssignment_3_in_rule__RequiredInterface__Group__3__Impl1713);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:876:1: rule__RequiredInterface__Group__4 : rule__RequiredInterface__Group__4__Impl ;
    public final void rule__RequiredInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:880:1: ( rule__RequiredInterface__Group__4__Impl )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:881:2: rule__RequiredInterface__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RequiredInterface__Group__4__Impl_in_rule__RequiredInterface__Group__41743);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:887:1: rule__RequiredInterface__Group__4__Impl : ( ';' ) ;
    public final void rule__RequiredInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:891:1: ( ( ';' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:892:1: ( ';' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:892:1: ( ';' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:893:1: ';'
            {
             before(grammarAccess.getRequiredInterfaceAccess().getSemicolonKeyword_4()); 
            match(input,12,FOLLOW_12_in_rule__RequiredInterface__Group__4__Impl1771); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:916:1: rule__ProvidedInterface__Group__0 : rule__ProvidedInterface__Group__0__Impl rule__ProvidedInterface__Group__1 ;
    public final void rule__ProvidedInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:920:1: ( rule__ProvidedInterface__Group__0__Impl rule__ProvidedInterface__Group__1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:921:2: rule__ProvidedInterface__Group__0__Impl rule__ProvidedInterface__Group__1
            {
            pushFollow(FOLLOW_rule__ProvidedInterface__Group__0__Impl_in_rule__ProvidedInterface__Group__01812);
            rule__ProvidedInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProvidedInterface__Group__1_in_rule__ProvidedInterface__Group__01815);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:928:1: rule__ProvidedInterface__Group__0__Impl : ( 'provides' ) ;
    public final void rule__ProvidedInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:932:1: ( ( 'provides' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:933:1: ( 'provides' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:933:1: ( 'provides' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:934:1: 'provides'
            {
             before(grammarAccess.getProvidedInterfaceAccess().getProvidesKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__ProvidedInterface__Group__0__Impl1843); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:947:1: rule__ProvidedInterface__Group__1 : rule__ProvidedInterface__Group__1__Impl rule__ProvidedInterface__Group__2 ;
    public final void rule__ProvidedInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:951:1: ( rule__ProvidedInterface__Group__1__Impl rule__ProvidedInterface__Group__2 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:952:2: rule__ProvidedInterface__Group__1__Impl rule__ProvidedInterface__Group__2
            {
            pushFollow(FOLLOW_rule__ProvidedInterface__Group__1__Impl_in_rule__ProvidedInterface__Group__11874);
            rule__ProvidedInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProvidedInterface__Group__2_in_rule__ProvidedInterface__Group__11877);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:959:1: rule__ProvidedInterface__Group__1__Impl : ( ( rule__ProvidedInterface__TypeAssignment_1 ) ) ;
    public final void rule__ProvidedInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:963:1: ( ( ( rule__ProvidedInterface__TypeAssignment_1 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:964:1: ( ( rule__ProvidedInterface__TypeAssignment_1 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:964:1: ( ( rule__ProvidedInterface__TypeAssignment_1 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:965:1: ( rule__ProvidedInterface__TypeAssignment_1 )
            {
             before(grammarAccess.getProvidedInterfaceAccess().getTypeAssignment_1()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:966:1: ( rule__ProvidedInterface__TypeAssignment_1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:966:2: rule__ProvidedInterface__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__ProvidedInterface__TypeAssignment_1_in_rule__ProvidedInterface__Group__1__Impl1904);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:976:1: rule__ProvidedInterface__Group__2 : rule__ProvidedInterface__Group__2__Impl rule__ProvidedInterface__Group__3 ;
    public final void rule__ProvidedInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:980:1: ( rule__ProvidedInterface__Group__2__Impl rule__ProvidedInterface__Group__3 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:981:2: rule__ProvidedInterface__Group__2__Impl rule__ProvidedInterface__Group__3
            {
            pushFollow(FOLLOW_rule__ProvidedInterface__Group__2__Impl_in_rule__ProvidedInterface__Group__21934);
            rule__ProvidedInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProvidedInterface__Group__3_in_rule__ProvidedInterface__Group__21937);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:988:1: rule__ProvidedInterface__Group__2__Impl : ( 'as' ) ;
    public final void rule__ProvidedInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:992:1: ( ( 'as' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:993:1: ( 'as' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:993:1: ( 'as' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:994:1: 'as'
            {
             before(grammarAccess.getProvidedInterfaceAccess().getAsKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__ProvidedInterface__Group__2__Impl1965); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1007:1: rule__ProvidedInterface__Group__3 : rule__ProvidedInterface__Group__3__Impl rule__ProvidedInterface__Group__4 ;
    public final void rule__ProvidedInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1011:1: ( rule__ProvidedInterface__Group__3__Impl rule__ProvidedInterface__Group__4 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1012:2: rule__ProvidedInterface__Group__3__Impl rule__ProvidedInterface__Group__4
            {
            pushFollow(FOLLOW_rule__ProvidedInterface__Group__3__Impl_in_rule__ProvidedInterface__Group__31996);
            rule__ProvidedInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProvidedInterface__Group__4_in_rule__ProvidedInterface__Group__31999);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1019:1: rule__ProvidedInterface__Group__3__Impl : ( ( rule__ProvidedInterface__NameAssignment_3 ) ) ;
    public final void rule__ProvidedInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1023:1: ( ( ( rule__ProvidedInterface__NameAssignment_3 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1024:1: ( ( rule__ProvidedInterface__NameAssignment_3 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1024:1: ( ( rule__ProvidedInterface__NameAssignment_3 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1025:1: ( rule__ProvidedInterface__NameAssignment_3 )
            {
             before(grammarAccess.getProvidedInterfaceAccess().getNameAssignment_3()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1026:1: ( rule__ProvidedInterface__NameAssignment_3 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1026:2: rule__ProvidedInterface__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ProvidedInterface__NameAssignment_3_in_rule__ProvidedInterface__Group__3__Impl2026);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1036:1: rule__ProvidedInterface__Group__4 : rule__ProvidedInterface__Group__4__Impl ;
    public final void rule__ProvidedInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1040:1: ( rule__ProvidedInterface__Group__4__Impl )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1041:2: rule__ProvidedInterface__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ProvidedInterface__Group__4__Impl_in_rule__ProvidedInterface__Group__42056);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1047:1: rule__ProvidedInterface__Group__4__Impl : ( ';' ) ;
    public final void rule__ProvidedInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1051:1: ( ( ';' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1052:1: ( ';' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1052:1: ( ';' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1053:1: ';'
            {
             before(grammarAccess.getProvidedInterfaceAccess().getSemicolonKeyword_4()); 
            match(input,12,FOLLOW_12_in_rule__ProvidedInterface__Group__4__Impl2084); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1076:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1080:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1081:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__02125);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__1_in_rule__Component__Group__02128);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1088:1: rule__Component__Group__0__Impl : ( 'contains' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1092:1: ( ( 'contains' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1093:1: ( 'contains' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1093:1: ( 'contains' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1094:1: 'contains'
            {
             before(grammarAccess.getComponentAccess().getContainsKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Component__Group__0__Impl2156); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1107:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1111:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1112:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__12187);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__2_in_rule__Component__Group__12190);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1119:1: rule__Component__Group__1__Impl : ( ( rule__Component__TypeAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1123:1: ( ( ( rule__Component__TypeAssignment_1 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1124:1: ( ( rule__Component__TypeAssignment_1 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1124:1: ( ( rule__Component__TypeAssignment_1 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1125:1: ( rule__Component__TypeAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getTypeAssignment_1()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1126:1: ( rule__Component__TypeAssignment_1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1126:2: rule__Component__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Component__TypeAssignment_1_in_rule__Component__Group__1__Impl2217);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1136:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1140:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1141:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__22247);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__3_in_rule__Component__Group__22250);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1148:1: rule__Component__Group__2__Impl : ( 'as' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1152:1: ( ( 'as' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1153:1: ( 'as' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1153:1: ( 'as' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1154:1: 'as'
            {
             before(grammarAccess.getComponentAccess().getAsKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Component__Group__2__Impl2278); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1167:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1171:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1172:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__32309);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__4_in_rule__Component__Group__32312);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1179:1: rule__Component__Group__3__Impl : ( ( rule__Component__NameAssignment_3 ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1183:1: ( ( ( rule__Component__NameAssignment_3 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1184:1: ( ( rule__Component__NameAssignment_3 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1184:1: ( ( rule__Component__NameAssignment_3 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1185:1: ( rule__Component__NameAssignment_3 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_3()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1186:1: ( rule__Component__NameAssignment_3 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1186:2: rule__Component__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Component__NameAssignment_3_in_rule__Component__Group__3__Impl2339);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1196:1: rule__Component__Group__4 : rule__Component__Group__4__Impl ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1200:1: ( rule__Component__Group__4__Impl )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1201:2: rule__Component__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__42369);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1207:1: rule__Component__Group__4__Impl : ( ';' ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1211:1: ( ( ';' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1212:1: ( ';' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1212:1: ( ';' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1213:1: ';'
            {
             before(grammarAccess.getComponentAccess().getSemicolonKeyword_4()); 
            match(input,12,FOLLOW_12_in_rule__Component__Group__4__Impl2397); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1236:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1240:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1241:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_rule__Binding__Group__0__Impl_in_rule__Binding__Group__02438);
            rule__Binding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__1_in_rule__Binding__Group__02441);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1248:1: rule__Binding__Group__0__Impl : ( 'binds' ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1252:1: ( ( 'binds' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1253:1: ( 'binds' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1253:1: ( 'binds' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1254:1: 'binds'
            {
             before(grammarAccess.getBindingAccess().getBindsKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Binding__Group__0__Impl2469); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1267:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1271:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1272:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_rule__Binding__Group__1__Impl_in_rule__Binding__Group__12500);
            rule__Binding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__2_in_rule__Binding__Group__12503);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1279:1: rule__Binding__Group__1__Impl : ( ( rule__Binding__SourceComponentAssignment_1 ) ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1283:1: ( ( ( rule__Binding__SourceComponentAssignment_1 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1284:1: ( ( rule__Binding__SourceComponentAssignment_1 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1284:1: ( ( rule__Binding__SourceComponentAssignment_1 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1285:1: ( rule__Binding__SourceComponentAssignment_1 )
            {
             before(grammarAccess.getBindingAccess().getSourceComponentAssignment_1()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1286:1: ( rule__Binding__SourceComponentAssignment_1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1286:2: rule__Binding__SourceComponentAssignment_1
            {
            pushFollow(FOLLOW_rule__Binding__SourceComponentAssignment_1_in_rule__Binding__Group__1__Impl2530);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1296:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1300:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1301:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
            {
            pushFollow(FOLLOW_rule__Binding__Group__2__Impl_in_rule__Binding__Group__22560);
            rule__Binding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__3_in_rule__Binding__Group__22563);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1308:1: rule__Binding__Group__2__Impl : ( '.' ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1312:1: ( ( '.' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1313:1: ( '.' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1313:1: ( '.' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1314:1: '.'
            {
             before(grammarAccess.getBindingAccess().getFullStopKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Binding__Group__2__Impl2591); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1327:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl rule__Binding__Group__4 ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1331:1: ( rule__Binding__Group__3__Impl rule__Binding__Group__4 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1332:2: rule__Binding__Group__3__Impl rule__Binding__Group__4
            {
            pushFollow(FOLLOW_rule__Binding__Group__3__Impl_in_rule__Binding__Group__32622);
            rule__Binding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__4_in_rule__Binding__Group__32625);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1339:1: rule__Binding__Group__3__Impl : ( ( rule__Binding__SourceInterfaceAssignment_3 ) ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1343:1: ( ( ( rule__Binding__SourceInterfaceAssignment_3 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1344:1: ( ( rule__Binding__SourceInterfaceAssignment_3 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1344:1: ( ( rule__Binding__SourceInterfaceAssignment_3 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1345:1: ( rule__Binding__SourceInterfaceAssignment_3 )
            {
             before(grammarAccess.getBindingAccess().getSourceInterfaceAssignment_3()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1346:1: ( rule__Binding__SourceInterfaceAssignment_3 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1346:2: rule__Binding__SourceInterfaceAssignment_3
            {
            pushFollow(FOLLOW_rule__Binding__SourceInterfaceAssignment_3_in_rule__Binding__Group__3__Impl2652);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1356:1: rule__Binding__Group__4 : rule__Binding__Group__4__Impl rule__Binding__Group__5 ;
    public final void rule__Binding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1360:1: ( rule__Binding__Group__4__Impl rule__Binding__Group__5 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1361:2: rule__Binding__Group__4__Impl rule__Binding__Group__5
            {
            pushFollow(FOLLOW_rule__Binding__Group__4__Impl_in_rule__Binding__Group__42682);
            rule__Binding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__5_in_rule__Binding__Group__42685);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1368:1: rule__Binding__Group__4__Impl : ( 'to' ) ;
    public final void rule__Binding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1372:1: ( ( 'to' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1373:1: ( 'to' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1373:1: ( 'to' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1374:1: 'to'
            {
             before(grammarAccess.getBindingAccess().getToKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__Binding__Group__4__Impl2713); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1387:1: rule__Binding__Group__5 : rule__Binding__Group__5__Impl rule__Binding__Group__6 ;
    public final void rule__Binding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1391:1: ( rule__Binding__Group__5__Impl rule__Binding__Group__6 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1392:2: rule__Binding__Group__5__Impl rule__Binding__Group__6
            {
            pushFollow(FOLLOW_rule__Binding__Group__5__Impl_in_rule__Binding__Group__52744);
            rule__Binding__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__6_in_rule__Binding__Group__52747);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1399:1: rule__Binding__Group__5__Impl : ( ( rule__Binding__TargetComponentAssignment_5 ) ) ;
    public final void rule__Binding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1403:1: ( ( ( rule__Binding__TargetComponentAssignment_5 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1404:1: ( ( rule__Binding__TargetComponentAssignment_5 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1404:1: ( ( rule__Binding__TargetComponentAssignment_5 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1405:1: ( rule__Binding__TargetComponentAssignment_5 )
            {
             before(grammarAccess.getBindingAccess().getTargetComponentAssignment_5()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1406:1: ( rule__Binding__TargetComponentAssignment_5 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1406:2: rule__Binding__TargetComponentAssignment_5
            {
            pushFollow(FOLLOW_rule__Binding__TargetComponentAssignment_5_in_rule__Binding__Group__5__Impl2774);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1416:1: rule__Binding__Group__6 : rule__Binding__Group__6__Impl rule__Binding__Group__7 ;
    public final void rule__Binding__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1420:1: ( rule__Binding__Group__6__Impl rule__Binding__Group__7 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1421:2: rule__Binding__Group__6__Impl rule__Binding__Group__7
            {
            pushFollow(FOLLOW_rule__Binding__Group__6__Impl_in_rule__Binding__Group__62804);
            rule__Binding__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__7_in_rule__Binding__Group__62807);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1428:1: rule__Binding__Group__6__Impl : ( '.' ) ;
    public final void rule__Binding__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1432:1: ( ( '.' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1433:1: ( '.' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1433:1: ( '.' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1434:1: '.'
            {
             before(grammarAccess.getBindingAccess().getFullStopKeyword_6()); 
            match(input,22,FOLLOW_22_in_rule__Binding__Group__6__Impl2835); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1447:1: rule__Binding__Group__7 : rule__Binding__Group__7__Impl rule__Binding__Group__8 ;
    public final void rule__Binding__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1451:1: ( rule__Binding__Group__7__Impl rule__Binding__Group__8 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1452:2: rule__Binding__Group__7__Impl rule__Binding__Group__8
            {
            pushFollow(FOLLOW_rule__Binding__Group__7__Impl_in_rule__Binding__Group__72866);
            rule__Binding__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__8_in_rule__Binding__Group__72869);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1459:1: rule__Binding__Group__7__Impl : ( ( rule__Binding__TargetInterfaceAssignment_7 ) ) ;
    public final void rule__Binding__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1463:1: ( ( ( rule__Binding__TargetInterfaceAssignment_7 ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1464:1: ( ( rule__Binding__TargetInterfaceAssignment_7 ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1464:1: ( ( rule__Binding__TargetInterfaceAssignment_7 ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1465:1: ( rule__Binding__TargetInterfaceAssignment_7 )
            {
             before(grammarAccess.getBindingAccess().getTargetInterfaceAssignment_7()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1466:1: ( rule__Binding__TargetInterfaceAssignment_7 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1466:2: rule__Binding__TargetInterfaceAssignment_7
            {
            pushFollow(FOLLOW_rule__Binding__TargetInterfaceAssignment_7_in_rule__Binding__Group__7__Impl2896);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1476:1: rule__Binding__Group__8 : rule__Binding__Group__8__Impl ;
    public final void rule__Binding__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1480:1: ( rule__Binding__Group__8__Impl )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1481:2: rule__Binding__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Binding__Group__8__Impl_in_rule__Binding__Group__82926);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1487:1: rule__Binding__Group__8__Impl : ( ';' ) ;
    public final void rule__Binding__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1491:1: ( ( ';' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1492:1: ( ';' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1492:1: ( ';' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1493:1: ';'
            {
             before(grammarAccess.getBindingAccess().getSemicolonKeyword_8()); 
            match(input,12,FOLLOW_12_in_rule__Binding__Group__8__Impl2954); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1524:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1528:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1529:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03003);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03006);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1536:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1540:1: ( ( RULE_ID ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1541:1: ( RULE_ID )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1541:1: ( RULE_ID )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1542:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3033); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1553:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1557:1: ( rule__QualifiedName__Group__1__Impl )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1558:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13062);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1564:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1568:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1569:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1569:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1570:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1571:1: ( rule__QualifiedName__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1571:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3089);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1585:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1589:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1590:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03124);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03127);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1597:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1601:1: ( ( '.' ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1602:1: ( '.' )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1602:1: ( '.' )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1603:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__QualifiedName__Group_1__0__Impl3155); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1616:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1620:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1621:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13186);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1627:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1631:1: ( ( RULE_ID ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1632:1: ( RULE_ID )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1632:1: ( RULE_ID )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1633:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3213); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1649:1: rule__Definition__ImportsAssignment_0 : ( ruleImports ) ;
    public final void rule__Definition__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1653:1: ( ( ruleImports ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1654:1: ( ruleImports )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1654:1: ( ruleImports )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1655:1: ruleImports
            {
             before(grammarAccess.getDefinitionAccess().getImportsImportsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImports_in_rule__Definition__ImportsAssignment_03251);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1664:1: rule__Definition__ArchitectureAssignment_1 : ( ruleArchitecture ) ;
    public final void rule__Definition__ArchitectureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1668:1: ( ( ruleArchitecture ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1669:1: ( ruleArchitecture )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1669:1: ( ruleArchitecture )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1670:1: ruleArchitecture
            {
             before(grammarAccess.getDefinitionAccess().getArchitectureArchitectureParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleArchitecture_in_rule__Definition__ArchitectureAssignment_13282);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1679:1: rule__Imports__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Imports__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1683:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1684:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1684:1: ( ruleQualifiedNameWithWildcard )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1685:1: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportsAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Imports__ImportedNamespaceAssignment_13313);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1694:1: rule__Architecture__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Architecture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1698:1: ( ( ruleQualifiedName ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1699:1: ( ruleQualifiedName )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1699:1: ( ruleQualifiedName )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1700:1: ruleQualifiedName
            {
             before(grammarAccess.getArchitectureAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Architecture__NameAssignment_13344);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1709:1: rule__Architecture__ElementsAssignment_3 : ( ruleArchitectureElements ) ;
    public final void rule__Architecture__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1713:1: ( ( ruleArchitectureElements ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1714:1: ( ruleArchitectureElements )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1714:1: ( ruleArchitectureElements )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1715:1: ruleArchitectureElements
            {
             before(grammarAccess.getArchitectureAccess().getElementsArchitectureElementsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleArchitectureElements_in_rule__Architecture__ElementsAssignment_33375);
            ruleArchitectureElements();

            state._fsp--;

             after(grammarAccess.getArchitectureAccess().getElementsArchitectureElementsParserRuleCall_3_0()); 

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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1724:1: rule__RequiredInterface__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RequiredInterface__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1728:1: ( ( ( RULE_ID ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1729:1: ( ( RULE_ID ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1729:1: ( ( RULE_ID ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1730:1: ( RULE_ID )
            {
             before(grammarAccess.getRequiredInterfaceAccess().getTypeInterfaceDefinitionCrossReference_1_0()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1731:1: ( RULE_ID )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1732:1: RULE_ID
            {
             before(grammarAccess.getRequiredInterfaceAccess().getTypeInterfaceDefinitionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RequiredInterface__TypeAssignment_13410); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1743:1: rule__RequiredInterface__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__RequiredInterface__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1747:1: ( ( RULE_ID ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1748:1: ( RULE_ID )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1748:1: ( RULE_ID )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1749:1: RULE_ID
            {
             before(grammarAccess.getRequiredInterfaceAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RequiredInterface__NameAssignment_33445); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1758:1: rule__ProvidedInterface__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ProvidedInterface__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1762:1: ( ( ( RULE_ID ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1763:1: ( ( RULE_ID ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1763:1: ( ( RULE_ID ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1764:1: ( RULE_ID )
            {
             before(grammarAccess.getProvidedInterfaceAccess().getTypeInterfaceDefinitionCrossReference_1_0()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1765:1: ( RULE_ID )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1766:1: RULE_ID
            {
             before(grammarAccess.getProvidedInterfaceAccess().getTypeInterfaceDefinitionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProvidedInterface__TypeAssignment_13480); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1777:1: rule__ProvidedInterface__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ProvidedInterface__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1781:1: ( ( RULE_ID ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1782:1: ( RULE_ID )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1782:1: ( RULE_ID )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1783:1: RULE_ID
            {
             before(grammarAccess.getProvidedInterfaceAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProvidedInterface__NameAssignment_33515); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1792:1: rule__Component__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Component__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1796:1: ( ( ( ruleQualifiedName ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1797:1: ( ( ruleQualifiedName ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1797:1: ( ( ruleQualifiedName ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1798:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getComponentAccess().getTypeArchitectureCrossReference_1_0()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1799:1: ( ruleQualifiedName )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1800:1: ruleQualifiedName
            {
             before(grammarAccess.getComponentAccess().getTypeArchitectureQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Component__TypeAssignment_13550);
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1811:1: rule__Component__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1815:1: ( ( RULE_ID ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1816:1: ( RULE_ID )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1816:1: ( RULE_ID )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1817:1: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Component__NameAssignment_33585); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1826:1: rule__Binding__SourceComponentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__SourceComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1830:1: ( ( ( RULE_ID ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1831:1: ( ( RULE_ID ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1831:1: ( ( RULE_ID ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1832:1: ( RULE_ID )
            {
             before(grammarAccess.getBindingAccess().getSourceComponentComponentCrossReference_1_0()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1833:1: ( RULE_ID )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1834:1: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getSourceComponentComponentIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Binding__SourceComponentAssignment_13620); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1845:1: rule__Binding__SourceInterfaceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__SourceInterfaceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1849:1: ( ( ( RULE_ID ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1850:1: ( ( RULE_ID ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1850:1: ( ( RULE_ID ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1851:1: ( RULE_ID )
            {
             before(grammarAccess.getBindingAccess().getSourceInterfaceRequiredInterfaceCrossReference_3_0()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1852:1: ( RULE_ID )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1853:1: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getSourceInterfaceRequiredInterfaceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Binding__SourceInterfaceAssignment_33659); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1864:1: rule__Binding__TargetComponentAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__TargetComponentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1868:1: ( ( ( RULE_ID ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1869:1: ( ( RULE_ID ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1869:1: ( ( RULE_ID ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1870:1: ( RULE_ID )
            {
             before(grammarAccess.getBindingAccess().getTargetComponentComponentCrossReference_5_0()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1871:1: ( RULE_ID )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1872:1: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getTargetComponentComponentIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Binding__TargetComponentAssignment_53698); 
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
    // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1883:1: rule__Binding__TargetInterfaceAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__TargetInterfaceAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1887:1: ( ( ( RULE_ID ) ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1888:1: ( ( RULE_ID ) )
            {
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1888:1: ( ( RULE_ID ) )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1889:1: ( RULE_ID )
            {
             before(grammarAccess.getBindingAccess().getTargetInterfaceProvidedInterfaceCrossReference_7_0()); 
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1890:1: ( RULE_ID )
            // ../example.components.simple.ui/src-gen/example/components/simple/ui/contentassist/antlr/internal/InternalSimplifiedADL.g:1891:1: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getTargetInterfaceProvidedInterfaceIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Binding__TargetInterfaceAssignment_73737); 
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
    public static final BitSet FOLLOW_ruleArchitectureElements_in_entryRuleArchitectureElements301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchitectureElements308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchitectureElements__Alternatives_in_ruleArchitectureElements334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterface_in_entryRuleRequiredInterface361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredInterface368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredInterface__Group__0_in_ruleRequiredInterface394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterface_in_entryRuleProvidedInterface421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvidedInterface428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedInterface__Group__0_in_ruleProvidedInterface454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0_in_ruleComponent514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_entryRuleBinding541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinding548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__0_in_ruleBinding574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__ArchitectureElements__Alternatives670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterface_in_rule__ArchitectureElements__Alternatives687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterface_in_rule__ArchitectureElements__Alternatives704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_rule__ArchitectureElements__Alternatives721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__0751 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__0754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__ImportsAssignment_0_in_rule__Definition__Group__0__Impl781 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__ArchitectureAssignment_1_in_rule__Definition__Group__1__Impl839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Imports__Group__0__Impl_in_rule__Imports__Group__0873 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Imports__Group__1_in_rule__Imports__Group__0876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Imports__Group__0__Impl904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Imports__Group__1__Impl_in_rule__Imports__Group__1935 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Imports__Group__2_in_rule__Imports__Group__1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Imports__ImportedNamespaceAssignment_1_in_rule__Imports__Group__1__Impl965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Imports__Group__2__Impl_in_rule__Imports__Group__2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Imports__Group__2__Impl1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__01060 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__01063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__11119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__QualifiedNameWithWildcard__Group__1__Impl1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__Group__0__Impl_in_rule__Architecture__Group__01185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Architecture__Group__1_in_rule__Architecture__Group__01188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Architecture__Group__0__Impl1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__Group__1__Impl_in_rule__Architecture__Group__11247 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Architecture__Group__2_in_rule__Architecture__Group__11250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__NameAssignment_1_in_rule__Architecture__Group__1__Impl1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__Group__2__Impl_in_rule__Architecture__Group__21307 = new BitSet(new long[]{0x00000000003B0000L});
    public static final BitSet FOLLOW_rule__Architecture__Group__3_in_rule__Architecture__Group__21310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Architecture__Group__2__Impl1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__Group__3__Impl_in_rule__Architecture__Group__31369 = new BitSet(new long[]{0x00000000003B0000L});
    public static final BitSet FOLLOW_rule__Architecture__Group__4_in_rule__Architecture__Group__31372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__ElementsAssignment_3_in_rule__Architecture__Group__3__Impl1399 = new BitSet(new long[]{0x00000000003A0002L});
    public static final BitSet FOLLOW_rule__Architecture__Group__4__Impl_in_rule__Architecture__Group__41430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Architecture__Group__4__Impl1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredInterface__Group__0__Impl_in_rule__RequiredInterface__Group__01499 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RequiredInterface__Group__1_in_rule__RequiredInterface__Group__01502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RequiredInterface__Group__0__Impl1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredInterface__Group__1__Impl_in_rule__RequiredInterface__Group__11561 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__RequiredInterface__Group__2_in_rule__RequiredInterface__Group__11564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredInterface__TypeAssignment_1_in_rule__RequiredInterface__Group__1__Impl1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredInterface__Group__2__Impl_in_rule__RequiredInterface__Group__21621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RequiredInterface__Group__3_in_rule__RequiredInterface__Group__21624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RequiredInterface__Group__2__Impl1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredInterface__Group__3__Impl_in_rule__RequiredInterface__Group__31683 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RequiredInterface__Group__4_in_rule__RequiredInterface__Group__31686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredInterface__NameAssignment_3_in_rule__RequiredInterface__Group__3__Impl1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredInterface__Group__4__Impl_in_rule__RequiredInterface__Group__41743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RequiredInterface__Group__4__Impl1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedInterface__Group__0__Impl_in_rule__ProvidedInterface__Group__01812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProvidedInterface__Group__1_in_rule__ProvidedInterface__Group__01815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ProvidedInterface__Group__0__Impl1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedInterface__Group__1__Impl_in_rule__ProvidedInterface__Group__11874 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ProvidedInterface__Group__2_in_rule__ProvidedInterface__Group__11877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedInterface__TypeAssignment_1_in_rule__ProvidedInterface__Group__1__Impl1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedInterface__Group__2__Impl_in_rule__ProvidedInterface__Group__21934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProvidedInterface__Group__3_in_rule__ProvidedInterface__Group__21937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ProvidedInterface__Group__2__Impl1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedInterface__Group__3__Impl_in_rule__ProvidedInterface__Group__31996 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ProvidedInterface__Group__4_in_rule__ProvidedInterface__Group__31999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedInterface__NameAssignment_3_in_rule__ProvidedInterface__Group__3__Impl2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedInterface__Group__4__Impl_in_rule__ProvidedInterface__Group__42056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ProvidedInterface__Group__4__Impl2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__02125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Component__Group__1_in_rule__Component__Group__02128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Component__Group__0__Impl2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__12187 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Component__Group__2_in_rule__Component__Group__12190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__TypeAssignment_1_in_rule__Component__Group__1__Impl2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__22247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Component__Group__3_in_rule__Component__Group__22250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Component__Group__2__Impl2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__32309 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Component__Group__4_in_rule__Component__Group__32312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__NameAssignment_3_in_rule__Component__Group__3__Impl2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__42369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Component__Group__4__Impl2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__0__Impl_in_rule__Binding__Group__02438 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Binding__Group__1_in_rule__Binding__Group__02441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Binding__Group__0__Impl2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__1__Impl_in_rule__Binding__Group__12500 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Binding__Group__2_in_rule__Binding__Group__12503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__SourceComponentAssignment_1_in_rule__Binding__Group__1__Impl2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__2__Impl_in_rule__Binding__Group__22560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Binding__Group__3_in_rule__Binding__Group__22563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Binding__Group__2__Impl2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__3__Impl_in_rule__Binding__Group__32622 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Binding__Group__4_in_rule__Binding__Group__32625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__SourceInterfaceAssignment_3_in_rule__Binding__Group__3__Impl2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__4__Impl_in_rule__Binding__Group__42682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Binding__Group__5_in_rule__Binding__Group__42685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Binding__Group__4__Impl2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__5__Impl_in_rule__Binding__Group__52744 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Binding__Group__6_in_rule__Binding__Group__52747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__TargetComponentAssignment_5_in_rule__Binding__Group__5__Impl2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__6__Impl_in_rule__Binding__Group__62804 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Binding__Group__7_in_rule__Binding__Group__62807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Binding__Group__6__Impl2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__7__Impl_in_rule__Binding__Group__72866 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Binding__Group__8_in_rule__Binding__Group__72869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__TargetInterfaceAssignment_7_in_rule__Binding__Group__7__Impl2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__8__Impl_in_rule__Binding__Group__82926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Binding__Group__8__Impl2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03003 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3089 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__QualifiedName__Group_1__0__Impl3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImports_in_rule__Definition__ImportsAssignment_03251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitecture_in_rule__Definition__ArchitectureAssignment_13282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Imports__ImportedNamespaceAssignment_13313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Architecture__NameAssignment_13344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitectureElements_in_rule__Architecture__ElementsAssignment_33375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RequiredInterface__TypeAssignment_13410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RequiredInterface__NameAssignment_33445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProvidedInterface__TypeAssignment_13480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProvidedInterface__NameAssignment_33515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Component__TypeAssignment_13550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Component__NameAssignment_33585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Binding__SourceComponentAssignment_13620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Binding__SourceInterfaceAssignment_33659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Binding__TargetComponentAssignment_53698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Binding__TargetInterfaceAssignment_73737 = new BitSet(new long[]{0x0000000000000002L});

}