package tanstack.react.router

import tanstack.router.core.ParsedLocation

fun <T> useLocation(
    select: Select<ParsedLocation, T>,
): T =
    useLocation(UseLocationOptions(select = select))

fun <T> useLocation(
    select: (location: ParsedLocation) -> T,
    structuralSharing: Boolean,
): T =
    useLocation(UseLocationOptions(select = select, structuralSharing = structuralSharing))
