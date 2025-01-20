package wrappers.example.table.selection

import react.FC
import react.PropsWithValue

internal val SelectionCell: FC<PropsWithValue<SelectedKeys>> = FC { props ->
    val keys = props.value

    val changeHandler = useSelectionChangeHandler(keys)

    SelectionCheckbox {
        value = keys
        onChange = changeHandler
    }
}
