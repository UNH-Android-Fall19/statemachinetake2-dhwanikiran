package com.example.statemachine.states

import com.example.statemachine.actions.Actions

interface SandwichState {
    fun consumeAction(action: Actions): SandwichState
}