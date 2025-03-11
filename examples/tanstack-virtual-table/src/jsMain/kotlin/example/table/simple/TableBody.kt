package wrappers.example.table.simple

import emotion.styled.styled
import js.array.ReadonlyArray
import react.FC
import react.PropsWithValue
import react.dom.html.ReactHTML.tbody
import tanstack.table.core.Row
import web.cssom.TextAlign
import wrappers.example.theme.Theme

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
