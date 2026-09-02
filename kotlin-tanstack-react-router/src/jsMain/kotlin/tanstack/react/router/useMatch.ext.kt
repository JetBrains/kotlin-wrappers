package tanstack.react.router

import tanstack.router.core.RouteMatch

fun useMatch(): UseMatchResult =
    useMatch(UseMatchOptions(strict = false))

fun <T> useMatch(
    select: Select<RouteMatch, T>,
): T =
    useMatch(UseMatchOptions(strict = false, select = select))
