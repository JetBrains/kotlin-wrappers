package example.table.base

import js.array.ReadonlyArray
import react.ChildrenBuilder
import react.FC
import react.PropsWithClassName
import react.dom.html.ReactHTML.table
import tanstack.table.core.HeaderGroup
import tanstack.table.core.Row

external interface TableBaseProps<D : Any> : PropsWithClassName {
    var headerGroups: ReadonlyArray<HeaderGroup<D>>
    var rows: ReadonlyArray<Row<D>>
}

val TableBase: FC<TableBaseProps<*>> = FC { props ->
    TableBase(props)
}

private fun <D : Any> ChildrenBuilder.TableBase(props: TableBaseProps<D>) {
    table {
        className = props.className

        TableHead {
            value = props.headerGroups
        }

        TableBody {
            value = props.rows
        }
    }
}
