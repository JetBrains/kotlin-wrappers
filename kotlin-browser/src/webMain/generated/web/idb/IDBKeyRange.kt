// Automatically generated - do not modify!

package web.idb

import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * The **`IDBKeyRange`** interface of the IndexedDB API represents a continuous interval over some data type that is used for keys. Records can be retrieved from IDBObjectStore and IDBIndex objects using keys or a range of keys. You can limit the range using lower and upper bounds. For example, you can iterate over all values of a key in the value range A–Z.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange)
 */
open external class IDBKeyRange
private constructor() {
    /**
     * The **`lower`** read-only property of the IDBKeyRange interface returns the lower bound of the key range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/lower)
     */
    val lower: JsAny?

    /**
     * The **`lowerOpen`** read-only property of the IDBKeyRange interface returns a boolean indicating whether the lower-bound value is included in the key range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/lowerOpen)
     */
    val lowerOpen: Boolean

    /**
     * The **`upper`** read-only property of the IDBKeyRange interface returns the upper bound of the key range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/upper)
     */
    val upper: JsAny?

    /**
     * The **`upperOpen`** read-only property of the IDBKeyRange interface returns a boolean indicating whether the upper-bound value is included in the key range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/upperOpen)
     */
    val upperOpen: Boolean

    /**
     * The **`includes()`** method of the IDBKeyRange interface returns a boolean indicating whether a specified key is inside the key range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/includes)
     */
    fun includes(key: JsAny?): Boolean

    companion object {
        /**
         * The **`bound()`** static method of the IDBKeyRange interface creates a new key range with the specified upper and lower bounds. The bounds can be open (that is, the bounds exclude the endpoint values) or closed (that is, the bounds include the endpoint values). By default, the bounds are closed.
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
         * The **`lowerBound()`** static method of the IDBKeyRange interface creates a new key range with only a lower bound. By default, it includes the lower endpoint value and is closed.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/lowerBound_static)
         */
        fun lowerBound(
            lower: JsAny?,
            open: Boolean = definedExternally,
        ): IDBKeyRange

        /**
         * The **`only()`** static method of the IDBKeyRange interface creates a new key range containing a single value.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/only_static)
         */
        fun only(value: JsAny?): IDBKeyRange

        /**
         * The **`upperBound()`** static method of the IDBKeyRange interface creates a new upper-bound key range. By default, it includes the upper endpoint value and is closed.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/upperBound_static)
         */
        fun upperBound(
            upper: JsAny?,
            open: Boolean = definedExternally,
        ): IDBKeyRange
    }
}
