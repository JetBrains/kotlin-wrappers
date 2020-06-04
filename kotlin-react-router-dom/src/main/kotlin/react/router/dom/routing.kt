package react.router.dom

import react.*

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
    var from: String?
    var to: String
    var push: Boolean
    var exact: Boolean
    var strict: Boolean
}
