package wrappers.example.table.selection

import react.FC
import react.PropsWithValue
import wrappers.example.entities.Key

internal external interface SelectionControlProps : PropsWithValue<Set<Key>> {
    var selection: Selection
}

internal val SelectionControl: FC<SelectionControlProps> = FC { props ->
    val checked = useIsChecked(props.value, props.selection)
    val changeHandler = useSelectionChangeHandler(props.value, props.selection)

    SelectionCheckbox {
        value = checked
        onChange = changeHandler
    }
}
