// Automatically generated - do not modify!

package web.cssom

import js.array.ReadonlyArray
import js.collections.ListLike

/**
 * The **`CSSUnparsedValue`** interface of the CSS Typed Object Model API represents a property value that can't be parsed into a more specific type — typically the value of a custom property.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSUnparsedValue)
 */
open external class CSSUnparsedValue(
    members: ReadonlyArray<CSSUnparsedSegment>,
) : CSSStyleValue,
    ListLike.Mixin<CSSUnparsedSegment> {
    /**
     * The **`length`** read-only property of the CSSUnparsedValue interface returns the number of items in the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSUnparsedValue/length)
     */
    override val length: Int
}
