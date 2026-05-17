package js.collections

import js.array.ReadonlyArray
import js.array.Tuple2

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakMap)
 */
open external class WeakMap<in K : JsAny, V : JsAny?>(
    entries: ReadonlyArray<Tuple2<K, V>>? = definedExternally,
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakMap/delete)
     */
    fun delete(key: K): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakMap/get)
     */
    fun get(key: K): V?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakMap/getOrInsert)
     */
    fun getOrInsert(
        key: K,
        defaultValue: V,
    ): V

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakMap/getOrInsertComputed)
     */
    fun getOrInsertComputed(
        key: K,
        callback: (key: @UnsafeVariance K) -> V,
    ): V

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakMap/has)
     */
    fun has(key: K): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakMap/set)
     */
    fun set(key: K, value: V): WeakMap<K, V>
}
