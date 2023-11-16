@file:JsModule("@jetbrains/ring-ui/components/link/link")

package ringui

import react.ComponentClass
import react.PropsWithChildren
import react.PropsWithClassName
import web.uievents.MouseEvent

// https://github.com/JetBrains/ring-ui/blob/master/components/link/link.js
external interface LinkProps : PropsWithChildren, PropsWithClassName {
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
external val Link: ComponentClass<LinkProps>
