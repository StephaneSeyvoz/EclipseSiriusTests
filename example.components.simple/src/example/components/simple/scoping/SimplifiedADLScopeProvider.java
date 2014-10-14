
package example.components.simple.scoping;

import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import example.components.simple.simplifiedADL.Architecture;
import example.components.simple.simplifiedADL.Binding;
import example.components.simple.simplifiedADL.ProvidedInterface;
import example.components.simple.simplifiedADL.RequiredInterface;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class SimplifiedADLScopeProvider extends AbstractDeclarativeScopeProvider {

	public IScope scope_Binding_sourceInterface(final Binding binding, final EReference ref) {

		Architecture sourceComponentArch = binding.getSourceComponent().getType();

		List<RequiredInterface> reqItfList = EcoreUtil2.eAllOfType(sourceComponentArch, RequiredInterface.class);
		
		return Scopes.scopeFor(reqItfList);
		
	}

	public IScope scope_Binding_targetInterface(final Binding binding, final EReference ref) {

		Architecture targetComponentArch = binding.getTargetComponent().getType();
		
		List<ProvidedInterface> reqItfList = EcoreUtil2.eAllOfType(targetComponentArch, ProvidedInterface.class);
		
		return Scopes.scopeFor(reqItfList);
		
	}

}
