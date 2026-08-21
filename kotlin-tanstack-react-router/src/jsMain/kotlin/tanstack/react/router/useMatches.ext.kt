package tanstack.react.router

fun useMatches(): Array<RouteMatch> =
    useMatches(UseMatchesOptions())

fun <T> useMatches(
    select: Select<Array<RouteMatch>, T>,
): T =
    useMatches(UseMatchesOptions(select = select))

fun <T> useMatches(
    select: Select<Array<RouteMatch>, T>,
    structuralSharing: Boolean,
): T =
    useMatches(UseMatchesOptions(select = select, structuralSharing = structuralSharing))