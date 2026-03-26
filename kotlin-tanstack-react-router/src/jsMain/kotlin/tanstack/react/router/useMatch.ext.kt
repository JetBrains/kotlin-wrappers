package tanstack.react.router

import tanstack.router.core.RouteId
import tanstack.router.core.RouteMatch

fun useMatch(): RouteMatch =
    useMatch(UseMatchOptions(strict = false))

fun <T> useMatch(
    select: Select<RouteMatch, T>,
): T =
    useMatch(UseMatchOptions(strict = false, select = select))

fun useMatch(
    from: RouteId,
    shouldThrow: Boolean,
): RouteMatch? =
    useMatch(UseMatchOptions(from = from, shouldThrow = shouldThrow))
