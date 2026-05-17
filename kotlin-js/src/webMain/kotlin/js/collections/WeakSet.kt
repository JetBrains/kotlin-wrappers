package js.collections

import js.array.ReadonlyArray

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakSet)
 */
open external class WeakSet<in T : JsAny?>(
    values: ReadonlyArray<T>? = definedExternally,
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakSet/add)
     */
    fun add(value: T): WeakSet<T>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakSet/delete)
     */
    fun delete(value: T): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakSet/has)
     */
    fun has(key: T): Boolean
}
