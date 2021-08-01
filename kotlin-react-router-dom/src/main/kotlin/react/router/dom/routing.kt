@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

import react.*

@JsName("HashRouter")
external val HashRouterComponent: ComponentClass<HashRouterProps>

@JsName("BrowserRouter")
external val BrowserRouterComponent: ComponentClass<BrowserRouterProps>

@JsName("Switch")
external val SwitchComponent: ComponentClass<RProps>

@JsName("Route")
external class RouteComponent<T : RProps> : Component<RouteProps<T>, State> {
    override fun render(): ReactElement?
}

@JsName("Link")
external val LinkComponent: ComponentClass<LinkProps>

@JsName("NavLink")
external class NavLinkComponent<T : RProps> : Component<NavLinkProps<T>, State> {
    override fun render(): ReactElement?
}

@JsName("Redirect")
external val RedirectComponent: ComponentClass<RedirectProps>

external interface RouterProps : RProps {
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

external interface RouteProps<T : RProps> : RProps {
    var path: Array<out String>
    var exact: Boolean
    var strict: Boolean
    var component: ComponentType<RProps>
    var render: (props: RouteResultProps<T>) -> ReactElement?
}

external interface LinkProps : RProps {
    var to: String
    var replace: Boolean
    var className: String?
}

external interface NavLinkProps<T : RProps> : LinkProps {
    var activeClassName: String
    var exact: Boolean
    var strict: Boolean
    var isActive: ((match: Match<T>?, location: Location) -> Boolean)?
    var location: Location
}

external interface RouteResultProps<T : RProps> : RProps {
    var history: History
    var location: Location
    var match: Match<T>
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

external interface Match<T : RProps> {
    var isExact: Boolean
    var url: String
    var path: String
    var params: T
}

external interface RedirectProps : RProps {
    var from: String?
    var to: String
    var push: Boolean
    var exact: Boolean
    var strict: Boolean
}
