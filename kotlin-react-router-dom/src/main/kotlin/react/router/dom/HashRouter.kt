@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

import react.ComponentClass

external interface HashRouterProps : RouterProps {
    var basename: String
    var getUserConfirmation: GetUserConfirmation?
    var hashType: String
}

external val HashRouter: ComponentClass<HashRouterProps>
