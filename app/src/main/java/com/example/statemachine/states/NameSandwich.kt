package com.example.statemachine.states

import com.example.statemachine.model.Sandwich
import com.example.statemachine.model.SandwichType
import com.example.statemachine.actions.Actions

class NameSandwich(private val sandwiches: List<Sandwich>, private val newSandwichType: SandwichType):
    SandwichState {
    override fun consumeAction(action: Actions): SandwichState {
        return when (action) {
            is Actions.SubmitSandwichClicked -> {
                val newSandwich = Sandwich(action.sandwichName, newSandwichType)
                SandwichList(sandwiches + newSandwich)
            }
            else -> throw IllegalStateException("Invalid action $action passed to state $this")
        }
    }
}