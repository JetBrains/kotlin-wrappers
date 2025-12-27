package tanstack.react.router

import js.objects.JsPlainObject

@JsPlainObject
external interface RouteOptions {
    val getParentRoute: () -> Route
    val path: String?
    val id: String?
    val component: RouteComponent?
    val errorComponent: ErrorRouteComponent?
    val notFoundComponent: NotFoundRouteComponent?
    val pendingComponent: RouteComponent?

    // TBD
}
