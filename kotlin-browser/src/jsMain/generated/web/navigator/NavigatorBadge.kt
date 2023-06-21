// Automatically generated - do not modify!

package web.navigator

import js.core.Void
import kotlin.js.Promise

sealed external interface NavigatorBadge {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/clearAppBadge) */
    fun clearAppBadge(): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/setAppBadge) */
    fun setAppBadge(contents: Number = definedExternally): Promise<Void>
}
