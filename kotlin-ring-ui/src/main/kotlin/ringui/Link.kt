@file:JsModule("@jetbrains/ring-ui/components/link/link")
@file:JsNonModule

package ringui

import org.w3c.dom.events.MouseEvent
import react.RClass
import react.dom.WithClassName

// https://github.com/JetBrains/ring-ui/blob/master/components/link/link.js
external interface LinkProps : WithClassName {
    var innerClassName: String
    var active: Boolean
    var inherit: Boolean
    var pseudo: Boolean
    var hover: Boolean
    var href: String
    var onPlainLeftClick: (MouseEvent) -> Unit
    var onClick: (MouseEvent) -> Unit
}

@JsName("default")
external val Link: RClass<LinkProps>
