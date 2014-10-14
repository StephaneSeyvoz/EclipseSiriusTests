/*
 * generated by Xtext
 */
package example.components.simple.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import example.components.simple.ui.internal.SimplifiedADLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SimplifiedADLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SimplifiedADLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SimplifiedADLActivator.getInstance().getInjector(SimplifiedADLActivator.EXAMPLE_COMPONENTS_SIMPLE_SIMPLIFIEDADL);
	}
	
}
