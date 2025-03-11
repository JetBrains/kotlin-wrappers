package wrappers.example.table.selection

import js.array.ReadonlyArray
import react.FC
import react.PropsWithValue
import react.useMemo
import tanstack.table.core.Row

internal val SelectionHeaderCell: FC<PropsWithValue<ReadonlyArray<Row<*>>>> = FC { props ->
    val rows = props.value
    val keys = useMemo(rows) {
        rows.map { it.id }.toSet()
    }

    SelectionCell {
        value = keys
    }
}
