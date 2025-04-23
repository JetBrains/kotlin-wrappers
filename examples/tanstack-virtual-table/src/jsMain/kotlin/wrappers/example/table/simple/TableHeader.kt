package wrappers.example.table.simple

import emotion.styled.StyledOptions
import emotion.styled.styled
import react.FC
import react.PropsWithValue
import react.dom.html.ReactHTML.th
import react.dom.html.ThHTMLAttributes
import tanstack.react.table.renderHeader
import tanstack.table.core.Header
import web.cssom.*
import web.cssom.LineStyle.Companion.solid
import web.html.HTMLTableCellElement
import wrappers.example.theme.Theme

internal external interface TableHeaderProps : PropsWithValue<Header<*, *>>

internal val TableHeader: FC<TableHeaderProps> = FC { props ->
    val header = props.value

    Header {
        size = header.column.getSize().px

        +renderHeader(header)
    }
}

private external interface HeaderProps : ThHTMLAttributes<HTMLTableCellElement> {
    var size: Length
}

private val Header = th.styled<HeaderProps>(
    StyledOptions(
        { true },
    )
) { props ->
    position = Position.sticky

    width = props.size

    fontWeight = FontWeight.normal
    padding = Padding(4.px, 12.px)
    borderRight = Border(1.px, solid, Theme.Stroke.Gray)
    borderBottom = Border(1.px, solid, Theme.Stroke.Gray)

    lastChild {
        borderRight = None.Companion.none
    }
}
