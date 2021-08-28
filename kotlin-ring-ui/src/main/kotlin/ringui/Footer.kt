@file:JsModule("@jetbrains/ring-ui/components/footer/footer")
@file:JsNonModule

package ringui

import kotlinext.js.ReadonlyArray
import react.ComponentClass
import react.dom.WithClassName

external interface FooterProps : WithClassName {
    var floating: Boolean
    var left: ReadonlyArray<IFooterItem>
    var center: ReadonlyArray<IFooterItem>
    var right: ReadonlyArray<IFooterItem>
}

@JsName("default")
external val Footer: ComponentClass<FooterProps>
