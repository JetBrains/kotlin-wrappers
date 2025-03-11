// Automatically generated - do not modify!

package web.serviceworker

import js.array.ReadonlyArray
import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.url.URL
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * Provides access to Client objects. Access it via self.clients within a service worker.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clients)
 */
external class Clients
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clients/claim)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun claim()

    @JsName("claim")
    fun claimAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clients/get)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun get(id: String): Client?

    @JsName("get")
    fun getAsync(id: String): Promise<Client?>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clients/matchAll)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun <T : ClientQueryOptions> matchAll(options: T = definedExternally): ReadonlyArray<Client /* | WindowClient */>

    @JsName("matchAll")
    fun <T : ClientQueryOptions> matchAllAsync(options: T = definedExternally): Promise<ReadonlyArray<Client /* | WindowClient */>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clients/openWindow)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun openWindow(url: String): WindowClient?

    @JsName("openWindow")
    fun openWindowAsync(url: String): Promise<WindowClient?>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun openWindow(url: URL): WindowClient?

    @JsName("openWindow")
    fun openWindowAsync(url: URL): Promise<WindowClient?>
}
