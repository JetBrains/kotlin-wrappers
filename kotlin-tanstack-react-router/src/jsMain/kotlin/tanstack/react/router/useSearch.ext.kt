package tanstack.react.router

import tanstack.router.core.Search

fun useSearch(): Search =
    useSearch(UseSearchOptions(strict = false))

fun <T> useSearch(
    select: Select<Search, T>,
): T =
    useSearch(UseSearchOptions(strict = false, select = select))
