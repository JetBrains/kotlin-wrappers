package react.router.dom

import kotlinext.js.jso

fun useRouteMatch(
    vararg path: String,
    exact: Boolean = false,
    strict: Boolean = false,
    sensitive: Boolean = false,
): Match? {
    if (path.isEmpty()) {
        return rawUseRouteMatch(null)
    }

    val options: RouteMatchOptions = jso {
        this.path = path
        this.exact = exact
        this.strict = strict
        this.sensitive = sensitive
    }

    return rawUseRouteMatch(options)
}
