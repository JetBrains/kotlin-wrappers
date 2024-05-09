// Automatically generated - do not modify!

package web.serviceworker

import js.core.Void
import js.promise.Promise

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager)
 */
sealed external class NavigationPreloadManager {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/disable)
     */
    suspend fun disable()

    @JsName("disable")
    fun disableAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/enable)
     */
    suspend fun enable()

    @JsName("enable")
    fun enableAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/getState)
     */
    suspend fun getState(): NavigationPreloadState

    @JsName("getState")
    fun getStateAsync(): Promise<NavigationPreloadState>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/setHeaderValue)
     */
    suspend fun setHeaderValue(value: String)

    @JsName("setHeaderValue")
    fun setHeaderValueAsync(value: String): Promise<Void>
}
