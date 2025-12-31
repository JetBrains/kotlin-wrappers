package tanstack.react.router

import tanstack.router.core.Search

fun useSearch(): Search =
    useSearch(UseSearchOptions(strict = false))
