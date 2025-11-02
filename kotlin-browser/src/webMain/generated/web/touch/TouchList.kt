// Automatically generated - do not modify!

package web.touch

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * The **`TouchList`** interface represents a list of contact points on a touch surface. For example, if the user has three fingers on the touch surface (such as a screen or trackpad), the corresponding TouchList object would have one Touch object for each finger, for a total of three entries.
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
