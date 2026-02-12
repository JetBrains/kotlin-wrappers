package tanstack.router.core

import js.errors.JsErrorLike
import kotlinx.js.JsPlainObject
import web.http.HeadersInit

@JsPlainObject
external interface NotFoundError :
    JsErrorLike {
    val data: Any?
    val `throw`: Boolean?
    val routeId: RouteId?
    val headers: HeadersInit?
}
