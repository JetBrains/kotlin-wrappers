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
    open fun delete(key: K): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakMap/get)
     */
    open fun get(key: K): V?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakMap/getOrInsert)
     */
    open fun getOrInsert(
        key: K,
        defaultValue: V,
    ): V

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakMap/getOrInsertComputed)
     */
    open fun getOrInsertComputed(
        key: K,
        callback: (key: @UnsafeVariance K) -> V,
    ): V

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakMap/has)
     */
    open fun has(key: K): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakMap/set)
     */
    open fun set(key: K, value: V): WeakMap<K, V>
}
