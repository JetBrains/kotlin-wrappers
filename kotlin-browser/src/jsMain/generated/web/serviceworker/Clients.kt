// Automatically generated - do not modify!

package web.serviceworker

import js.core.ReadonlyArray
import js.core.Void
import web.url.URL
import kotlin.js.Promise

sealed external class Clients {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clients/claim) */
    fun claim(): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clients/get) */
    operator fun get(id: String): Promise<Client?>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clients/matchAll) */
    fun <T : ClientQueryOptions> matchAll(options: T = definedExternally): Promise<ReadonlyArray<Client /* | WindowClient */>>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clients/openWindow) */
    fun openWindow(url: String): Promise<WindowClient?>
    fun openWindow(url: URL): Promise<WindowClient?>
}
