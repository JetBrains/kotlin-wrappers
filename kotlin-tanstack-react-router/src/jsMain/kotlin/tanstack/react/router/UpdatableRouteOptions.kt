package tanstack.react.router

import js.objects.JsPlainObject

@JsPlainObject
external interface UpdatableRouteOptions {
    val component: RouteComponent?
    val errorComponent: ErrorRouteComponent?
    val notFoundComponent: NotFoundRouteComponent?
    val pendingComponent: RouteComponent?
}
