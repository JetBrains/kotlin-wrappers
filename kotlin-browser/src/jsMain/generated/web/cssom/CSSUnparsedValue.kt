// Automatically generated - do not modify!

package web.cssom

import js.core.ArrayLike
import js.core.JsIterable
import js.core.ReadonlyArray

external class CSSUnparsedValue(
    members: ReadonlyArray<CSSUnparsedSegment>,
) : CSSStyleValue,
    ArrayLike<CSSUnparsedSegment>,
    JsIterable<CSSUnparsedSegment> {
    override val length: Int
    fun forEach(action: (item: CSSUnparsedSegment) -> Unit)
}
