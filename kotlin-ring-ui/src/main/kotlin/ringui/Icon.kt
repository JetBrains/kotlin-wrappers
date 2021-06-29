@file:JsModule("@jetbrains/ring-ui/components/icon/icon")
@file:JsNonModule

package ringui

import react.RClass
import react.dom.WithClassName

// https://github.com/JetBrains/ring-ui/blob/master/components/icon/icon.js
external interface IconProps : WithClassName {
    var color: String
    var glyph: String /* string | func */
    var height: Double
    var size: Double
    var width: Double
    var loading: Boolean
}

@JsName("default")
external val Icon: RClass<IconProps>
