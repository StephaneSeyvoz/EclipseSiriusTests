/*
 * generated by Xtext
 */
package example.interfaces.simple.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractSimplifiedItfValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(example.interfaces.simple.simplifiedItf.SimplifiedItfPackage.eINSTANCE);
		return result;
	}
}
