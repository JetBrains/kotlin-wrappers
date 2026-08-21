package tanstack.react.router

import js.array.ReadonlyArray

fun useMatches(): ReadonlyArray<RouteMatch> =
    useMatches(UseMatchesOptions())

fun <T> useMatches(
    select: Select<ReadonlyArray<RouteMatch>, T>,
): T =
    useMatches(UseMatchesOptions(select = select))

fun <T> useMatches(
    select: Select<ReadonlyArray<RouteMatch>, T>,
    structuralSharing: Boolean,
): T =
    useMatches(UseMatchesOptions(select = select, structuralSharing = structuralSharing))
