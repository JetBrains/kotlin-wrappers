// Automatically generated - do not modify!

package web.history

import web.url.URL

sealed external class History {
    val length: Int
    var scrollRestoration: ScrollRestoration
    val state: Any?
    fun back()
    fun forward()
    fun go(delta: Number = definedExternally)
    fun pushState(
        data: Any?,
        unused: String,
        url: String? = definedExternally,
    )

    fun pushState(
        data: Any?,
        unused: String,
        url: URL?,
    )

    fun replaceState(
        data: Any?,
        unused: String,
        url: String? = definedExternally,
    )

    fun replaceState(
        data: Any?,
        unused: String,
        url: URL?,
    )
}
