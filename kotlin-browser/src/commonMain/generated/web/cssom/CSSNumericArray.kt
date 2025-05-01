// Automatically generated - do not modify!

package web.cssom

import js.array.Tuple2
import js.collections.ListLike
import js.core.JsInt
import js.iterable.JsIterator

/**
 * The **`CSSNumericArray`** interface of the CSS Typed Object Model API contains a list of CSSNumericValue objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericArray)
 */
external class CSSNumericArray
private constructor() :
    ListLike<CSSNumericValue> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericArray/length)
     */
    override val length: Int

    override fun entries(): JsIterator<Tuple2<JsInt, CSSNumericValue>>
    override fun keys(): JsIterator<JsInt>
    override fun values(): JsIterator<CSSNumericValue>
    override fun forEach(action: (item: CSSNumericValue) -> Unit)
}
