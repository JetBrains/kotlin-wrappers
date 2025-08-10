// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.navigator

import js.reflect.JsExternalInheritorsOnly
import web.url.URL
import kotlin.js.definedExternally

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
    ): Unit = definedExternally

    fun registerProtocolHandler(
        scheme: String,
        url: URL,
    ): Unit = definedExternally
}
