package react.router.dom

import kotlinext.js.Object
import kotlinext.js.jsObject
import react.Props

fun <T : Props> useParams(): T? {
    val params = rawUseParams()

    return if (Object.keys(params).isNotEmpty()) {
        params.unsafeCast<T>()
    } else null
}

fun <T : Props> useRouteMatch(
    vararg path: String,
    exact: Boolean = false,
    strict: Boolean = false,
    sensitive: Boolean = false,
): Match<T>? {
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
