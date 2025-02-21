package wrappers.example.table.selection

import js.array.ReadonlyArray
import react.FC
import react.PropsWithValue
import react.useMemo
import tanstack.table.core.Row

internal external interface SelectionHeaderProps : PropsWithValue<ReadonlyArray<Row<*>>> {
    var selection: Selection
}

internal val SelectionHeader: FC<SelectionHeaderProps> = FC { props ->
    val keys = useMemo(props.value) {
        props.value
            .map { it.id }
            .toSet()
    }

    SelectionControl {
        selection = props.selection
        value = keys
    }
}
