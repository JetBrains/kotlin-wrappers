package wrappers.example.table.selection

import react.FC
import react.PropsWithValue
import react.useMemo
import wrappers.example.entities.Key

internal external interface SelectionCellProps : PropsWithValue<Key> {
    var selection: Selection
}

internal val SelectionCell: FC<SelectionCellProps> = FC { props ->
    val keys = useMemo(props.value) {
        setOf(props.value)
    }

    SelectionContext(props.selection) {
        SelectionControl {
            value = keys
        }
    }
}
