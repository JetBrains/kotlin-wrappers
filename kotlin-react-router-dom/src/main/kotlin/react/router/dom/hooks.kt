package react.router.dom

import kotlinext.js.Object
import kotlinext.js.jsObject
import react.RProps

fun <T: RProps> useParams(): T? {
    val rawParams = rawUseParams()

    return if (Object.keys(rawParams as Any).isEmpty()) null else rawParams as T
}

fun <T: RProps> useRouteMatch(
        exact: Boolean = false,
        strict: Boolean = false,
        sensitive: Boolean = false,
        vararg path: String
): RouteResultMatch<T>? {
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
