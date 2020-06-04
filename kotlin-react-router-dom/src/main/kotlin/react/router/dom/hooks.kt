package react.router.dom

import kotlinext.js.Object
import kotlinext.js.jsObject
import react.RProps

fun useHistory() = ReactRouterDom.useHistory()

fun useLocation() = ReactRouterDom.useLocation()

fun <T : RProps> useParams(module: ReactRouterDom): T? {
    val rawParams = module.useParams()

    return if (Object.keys(rawParams as Any).isEmpty()) null else rawParams as T
}

fun <T : RProps> useParams() = useParams<T>(ReactRouterDom)

fun <T : RProps> useRouteMatch(
    module: ReactRouterDom,
    path: Array<out String>,
    exact: Boolean = false,
    strict: Boolean = false,
    sensitive: Boolean = false
): RouteResultMatch<T>? {
    if (path.isEmpty()) {
        return module.useRouteMatch(null)
    }

    val options: RouteMatchOptions = jsObject {
        this.path = path
        this.exact = exact
        this.strict = strict
        this.sensitive = sensitive
    }

    return module.useRouteMatch(options)
}

fun <T : RProps> useRouteMatch(
    vararg path: String,
    exact: Boolean = false,
    strict: Boolean = false,
    sensitive: Boolean = false
) = useRouteMatch<T>(ReactRouterDom, path = path, exact = exact, strict = strict, sensitive  = sensitive)

external interface RouteMatchOptions {
    var path: Array<out String>
    var exact: Boolean
    var strict: Boolean
    var sensitive: Boolean
}
