/*
* generated by Xtext
*/
package example.components.simple.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class SimplifiedADLGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class DefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Definition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsImportsParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cArchitectureAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cArchitectureArchitectureParserRuleCall_1_0 = (RuleCall)cArchitectureAssignment_1.eContents().get(0);
		
		//Definition:
		//	imports+=Imports* architecture=Architecture;
		public ParserRule getRule() { return rule; }

		//imports+=Imports* architecture=Architecture
		public Group getGroup() { return cGroup; }

		//imports+=Imports*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }

		//Imports
		public RuleCall getImportsImportsParserRuleCall_0_0() { return cImportsImportsParserRuleCall_0_0; }

		//architecture=Architecture
		public Assignment getArchitectureAssignment_1() { return cArchitectureAssignment_1; }

		//Architecture
		public RuleCall getArchitectureArchitectureParserRuleCall_1_0() { return cArchitectureArchitectureParserRuleCall_1_0; }
	}

	public class ImportsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Imports");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Imports:
		//	"import" importedNamespace=QualifiedNameWithWildcard ";";
		public ParserRule getRule() { return rule; }

		//"import" importedNamespace=QualifiedNameWithWildcard ";"
		public Group getGroup() { return cGroup; }

		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//importedNamespace=QualifiedNameWithWildcard
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }

		//QualifiedNameWithWildcard
		public RuleCall getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0() { return cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0; }

		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}

	public class QualifiedNameWithWildcardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedNameWithWildcard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//QualifiedNameWithWildcard:
		//	QualifiedName ".*"?;
		public ParserRule getRule() { return rule; }

		//QualifiedName ".*"?
		public Group getGroup() { return cGroup; }

		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }

		//".*"?
		public Keyword getFullStopAsteriskKeyword_1() { return cFullStopAsteriskKeyword_1; }
	}

	public class ArchitectureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Architecture");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComponentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElementsArchitectureElementsParserRuleCall_3_0 = (RuleCall)cElementsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Architecture:
		//	"component" name=QualifiedName "{" elements+=ArchitectureElements* "}";
		public ParserRule getRule() { return rule; }

		//"component" name=QualifiedName "{" elements+=ArchitectureElements* "}"
		public Group getGroup() { return cGroup; }

		//"component"
		public Keyword getComponentKeyword_0() { return cComponentKeyword_0; }

		//name=QualifiedName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_1_0() { return cNameQualifiedNameParserRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//elements+=ArchitectureElements*
		public Assignment getElementsAssignment_3() { return cElementsAssignment_3; }

		//ArchitectureElements
		public RuleCall getElementsArchitectureElementsParserRuleCall_3_0() { return cElementsArchitectureElementsParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class ArchitectureElementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ArchitectureElements");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cComponentParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cProvidedInterfaceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cRequiredInterfaceParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cBindingParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//ArchitectureElements:
		//	Component | ProvidedInterface | RequiredInterface | Binding;
		public ParserRule getRule() { return rule; }

		//Component | ProvidedInterface | RequiredInterface | Binding
		public Alternatives getAlternatives() { return cAlternatives; }

		//Component
		public RuleCall getComponentParserRuleCall_0() { return cComponentParserRuleCall_0; }

		//ProvidedInterface
		public RuleCall getProvidedInterfaceParserRuleCall_1() { return cProvidedInterfaceParserRuleCall_1; }

		//RequiredInterface
		public RuleCall getRequiredInterfaceParserRuleCall_2() { return cRequiredInterfaceParserRuleCall_2; }

		//Binding
		public RuleCall getBindingParserRuleCall_3() { return cBindingParserRuleCall_3; }
	}

	public class RequiredInterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RequiredInterface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRequiresKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTypeInterfaceDefinitionCrossReference_1_0 = (CrossReference)cTypeAssignment_1.eContents().get(0);
		private final RuleCall cTypeInterfaceDefinitionQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cTypeInterfaceDefinitionCrossReference_1_0.eContents().get(1);
		private final Keyword cAsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//RequiredInterface:
		//	"requires" type=[SimplifiedItf::InterfaceDefinition|QualifiedName] "as" name=ID ";";
		public ParserRule getRule() { return rule; }

		//"requires" type=[SimplifiedItf::InterfaceDefinition|QualifiedName] "as" name=ID ";"
		public Group getGroup() { return cGroup; }

		//"requires"
		public Keyword getRequiresKeyword_0() { return cRequiresKeyword_0; }

		//type=[SimplifiedItf::InterfaceDefinition|QualifiedName]
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//[SimplifiedItf::InterfaceDefinition|QualifiedName]
		public CrossReference getTypeInterfaceDefinitionCrossReference_1_0() { return cTypeInterfaceDefinitionCrossReference_1_0; }

		//QualifiedName
		public RuleCall getTypeInterfaceDefinitionQualifiedNameParserRuleCall_1_0_1() { return cTypeInterfaceDefinitionQualifiedNameParserRuleCall_1_0_1; }

		//"as"
		public Keyword getAsKeyword_2() { return cAsKeyword_2; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class ProvidedInterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ProvidedInterface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProvidesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTypeInterfaceDefinitionCrossReference_1_0 = (CrossReference)cTypeAssignment_1.eContents().get(0);
		private final RuleCall cTypeInterfaceDefinitionQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cTypeInterfaceDefinitionCrossReference_1_0.eContents().get(1);
		private final Keyword cAsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ProvidedInterface:
		//	"provides" type=[SimplifiedItf::InterfaceDefinition|QualifiedName] "as" name=ID ";";
		public ParserRule getRule() { return rule; }

		//"provides" type=[SimplifiedItf::InterfaceDefinition|QualifiedName] "as" name=ID ";"
		public Group getGroup() { return cGroup; }

		//"provides"
		public Keyword getProvidesKeyword_0() { return cProvidesKeyword_0; }

		//type=[SimplifiedItf::InterfaceDefinition|QualifiedName]
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//[SimplifiedItf::InterfaceDefinition|QualifiedName]
		public CrossReference getTypeInterfaceDefinitionCrossReference_1_0() { return cTypeInterfaceDefinitionCrossReference_1_0; }

		//QualifiedName
		public RuleCall getTypeInterfaceDefinitionQualifiedNameParserRuleCall_1_0_1() { return cTypeInterfaceDefinitionQualifiedNameParserRuleCall_1_0_1; }

		//"as"
		public Keyword getAsKeyword_2() { return cAsKeyword_2; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class ComponentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Component");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContainsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTypeArchitectureCrossReference_1_0 = (CrossReference)cTypeAssignment_1.eContents().get(0);
		private final RuleCall cTypeArchitectureQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cTypeArchitectureCrossReference_1_0.eContents().get(1);
		private final Keyword cAsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Component:
		//	"contains" type=[Architecture|QualifiedName] "as" name=ID ";";
		public ParserRule getRule() { return rule; }

		//"contains" type=[Architecture|QualifiedName] "as" name=ID ";"
		public Group getGroup() { return cGroup; }

		//"contains"
		public Keyword getContainsKeyword_0() { return cContainsKeyword_0; }

		//type=[Architecture|QualifiedName]
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//[Architecture|QualifiedName]
		public CrossReference getTypeArchitectureCrossReference_1_0() { return cTypeArchitectureCrossReference_1_0; }

		//QualifiedName
		public RuleCall getTypeArchitectureQualifiedNameParserRuleCall_1_0_1() { return cTypeArchitectureQualifiedNameParserRuleCall_1_0_1; }

		//"as"
		public Keyword getAsKeyword_2() { return cAsKeyword_2; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class BindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Binding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBindsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSourceComponentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cSourceComponentComponentCrossReference_1_0 = (CrossReference)cSourceComponentAssignment_1.eContents().get(0);
		private final RuleCall cSourceComponentComponentIDTerminalRuleCall_1_0_1 = (RuleCall)cSourceComponentComponentCrossReference_1_0.eContents().get(1);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSourceInterfaceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cSourceInterfaceRequiredInterfaceCrossReference_3_0 = (CrossReference)cSourceInterfaceAssignment_3.eContents().get(0);
		private final RuleCall cSourceInterfaceRequiredInterfaceIDTerminalRuleCall_3_0_1 = (RuleCall)cSourceInterfaceRequiredInterfaceCrossReference_3_0.eContents().get(1);
		private final Keyword cToKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cTargetComponentAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cTargetComponentComponentCrossReference_5_0 = (CrossReference)cTargetComponentAssignment_5.eContents().get(0);
		private final RuleCall cTargetComponentComponentIDTerminalRuleCall_5_0_1 = (RuleCall)cTargetComponentComponentCrossReference_5_0.eContents().get(1);
		private final Keyword cFullStopKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cTargetInterfaceAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cTargetInterfaceProvidedInterfaceCrossReference_7_0 = (CrossReference)cTargetInterfaceAssignment_7.eContents().get(0);
		private final RuleCall cTargetInterfaceProvidedInterfaceIDTerminalRuleCall_7_0_1 = (RuleCall)cTargetInterfaceProvidedInterfaceCrossReference_7_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Binding:
		//	"binds" sourceComponent=[Component] "." sourceInterface=[RequiredInterface] "to" targetComponent=[Component] "."
		//	targetInterface=[ProvidedInterface] ";";
		public ParserRule getRule() { return rule; }

		//"binds" sourceComponent=[Component] "." sourceInterface=[RequiredInterface] "to" targetComponent=[Component] "."
		//targetInterface=[ProvidedInterface] ";"
		public Group getGroup() { return cGroup; }

		//"binds"
		public Keyword getBindsKeyword_0() { return cBindsKeyword_0; }

		//sourceComponent=[Component]
		public Assignment getSourceComponentAssignment_1() { return cSourceComponentAssignment_1; }

		//[Component]
		public CrossReference getSourceComponentComponentCrossReference_1_0() { return cSourceComponentComponentCrossReference_1_0; }

		//ID
		public RuleCall getSourceComponentComponentIDTerminalRuleCall_1_0_1() { return cSourceComponentComponentIDTerminalRuleCall_1_0_1; }

		//"."
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }

		//sourceInterface=[RequiredInterface]
		public Assignment getSourceInterfaceAssignment_3() { return cSourceInterfaceAssignment_3; }

		//[RequiredInterface]
		public CrossReference getSourceInterfaceRequiredInterfaceCrossReference_3_0() { return cSourceInterfaceRequiredInterfaceCrossReference_3_0; }

		//ID
		public RuleCall getSourceInterfaceRequiredInterfaceIDTerminalRuleCall_3_0_1() { return cSourceInterfaceRequiredInterfaceIDTerminalRuleCall_3_0_1; }

		//"to"
		public Keyword getToKeyword_4() { return cToKeyword_4; }

		//targetComponent=[Component]
		public Assignment getTargetComponentAssignment_5() { return cTargetComponentAssignment_5; }

		//[Component]
		public CrossReference getTargetComponentComponentCrossReference_5_0() { return cTargetComponentComponentCrossReference_5_0; }

		//ID
		public RuleCall getTargetComponentComponentIDTerminalRuleCall_5_0_1() { return cTargetComponentComponentIDTerminalRuleCall_5_0_1; }

		//"."
		public Keyword getFullStopKeyword_6() { return cFullStopKeyword_6; }

		//targetInterface=[ProvidedInterface]
		public Assignment getTargetInterfaceAssignment_7() { return cTargetInterfaceAssignment_7; }

		//[ProvidedInterface]
		public CrossReference getTargetInterfaceProvidedInterfaceCrossReference_7_0() { return cTargetInterfaceProvidedInterfaceCrossReference_7_0; }

		//ID
		public RuleCall getTargetInterfaceProvidedInterfaceIDTerminalRuleCall_7_0_1() { return cTargetInterfaceProvidedInterfaceIDTerminalRuleCall_7_0_1; }

		//";"
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	private final DefinitionElements pDefinition;
	private final ImportsElements pImports;
	private final QualifiedNameWithWildcardElements pQualifiedNameWithWildcard;
	private final ArchitectureElements pArchitecture;
	private final ArchitectureElementsElements pArchitectureElements;
	private final RequiredInterfaceElements pRequiredInterface;
	private final ProvidedInterfaceElements pProvidedInterface;
	private final ComponentElements pComponent;
	private final BindingElements pBinding;
	private final QualifiedNameElements pQualifiedName;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SimplifiedADLGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDefinition = new DefinitionElements();
		this.pImports = new ImportsElements();
		this.pQualifiedNameWithWildcard = new QualifiedNameWithWildcardElements();
		this.pArchitecture = new ArchitectureElements();
		this.pArchitectureElements = new ArchitectureElementsElements();
		this.pRequiredInterface = new RequiredInterfaceElements();
		this.pProvidedInterface = new ProvidedInterfaceElements();
		this.pComponent = new ComponentElements();
		this.pBinding = new BindingElements();
		this.pQualifiedName = new QualifiedNameElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("example.components.simple.SimplifiedADL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Definition:
	//	imports+=Imports* architecture=Architecture;
	public DefinitionElements getDefinitionAccess() {
		return pDefinition;
	}
	
	public ParserRule getDefinitionRule() {
		return getDefinitionAccess().getRule();
	}

	//Imports:
	//	"import" importedNamespace=QualifiedNameWithWildcard ";";
	public ImportsElements getImportsAccess() {
		return pImports;
	}
	
	public ParserRule getImportsRule() {
		return getImportsAccess().getRule();
	}

	//QualifiedNameWithWildcard:
	//	QualifiedName ".*"?;
	public QualifiedNameWithWildcardElements getQualifiedNameWithWildcardAccess() {
		return pQualifiedNameWithWildcard;
	}
	
	public ParserRule getQualifiedNameWithWildcardRule() {
		return getQualifiedNameWithWildcardAccess().getRule();
	}

	//Architecture:
	//	"component" name=QualifiedName "{" elements+=ArchitectureElements* "}";
	public ArchitectureElements getArchitectureAccess() {
		return pArchitecture;
	}
	
	public ParserRule getArchitectureRule() {
		return getArchitectureAccess().getRule();
	}

	//ArchitectureElements:
	//	Component | ProvidedInterface | RequiredInterface | Binding;
	public ArchitectureElementsElements getArchitectureElementsAccess() {
		return pArchitectureElements;
	}
	
	public ParserRule getArchitectureElementsRule() {
		return getArchitectureElementsAccess().getRule();
	}

	//RequiredInterface:
	//	"requires" type=[SimplifiedItf::InterfaceDefinition|QualifiedName] "as" name=ID ";";
	public RequiredInterfaceElements getRequiredInterfaceAccess() {
		return pRequiredInterface;
	}
	
	public ParserRule getRequiredInterfaceRule() {
		return getRequiredInterfaceAccess().getRule();
	}

	//ProvidedInterface:
	//	"provides" type=[SimplifiedItf::InterfaceDefinition|QualifiedName] "as" name=ID ";";
	public ProvidedInterfaceElements getProvidedInterfaceAccess() {
		return pProvidedInterface;
	}
	
	public ParserRule getProvidedInterfaceRule() {
		return getProvidedInterfaceAccess().getRule();
	}

	//Component:
	//	"contains" type=[Architecture|QualifiedName] "as" name=ID ";";
	public ComponentElements getComponentAccess() {
		return pComponent;
	}
	
	public ParserRule getComponentRule() {
		return getComponentAccess().getRule();
	}

	//Binding:
	//	"binds" sourceComponent=[Component] "." sourceInterface=[RequiredInterface] "to" targetComponent=[Component] "."
	//	targetInterface=[ProvidedInterface] ";";
	public BindingElements getBindingAccess() {
		return pBinding;
	}
	
	public ParserRule getBindingRule() {
		return getBindingAccess().getRule();
	}

	//QualifiedName:
	//	ID ("." ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
