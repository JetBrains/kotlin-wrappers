// Automatically generated - do not modify!

package web.serviceworker

import js.core.Void
import kotlin.js.Promise

sealed external class NavigationPreloadManager {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/disable) */
    fun disable(): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/enable) */
    fun enable(): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/getState) */
    fun getState(): Promise<NavigationPreloadState>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/setHeaderValue) */
    fun setHeaderValue(value: String): Promise<Void>
}
