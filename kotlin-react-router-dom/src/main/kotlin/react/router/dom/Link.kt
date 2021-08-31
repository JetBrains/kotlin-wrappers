@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

import react.ComponentClass
import react.PropsWithChildren
import react.PropsWithClassName

external interface LinkProps : PropsWithChildren, PropsWithClassName {
    var to: String
    var replace: Boolean
}

external val Link: ComponentClass<LinkProps>
