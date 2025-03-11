package wrappers.example.table.simple

import emotion.styled.styled
import react.FC
import react.PropsWithValue
import react.dom.html.ReactHTML.th
import tanstack.react.table.renderHeader
import tanstack.table.core.Header
import web.cssom.*
import web.cssom.LineStyle.Companion.solid
import wrappers.example.theme.Theme

internal external interface TableHeaderProps : PropsWithValue<Header<*, *>>

internal val TableHeader: FC<TableHeaderProps> = FC { props ->
    val header = props.value

    Container {
        +renderHeader(header)
    }
}

private val Container = th.styled {
    fontWeight = FontWeight.normal
    padding = Padding(4.px, 12.px)
    borderRight = Border(1.px, solid, Theme.Stroke.Gray)
    borderBottom = Border(1.px, solid, Theme.Stroke.Gray)

    lastChild {
        borderRight = None.Companion.none
    }
}
