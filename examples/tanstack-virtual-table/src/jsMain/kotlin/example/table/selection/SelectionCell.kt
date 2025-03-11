package wrappers.example.table.selection

import react.FC
import react.PropsWithValue

internal val SelectionCell: FC<PropsWithValue<SelectedKeys>> = FC { props ->
    val keys = props.value

    val checked = useIsChecked(keys)
    val changeHandler = useSelectionChangeHandler(keys)

    SelectionCheckbox {
        value = checked
        onChange = changeHandler
    }
}
