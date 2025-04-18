// Automatically generated - do not modify!

package web.uievents

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * The **`TouchList`** interface represents a list of contact points on a touch surface.
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
    override val length: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchList/item)
     */
    fun item(index: Int): Touch?
}
