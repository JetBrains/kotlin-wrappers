package tanstack.react.router

import tanstack.router.core.RouteId
import tanstack.router.core.RouteMatch

fun useMatch(): RouteMatch =
    useMatch(UseMatchOptions(strict = false))

fun <T> useMatch(
    select: Select<RouteMatch, T>,
): T =
    useMatch(UseMatchOptions(strict = false, select = select))

fun <T> useMatch(
    from: RouteId,
): T =
    useMatch(UseMatchOptions(from = from, shouldThrow = false))
