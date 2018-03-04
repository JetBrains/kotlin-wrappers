@file:JsModule("react-router-dom")

package react.router.dom

import react.*

@JsName("HashRouter")
external class HashRouterComponent : Component<RProps, RState> {
    override fun render(): ReactElement?
}

@JsName("Switch")
external class SwitchComponent : Component<RProps, RState> {
    override fun render(): ReactElement?
}

@JsName("Route")
external class RouteComponent : Component<RouteProps, RState> {
    override fun render(): ReactElement?
}

@JsName("Link")
external class LinkComponent : Component<LinkProps, RState> {
    override fun render(): ReactElement?
}

external interface RouteProps : RProps {
    var path: String
    var exact: Boolean
    var component: RClass<RProps>
    var render: () -> ReactElement?
}

external interface LinkProps : RProps {
    var to: String
    var replace: Boolean
}
