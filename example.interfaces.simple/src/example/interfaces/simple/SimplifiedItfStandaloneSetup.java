/*
* generated by Xtext
*/
package example.interfaces.simple;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SimplifiedItfStandaloneSetup extends SimplifiedItfStandaloneSetupGenerated{

	public static void doSetup() {
		new SimplifiedItfStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

