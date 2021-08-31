package react.router.dom

import kotlinext.js.jso

fun matchPath(
    pathName: String,
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

    return matchPath(pathName, options)
}

fun matchPath(
    pathName: String,
    vararg path: String,
    block: ExtraMatchOptions.() -> Unit,
): Match? {
    val options: MatchOptions = jso {
        this.path = path
    }

    options.block()

    return rawMatchPath(pathName, options)
}
