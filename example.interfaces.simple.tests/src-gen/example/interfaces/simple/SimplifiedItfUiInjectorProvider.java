/*
* generated by Xtext
*/
package example.interfaces.simple;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SimplifiedItfUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return example.interfaces.simple.ui.internal.SimplifiedItfActivator.getInstance().getInjector("example.interfaces.simple.SimplifiedItf");
	}
	
}
