// Automatically generated - do not modify!

package web.cssom

import js.collections.ListLike
import js.core.JsIterable
import js.core.JsTuple2
import js.core.ReadonlyArray

external class CSSUnparsedValue(
    members: ReadonlyArray<CSSUnparsedSegment>,
) : CSSStyleValue,
    ListLike<CSSUnparsedSegment> {
    override val length: Int


    override fun entries(): JsIterable.Iterator<JsTuple2<Int, CSSUnparsedSegment>>
    override fun keys(): JsIterable.Iterator<Int>
    override fun values(): JsIterable.Iterator<CSSUnparsedSegment>
    override fun forEach(action: (item: CSSUnparsedSegment) -> Unit)
}
