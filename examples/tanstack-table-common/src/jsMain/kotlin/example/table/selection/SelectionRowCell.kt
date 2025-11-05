package example.table.selection

import react.FC
import react.PropsWithValue
import react.invoke
import react.useMemo
import tanstack.table.core.Row

internal val SelectionRowCell: FC<PropsWithValue<Row<*>>> = FC { props ->
    val keys = useMemo(props.value) {
        setOf(props.value.id)
    }

    SelectionCell {
        value = keys
    }
}
