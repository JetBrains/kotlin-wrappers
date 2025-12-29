package tanstack.router.core

import js.errors.JsErrorLike
import js.objects.JsPlainObject
import web.http.Headers

@JsPlainObject
external interface NotFoundError :
    JsErrorLike {
    val data: Any?
    val `throw`: Boolean?
    val routeId: RouteId?
    val headers: Headers?
}
