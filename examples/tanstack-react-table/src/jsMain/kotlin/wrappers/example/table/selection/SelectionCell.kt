package wrappers.example.table.selection

import preact.signals.core.Signal
import react.FC
import react.PropsWithValue
import wrappers.example.entities.Key

internal external interface SelectionCellProps : PropsWithValue<Signal<SelectedKeys>?> {
    var keys: Set<Key>
}

internal val SelectionCell: FC<SelectionCellProps> = FC { props ->
    val keys = props.keys
    val selection = props.value
        ?: return@FC

    val checked = useIsChecked(keys, selection)
    val changeHandler = useSelectionChangeHandler(keys, selection)

    SelectionCheckbox {
        value = checked
        onChange = changeHandler
    }
}
