package react.router.dom

import kotlinext.js.jso

fun matchPath(
    pathName: String,
    parent: Match? = null,
    block: MatchOptions.() -> Unit,
): Match? =
    matchPath(pathName, options = jso(block), parent)

@Deprecated(
    message = "Legacy match API",
)
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
