package tanstack.react.router

import tanstack.router.core.ToOptions

external interface UseMatchRouteOptions :
    ToOptions {
    var pending: Boolean?
    var includeSearch: Boolean?
    var fuzzy: Boolean?
}
