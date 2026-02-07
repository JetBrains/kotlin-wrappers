package tanstack.react.router

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface UpdatableRouteOptions :
    tanstack.router.core.UpdatableRouteOptions {
    val component: RouteComponent?
    val errorComponent: ErrorRouteComponent?
    val notFoundComponent: NotFoundRouteComponent?
    val pendingComponent: RouteComponent?
}
