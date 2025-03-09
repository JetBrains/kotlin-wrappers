// Automatically generated - do not modify!

package web.serviceworker

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager)
 */
external class NavigationPreloadManager
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/disable)
     */
    @JsAsync
    suspend fun disable()

    @JsName("disable")
    fun disableAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/enable)
     */
    @JsAsync
    suspend fun enable()

    @JsName("enable")
    fun enableAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/getState)
     */
    @JsAsync
    suspend fun getState(): NavigationPreloadState

    @JsName("getState")
    fun getStateAsync(): Promise<NavigationPreloadState>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/setHeaderValue)
     */
    @JsAsync
    suspend fun setHeaderValue(value: String)

    @JsName("setHeaderValue")
    fun setHeaderValueAsync(value: String): Promise<Void>
}
