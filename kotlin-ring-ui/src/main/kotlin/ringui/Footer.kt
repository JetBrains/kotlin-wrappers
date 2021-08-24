@file:JsModule("@jetbrains/ring-ui/components/footer/footer")
@file:JsNonModule

package ringui

import kotlinext.js.ReadonlyArray
import react.ComponentClass
import react.dom.WithClassName

// https://github.com/JetBrains/ring-ui/blob/master/components/footer/footer.js
external interface FooterProps : WithClassName {
    var floating: Boolean
    var left: ReadonlyArray<IFooterItem>
    var center: ReadonlyArray<IFooterItem>
    var right: ReadonlyArray<IFooterItem>
}

@JsName("default")
external val Footer: ComponentClass<FooterProps>

//It seems that FooterColumn and FooterLine are not supposed to be used outside of Footer itself (in other words, only Footer should use them)
