@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

import react.*

@JsName("HashRouter")
external class HashRouterComponent : Component<HashRouterProps, RState> {
    override fun render(): ReactElement?
}

@JsName("BrowserRouter")
external class BrowserRouterComponent : Component<BrowserRouterProps, RState> {
    override fun render(): ReactElement?
}

@JsName("Switch")
external class SwitchComponent : Component<RProps, RState> {
    override fun render(): ReactElement?
}

@JsName("Route")
external class RouteComponent<T : RProps> : Component<RouteProps<T>, RState> {
    override fun render(): ReactElement?
}

@JsName("Link")
external class LinkComponent : Component<LinkProps, RState> {
    override fun render(): ReactElement?
}

@JsName("NavLink")
external class NavLinkComponent<T : RProps> : Component<NavLinkProps<T>, RState> {
    override fun render(): ReactElement?
}

@JsName("Redirect")
external class RedirectComponent : Component<RedirectProps, RState> {
    override fun render(): ReactElement?
}

external interface BrowserRouterProps : RProps {
    var basename: String
    var forceRefresh: Boolean
    var getUserConfirmation: GetUserConfirmation?
    var keyLength: Int
}

external interface HashRouterProps : RProps {
    var basename: String
    var getUserConfirmation: GetUserConfirmation?
    var hashType: String
}

external interface RouteProps<T : RProps> : RProps {
    var path: Array<out String>
    var exact: Boolean
    var strict: Boolean
    var component: RClass<RProps>
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
    var isActive: ((match: RouteResultMatch<T>?, location: RouteResultLocation) -> Boolean)?
    var location: RouteResultLocation
}

external interface RouteResultProps<T : RProps> : RProps {
    var history: RouteResultHistory
    var location: RouteResultLocation
    var match: RouteResultMatch<T>
}

external interface RouteResultHistory {
    val length: Int
    val action: String
    var location: RouteResultLocation

    fun push(path: String, state: dynamic = definedExternally)
    fun replace(path: String, state: dynamic = definedExternally) 
    fun go(n: Int)
    fun goBack()
    fun goForward()
}

external interface RouteResultLocation {
    var hash: String
    var pathname: String
    var search: String
}

external interface RouteResultMatch<T : RProps> {
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
