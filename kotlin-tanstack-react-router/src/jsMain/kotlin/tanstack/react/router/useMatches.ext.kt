package tanstack.react.router

import js.array.ReadonlyArray
import tanstack.router.core.RouteMatch

fun useMatches(): ReadonlyArray<RouteMatch> =
    useMatches(UseMatchesOptions())

fun <T> useMatches(
    select: Select<ReadonlyArray<RouteMatch>, T>,
): T =
    useMatches(UseMatchesOptions(select = select))
