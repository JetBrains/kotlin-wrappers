// Automatically generated - do not modify!

package serviceworkers

import js.core.ReadonlyArray
import js.core.Void
import web.url.URL
import kotlin.js.Promise

sealed external class Clients {
    fun claim(): Promise<Void>
    fun get(id: String): Promise<Client?>
    fun <T : ClientQueryOptions> matchAll(options: T = definedExternally): Promise<ReadonlyArray<Client /* | WindowClient */>>
    fun openWindow(url: String): Promise<WindowClient?>
    fun openWindow(url: URL): Promise<WindowClient?>
}
