package wrappers.example.table.selection

import preact.signals.core.ReadonlySignal
import preact.signals.react.runtime.useSignals
import react.FC
import react.PropsWithValue
import react.dom.events.ChangeEvent
import react.dom.html.ReactHTML.input
import web.html.HTMLInputElement
import web.html.InputType.Companion.checkbox

internal external interface SelectionCheckboxProps : PropsWithValue<ReadonlySignal<Boolean>> {
    var onChange: (event: ChangeEvent<HTMLInputElement>) -> Unit
}

internal val SelectionCheckbox: FC<SelectionCheckboxProps> = FC { props ->
    useSignals() // for preact signals to re-render the component on change without Babel plugin

    val isChecked = props.value

    input {
        type = checkbox
        checked = isChecked.value
        onChange = props.onChange
    }
}
