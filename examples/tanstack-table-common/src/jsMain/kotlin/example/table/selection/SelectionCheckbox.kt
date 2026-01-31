package example.table.selection

import preact.signals.core.ReadonlySignal
import preact.signals.react.runtime.useSignals
import react.FC
import react.PropsWithValue
import react.dom.events.ChangeEventHandler
import react.dom.html.ReactHTML.input
import web.html.HTMLInputElement
import web.html.InputType
import web.html.checkbox

internal external interface SelectionCheckboxProps : PropsWithValue<ReadonlySignal<Boolean>> {
    var onChange: ChangeEventHandler<HTMLInputElement, HTMLInputElement>
}

internal val SelectionCheckbox: FC<SelectionCheckboxProps> = FC { props ->
    useSignals() // for preact signals to re-render the component on change without Babel plugin

    val isChecked = props.value

    input {
        type = InputType.checkbox
        checked = isChecked.value
        onChange = props.onChange
    }
}
