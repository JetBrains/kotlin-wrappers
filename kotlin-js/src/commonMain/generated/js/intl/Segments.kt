// Automatically generated - do not modify!

package js.intl

import kotlin.js.definedExternally

sealed external interface Segments {
    /**
     * Returns an object describing the segment in the original string that includes the code unit at a specified index.
     *
     * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl/Segmenter/segment/Segments/containing)
     *
     * @param codeUnitIndex - A number specifying the index of the code unit in the original input string. If the value is omitted, it defaults to `0`.
     */
    fun containing(codeUnitIndex: Int = definedExternally): SegmentData?
    /**
     * Returns an iterator to iterate over the segments.
     */
    // [Symbol.iterator](): SegmentIterator<SegmentData>
}
