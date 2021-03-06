/*
* generated by Xtext
*/
package example.components.simple.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import example.components.simple.services.SimplifiedADLGrammarAccess;

public class SimplifiedADLParser extends AbstractContentAssistParser {
	
	@Inject
	private SimplifiedADLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected example.components.simple.ui.contentassist.antlr.internal.InternalSimplifiedADLParser createParser() {
		example.components.simple.ui.contentassist.antlr.internal.InternalSimplifiedADLParser result = new example.components.simple.ui.contentassist.antlr.internal.InternalSimplifiedADLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getArchitectureElementsAccess().getAlternatives(), "rule__ArchitectureElements__Alternatives");
					put(grammarAccess.getDefinitionAccess().getGroup(), "rule__Definition__Group__0");
					put(grammarAccess.getImportsAccess().getGroup(), "rule__Imports__Group__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getArchitectureAccess().getGroup(), "rule__Architecture__Group__0");
					put(grammarAccess.getRequiredInterfaceAccess().getGroup(), "rule__RequiredInterface__Group__0");
					put(grammarAccess.getProvidedInterfaceAccess().getGroup(), "rule__ProvidedInterface__Group__0");
					put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
					put(grammarAccess.getBindingAccess().getGroup(), "rule__Binding__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getDefinitionAccess().getImportsAssignment_0(), "rule__Definition__ImportsAssignment_0");
					put(grammarAccess.getDefinitionAccess().getArchitectureAssignment_1(), "rule__Definition__ArchitectureAssignment_1");
					put(grammarAccess.getImportsAccess().getImportedNamespaceAssignment_1(), "rule__Imports__ImportedNamespaceAssignment_1");
					put(grammarAccess.getArchitectureAccess().getNameAssignment_1(), "rule__Architecture__NameAssignment_1");
					put(grammarAccess.getArchitectureAccess().getElementsAssignment_3(), "rule__Architecture__ElementsAssignment_3");
					put(grammarAccess.getRequiredInterfaceAccess().getTypeAssignment_1(), "rule__RequiredInterface__TypeAssignment_1");
					put(grammarAccess.getRequiredInterfaceAccess().getNameAssignment_3(), "rule__RequiredInterface__NameAssignment_3");
					put(grammarAccess.getProvidedInterfaceAccess().getTypeAssignment_1(), "rule__ProvidedInterface__TypeAssignment_1");
					put(grammarAccess.getProvidedInterfaceAccess().getNameAssignment_3(), "rule__ProvidedInterface__NameAssignment_3");
					put(grammarAccess.getComponentAccess().getTypeAssignment_1(), "rule__Component__TypeAssignment_1");
					put(grammarAccess.getComponentAccess().getNameAssignment_3(), "rule__Component__NameAssignment_3");
					put(grammarAccess.getBindingAccess().getSourceComponentAssignment_1(), "rule__Binding__SourceComponentAssignment_1");
					put(grammarAccess.getBindingAccess().getSourceInterfaceAssignment_3(), "rule__Binding__SourceInterfaceAssignment_3");
					put(grammarAccess.getBindingAccess().getTargetComponentAssignment_5(), "rule__Binding__TargetComponentAssignment_5");
					put(grammarAccess.getBindingAccess().getTargetInterfaceAssignment_7(), "rule__Binding__TargetInterfaceAssignment_7");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			example.components.simple.ui.contentassist.antlr.internal.InternalSimplifiedADLParser typedParser = (example.components.simple.ui.contentassist.antlr.internal.InternalSimplifiedADLParser) parser;
			typedParser.entryRuleDefinition();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SimplifiedADLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SimplifiedADLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
