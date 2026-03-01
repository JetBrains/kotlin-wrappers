package floating.ui.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface Middleware {
    val name: String
    val options: Any?
    // val fn: (state: MiddlewareState) -> PromiseResult<MiddlewareReturn>
}
