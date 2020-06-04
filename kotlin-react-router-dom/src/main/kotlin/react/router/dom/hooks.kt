package react.router.dom

import kotlinext.js.Object
import kotlinext.js.jsObject
import react.RProps

fun useHistory() = ReactRouterDomModule.rawUseHistory()

fun useLocation() = ReactRouterDomModule.rawUseLocation()

fun <T : RProps> useParams(module: ReactRouterDom): T? {
    val rawParams = module.rawUseParams()

    return if (Object.keys(rawParams as Any).isEmpty()) null else rawParams as T
}

fun <T : RProps> useParams(): T? = useParams<T>(ReactRouterDomModule)

fun <T : RProps> useRouteMatch(
    module: ReactRouterDom,
    path: Array<out String>,
    exact: Boolean = false,
    strict: Boolean = false,
    sensitive: Boolean = false
): RouteResultMatch<T>? {
    if (path.isEmpty()) {
        return module.rawUseRouteMatch(null)
    }

    val options: RouteMatchOptions = jsObject {
        this.path = path
        this.exact = exact
        this.strict = strict
        this.sensitive = sensitive
    }

    return module.rawUseRouteMatch(options)
}

fun <T : RProps> useRouteMatch(
    module: ReactRouterDom,
    vararg path: String,
    exact: Boolean = false,
    strict: Boolean = false,
    sensitive: Boolean = false
) = useRouteMatch<T>(module, path, exact, strict, sensitive)

fun <T : RProps> useRouteMatch(
    vararg path: String,
    exact: Boolean = false,
    strict: Boolean = false,
    sensitive: Boolean = false
) = useRouteMatch<T>(ReactRouterDomModule, path, exact, strict, sensitive)

external interface RouteMatchOptions {
    var path: Array<out String>
    var exact: Boolean
    var strict: Boolean
    var sensitive: Boolean
}
