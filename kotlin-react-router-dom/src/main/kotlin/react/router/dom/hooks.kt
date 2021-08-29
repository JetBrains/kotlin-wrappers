package react.router.dom

import kotlinext.js.jsObject

fun useRouteMatch(
    vararg path: String,
    exact: Boolean = false,
    strict: Boolean = false,
    sensitive: Boolean = false,
): Match? {
    if (path.isEmpty()) {
        return rawUseRouteMatch(null)
    }

    val options: RouteMatchOptions = jsObject {
        this.path = path
        this.exact = exact
        this.strict = strict
        this.sensitive = sensitive
    }

    return rawUseRouteMatch(options)
}

external interface RouteMatchOptions {
    var path: Array<out String>
    var exact: Boolean
    var strict: Boolean
    var sensitive: Boolean
}
