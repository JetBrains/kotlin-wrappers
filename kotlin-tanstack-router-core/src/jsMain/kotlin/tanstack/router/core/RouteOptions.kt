package tanstack.router.core

import js.objects.JsPlainObject

@JsPlainObject
external interface RouteOptions :
    FilebaseRouteOptions,
    UpdatableRouteOptions {
    // BaseRouteOptions
    val getParentRoute: () -> AnyRoute

    // RoutePathOptions
    val path: RoutePath?
    val id: RouteId?

    // ParamsOptions
    val params: ParamsOptions?

    @JsPlainObject
    interface ParamsOptions {
        val parse: ((rawParams: String) -> Params)?
        val stringify: ((params: Params) -> String)?
    }
}
