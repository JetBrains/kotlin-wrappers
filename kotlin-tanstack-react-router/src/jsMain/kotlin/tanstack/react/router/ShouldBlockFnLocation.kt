package tanstack.react.router

import js.objects.JsPlainObject
import tanstack.router.core.Params
import tanstack.router.core.RouteId
import tanstack.router.core.RoutePath
import tanstack.router.core.Search

@JsPlainObject
external interface ShouldBlockFnLocation {
    val routeId: RouteId
    val fullPath: RoutePath
    val pathname: String
    val params: Params
    val search: Search
}
