package wrappers.example.table.selection

import react.FC
import react.PropsWithValue
import wrappers.example.entities.Key

internal val SelectionControl: FC<PropsWithValue<Set<Key>>> = FC { props ->
    val keys = props.value

    val checked = useIsChecked(keys)
    val changeHandler = useSelectionChangeHandler(keys)

    SelectionCheckbox {
        value = checked
        onChange = changeHandler
    }
}
