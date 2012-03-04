package com.ghvandoorn.xtext.statemachine.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.ghvandoorn.xtext.statemachine.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'initial_state'", "'events'", "'end'", "'state'", "'=>'"
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
    public String getGrammarFileName() { return "../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g"; }


     
     	private DslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleStateMachine"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:60:1: entryRuleStateMachine : ruleStateMachine EOF ;
    public final void entryRuleStateMachine() throws RecognitionException {
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:61:1: ( ruleStateMachine EOF )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:62:1: ruleStateMachine EOF
            {
             before(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_ruleStateMachine_in_entryRuleStateMachine61);
            ruleStateMachine();

            state._fsp--;

             after(grammarAccess.getStateMachineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateMachine68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:69:1: ruleStateMachine : ( ( rule__StateMachine__Group__0 ) ) ;
    public final void ruleStateMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:73:2: ( ( ( rule__StateMachine__Group__0 ) ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:74:1: ( ( rule__StateMachine__Group__0 ) )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:74:1: ( ( rule__StateMachine__Group__0 ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:75:1: ( rule__StateMachine__Group__0 )
            {
             before(grammarAccess.getStateMachineAccess().getGroup()); 
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:76:1: ( rule__StateMachine__Group__0 )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:76:2: rule__StateMachine__Group__0
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__0_in_ruleStateMachine94);
            rule__StateMachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleState"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:88:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:89:1: ( ruleState EOF )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:90:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState121);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:97:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:101:2: ( ( ( rule__State__Group__0 ) ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:102:1: ( ( rule__State__Group__0 ) )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:102:1: ( ( rule__State__Group__0 ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:103:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:104:1: ( rule__State__Group__0 )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:104:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState154);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:116:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:117:1: ( ruleTransition EOF )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:118:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition181);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:125:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:129:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:130:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:130:1: ( ( rule__Transition__Group__0 ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:131:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:132:1: ( rule__Transition__Group__0 )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:132:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition214);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEvent"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:144:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:145:1: ( ruleEvent EOF )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:146:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent241);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:153:1: ruleEvent : ( ( rule__Event__NameAssignment ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:157:2: ( ( ( rule__Event__NameAssignment ) ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:158:1: ( ( rule__Event__NameAssignment ) )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:158:1: ( ( rule__Event__NameAssignment ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:159:1: ( rule__Event__NameAssignment )
            {
             before(grammarAccess.getEventAccess().getNameAssignment()); 
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:160:1: ( rule__Event__NameAssignment )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:160:2: rule__Event__NameAssignment
            {
            pushFollow(FOLLOW_rule__Event__NameAssignment_in_ruleEvent274);
            rule__Event__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "rule__StateMachine__Group__0"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:174:1: rule__StateMachine__Group__0 : rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 ;
    public final void rule__StateMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:178:1: ( rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:179:2: rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__0__Impl_in_rule__StateMachine__Group__0308);
            rule__StateMachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__1_in_rule__StateMachine__Group__0311);
            rule__StateMachine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0"


    // $ANTLR start "rule__StateMachine__Group__0__Impl"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:186:1: rule__StateMachine__Group__0__Impl : ( () ) ;
    public final void rule__StateMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:190:1: ( ( () ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:191:1: ( () )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:191:1: ( () )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:192:1: ()
            {
             before(grammarAccess.getStateMachineAccess().getStateMachineAction_0()); 
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:193:1: ()
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:195:1: 
            {
            }

             after(grammarAccess.getStateMachineAccess().getStateMachineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0__Impl"


    // $ANTLR start "rule__StateMachine__Group__1"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:205:1: rule__StateMachine__Group__1 : rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 ;
    public final void rule__StateMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:209:1: ( rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:210:2: rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__1__Impl_in_rule__StateMachine__Group__1369);
            rule__StateMachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__2_in_rule__StateMachine__Group__1372);
            rule__StateMachine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1"


    // $ANTLR start "rule__StateMachine__Group__1__Impl"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:217:1: rule__StateMachine__Group__1__Impl : ( ( rule__StateMachine__Group_1__0 )? ) ;
    public final void rule__StateMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:221:1: ( ( ( rule__StateMachine__Group_1__0 )? ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:222:1: ( ( rule__StateMachine__Group_1__0 )? )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:222:1: ( ( rule__StateMachine__Group_1__0 )? )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:223:1: ( rule__StateMachine__Group_1__0 )?
            {
             before(grammarAccess.getStateMachineAccess().getGroup_1()); 
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:224:1: ( rule__StateMachine__Group_1__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:224:2: rule__StateMachine__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__StateMachine__Group_1__0_in_rule__StateMachine__Group__1__Impl399);
                    rule__StateMachine__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateMachineAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1__Impl"


    // $ANTLR start "rule__StateMachine__Group__2"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:234:1: rule__StateMachine__Group__2 : rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 ;
    public final void rule__StateMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:238:1: ( rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:239:2: rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__2__Impl_in_rule__StateMachine__Group__2430);
            rule__StateMachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__3_in_rule__StateMachine__Group__2433);
            rule__StateMachine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2"


    // $ANTLR start "rule__StateMachine__Group__2__Impl"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:246:1: rule__StateMachine__Group__2__Impl : ( 'initial_state' ) ;
    public final void rule__StateMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:250:1: ( ( 'initial_state' ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:251:1: ( 'initial_state' )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:251:1: ( 'initial_state' )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:252:1: 'initial_state'
            {
             before(grammarAccess.getStateMachineAccess().getInitial_stateKeyword_2()); 
            match(input,11,FOLLOW_11_in_rule__StateMachine__Group__2__Impl461); 
             after(grammarAccess.getStateMachineAccess().getInitial_stateKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2__Impl"


    // $ANTLR start "rule__StateMachine__Group__3"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:265:1: rule__StateMachine__Group__3 : rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 ;
    public final void rule__StateMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:269:1: ( rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:270:2: rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__3__Impl_in_rule__StateMachine__Group__3492);
            rule__StateMachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__4_in_rule__StateMachine__Group__3495);
            rule__StateMachine__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3"


    // $ANTLR start "rule__StateMachine__Group__3__Impl"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:277:1: rule__StateMachine__Group__3__Impl : ( ( rule__StateMachine__InitialStateAssignment_3 ) ) ;
    public final void rule__StateMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:281:1: ( ( ( rule__StateMachine__InitialStateAssignment_3 ) ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:282:1: ( ( rule__StateMachine__InitialStateAssignment_3 ) )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:282:1: ( ( rule__StateMachine__InitialStateAssignment_3 ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:283:1: ( rule__StateMachine__InitialStateAssignment_3 )
            {
             before(grammarAccess.getStateMachineAccess().getInitialStateAssignment_3()); 
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:284:1: ( rule__StateMachine__InitialStateAssignment_3 )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:284:2: rule__StateMachine__InitialStateAssignment_3
            {
            pushFollow(FOLLOW_rule__StateMachine__InitialStateAssignment_3_in_rule__StateMachine__Group__3__Impl522);
            rule__StateMachine__InitialStateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getInitialStateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3__Impl"


    // $ANTLR start "rule__StateMachine__Group__4"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:294:1: rule__StateMachine__Group__4 : rule__StateMachine__Group__4__Impl ;
    public final void rule__StateMachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:298:1: ( rule__StateMachine__Group__4__Impl )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:299:2: rule__StateMachine__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__4__Impl_in_rule__StateMachine__Group__4552);
            rule__StateMachine__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__4"


    // $ANTLR start "rule__StateMachine__Group__4__Impl"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:305:1: rule__StateMachine__Group__4__Impl : ( ( rule__StateMachine__StatesAssignment_4 )* ) ;
    public final void rule__StateMachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:309:1: ( ( ( rule__StateMachine__StatesAssignment_4 )* ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:310:1: ( ( rule__StateMachine__StatesAssignment_4 )* )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:310:1: ( ( rule__StateMachine__StatesAssignment_4 )* )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:311:1: ( rule__StateMachine__StatesAssignment_4 )*
            {
             before(grammarAccess.getStateMachineAccess().getStatesAssignment_4()); 
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:312:1: ( rule__StateMachine__StatesAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:312:2: rule__StateMachine__StatesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__StateMachine__StatesAssignment_4_in_rule__StateMachine__Group__4__Impl579);
            	    rule__StateMachine__StatesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getStatesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__4__Impl"


    // $ANTLR start "rule__StateMachine__Group_1__0"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:332:1: rule__StateMachine__Group_1__0 : rule__StateMachine__Group_1__0__Impl rule__StateMachine__Group_1__1 ;
    public final void rule__StateMachine__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:336:1: ( rule__StateMachine__Group_1__0__Impl rule__StateMachine__Group_1__1 )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:337:2: rule__StateMachine__Group_1__0__Impl rule__StateMachine__Group_1__1
            {
            pushFollow(FOLLOW_rule__StateMachine__Group_1__0__Impl_in_rule__StateMachine__Group_1__0620);
            rule__StateMachine__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group_1__1_in_rule__StateMachine__Group_1__0623);
            rule__StateMachine__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_1__0"


    // $ANTLR start "rule__StateMachine__Group_1__0__Impl"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:344:1: rule__StateMachine__Group_1__0__Impl : ( 'events' ) ;
    public final void rule__StateMachine__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:348:1: ( ( 'events' ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:349:1: ( 'events' )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:349:1: ( 'events' )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:350:1: 'events'
            {
             before(grammarAccess.getStateMachineAccess().getEventsKeyword_1_0()); 
            match(input,12,FOLLOW_12_in_rule__StateMachine__Group_1__0__Impl651); 
             after(grammarAccess.getStateMachineAccess().getEventsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_1__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_1__1"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:363:1: rule__StateMachine__Group_1__1 : rule__StateMachine__Group_1__1__Impl rule__StateMachine__Group_1__2 ;
    public final void rule__StateMachine__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:367:1: ( rule__StateMachine__Group_1__1__Impl rule__StateMachine__Group_1__2 )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:368:2: rule__StateMachine__Group_1__1__Impl rule__StateMachine__Group_1__2
            {
            pushFollow(FOLLOW_rule__StateMachine__Group_1__1__Impl_in_rule__StateMachine__Group_1__1682);
            rule__StateMachine__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group_1__2_in_rule__StateMachine__Group_1__1685);
            rule__StateMachine__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_1__1"


    // $ANTLR start "rule__StateMachine__Group_1__1__Impl"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:375:1: rule__StateMachine__Group_1__1__Impl : ( ( ( rule__StateMachine__EventsAssignment_1_1 ) ) ( ( rule__StateMachine__EventsAssignment_1_1 )* ) ) ;
    public final void rule__StateMachine__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:379:1: ( ( ( ( rule__StateMachine__EventsAssignment_1_1 ) ) ( ( rule__StateMachine__EventsAssignment_1_1 )* ) ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:380:1: ( ( ( rule__StateMachine__EventsAssignment_1_1 ) ) ( ( rule__StateMachine__EventsAssignment_1_1 )* ) )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:380:1: ( ( ( rule__StateMachine__EventsAssignment_1_1 ) ) ( ( rule__StateMachine__EventsAssignment_1_1 )* ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:381:1: ( ( rule__StateMachine__EventsAssignment_1_1 ) ) ( ( rule__StateMachine__EventsAssignment_1_1 )* )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:381:1: ( ( rule__StateMachine__EventsAssignment_1_1 ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:382:1: ( rule__StateMachine__EventsAssignment_1_1 )
            {
             before(grammarAccess.getStateMachineAccess().getEventsAssignment_1_1()); 
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:383:1: ( rule__StateMachine__EventsAssignment_1_1 )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:383:2: rule__StateMachine__EventsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__StateMachine__EventsAssignment_1_1_in_rule__StateMachine__Group_1__1__Impl714);
            rule__StateMachine__EventsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getEventsAssignment_1_1()); 

            }

            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:386:1: ( ( rule__StateMachine__EventsAssignment_1_1 )* )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:387:1: ( rule__StateMachine__EventsAssignment_1_1 )*
            {
             before(grammarAccess.getStateMachineAccess().getEventsAssignment_1_1()); 
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:388:1: ( rule__StateMachine__EventsAssignment_1_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:388:2: rule__StateMachine__EventsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__StateMachine__EventsAssignment_1_1_in_rule__StateMachine__Group_1__1__Impl726);
            	    rule__StateMachine__EventsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getEventsAssignment_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_1__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_1__2"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:399:1: rule__StateMachine__Group_1__2 : rule__StateMachine__Group_1__2__Impl ;
    public final void rule__StateMachine__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:403:1: ( rule__StateMachine__Group_1__2__Impl )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:404:2: rule__StateMachine__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__StateMachine__Group_1__2__Impl_in_rule__StateMachine__Group_1__2759);
            rule__StateMachine__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_1__2"


    // $ANTLR start "rule__StateMachine__Group_1__2__Impl"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:410:1: rule__StateMachine__Group_1__2__Impl : ( 'end' ) ;
    public final void rule__StateMachine__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:414:1: ( ( 'end' ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:415:1: ( 'end' )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:415:1: ( 'end' )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:416:1: 'end'
            {
             before(grammarAccess.getStateMachineAccess().getEndKeyword_1_2()); 
            match(input,13,FOLLOW_13_in_rule__StateMachine__Group_1__2__Impl787); 
             after(grammarAccess.getStateMachineAccess().getEndKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_1__2__Impl"


    // $ANTLR start "rule__State__Group__0"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:435:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:439:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:440:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__0824);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__0827);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:447:1: rule__State__Group__0__Impl : ( 'state' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:451:1: ( ( 'state' ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:452:1: ( 'state' )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:452:1: ( 'state' )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:453:1: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__State__Group__0__Impl855); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:466:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:470:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:471:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__1886);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__1889);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:478:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:482:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:483:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:483:1: ( ( rule__State__NameAssignment_1 ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:484:1: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:485:1: ( rule__State__NameAssignment_1 )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:485:2: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl916);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:495:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:499:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:500:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__2946);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__2949);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:507:1: rule__State__Group__2__Impl : ( ( rule__State__TransitionsAssignment_2 )* ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:511:1: ( ( ( rule__State__TransitionsAssignment_2 )* ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:512:1: ( ( rule__State__TransitionsAssignment_2 )* )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:512:1: ( ( rule__State__TransitionsAssignment_2 )* )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:513:1: ( rule__State__TransitionsAssignment_2 )*
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_2()); 
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:514:1: ( rule__State__TransitionsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:514:2: rule__State__TransitionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__State__TransitionsAssignment_2_in_rule__State__Group__2__Impl976);
            	    rule__State__TransitionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getTransitionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:524:1: rule__State__Group__3 : rule__State__Group__3__Impl ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:528:1: ( rule__State__Group__3__Impl )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:529:2: rule__State__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__31007);
            rule__State__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:535:1: rule__State__Group__3__Impl : ( 'end' ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:539:1: ( ( 'end' ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:540:1: ( 'end' )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:540:1: ( 'end' )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:541:1: 'end'
            {
             before(grammarAccess.getStateAccess().getEndKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__State__Group__3__Impl1035); 
             after(grammarAccess.getStateAccess().getEndKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:562:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:566:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:567:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__01074);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__01077);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:574:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__EventAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:578:1: ( ( ( rule__Transition__EventAssignment_0 ) ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:579:1: ( ( rule__Transition__EventAssignment_0 ) )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:579:1: ( ( rule__Transition__EventAssignment_0 ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:580:1: ( rule__Transition__EventAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getEventAssignment_0()); 
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:581:1: ( rule__Transition__EventAssignment_0 )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:581:2: rule__Transition__EventAssignment_0
            {
            pushFollow(FOLLOW_rule__Transition__EventAssignment_0_in_rule__Transition__Group__0__Impl1104);
            rule__Transition__EventAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getEventAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:591:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:595:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:596:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__11134);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__11137);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:603:1: rule__Transition__Group__1__Impl : ( '=>' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:607:1: ( ( '=>' ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:608:1: ( '=>' )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:608:1: ( '=>' )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:609:1: '=>'
            {
             before(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Transition__Group__1__Impl1165); 
             after(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:622:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:626:1: ( rule__Transition__Group__2__Impl )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:627:2: rule__Transition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__21196);
            rule__Transition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:633:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__StateAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:637:1: ( ( ( rule__Transition__StateAssignment_2 ) ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:638:1: ( ( rule__Transition__StateAssignment_2 ) )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:638:1: ( ( rule__Transition__StateAssignment_2 ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:639:1: ( rule__Transition__StateAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getStateAssignment_2()); 
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:640:1: ( rule__Transition__StateAssignment_2 )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:640:2: rule__Transition__StateAssignment_2
            {
            pushFollow(FOLLOW_rule__Transition__StateAssignment_2_in_rule__Transition__Group__2__Impl1223);
            rule__Transition__StateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getStateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__StateMachine__EventsAssignment_1_1"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:657:1: rule__StateMachine__EventsAssignment_1_1 : ( ruleEvent ) ;
    public final void rule__StateMachine__EventsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:661:1: ( ( ruleEvent ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:662:1: ( ruleEvent )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:662:1: ( ruleEvent )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:663:1: ruleEvent
            {
             before(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__StateMachine__EventsAssignment_1_11264);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__EventsAssignment_1_1"


    // $ANTLR start "rule__StateMachine__InitialStateAssignment_3"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:672:1: rule__StateMachine__InitialStateAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__StateMachine__InitialStateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:676:1: ( ( ( RULE_ID ) ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:677:1: ( ( RULE_ID ) )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:677:1: ( ( RULE_ID ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:678:1: ( RULE_ID )
            {
             before(grammarAccess.getStateMachineAccess().getInitialStateStateCrossReference_3_0()); 
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:679:1: ( RULE_ID )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:680:1: RULE_ID
            {
             before(grammarAccess.getStateMachineAccess().getInitialStateStateIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateMachine__InitialStateAssignment_31299); 
             after(grammarAccess.getStateMachineAccess().getInitialStateStateIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getStateMachineAccess().getInitialStateStateCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__InitialStateAssignment_3"


    // $ANTLR start "rule__StateMachine__StatesAssignment_4"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:691:1: rule__StateMachine__StatesAssignment_4 : ( ruleState ) ;
    public final void rule__StateMachine__StatesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:695:1: ( ( ruleState ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:696:1: ( ruleState )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:696:1: ( ruleState )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:697:1: ruleState
            {
             before(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__StateMachine__StatesAssignment_41334);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__StatesAssignment_4"


    // $ANTLR start "rule__State__NameAssignment_1"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:706:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:710:1: ( ( RULE_ID ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:711:1: ( RULE_ID )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:711:1: ( RULE_ID )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:712:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_11365); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__State__TransitionsAssignment_2"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:721:1: rule__State__TransitionsAssignment_2 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:725:1: ( ( ruleTransition ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:726:1: ( ruleTransition )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:726:1: ( ruleTransition )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:727:1: ruleTransition
            {
             before(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTransition_in_rule__State__TransitionsAssignment_21396);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__TransitionsAssignment_2"


    // $ANTLR start "rule__Transition__EventAssignment_0"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:736:1: rule__Transition__EventAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:740:1: ( ( ( RULE_ID ) ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:741:1: ( ( RULE_ID ) )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:741:1: ( ( RULE_ID ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:742:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0()); 
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:743:1: ( RULE_ID )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:744:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getEventEventIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__EventAssignment_01431); 
             after(grammarAccess.getTransitionAccess().getEventEventIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__EventAssignment_0"


    // $ANTLR start "rule__Transition__StateAssignment_2"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:755:1: rule__Transition__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:759:1: ( ( ( RULE_ID ) ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:760:1: ( ( RULE_ID ) )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:760:1: ( ( RULE_ID ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:761:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0()); 
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:762:1: ( RULE_ID )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:763:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getStateStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__StateAssignment_21470); 
             after(grammarAccess.getTransitionAccess().getStateStateIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__StateAssignment_2"


    // $ANTLR start "rule__Event__NameAssignment"
    // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:774:1: rule__Event__NameAssignment : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:778:1: ( ( RULE_ID ) )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:779:1: ( RULE_ID )
            {
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:779:1: ( RULE_ID )
            // ../com.ghvandoorn.xtext.statemachine.ui/src-gen/com/ghvandoorn/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:780:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__NameAssignment1505); 
             after(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleStateMachine_in_entryRuleStateMachine61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateMachine68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__0_in_ruleStateMachine94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__NameAssignment_in_ruleEvent274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__0__Impl_in_rule__StateMachine__Group__0308 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__1_in_rule__StateMachine__Group__0311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__1__Impl_in_rule__StateMachine__Group__1369 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__2_in_rule__StateMachine__Group__1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_1__0_in_rule__StateMachine__Group__1__Impl399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__2__Impl_in_rule__StateMachine__Group__2430 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__3_in_rule__StateMachine__Group__2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__StateMachine__Group__2__Impl461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__3__Impl_in_rule__StateMachine__Group__3492 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__4_in_rule__StateMachine__Group__3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__InitialStateAssignment_3_in_rule__StateMachine__Group__3__Impl522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__4__Impl_in_rule__StateMachine__Group__4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__StatesAssignment_4_in_rule__StateMachine__Group__4__Impl579 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_1__0__Impl_in_rule__StateMachine__Group_1__0620 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_1__1_in_rule__StateMachine__Group_1__0623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__StateMachine__Group_1__0__Impl651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_1__1__Impl_in_rule__StateMachine__Group_1__1682 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_1__2_in_rule__StateMachine__Group_1__1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__EventsAssignment_1_1_in_rule__StateMachine__Group_1__1__Impl714 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__StateMachine__EventsAssignment_1_1_in_rule__StateMachine__Group_1__1__Impl726 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_1__2__Impl_in_rule__StateMachine__Group_1__2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__StateMachine__Group_1__2__Impl787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__0824 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__0827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__State__Group__0__Impl855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__1886 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__2946 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TransitionsAssignment_2_in_rule__State__Group__2__Impl976 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__31007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__State__Group__3__Impl1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__01074 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__01077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__EventAssignment_0_in_rule__Transition__Group__0__Impl1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__11134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__11137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Transition__Group__1__Impl1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__21196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__StateAssignment_2_in_rule__Transition__Group__2__Impl1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__StateMachine__EventsAssignment_1_11264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateMachine__InitialStateAssignment_31299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__StateMachine__StatesAssignment_41334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_11365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__State__TransitionsAssignment_21396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__EventAssignment_01431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__StateAssignment_21470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__NameAssignment1505 = new BitSet(new long[]{0x0000000000000002L});

}