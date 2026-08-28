package tanstack.react.router

import js.array.ReadonlyArray

fun <T> useMatches(
    select: Select<ReadonlyArray<RouteMatch>, T>,
): T =
    useMatches(UseMatchesOptions(select = select))
