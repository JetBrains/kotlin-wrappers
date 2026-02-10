@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package tanstack.router.core

import js.errors.JsErrorLike
import web.http.Response

external interface Redirect :
    Response,
    JsErrorLike {
    val options: NavigateOptions
    val redirectHandled: Boolean?
}
