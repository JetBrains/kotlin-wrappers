// Automatically generated - do not modify!

package web.serviceworker

import js.core.Void
import js.promise.Promise
import js.promise.internal.awaitPromiseLike
import kotlin.js.JsName

/**
 * The **`NavigationPreloadManager`** interface of the Service Worker API provides methods for managing the preloading of resources in parallel with service worker bootup.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager)
 */
external class NavigationPreloadManager
private constructor() {
    /**
     * The **`disable()`** method of the NavigationPreloadManager interface halts the automatic preloading of service-worker-managed resources previously started using NavigationPreloadManager.enable() It returns a promise that resolves with `undefined`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/disable)
     */
    @JsName("disable")
    fun disableAsync(): Promise<Void>

    /**
     * The **`enable()`** method of the NavigationPreloadManager interface is used to enable preloading of resources managed by the service worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/enable)
     */
    @JsName("enable")
    fun enableAsync(): Promise<Void>

    /**
     * The **`getState()`** method of the NavigationPreloadManager interface returns a Promise that resolves to an object with properties that indicate whether preload is enabled and what value will be sent in the Service-Worker-Navigation-Preload HTTP header.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/getState)
     */
    @JsName("getState")
    fun getStateAsync(): Promise<NavigationPreloadState>

    /**
     * The **`setHeaderValue()`** method of the NavigationPreloadManager interface sets the value of the Service-Worker-Navigation-Preload header that will be sent with requests resulting from a Window/fetch operation made during service worker navigation preloading.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/setHeaderValue)
     */
    @JsName("setHeaderValue")
    fun setHeaderValueAsync(value: String): Promise<Void>
}

/**
 * The **`disable()`** method of the NavigationPreloadManager interface halts the automatic preloading of service-worker-managed resources previously started using NavigationPreloadManager.enable() It returns a promise that resolves with `undefined`.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/disable)
 */
suspend inline fun NavigationPreloadManager.disable() {
    awaitPromiseLike(disableAsync())
}

/**
 * The **`enable()`** method of the NavigationPreloadManager interface is used to enable preloading of resources managed by the service worker.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/enable)
 */
suspend inline fun NavigationPreloadManager.enable() {
    awaitPromiseLike(enableAsync())
}

/**
 * The **`getState()`** method of the NavigationPreloadManager interface returns a Promise that resolves to an object with properties that indicate whether preload is enabled and what value will be sent in the Service-Worker-Navigation-Preload HTTP header.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/getState)
 */
suspend inline fun NavigationPreloadManager.getState(): NavigationPreloadState {
    return awaitPromiseLike(getStateAsync())
}

/**
 * The **`setHeaderValue()`** method of the NavigationPreloadManager interface sets the value of the Service-Worker-Navigation-Preload header that will be sent with requests resulting from a Window/fetch operation made during service worker navigation preloading.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/setHeaderValue)
 */
suspend inline fun NavigationPreloadManager.setHeaderValue(value: String) {
    awaitPromiseLike(setHeaderValueAsync(value = value))
}
