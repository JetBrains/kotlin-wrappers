package example.components.table.base

import emotion.styled.styled
import example.table.simple.TableStyles
import example.theme.Theme
import js.array.ReadonlyArray
import react.ChildrenBuilder
import react.FC
import react.Props
import react.ReactDsl
import react.dom.html.ReactHTML.table
import tanstack.table.core.HeaderGroup
import tanstack.table.core.Row
import web.cssom.Auto.Companion.auto
import web.cssom.Border
import web.cssom.BorderCollapse
import web.cssom.LineStyle.Companion.solid
import web.cssom.WhiteSpace
import web.cssom.px

internal external interface TableProps<D : Any> : Props {
    var headerGroups: ReadonlyArray<HeaderGroup<D>>
    var rows: ReadonlyArray<Row<D>>
}

internal fun <D : Any> ChildrenBuilder.Table(block: @ReactDsl TableProps<D>.() -> Unit) {
    Table.invoke(block)
}

private val Table: FC<TableProps<*>> = FC { props ->
    Table(props)
}

private fun <D : Any> ChildrenBuilder.Table(props: TableProps<D>) {
    TableStyles()

    TableBase {
        TableHead {
            value = props.headerGroups
        }

        TableBody {
            value = props.rows
        }
    }
}

private val TableBase = table.styled {
    width = 400.px
    borderSpacing = 0.px
    borderCollapse = BorderCollapse.collapse
    whiteSpace = WhiteSpace.nowrap
    border = Border(2.px, solid, Theme.Stroke.Gray)
    margin = auto
}
