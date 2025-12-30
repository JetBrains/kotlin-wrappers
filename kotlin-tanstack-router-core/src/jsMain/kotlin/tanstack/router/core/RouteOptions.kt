package tanstack.router.core

import js.objects.JsPlainObject

@JsPlainObject
external interface RouteOptions<TParentRoute : BaseRoute<*>> {
    val getParentRoute: () -> TParentRoute
    val path: RoutePath?
    val id: RouteId?

    // TBD
}
