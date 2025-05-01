// Automatically generated - do not modify!

package web.cssom

import js.array.ReadonlyArray
import js.array.Tuple2
import js.collections.ListLike
import js.core.JsInt
import js.iterable.JsIterator

/**
 * The **`CSSUnparsedValue`** interface of the CSS Typed Object Model API represents property values that reference custom properties.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSUnparsedValue)
 */
open external class CSSUnparsedValue(
    members: ReadonlyArray<CSSUnparsedSegment>,
) : CSSStyleValue,
    ListLike<CSSUnparsedSegment> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSUnparsedValue/length)
     */
    override val length: Int

    override fun entries(): JsIterator<Tuple2<JsInt, CSSUnparsedSegment>>
    override fun keys(): JsIterator<JsInt>
    override fun values(): JsIterator<CSSUnparsedSegment>
    override fun forEach(action: (item: CSSUnparsedSegment) -> Unit)
}
