package wrappers.example.table.simple

import emotion.styled.styled
import js.array.ReadonlyArray
import react.ChildrenBuilder
import react.FC
import react.Props
import react.ReactDsl
import react.dom.html.ReactHTML.table
import tanstack.table.core.HeaderGroup
import tanstack.table.core.Row
import web.cssom.*
import web.cssom.Auto.Companion.auto
import web.cssom.LineStyle.Companion.solid
import wrappers.example.theme.Theme

internal external interface SimpleTableProps<D : Any> : Props {
    var headerGroups: ReadonlyArray<HeaderGroup<D>>
    var rows: ReadonlyArray<Row<D>>
}

internal fun <D : Any> ChildrenBuilder.SimpleTable(block: @ReactDsl SimpleTableProps<D>.() -> Unit) {
    SimpleTable.invoke(block)
}

private val SimpleTable: FC<SimpleTableProps<*>> = FC { props ->
    SimpleTable(props)
}

private fun <D : Any> ChildrenBuilder.SimpleTable(props: SimpleTableProps<D>) {
    val (rows, styles) = useRows(props.rows)

    TableBase {
        TableHead {
            value = props.headerGroups
        }

        if (styles != null) {
            TableStyles {
                value = styles
            }
        }

        TableBody {
            value = rows
        }
    }
}

private val TableBase = table.styled {
    height = 100.pct

    borderSpacing = 0.px
    borderCollapse = BorderCollapse.collapse
    border = Border(2.px, solid, Theme.Stroke.Gray)

    whiteSpace = WhiteSpace.nowrap
    margin = auto
}
