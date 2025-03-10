// Automatically generated - do not modify!

package web.cssom

import js.array.JsTuple2
import js.array.ReadonlyArray
import js.collections.ListLike
import js.core.JsInt
import js.iterable.JsIterator

/**
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

    override fun entries(): JsIterator<JsTuple2<JsInt, CSSUnparsedSegment>>
    override fun keys(): JsIterator<JsInt>
    override fun values(): JsIterator<CSSUnparsedSegment>
    override fun forEach(action: (item: CSSUnparsedSegment) -> Unit)
}
