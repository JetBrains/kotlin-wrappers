// Automatically generated - do not modify!

package web.uievents

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * The **`TouchList`** interface represents a list of contact points on a touch surface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchList)
 */
open external class TouchList
private constructor() :
    ArrayLike<Touch>,
    JsIterable<Touch> {
    /**
     * The **`length`** read-only property indicates the number of items (touch points) in a given TouchList.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchList/length)
     */
    override val length: Int

    /**
     * The **`item()`** method returns the Touch object at the specified index in the TouchList.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchList/item)
     */
    fun item(index: Int): Touch?
}
