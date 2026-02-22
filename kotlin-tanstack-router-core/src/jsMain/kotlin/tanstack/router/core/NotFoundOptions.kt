package tanstack.router.core

import kotlinx.js.JsPlainObject
import web.http.HeadersInit

@JsPlainObject
external interface NotFoundOptions :
    NotFoundError {
    override var data: Any?
    override var `throw`: Boolean?
    override var routeId: RouteId?
    override var headers: HeadersInit?
}
