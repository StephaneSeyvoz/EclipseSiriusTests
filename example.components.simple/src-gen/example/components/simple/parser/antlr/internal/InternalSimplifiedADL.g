/*
* generated by Xtext
*/
grammar InternalSimplifiedADL;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package example.components.simple.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleDefinition
entryRuleDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDefinitionRule()); }
	 iv_ruleDefinition=ruleDefinition 
	 { $current=$iv_ruleDefinition.current; } 
	 EOF 
;

// Rule Definition
ruleDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getDefinitionAccess().getImportsImportsParserRuleCall_0_0()); 
	    }
		lv_imports_0_0=ruleImports		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDefinitionRule());
	        }
       		add(
       			$current, 
       			"imports",
        		lv_imports_0_0, 
        		"Imports");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getDefinitionAccess().getArchitectureArchitectureParserRuleCall_1_0()); 
	    }
		lv_architecture_1_0=ruleArchitecture		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDefinitionRule());
	        }
       		set(
       			$current, 
       			"architecture",
        		lv_architecture_1_0, 
        		"Architecture");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleImports
entryRuleImports returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImportsRule()); }
	 iv_ruleImports=ruleImports 
	 { $current=$iv_ruleImports.current; } 
	 EOF 
;

// Rule Imports
ruleImports returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='import' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getImportsAccess().getImportKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getImportsAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
	    }
		lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getImportsRule());
	        }
       		set(
       			$current, 
       			"importedNamespace",
        		lv_importedNamespace_1_0, 
        		"QualifiedNameWithWildcard");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getImportsAccess().getSemicolonKeyword_2());
    }
)
;





// Entry rule entryRuleQualifiedNameWithWildcard
entryRuleQualifiedNameWithWildcard returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); } 
	 iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard 
	 { $current=$iv_ruleQualifiedNameWithWildcard.current.getText(); }  
	 EOF 
;

// Rule QualifiedNameWithWildcard
ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
    }
    this_QualifiedName_0=ruleQualifiedName    {
		$current.merge(this_QualifiedName_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }
(
	kw='.*' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
    }
)?)
    ;





// Entry rule entryRuleArchitecture
entryRuleArchitecture returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getArchitectureRule()); }
	 iv_ruleArchitecture=ruleArchitecture 
	 { $current=$iv_ruleArchitecture.current; } 
	 EOF 
;

// Rule Architecture
ruleArchitecture returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='component' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getArchitectureAccess().getComponentKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getArchitectureAccess().getNameQualifiedNameParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleQualifiedName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getArchitectureRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"QualifiedName");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getArchitectureAccess().getElementsArchitectureElementsParserRuleCall_3_0()); 
	    }
		lv_elements_3_0=ruleArchitectureElements		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getArchitectureRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_3_0, 
        		"ArchitectureElements");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleArchitectureElements
entryRuleArchitectureElements returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getArchitectureElementsRule()); }
	 iv_ruleArchitectureElements=ruleArchitectureElements 
	 { $current=$iv_ruleArchitectureElements.current; } 
	 EOF 
;

// Rule ArchitectureElements
ruleArchitectureElements returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getArchitectureElementsAccess().getComponentParserRuleCall_0()); 
    }
    this_Component_0=ruleComponent
    { 
        $current = $this_Component_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getArchitectureElementsAccess().getProvidedInterfaceParserRuleCall_1()); 
    }
    this_ProvidedInterface_1=ruleProvidedInterface
    { 
        $current = $this_ProvidedInterface_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getArchitectureElementsAccess().getRequiredInterfaceParserRuleCall_2()); 
    }
    this_RequiredInterface_2=ruleRequiredInterface
    { 
        $current = $this_RequiredInterface_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getArchitectureElementsAccess().getBindingParserRuleCall_3()); 
    }
    this_Binding_3=ruleBinding
    { 
        $current = $this_Binding_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleRequiredInterface
entryRuleRequiredInterface returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRequiredInterfaceRule()); }
	 iv_ruleRequiredInterface=ruleRequiredInterface 
	 { $current=$iv_ruleRequiredInterface.current; } 
	 EOF 
;

// Rule RequiredInterface
ruleRequiredInterface returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='requires' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getRequiredInterfaceAccess().getRequiresKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRequiredInterfaceRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getRequiredInterfaceAccess().getTypeInterfaceDefinitionCrossReference_1_0()); 
	}

)
)	otherlv_2='as' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getRequiredInterfaceAccess().getAsKeyword_2());
    }
(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getRequiredInterfaceAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRequiredInterfaceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"ID");
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getRequiredInterfaceAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleProvidedInterface
entryRuleProvidedInterface returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProvidedInterfaceRule()); }
	 iv_ruleProvidedInterface=ruleProvidedInterface 
	 { $current=$iv_ruleProvidedInterface.current; } 
	 EOF 
;

// Rule ProvidedInterface
ruleProvidedInterface returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='provides' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getProvidedInterfaceAccess().getProvidesKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getProvidedInterfaceRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getProvidedInterfaceAccess().getTypeInterfaceDefinitionCrossReference_1_0()); 
	}

)
)	otherlv_2='as' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getProvidedInterfaceAccess().getAsKeyword_2());
    }
(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getProvidedInterfaceAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getProvidedInterfaceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"ID");
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getProvidedInterfaceAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleComponent
entryRuleComponent returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getComponentRule()); }
	 iv_ruleComponent=ruleComponent 
	 { $current=$iv_ruleComponent.current; } 
	 EOF 
;

// Rule Component
ruleComponent returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='contains' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getContainsKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getComponentRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getComponentAccess().getTypeArchitectureCrossReference_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='as' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getAsKeyword_2());
    }
(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getComponentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"ID");
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleBinding
entryRuleBinding returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBindingRule()); }
	 iv_ruleBinding=ruleBinding 
	 { $current=$iv_ruleBinding.current; } 
	 EOF 
;

// Rule Binding
ruleBinding returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='binds' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getBindingAccess().getBindsKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getBindingRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getSourceComponentComponentCrossReference_1_0()); 
	}

)
)	otherlv_2='.' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getBindingAccess().getFullStopKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getBindingRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getBindingAccess().getSourceInterfaceRequiredInterfaceCrossReference_3_0()); 
	}

)
)	otherlv_4='to' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getBindingAccess().getToKeyword_4());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getBindingRule());
	        }
        }
	otherlv_5=RULE_ID
	{
		newLeafNode(otherlv_5, grammarAccess.getBindingAccess().getTargetComponentComponentCrossReference_5_0()); 
	}

)
)	otherlv_6='.' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getBindingAccess().getFullStopKeyword_6());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getBindingRule());
	        }
        }
	otherlv_7=RULE_ID
	{
		newLeafNode(otherlv_7, grammarAccess.getBindingAccess().getTargetInterfaceProvidedInterfaceCrossReference_7_0()); 
	}

)
)	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getBindingAccess().getSemicolonKeyword_8());
    }
)
;





// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); } 
	 iv_ruleQualifiedName=ruleQualifiedName 
	 { $current=$iv_ruleQualifiedName.current.getText(); }  
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


