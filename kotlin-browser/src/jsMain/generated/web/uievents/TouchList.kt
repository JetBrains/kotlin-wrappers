// Automatically generated - do not modify!

package web.uievents

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * A list of contact points on a touch surface. For example, if the user has three fingers on the touch surface (such as a screen or trackpad), the corresponding TouchList object would have one Touch object for each finger, for a total of three entries.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchList)
 */
external class TouchList
private constructor() :
    ArrayLike<Touch>,
    JsIterable<Touch> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchList/length)
     */
    val length: UInt

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchList/item)
     */
    fun item(index: UInt): Touch?
}
