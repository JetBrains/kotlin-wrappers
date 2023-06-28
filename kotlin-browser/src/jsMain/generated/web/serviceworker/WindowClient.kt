// Automatically generated - do not modify!

package web.serviceworker

import js.promise.Promise
import web.dom.DocumentVisibilityState
import web.url.URL

sealed external class WindowClient :
    Client {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient/focused) */
    val focused: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient/visibilityState) */
    val visibilityState: DocumentVisibilityState

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient/focus) */
    fun focus(): Promise<WindowClient>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient/navigate) */
    fun navigate(url: String): Promise<WindowClient?>
    fun navigate(url: URL): Promise<WindowClient?>
}
