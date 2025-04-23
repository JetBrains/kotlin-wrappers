package wrappers.example.table.simple

import emotion.styled.StyledOptions
import emotion.styled.styled
import react.FC
import react.PropsWithValue
import react.dom.html.ReactHTML.td
import react.dom.html.TdHTMLAttributes
import tanstack.react.table.renderCell
import tanstack.table.core.Cell
import web.cssom.Length
import web.cssom.Padding
import web.cssom.px
import web.html.HTMLTableCellElement

internal external interface TableCellProps : PropsWithValue<Cell<*, *>>

internal val TableCell: FC<TableCellProps> = FC { props ->
    val cell = props.value

    Cell {
        size = cell.column.getSize().px

        +renderCell(cell)
    }
}

private external interface CellProps : TdHTMLAttributes<HTMLTableCellElement> {
    var size: Length
}

private val Cell = td.styled<CellProps>(
    StyledOptions(
        { true },
    )
) { props ->
    padding = Padding(10.px, 12.px)
    width = props.size
}
