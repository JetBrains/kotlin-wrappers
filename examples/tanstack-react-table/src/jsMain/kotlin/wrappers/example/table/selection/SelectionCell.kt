package wrappers.example.table.selection

import react.FC
import react.Key
import react.PropsWithValue

internal external interface SelectionCellProps : PropsWithValue<Set<Key>> {
    var metadata: TableMetadata
}

internal val SelectionCell: FC<SelectionCellProps> = FC { props ->
    val keys = props.value
    val metadata = props.metadata

    val checked = useIsChecked(keys, metadata)
    val changeHandler = useSelectionChangeHandler(keys, metadata)

    SelectionCheckbox {
        value = checked
        onChange = changeHandler
    }
}
