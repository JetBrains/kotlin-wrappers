package tanstack.react.router

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface RouteOptions :
    tanstack.router.core.RouteOptions,
    UpdatableRouteOptions
