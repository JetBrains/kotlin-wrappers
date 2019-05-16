@file:JsModule("react-router-dom")

package react.router.dom

import react.*

@JsName("HashRouter")
external class HashRouterComponent : Component<RProps, RState> {
    override fun render(): ReactElement?
}

@JsName("BrowserRouter")
external class BrowserRouterComponent : Component<RProps, RState> {
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
external class NavLinkComponent : Component<NavLinkProps, RState> {
    override fun render(): ReactElement?
}

@JsName("Redirect")
external class RedirectComponent : Component<RedirectProps, RState> {
    override fun render(): ReactElement?
}

external interface RouteProps<T : RProps> : RProps {
    var path: String
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

external interface NavLinkProps : LinkProps {
    var activeClassName: String
    var exact: Boolean
    var strict: Boolean
    var isActive: (() -> Unit)?
}

external interface RouteResultProps<T : RProps> : RProps {
    var history: RouteResultHistory
    var location: RouteResultLocation
    var match: RouteResultMatch<T>
}

external interface RouteResultHistory {
    var location: RouteResultLocation

    fun push(path: String)
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
    var from: String
    var to: String
    var push: Boolean
    var exact: Boolean
    var strict: Boolean
}
