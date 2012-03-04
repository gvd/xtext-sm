package com.ghvandoorn.xtext.statemachine.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractDslJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(com.ghvandoorn.xtext.statemachine.dsl.DslPackage.eINSTANCE);
		return result;
	}

}
