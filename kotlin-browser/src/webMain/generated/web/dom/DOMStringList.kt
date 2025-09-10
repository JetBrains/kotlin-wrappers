// Automatically generated - do not modify!

package web.dom

import js.array.ArrayLike
import js.iterable.JsIterable
import kotlin.js.JsString

/**
 * The **`DOMStringList`** interface is a legacy type returned by some APIs and represents a non-modifiable list of strings (`DOMString`).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMStringList)
 */
open external class DOMStringList
private constructor() :
    ArrayLike<JsString>,
    JsIterable<JsString> {
    /**
     * The read-only **`length`** property indicates the number of strings in the DOMStringList.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMStringList/length)
     */
    override val length: Int

    /**
     * The **`contains()`** method returns a boolean indicating whether the given string is in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMStringList/contains)
     */
    fun contains(string: String): Boolean

    /**
     * The **`item()`** method returns a string from a `DOMStringList` by index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMStringList/item)
     */
    fun item(index: Int): String?
}
