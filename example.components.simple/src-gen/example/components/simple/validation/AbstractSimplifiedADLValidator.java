/*
 * generated by Xtext
 */
package example.components.simple.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractSimplifiedADLValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(example.components.simple.simplifiedADL.SimplifiedADLPackage.eINSTANCE);
		return result;
	}
}