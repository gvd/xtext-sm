/*
* generated by Xtext
*/
package com.ghvandoorn.xtext.statemachine;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class DslUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return com.ghvandoorn.xtext.statemachine.ui.internal.DslActivator.getInstance().getInjector("com.ghvandoorn.xtext.statemachine.Dsl");
	}
	
}