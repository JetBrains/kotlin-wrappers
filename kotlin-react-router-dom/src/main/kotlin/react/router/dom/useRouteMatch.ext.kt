package react.router.dom

import kotlinext.js.jso

fun useRouteMatch(
    vararg path: String,
    exact: Boolean = false,
    strict: Boolean = false,
    sensitive: Boolean = false,
): Match? {
    val options: MatchOptions = jso {
        this.path = path
        this.exact = exact
        this.strict = strict
        this.sensitive = sensitive
    }

    return useRouteMatch(options)
}

fun useRouteMatch(
    block: MatchOptions.() -> Unit,
): Match? {
    val options: MatchOptions = jso { }
    options.block()

    return rawUseRouteMatch(options)
}