package example.components.simple.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import example.components.simple.services.SimplifiedADLGrammarAccess;
import example.components.simple.simplifiedADL.Architecture;
import example.components.simple.simplifiedADL.Binding;
import example.components.simple.simplifiedADL.Component;
import example.components.simple.simplifiedADL.Definition;
import example.components.simple.simplifiedADL.Imports;
import example.components.simple.simplifiedADL.ProvidedInterface;
import example.components.simple.simplifiedADL.RequiredInterface;
import example.components.simple.simplifiedADL.SimplifiedADLPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SimplifiedADLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SimplifiedADLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SimplifiedADLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SimplifiedADLPackage.ARCHITECTURE:
				if(context == grammarAccess.getArchitectureRule()) {
					sequence_Architecture(context, (Architecture) semanticObject); 
					return; 
				}
				else break;
			case SimplifiedADLPackage.BINDING:
				if(context == grammarAccess.getArchitectureElementsRule() ||
				   context == grammarAccess.getBindingRule()) {
					sequence_Binding(context, (Binding) semanticObject); 
					return; 
				}
				else break;
			case SimplifiedADLPackage.COMPONENT:
				if(context == grammarAccess.getArchitectureElementsRule() ||
				   context == grammarAccess.getComponentRule()) {
					sequence_Component(context, (Component) semanticObject); 
					return; 
				}
				else break;
			case SimplifiedADLPackage.DEFINITION:
				if(context == grammarAccess.getDefinitionRule()) {
					sequence_Definition(context, (Definition) semanticObject); 
					return; 
				}
				else break;
			case SimplifiedADLPackage.IMPORTS:
				if(context == grammarAccess.getImportsRule()) {
					sequence_Imports(context, (Imports) semanticObject); 
					return; 
				}
				else break;
			case SimplifiedADLPackage.PROVIDED_INTERFACE:
				if(context == grammarAccess.getArchitectureElementsRule() ||
				   context == grammarAccess.getProvidedInterfaceRule()) {
					sequence_ProvidedInterface(context, (ProvidedInterface) semanticObject); 
					return; 
				}
				else break;
			case SimplifiedADLPackage.REQUIRED_INTERFACE:
				if(context == grammarAccess.getArchitectureElementsRule() ||
				   context == grammarAccess.getRequiredInterfaceRule()) {
					sequence_RequiredInterface(context, (RequiredInterface) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=QualifiedName elements+=ArchitectureElements*)
	 */
	protected void sequence_Architecture(EObject context, Architecture semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sourceComponent=[Component|ID] sourceInterface=[RequiredInterface|ID] targetComponent=[Component|ID] targetInterface=[ProvidedInterface|ID])
	 */
	protected void sequence_Binding(EObject context, Binding semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SimplifiedADLPackage.Literals.BINDING__SOURCE_COMPONENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplifiedADLPackage.Literals.BINDING__SOURCE_COMPONENT));
			if(transientValues.isValueTransient(semanticObject, SimplifiedADLPackage.Literals.BINDING__SOURCE_INTERFACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplifiedADLPackage.Literals.BINDING__SOURCE_INTERFACE));
			if(transientValues.isValueTransient(semanticObject, SimplifiedADLPackage.Literals.BINDING__TARGET_COMPONENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplifiedADLPackage.Literals.BINDING__TARGET_COMPONENT));
			if(transientValues.isValueTransient(semanticObject, SimplifiedADLPackage.Literals.BINDING__TARGET_INTERFACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplifiedADLPackage.Literals.BINDING__TARGET_INTERFACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBindingAccess().getSourceComponentComponentIDTerminalRuleCall_1_0_1(), semanticObject.getSourceComponent());
		feeder.accept(grammarAccess.getBindingAccess().getSourceInterfaceRequiredInterfaceIDTerminalRuleCall_3_0_1(), semanticObject.getSourceInterface());
		feeder.accept(grammarAccess.getBindingAccess().getTargetComponentComponentIDTerminalRuleCall_5_0_1(), semanticObject.getTargetComponent());
		feeder.accept(grammarAccess.getBindingAccess().getTargetInterfaceProvidedInterfaceIDTerminalRuleCall_7_0_1(), semanticObject.getTargetInterface());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Architecture|QualifiedName] name=ID)
	 */
	protected void sequence_Component(EObject context, Component semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SimplifiedADLPackage.Literals.COMPONENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplifiedADLPackage.Literals.COMPONENT__TYPE));
			if(transientValues.isValueTransient(semanticObject, SimplifiedADLPackage.Literals.COMPONENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplifiedADLPackage.Literals.COMPONENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComponentAccess().getTypeArchitectureQualifiedNameParserRuleCall_1_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Imports* architecture=Architecture)
	 */
	protected void sequence_Definition(EObject context, Definition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Imports(EObject context, Imports semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SimplifiedADLPackage.Literals.IMPORTS__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplifiedADLPackage.Literals.IMPORTS__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportsAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=[InterfaceDefinition|ID] name=ID)
	 */
	protected void sequence_ProvidedInterface(EObject context, ProvidedInterface semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SimplifiedADLPackage.Literals.PROVIDED_INTERFACE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplifiedADLPackage.Literals.PROVIDED_INTERFACE__TYPE));
			if(transientValues.isValueTransient(semanticObject, SimplifiedADLPackage.Literals.PROVIDED_INTERFACE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplifiedADLPackage.Literals.PROVIDED_INTERFACE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProvidedInterfaceAccess().getTypeInterfaceDefinitionIDTerminalRuleCall_1_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getProvidedInterfaceAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=[InterfaceDefinition|ID] name=ID)
	 */
	protected void sequence_RequiredInterface(EObject context, RequiredInterface semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SimplifiedADLPackage.Literals.REQUIRED_INTERFACE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplifiedADLPackage.Literals.REQUIRED_INTERFACE__TYPE));
			if(transientValues.isValueTransient(semanticObject, SimplifiedADLPackage.Literals.REQUIRED_INTERFACE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplifiedADLPackage.Literals.REQUIRED_INTERFACE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRequiredInterfaceAccess().getTypeInterfaceDefinitionIDTerminalRuleCall_1_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getRequiredInterfaceAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
}
