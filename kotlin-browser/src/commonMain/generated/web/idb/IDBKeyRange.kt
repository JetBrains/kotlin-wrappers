// Automatically generated - do not modify!

package web.idb

import js.core.JsAny
import kotlin.js.definedExternally

/**
 * The **`IDBKeyRange`** interface of the IndexedDB API represents a continuous interval over some data type that is used for keys.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange)
 */
external class IDBKeyRange
private constructor() {
    /**
     * Returns lower bound, or undefined if none.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/lower)
     */
    val lower: JsAny?

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
    val upper: JsAny?

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
    fun includes(key: JsAny?): Boolean

    companion object {
        /**
         * Returns a new IDBKeyRange spanning from lower to upper. If lowerOpen is true, lower is not included in the range. If upperOpen is true, upper is not included in the range.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/bound_static)
         */
        fun bound(
            lower: JsAny?,
            upper: JsAny?,
            lowerOpen: Boolean = definedExternally,
            upperOpen: Boolean = definedExternally,
        ): IDBKeyRange

        /**
         * Returns a new IDBKeyRange starting at key with no upper bound. If open is true, key is not included in the range.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/lowerBound_static)
         */
        fun lowerBound(
            lower: JsAny?,
            open: Boolean = definedExternally,
        ): IDBKeyRange

        /**
         * Returns a new IDBKeyRange spanning only key.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/only_static)
         */
        fun only(value: JsAny?): IDBKeyRange

        /**
         * Returns a new IDBKeyRange with no lower bound and ending at key. If open is true, key is not included in the range.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/upperBound_static)
         */
        fun upperBound(
            upper: JsAny?,
            open: Boolean = definedExternally,
        ): IDBKeyRange
    }
}
