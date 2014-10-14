package example.interfaces.simple.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import example.interfaces.simple.services.SimplifiedItfGrammarAccess;
import example.interfaces.simple.simplifiedItf.InterfaceDefinition;
import example.interfaces.simple.simplifiedItf.Method;
import example.interfaces.simple.simplifiedItf.SimplifiedItfPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class SimplifiedItfSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SimplifiedItfGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SimplifiedItfPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SimplifiedItfPackage.INTERFACE_DEFINITION:
				if(context == grammarAccess.getInterfaceDefinitionRule()) {
					sequence_InterfaceDefinition(context, (InterfaceDefinition) semanticObject); 
					return; 
				}
				else break;
			case SimplifiedItfPackage.METHOD:
				if(context == grammarAccess.getMethodRule()) {
					sequence_Method(context, (Method) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=QualifiedName methods+=Method*)
	 */
	protected void sequence_InterfaceDefinition(EObject context, InterfaceDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (returnType=Type name=ID typesList+=Type typesList+=Type*)
	 */
	protected void sequence_Method(EObject context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
