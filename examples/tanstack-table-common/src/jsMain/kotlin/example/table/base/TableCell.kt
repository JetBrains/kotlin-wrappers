package example.table.base

import react.FC
import react.PropsWithValue
import react.dom.html.ReactHTML.td
import react.invoke
import react.unaryPlus
import tanstack.react.table.renderCell
import tanstack.table.core.Cell

internal external interface TableCellProps : PropsWithValue<Cell<*, *>>

internal val TableCell: FC<TableCellProps> = FC { props ->
    val cell = props.value

    td {
        +renderCell(cell)
    }
}
