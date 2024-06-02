package ringui

import react.RBuilder
import react.RHandler

fun RBuilder.Dropdown(
    anchor: Any,
    handler: RHandler<DropdownProps>,
) {
    Dropdown {
        attrs.anchor = anchor

        handler()
    }
}
