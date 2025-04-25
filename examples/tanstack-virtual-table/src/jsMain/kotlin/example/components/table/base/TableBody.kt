package example.components.table.base

import emotion.styled.styled
import example.theme.Theme
import js.array.ReadonlyArray
import react.FC
import react.PropsWithValue
import react.dom.html.ReactHTML.tbody
import tanstack.table.core.Row
import web.cssom.TextAlign

internal external interface TableBodyProps : PropsWithValue<ReadonlyArray<Row<*>>>

internal val TableBody: FC<TableBodyProps> = FC { props ->
    val rows = props.value

    Container {
        for (row in rows) {
            TableRow {
                key = row.id
                value = row
            }
        }
    }
}

private val Container = tbody.styled {
    color = Theme.Text.Black
    backgroundColor = Theme.Background.White
    textAlign = TextAlign.start
}
