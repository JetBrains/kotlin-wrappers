package wrappers.example.table.selection

import preact.signals.react.runtime.useSignals
import preact.signals.react.useComputed
import react.FC
import react.PropsWithValue
import react.dom.events.ChangeEvent
import react.dom.html.ReactHTML.input
import web.html.HTMLInputElement
import web.html.InputType.Companion.checkbox

internal external interface SelectionCheckboxProps : PropsWithValue<SelectedKeys> {
    var onChange: (event: ChangeEvent<HTMLInputElement>) -> Unit
}

internal val SelectionCheckbox: FC<SelectionCheckboxProps> = FC { props ->
    useSignals() // for preact signals to re-render the component on change without Babel plugin

    val isChecked = useComputed {
        props.value.all { selectedKeys.value.contains(it) }
    }

    input {
        type = checkbox
        checked = isChecked.value
        onChange = props.onChange
    }
}
