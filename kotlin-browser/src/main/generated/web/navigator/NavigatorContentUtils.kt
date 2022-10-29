// Automatically generated - do not modify!

package web.navigator

import web.url.URL

sealed external interface NavigatorContentUtils {
    /** Available only in secure contexts. */
    fun registerProtocolHandler(
        scheme: String,
        url: URL, /* | string */
    )
}
