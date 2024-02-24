@file:JsModule("@jetbrains/ring-ui/components/button/button")

package ringui

import react.ComponentClass
import react.PropsWithChildren
import react.PropsWithClassName
import web.uievents.MouseEvent

// https://github.com/JetBrains/ring-ui/blob/master/components/button/button.js
external interface ButtonProps : PropsWithChildren, PropsWithClassName {
    var theme: String
    var active: Boolean
    var danger: Boolean
    var delayed: Boolean
    var loader: Boolean
    var primary: Boolean
    var disabled: Boolean

    var short: Boolean
    var text: Boolean
    var inline: Boolean
    var dropdown: Boolean

    var href: String

    var icon: String /* string | func */
    var iconSize: Double
    var iconClassName: String

    var onMouseDown: (MouseEvent<*>) -> Unit
}

@JsName("default")
external val Button: ComponentClass<ButtonProps>
