// Automatically generated - do not modify!

package web.serviceworker

import dom.DocumentVisibilityState
import web.url.URL
import kotlin.js.Promise

sealed external class WindowClient :
    Client {
    val focused: Boolean
    val visibilityState: DocumentVisibilityState
    fun focus(): Promise<WindowClient>
    fun navigate(url: String): Promise<WindowClient?>
    fun navigate(url: URL): Promise<WindowClient?>
}
