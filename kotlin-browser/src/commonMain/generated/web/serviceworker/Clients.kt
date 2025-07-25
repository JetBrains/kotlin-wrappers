// Automatically generated - do not modify!

package web.serviceworker

import js.array.ReadonlyArray
import js.core.Void
import js.promise.Promise
import js.promise.await
import web.url.URL
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The `Clients` interface provides access to Client objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clients)
 */
open external class Clients
private constructor() {
    /**
     * The **`claim()`** method of the Clients interface allows an active service worker to set itself as the ServiceWorkerContainer.controller for all clients within its ServiceWorkerRegistration.scope.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clients/claim)
     */
    @JsName("claim")
    fun claimAsync(): Promise<Void>

    /**
     * The **`get()`** method of the Clients interface gets a service worker client matching a given `id` and returns it in a Promise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clients/get)
     */
    @JsName("get")
    fun getAsync(id: String): Promise<Client?>

    /**
     * The **`matchAll()`** method of the Clients interface returns a Promise for a list of service worker Client objects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clients/matchAll)
     */
    @JsName("matchAll")
    fun <T : ClientQueryOptions> matchAllAsync(options: T = definedExternally): Promise<ReadonlyArray<Client /* | WindowClient */>>

    /**
     * The **`openWindow()`** method of the Clients interface creates a new top level browsing context and loads a given URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clients/openWindow)
     */
    @JsName("openWindow")
    fun openWindowAsync(url: String): Promise<WindowClient?>

    @JsName("openWindow")
    fun openWindowAsync(url: URL): Promise<WindowClient?>
}

/**
 * The **`claim()`** method of the Clients interface allows an active service worker to set itself as the ServiceWorkerContainer.controller for all clients within its ServiceWorkerRegistration.scope.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clients/claim)
 */
suspend inline fun Clients.claim() {
    claimAsync().await()
}

/**
 * The **`get()`** method of the Clients interface gets a service worker client matching a given `id` and returns it in a Promise.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clients/get)
 */
suspend inline fun Clients.get(id: String): Client? {
    return getAsync(
        id = id,
    ).await()
}

/**
 * The **`matchAll()`** method of the Clients interface returns a Promise for a list of service worker Client objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clients/matchAll)
 */
suspend inline fun <T : ClientQueryOptions> Clients.matchAll(options: T): ReadonlyArray<Client /* | WindowClient */> {
    return matchAllAsync(
        options = options,
    ).await()
}

/**
 * The **`matchAll()`** method of the Clients interface returns a Promise for a list of service worker Client objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clients/matchAll)
 */
suspend inline fun <T : ClientQueryOptions> Clients.matchAll(): ReadonlyArray<Client /* | WindowClient */> {
    return matchAllAsync<T>().await()
}

/**
 * The **`openWindow()`** method of the Clients interface creates a new top level browsing context and loads a given URL.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clients/openWindow)
 */
suspend inline fun Clients.openWindow(url: String): WindowClient? {
    return openWindowAsync(
        url = url,
    ).await()
}

suspend inline fun Clients.openWindow(url: URL): WindowClient? {
    return openWindowAsync(
        url = url,
    ).await()
}
