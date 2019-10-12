package com.example.statemachine.actions

import com.example.statemachine.model.Sandwich
import com.example.statemachine.model.SandwichType

sealed class Actions {
    class AddSandwichClicked: Actions()
    class SandwichTypeSelected(val type: SandwichType): Actions()
    class PredefinedSandwichSelected(val sandwich: Sandwich): Actions()
    class SubmitSandwichClicked(val sandwichName: String): Actions()
}