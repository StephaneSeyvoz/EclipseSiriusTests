/*
* generated by Xtext
*/
package example.components.simple;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SimplifiedADLUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return example.components.simple.ui.internal.SimplifiedADLActivator.getInstance().getInjector("example.components.simple.SimplifiedADL");
	}
	
}
