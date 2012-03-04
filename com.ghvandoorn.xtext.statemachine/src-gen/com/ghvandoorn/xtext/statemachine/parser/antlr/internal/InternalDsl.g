/*
* generated by Xtext
*/
grammar InternalDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package com.ghvandoorn.xtext.statemachine.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.ghvandoorn.xtext.statemachine.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.ghvandoorn.xtext.statemachine.services.DslGrammarAccess;

}

@parser::members {

 	private DslGrammarAccess grammarAccess;
 	
    public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "StateMachine";	
   	}
   	
   	@Override
   	protected DslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleStateMachine
entryRuleStateMachine returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStateMachineRule()); }
	 iv_ruleStateMachine=ruleStateMachine 
	 { $current=$iv_ruleStateMachine.current; } 
	 EOF 
;

// Rule StateMachine
ruleStateMachine returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getStateMachineAccess().getStateMachineAction_0(),
            $current);
    }
)(	otherlv_1='events' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getStateMachineAccess().getEventsKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_1_1_0()); 
	    }
		lv_events_2_0=ruleEvent		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateMachineRule());
	        }
       		add(
       			$current, 
       			"events",
        		lv_events_2_0, 
        		"Event");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_3='end' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getEndKeyword_1_2());
    }
)?	otherlv_4='initial_state' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getStateMachineAccess().getInitial_stateKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getStateMachineRule());
	        }
        }
	otherlv_5=RULE_ID
	{
		newLeafNode(otherlv_5, grammarAccess.getStateMachineAccess().getInitialStateStateCrossReference_3_0()); 
	}

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_4_0()); 
	    }
		lv_states_6_0=ruleState		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateMachineRule());
	        }
       		add(
       			$current, 
       			"states",
        		lv_states_6_0, 
        		"State");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleState
entryRuleState returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	 iv_ruleState=ruleState 
	 { $current=$iv_ruleState.current; } 
	 EOF 
;

// Rule State
ruleState returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='state' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStateRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_2_0()); 
	    }
		lv_transitions_2_0=ruleTransition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateRule());
	        }
       		add(
       			$current, 
       			"transitions",
        		lv_transitions_2_0, 
        		"Transition");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_3='end' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getEndKeyword_3());
    }
)
;





// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	 iv_ruleTransition=ruleTransition 
	 { $current=$iv_ruleTransition.current; } 
	 EOF 
;

// Rule Transition
ruleTransition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransitionRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0()); 
	}

)
)	otherlv_1='=>' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransitionRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0()); 
	}

)
))
;





// Entry rule entryRuleEvent
entryRuleEvent returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEventRule()); }
	 iv_ruleEvent=ruleEvent 
	 { $current=$iv_ruleEvent.current; } 
	 EOF 
;

// Rule Event
ruleEvent returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEventRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

