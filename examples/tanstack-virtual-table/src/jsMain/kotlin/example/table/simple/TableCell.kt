package wrappers.example.table.simple

import emotion.styled.styled
import react.FC
import react.PropsWithValue
import react.dom.html.ReactHTML.td
import tanstack.react.table.renderCell
import tanstack.table.core.Cell
import web.cssom.Padding
import web.cssom.px

internal external interface TableCellProps : PropsWithValue<Cell<*, *>>

internal val TableCell: FC<TableCellProps> = FC { props ->
    val cell = props.value

    Container {
        +renderCell(cell)
    }
}

private val Container = td.styled {
    padding = Padding(10.px, 12.px)
}
