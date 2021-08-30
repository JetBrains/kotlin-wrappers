@file:JsModule("@jetbrains/ring-ui/components/heading/heading")
@file:JsNonModule()

package ringui

import react.ComponentClass
import react.PropsWithChildren
import react.PropsWithClassName

external interface HeadingProps : PropsWithChildren, PropsWithClassName {
    var level: Int
}

@JsName("default")
external val Heading: ComponentClass<HeadingProps>
