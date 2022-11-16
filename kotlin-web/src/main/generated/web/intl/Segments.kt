// Automatically generated - do not modify!

package web.intl

sealed external interface Segments {
    /**
     * Returns an object describing the segment in the original string that includes the code unit at a specified index.
     *
     * @param codeUnitIndex - A number specifying the index of the code unit in the original input string. If the value is omitted, it defaults to `0`.
     */
    fun containing(codeUnitIndex: Number = definedExternally): SegmentData
    /** Returns an iterator to iterate over the segments. */
    // [Symbol.iterator](): IterableIterator<SegmentData>
}
