package ringui

import react.RBuilder
import react.RHandler

fun RBuilder.Dropdown(
    anchor: dynamic,
    handler: RHandler<DropdownProps>,
) {
    Dropdown {
        attrs.anchor = anchor

        handler()
    }
}
