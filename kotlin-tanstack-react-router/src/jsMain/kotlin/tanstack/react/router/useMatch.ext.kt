package tanstack.react.router

fun useMatch(): UseMatchResult =
    useMatch(UseMatchOptions(strict = false))

fun <T> useMatch(
    select: Select<UseMatchResult, T>,
): T =
    useMatch(UseMatchOptions(strict = false, select = select))
