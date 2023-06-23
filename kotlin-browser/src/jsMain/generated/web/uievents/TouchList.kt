// Automatically generated - do not modify!

package web.uievents

import js.core.ArrayLike
import js.core.JsIterable

/**
 * A list of contact points on a touch surface. For example, if the user has three fingers on the touch surface (such as a screen or trackpad), the corresponding TouchList object would have one Touch object for each finger, for a total of three entries.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchList)
 */
sealed external class TouchList :
    ArrayLike<Touch>,
    JsIterable<Touch> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchList/item) */
    fun item(index: Int): Touch?
}
