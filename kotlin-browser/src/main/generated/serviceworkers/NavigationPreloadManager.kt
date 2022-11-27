// Automatically generated - do not modify!

package serviceworkers

import js.core.Void
import kotlin.js.Promise

sealed external class NavigationPreloadManager {
    fun disable(): Promise<Void>
    fun enable(): Promise<Void>
    fun getState(): Promise<NavigationPreloadState>
    fun setHeaderValue(value: String): Promise<Void>
}
