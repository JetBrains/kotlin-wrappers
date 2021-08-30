@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

import react.ComponentClass

external interface BrowserRouterProps : RouterProps {
    var basename: String
    var forceRefresh: Boolean
    var getUserConfirmation: GetUserConfirmation?
    var keyLength: Int
}

external val BrowserRouter: ComponentClass<BrowserRouterProps>
