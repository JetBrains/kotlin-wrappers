@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package tanstack.router.core

import web.http.Response

external interface Redirect :
    Response {
    val options: NavigateOptions
    val redirectHandled: Boolean?
}
