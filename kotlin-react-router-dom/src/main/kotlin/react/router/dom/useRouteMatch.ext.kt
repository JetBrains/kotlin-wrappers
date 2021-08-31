package react.router.dom

import kotlinext.js.jso

fun useRouteMatch(
    vararg path: String,
    exact: Boolean = false,
    strict: Boolean = false,
    sensitive: Boolean = false,
): Match? {
    if (path.isEmpty()) {
        return useRouteMatch()
    }

    val options: MatchOptions = jso {
        this.path = path
        this.exact = exact
        this.strict = strict
        this.sensitive = sensitive
    }

    return useRouteMatch(options)
}
