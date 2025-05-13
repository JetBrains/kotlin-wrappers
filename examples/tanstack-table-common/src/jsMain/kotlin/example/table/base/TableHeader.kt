package example.table.base

import react.FC
import react.PropsWithValue
import react.dom.html.ReactHTML.th
import tanstack.react.table.renderHeader
import tanstack.table.core.Header

internal external interface TableHeaderProps : PropsWithValue<Header<*, *>>

internal val TableHeader: FC<TableHeaderProps> = FC { props ->
    val header = props.value

    th {
        +renderHeader(header)
    }
}
