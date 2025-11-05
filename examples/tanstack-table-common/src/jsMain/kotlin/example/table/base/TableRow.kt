package example.table.base

import react.FC
import react.PropsWithValue
import react.dom.html.ReactHTML.tr
import tanstack.table.core.Row

internal external interface TableRowProps : PropsWithValue<Row<*>>

internal val TableRow: FC<TableRowProps> = FC { props ->
    val row = props.value

    tr {
        for (cell in row.getVisibleCells()) {
            TableCell {
                key = cell.id
                value = cell
            }
        }
    }
}
