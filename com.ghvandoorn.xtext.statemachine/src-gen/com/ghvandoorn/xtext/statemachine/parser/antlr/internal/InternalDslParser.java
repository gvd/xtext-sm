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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'events'", "'end'", "'initial_state'", "'state'", "'=>'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g"; }



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



    // $ANTLR start "entryRuleStateMachine"
    // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:67:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:68:2: (iv_ruleStateMachine= ruleStateMachine EOF )
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:69:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_ruleStateMachine_in_entryRuleStateMachine75);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateMachine85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:76:1: ruleStateMachine returns [EObject current=null] : ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? otherlv_4= 'initial_state' ( (otherlv_5= RULE_ID ) ) ( (lv_states_6_0= ruleState ) )* ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_events_2_0 = null;

        EObject lv_states_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:79:28: ( ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? otherlv_4= 'initial_state' ( (otherlv_5= RULE_ID ) ) ( (lv_states_6_0= ruleState ) )* ) )
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:80:1: ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? otherlv_4= 'initial_state' ( (otherlv_5= RULE_ID ) ) ( (lv_states_6_0= ruleState ) )* )
            {
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:80:1: ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? otherlv_4= 'initial_state' ( (otherlv_5= RULE_ID ) ) ( (lv_states_6_0= ruleState ) )* )
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:80:2: () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? otherlv_4= 'initial_state' ( (otherlv_5= RULE_ID ) ) ( (lv_states_6_0= ruleState ) )*
            {
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:80:2: ()
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateMachineAccess().getStateMachineAction_0(),
                        current);
                

            }

            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:86:2: (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:86:4: otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleStateMachine132); 

                        	newLeafNode(otherlv_1, grammarAccess.getStateMachineAccess().getEventsKeyword_1_0());
                        
                    // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:90:1: ( (lv_events_2_0= ruleEvent ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:91:1: (lv_events_2_0= ruleEvent )
                    	    {
                    	    // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:91:1: (lv_events_2_0= ruleEvent )
                    	    // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:92:3: lv_events_2_0= ruleEvent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEvent_in_ruleStateMachine153);
                    	    lv_events_2_0=ruleEvent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"events",
                    	            		lv_events_2_0, 
                    	            		"Event");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);

                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleStateMachine166); 

                        	newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getEndKeyword_1_2());
                        

                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleStateMachine180); 

                	newLeafNode(otherlv_4, grammarAccess.getStateMachineAccess().getInitial_stateKeyword_2());
                
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:116:1: ( (otherlv_5= RULE_ID ) )
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:117:1: (otherlv_5= RULE_ID )
            {
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:117:1: (otherlv_5= RULE_ID )
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:118:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStateMachineRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStateMachine200); 

            		newLeafNode(otherlv_5, grammarAccess.getStateMachineAccess().getInitialStateStateCrossReference_3_0()); 
            	

            }


            }

            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:129:2: ( (lv_states_6_0= ruleState ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:130:1: (lv_states_6_0= ruleState )
            	    {
            	    // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:130:1: (lv_states_6_0= ruleState )
            	    // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:131:3: lv_states_6_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleStateMachine221);
            	    lv_states_6_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_6_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleState"
    // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:155:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:156:2: (iv_ruleState= ruleState EOF )
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:157:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState258);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState268); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:164:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_transitions_2_0= ruleTransition ) )* otherlv_3= 'end' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_transitions_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:167:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_transitions_2_0= ruleTransition ) )* otherlv_3= 'end' ) )
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:168:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_transitions_2_0= ruleTransition ) )* otherlv_3= 'end' )
            {
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:168:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_transitions_2_0= ruleTransition ) )* otherlv_3= 'end' )
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:168:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_transitions_2_0= ruleTransition ) )* otherlv_3= 'end'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleState305); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:172:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:173:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:173:1: (lv_name_1_0= RULE_ID )
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:174:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState322); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:190:2: ( (lv_transitions_2_0= ruleTransition ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:191:1: (lv_transitions_2_0= ruleTransition )
            	    {
            	    // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:191:1: (lv_transitions_2_0= ruleTransition )
            	    // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:192:3: lv_transitions_2_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransition_in_ruleState348);
            	    lv_transitions_2_0=ruleTransition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"transitions",
            	            		lv_transitions_2_0, 
            	            		"Transition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleState361); 

                	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getEndKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:220:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:221:2: (iv_ruleTransition= ruleTransition EOF )
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:222:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition397);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition407); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:229:1: ruleTransition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:232:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) )
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:233:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:233:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:233:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
            {
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:233:2: ( (otherlv_0= RULE_ID ) )
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:234:1: (otherlv_0= RULE_ID )
            {
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:234:1: (otherlv_0= RULE_ID )
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:235:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition452); 

            		newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleTransition464); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1());
                
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:250:1: ( (otherlv_2= RULE_ID ) )
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:251:1: (otherlv_2= RULE_ID )
            {
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:251:1: (otherlv_2= RULE_ID )
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:252:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition484); 

            		newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEvent"
    // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:271:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:272:2: (iv_ruleEvent= ruleEvent EOF )
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:273:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent520);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent530); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:280:1: ruleEvent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:283:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:284:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:284:1: ( (lv_name_0_0= RULE_ID ) )
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:285:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:285:1: (lv_name_0_0= RULE_ID )
            // ../com.ghvandoorn.xtext.statemachine/src-gen/com/ghvandoorn/xtext/statemachine/parser/antlr/internal/InternalDsl.g:286:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent571); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleStateMachine_in_entryRuleStateMachine75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateMachine85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStateMachine132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleStateMachine153 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleStateMachine166 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStateMachine180 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStateMachine200 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleState_in_ruleStateMachine221 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleState305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState322 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState348 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleState361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition452 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTransition464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent571 = new BitSet(new long[]{0x0000000000000002L});

}