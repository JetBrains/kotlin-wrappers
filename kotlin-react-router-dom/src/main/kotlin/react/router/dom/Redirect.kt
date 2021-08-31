@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

import react.ComponentClass
import react.Props

external interface RedirectProps : Props {
    var from: String?
    var to: String
    var push: Boolean
    var exact: Boolean
    var strict: Boolean
    var sensitive: Boolean
}

external val Redirect: ComponentClass<RedirectProps>
