package com.example.statemachine.states

import com.example.statemachine.model.Sandwich
import com.example.statemachine.actions.Actions

class SandwichList(val sandwiches: List<Sandwich>):
    SandwichState {
    override fun consumeAction(action: Actions): SandwichState {
        return when(action) {
            is Actions.AddSandwichClicked -> AddSandwich(sandwiches)
            else -> throw IllegalStateException("Invalid action $action passed to state $this")
        }
    }
}