// Automatically generated - do not modify!

package web.cssom

import js.core.ArrayLike
import js.core.ReadonlyArray

external class CSSUnparsedValue(
    members: ReadonlyArray<CSSUnparsedSegment>,
) : CSSStyleValue,
    ArrayLike<CSSUnparsedSegment> {
    override val length: Int
    fun forEach(action: (item: CSSUnparsedSegment) -> Unit)
}
