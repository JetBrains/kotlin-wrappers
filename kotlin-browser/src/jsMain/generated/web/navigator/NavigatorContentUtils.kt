// Automatically generated - do not modify!

package web.navigator

import web.url.URL

sealed external interface NavigatorContentUtils {
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
