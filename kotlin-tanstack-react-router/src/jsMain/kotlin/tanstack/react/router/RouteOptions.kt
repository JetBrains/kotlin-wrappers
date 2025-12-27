package tanstack.react.router

import js.objects.JsPlainObject

@JsPlainObject
external interface RouteOptions :
    tanstack.router.core.RouteOptions<Route>,
    UpdatableRouteOptions
