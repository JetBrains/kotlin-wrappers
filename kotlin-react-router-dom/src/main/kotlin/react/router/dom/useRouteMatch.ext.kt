package react.router.dom

import kotlinext.js.jso

fun useRouteMatch(
    block: MatchOptions.() -> Unit,
): Match? =
    useRouteMatch(options = jso(block))
