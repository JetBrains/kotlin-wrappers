package react.router.dom

import kotlinext.js.jso

fun matchPath(
    pathName: String,
    block: MatchOptions.() -> Unit,
): Match? =
    matchPath(pathName, options = jso(block))

fun matchPath(
    pathName: String,
    parent: Match,
    block: MatchOptions.() -> Unit,
): Match? =
    matchPath(pathName, options = jso(block), parent)
