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
external class RouteComponent<T : RProps> : Component<RouteProps<T>, RState> {
    override fun render(): ReactElement?
}

@JsName("Link")
external class LinkComponent : Component<LinkProps, RState> {
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
}

external interface RouteResultProps<T : RProps> : RProps {
    var match: RouteResultMatch<T>
}

external interface RouteResultMatch<T : RProps> {
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
