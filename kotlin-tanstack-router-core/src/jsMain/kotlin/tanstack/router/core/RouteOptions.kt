package tanstack.router.core

import js.objects.JsPlainObject

@JsPlainObject
external interface RouteOptions<TParentRoute : BaseRoute<*>> {
    // BaseRouteOptions
    val getParentRoute: () -> TParentRoute

    // RoutePathOptions
    val path: RoutePath?
    val id: RouteId?

    // ParamsOptions
    val params: Params?

    @JsPlainObject
    interface Params {
        val parse: ((rawParams: String) -> Params)?
        val stringify: ((params: Params) -> String)?
    }

    // TBD
}
