@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

import react.ComponentClass
import react.PropsWithChildren

external interface LinkProps : PropsWithChildren {
    var to: String
    var replace: Boolean
    var className: String?
}

external val Link: ComponentClass<LinkProps>
