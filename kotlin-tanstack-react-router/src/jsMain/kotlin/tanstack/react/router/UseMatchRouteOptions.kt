package tanstack.react.router

import kotlinx.js.JsPlainObject
import tanstack.router.core.ToOptions

@JsPlainObject
external interface UseMatchRouteOptions :
    ToOptions {
    var pending: Boolean?
    var includeSearch: Boolean?
    var fuzzy: Boolean?
}
