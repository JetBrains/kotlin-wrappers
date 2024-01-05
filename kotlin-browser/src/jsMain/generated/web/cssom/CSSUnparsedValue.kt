// Automatically generated - do not modify!

package web.cssom

import js.array.JsTuple2
import js.array.ReadonlyArray
import js.collections.ListLike
import js.iterable.IterableIterator

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSUnparsedValue)
 */
external class CSSUnparsedValue(
    members: ReadonlyArray<CSSUnparsedSegment>,
) : CSSStyleValue,
    ListLike<CSSUnparsedSegment> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSUnparsedValue/length)
     */
    override val length: Int

    override fun entries(): IterableIterator<JsTuple2<Int, CSSUnparsedSegment>>
    override fun keys(): IterableIterator<Int>
    override fun values(): IterableIterator<CSSUnparsedSegment>
    override fun forEach(action: (item: CSSUnparsedSegment) -> Unit)
}
