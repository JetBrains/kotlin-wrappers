package react.router.dom

import kotlinext.js.Object
import kotlinext.js.jsObject
import react.RProps

fun useHistory() = ReactRouterDomModule.useHistory()

fun useLocation() = ReactRouterDomModule.useLocation()

fun <T : RProps> useParams(): T? {
    val rawParams = ReactRouterDomModule.useParams()

    return if (Object.keys(rawParams as Any).isEmpty()) null else rawParams as T
}

fun <T : RProps> useRouteMatch(
    path: Array<out String>,
    exact: Boolean = false,
    strict: Boolean = false,
    sensitive: Boolean = false
): RouteResultMatch<T>? {
    if (path.isEmpty()) {
        return ReactRouterDomModule.useRouteMatch(null)
    }

    val options: RouteMatchOptions = jsObject {
        this.path = path
        this.exact = exact
        this.strict = strict
        this.sensitive = sensitive
    }

    return ReactRouterDomModule.useRouteMatch(options)
}

external interface RouteMatchOptions {
    var path: Array<out String>
    var exact: Boolean
    var strict: Boolean
    var sensitive: Boolean
}
