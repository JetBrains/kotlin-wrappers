// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.navigator

import js.internal.InternalApi
import web.errors.DOMExceptionType.SecurityError
import web.errors.DOMExceptionType.SyntaxError
import web.errors.JsThrows
import web.url.URL

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface NavigatorContentUtils {
    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/registerProtocolHandler)
     */
    @JsThrows(SecurityError::class)
    @JsThrows(SyntaxError::class)
    fun registerProtocolHandler(
        scheme: String,
        url: String,
    ): Unit = definedExternally

    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/registerProtocolHandler)
     */
    @JsThrows(SecurityError::class)
    @JsThrows(SyntaxError::class)
    fun registerProtocolHandler(
        scheme: String,
        url: URL,
    ): Unit = definedExternally
}
