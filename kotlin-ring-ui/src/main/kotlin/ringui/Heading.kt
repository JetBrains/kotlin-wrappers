@file:JsModule("@jetbrains/ring-ui/components/heading/heading")
@file:JsNonModule()

package ringui

import react.ComponentClass
import react.dom.WithClassName

external interface HeadingProps : WithClassName {
    var level: Int
}

@JsName("default")
external val Heading: ComponentClass<HeadingProps>