// Automatically generated - do not modify!

package web.navigator

import js.reflect.JsExternalInheritorsOnly
import web.url.URL

/* mixin */
@JsExternalInheritorsOnly
external interface NavigatorContentUtils {
    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/registerProtocolHandler)
     */
    fun registerProtocolHandler(
        scheme: String,
        url: String,
    )

    fun registerProtocolHandler(
        scheme: String,
        url: URL,
    )
}
