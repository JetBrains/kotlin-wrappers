package react.router.dom

import kotlinext.js.jso

fun matchPath(
    pathName: String,
    vararg path: String,
    exact: Boolean = false,
    strict: Boolean = false,
    sensitive: Boolean = false,
): Match? {
    val options: RouteMatchOptions = jso {
        this.path = path
        this.exact = exact
        this.strict = strict
        this.sensitive = sensitive
    }

    return rawMatchPath(pathName, options)
}
