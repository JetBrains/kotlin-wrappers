package example.table.base

import js.array.ReadonlyArray
import react.FC
import react.Key
import react.PropsWithValue
import react.dom.html.ReactHTML.tbody
import tanstack.table.core.Row

internal external interface TableBodyProps : PropsWithValue<ReadonlyArray<Row<*>>>

internal val TableBody: FC<TableBodyProps> = FC { props ->
    val rows = props.value

    tbody {
        for (row in rows) {
            TableRow {
                key = Key(row.id)
                value = row
            }
        }
    }
}
