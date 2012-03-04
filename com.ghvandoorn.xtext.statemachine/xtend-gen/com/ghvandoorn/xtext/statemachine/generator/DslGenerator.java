package com.ghvandoorn.xtext.statemachine.generator;

import com.ghvandoorn.xtext.statemachine.dsl.Event;
import com.ghvandoorn.xtext.statemachine.dsl.State;
import com.ghvandoorn.xtext.statemachine.dsl.StateMachine;
import com.ghvandoorn.xtext.statemachine.dsl.Transition;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class DslGenerator implements IGenerator {
  private String filename;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
      String _fileNameWithoutExtension = this.getFileNameWithoutExtension(resource);
      this.filename = _fileNameWithoutExtension;
      TreeIterator<EObject> _allContents = resource.getAllContents();
      Iterator<StateMachine> _filter = IteratorExtensions.<StateMachine>filter(_allContents, com.ghvandoorn.xtext.statemachine.dsl.StateMachine.class);
      List<StateMachine> _list = IteratorExtensions.<StateMachine>toList(_filter);
      for (final StateMachine m : _list) {
        String _operator_plus = StringExtensions.operator_plus(this.filename, ".h");
        CharSequence _compile = this.compile(m, resource);
        fsa.generateFile(_operator_plus, _compile);
      }
  }
  
  public String getFileNameWithoutExtension(final Resource resource) {
      URI _uRI = resource.getURI();
      String _path = _uRI.path();
      File _file = new File(_path);
      File file = _file;
      String _name = file.getName();
      String fullPath = _name;
      int _lastIndexOf = fullPath.lastIndexOf(".");
      int dot = _lastIndexOf;
      String _substring = fullPath.substring(0, dot);
      return _substring;
  }
  
  public CharSequence compile(final StateMachine machine, final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#ifndef __");
    String _upperCase = this.filename.toUpperCase();
    _builder.append(_upperCase, "");
    _builder.append("_STATE_MACHINE__");
    _builder.newLineIfNotEmpty();
    _builder.append("#define __");
    String _upperCase_1 = this.filename.toUpperCase();
    _builder.append(_upperCase_1, "");
    _builder.append("_STATE_MACHINE__");
    _builder.newLineIfNotEmpty();
    _builder.append("#include <boost/msm/back/state_machine.hpp>");
    _builder.newLine();
    _builder.append("#include <boost/msm/front/state_machine_def.hpp>");
    _builder.newLine();
    _builder.append("#include <boost/msm/front/functor_row.hpp>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("namespace msm = boost::msm;");
    _builder.newLine();
    _builder.append("namespace mpl = boost::mpl;");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Event> _events = machine.getEvents();
      for(final Event event : _events) {
        CharSequence _compile = this.compile(event);
        _builder.append(_compile, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("struct state_machine_ : public msm::front::state_machine_def<state_machine_> {");
    _builder.newLine();
    {
      EList<State> _states = machine.getStates();
      for(final State state : _states) {
        _builder.append("\t");
        CharSequence _compile_1 = this.compile(state);
        _builder.append(_compile_1, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    CharSequence _defineStartState = this.defineStartState(machine);
    _builder.append(_defineStartState, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("struct transition_table : mpl::vector<");
    _builder.newLine();
    {
      EList<State> _states_1 = machine.getStates();
      for(final State state_1 : _states_1) {
        {
          EList<Transition> _transitions = state_1.getTransitions();
          for(final Transition transition : _transitions) {
            _builder.append("\t\t");
            EList<State> _states_2 = machine.getStates();
            State _last = IterableExtensions.<State>last(_states_2);
            EList<Transition> _transitions_1 = _last.getTransitions();
            Transition _last_1 = IterableExtensions.<Transition>last(_transitions_1);
            boolean _operator_equals = ObjectExtensions.operator_equals(transition, _last_1);
            CharSequence _compile_2 = this.compile(transition, state_1, Boolean.valueOf(_operator_equals));
            _builder.append(_compile_2, "		");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("> {};");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("template <class FSM,class Event>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void no_transition(Event const& e, FSM&,int state) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("std::cout << \"no transition from state \" << state");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<< \" on event \" << typeid(e).name() << std::endl;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("};");
    _builder.newLine();
    _builder.append("typedef msm::back::state_machine<state_machine_> ");
    String _lowerCase = this.filename.toLowerCase();
    String _firstUpper = StringExtensions.toFirstUpper(_lowerCase);
    _builder.append(_firstUpper, "");
    _builder.append("StateMachine;");
    _builder.newLineIfNotEmpty();
    _builder.append("#endif");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Event event) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("struct ");
    String _name = event.getName();
    _builder.append(_name, "");
    _builder.append(" {};");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final State state) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("struct ");
    String _name = state.getName();
    _builder.append(_name, "");
    _builder.append(" : public msm::front::state<> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("template <class Event,class FSM>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void on_entry(Event const&, FSM& ) {std::cout << \"entering: ");
    String _name_1 = state.getName();
    _builder.append(_name_1, "	");
    _builder.append("\" << std::endl;}");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("template <class Event,class FSM>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void on_exit(Event const&, FSM& ) {std::cout << \"leaving: ");
    String _name_2 = state.getName();
    _builder.append(_name_2, "	");
    _builder.append("\" << std::endl;}");
    _builder.newLineIfNotEmpty();
    _builder.append("};");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Transition transition, final State originatingState, final Boolean last) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("msm::front::Row < ");
    String _name = originatingState.getName();
    _builder.append(_name, "");
    _builder.append(", ");
    Event _event = transition.getEvent();
    String _name_1 = _event.getName();
    _builder.append(_name_1, "");
    _builder.append(", ");
    State _state = transition.getState();
    String _name_2 = _state.getName();
    _builder.append(_name_2, "");
    _builder.append(",  msm::front::none, msm::front::none >");
    {
      boolean _operator_not = BooleanExtensions.operator_not(last);
      if (_operator_not) {
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence defineStartState(final StateMachine machine) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("typedef ");
    State _initialState = machine.getInitialState();
    String _name = _initialState.getName();
    _builder.append(_name, "");
    _builder.append(" initial_state;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
