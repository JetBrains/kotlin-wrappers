// Automatically generated - do not modify!

package web.idb

/**
 * A key range can be a single value or a range with upper and lower bounds or endpoints. If the key range has both upper and lower bounds, then it is bounded; if it has no bounds, it is unbounded. A bounded key range can either be open (the endpoints are excluded) or closed (the endpoints are included). To retrieve all keys within a certain range, you can use the following code constructs:
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange)
 */
sealed external class IDBKeyRange {
    /**
     * Returns lower bound, or undefined if none.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/lower)
     */
    val lower: Any?

    /**
     * Returns true if the lower open flag is set, and false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/lowerOpen)
     */
    val lowerOpen: Boolean

    /**
     * Returns upper bound, or undefined if none.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/upper)
     */
    val upper: Any?

    /**
     * Returns true if the upper open flag is set, and false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/upperOpen)
     */
    val upperOpen: Boolean

    /**
     * Returns true if key is included in the range, and false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/includes)
     */
    fun includes(key: Any?): Boolean

    companion object {
        /**
         * Returns a new IDBKeyRange spanning from lower to upper. If lowerOpen is true, lower is not included in the range. If upperOpen is true, upper is not included in the range.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/bound_static)
         */
        fun bound(
            lower: Any?,
            upper: Any?,
            lowerOpen: Boolean = definedExternally,
            upperOpen: Boolean = definedExternally,
        ): IDBKeyRange

        /**
         * Returns a new IDBKeyRange starting at key with no upper bound. If open is true, key is not included in the range.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/lowerBound_static)
         */
        fun lowerBound(
            lower: Any?,
            open: Boolean = definedExternally,
        ): IDBKeyRange

        /**
         * Returns a new IDBKeyRange spanning only key.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/only_static)
         */
        fun only(value: Any?): IDBKeyRange

        /**
         * Returns a new IDBKeyRange with no lower bound and ending at key. If open is true, key is not included in the range.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/upperBound_static)
         */
        fun upperBound(
            upper: Any?,
            open: Boolean = definedExternally,
        ): IDBKeyRange
    }
}
