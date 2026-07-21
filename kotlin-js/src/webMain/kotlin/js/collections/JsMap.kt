package js.collections

import js.array.ReadonlyArray
import js.array.Tuple2
import js.iterable.JsIterator
import js.serialization.Serializable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map)
 */
@JsName("Map")
open external class JsMap<K : JsAny?, V : JsAny?>(
    values: ReadonlyArray<Tuple2<K, V>> = definedExternally,
) : MutableMapLike.Mixin<K, V>,
    Serializable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map/size)
     */
    override val size: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map/clear)
     */
    override fun clear()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map/delete)
     */
    override fun delete(key: K): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map/entries)
     */
    override fun entries(): JsIterator<Tuple2<K, V>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map/forEach)
     */
    override fun forEach(action: (value: V, key: K) -> Unit)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map/get)
     */
    override fun get(key: K): V?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map/getOrInsert)
     */
    fun getOrInsert(
        key: K,
        defaultValue: V,
    ): V

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map/getOrInsertComputed)
     */
    fun getOrInsertComputed(
        key: K,
        callback: (key: K) -> V,
    ): V

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map/has)
     */
    override fun has(key: K): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map/keys)
     */
    override fun keys(): JsIterator<K>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map/set)
     */
    override fun set(key: K, value: V)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map/values)
     */
    override fun values(): JsIterator<V>

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map/groupBy)
         */
        fun <T : JsAny, K : JsAny?> groupBy(
            items: ReadonlyArray<T>,
            keySelector: (value: T, index: Int) -> K,
        ): JsMap<K, ReadonlyArray<T>>
    }
}
