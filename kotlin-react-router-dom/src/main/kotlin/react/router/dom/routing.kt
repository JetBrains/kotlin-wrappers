@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

import react.*

external val HashRouter: ComponentClass<HashRouterProps>

external val BrowserRouter: ComponentClass<BrowserRouterProps>

external val Switch: ComponentClass<PropsWithChildren>

external val Route: ComponentClass<RouteProps>

external val Link: ComponentClass<LinkProps>

external val NavLink: ComponentClass<NavLinkProps>

external val Redirect: ComponentClass<RedirectProps>

external interface RouterProps : PropsWithChildren {
    var history: History
}

external interface BrowserRouterProps : RouterProps {
    var basename: String
    var forceRefresh: Boolean
    var getUserConfirmation: GetUserConfirmation?
    var keyLength: Int
}

external interface HashRouterProps : RouterProps {
    var basename: String
    var getUserConfirmation: GetUserConfirmation?
    var hashType: String
}

external interface RouteProps : Props {
    var path: Array<out String>
    var exact: Boolean
    var strict: Boolean
    var component: ComponentType<*>
    var render: (props: RouteResultProps) -> ReactElement?
}

external interface LinkProps : PropsWithChildren {
    var to: String
    var replace: Boolean
    var className: String?
}

external interface NavLinkProps : LinkProps {
    var activeClassName: String
    var exact: Boolean
    var strict: Boolean
    var isActive: ((match: Match?, location: Location) -> Boolean)?
    var location: Location
}

external interface RouteResultProps : Props {
    var history: History
    var location: Location
    var match: Match
}

external interface History {
    val length: Int
    val action: String
    var location: Location

    fun push(path: String, state: dynamic = definedExternally)
    fun replace(path: String, state: dynamic = definedExternally)
    fun go(n: Int)
    fun goBack()
    fun goForward()
}

external interface Location {
    var hash: String
    var pathname: String
    var search: String
}

external interface Match {
    var isExact: Boolean
    var url: String
    var path: String
    var params: Params
}

external interface RedirectProps : Props {
    var from: String?
    var to: String
    var push: Boolean
    var exact: Boolean
    var strict: Boolean
}
