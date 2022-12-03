// Automatically generated - do not modify!

package web.idb

sealed external class IDBKeyRange {
    /** Returns lower bound, or undefined if none. */
    val lower: Any?

    /** Returns true if the lower open flag is set, and false otherwise. */
    val lowerOpen: Boolean

    /** Returns upper bound, or undefined if none. */
    val upper: Any?

    /** Returns true if the upper open flag is set, and false otherwise. */
    val upperOpen: Boolean

    /** Returns true if key is included in the range, and false otherwise. */
    fun includes(key: Any?): Boolean

    companion object {
        /** Returns a new IDBKeyRange spanning from lower to upper. If lowerOpen is true, lower is not included in the range. If upperOpen is true, upper is not included in the range. */
        fun bound(
            lower: Any?,
            upper: Any?,
            lowerOpen: Boolean = definedExternally,
            upperOpen: Boolean = definedExternally,
        ): IDBKeyRange

        /** Returns a new IDBKeyRange starting at key with no upper bound. If open is true, key is not included in the range. */
        fun lowerBound(
            lower: Any?,
            open: Boolean = definedExternally,
        ): IDBKeyRange

        /** Returns a new IDBKeyRange spanning only key. */
        fun only(value: Any?): IDBKeyRange

        /** Returns a new IDBKeyRange with no lower bound and ending at key. If open is true, key is not included in the range. */
        fun upperBound(
            upper: Any?,
            open: Boolean = definedExternally,
        ): IDBKeyRange
    }
}
