package js.collections

import js.array.JsTuple2
import js.array.ReadonlyArray
import js.iterable.JsIterator

@JsName("Map")
open external class JsMap<K, V>(
    values: ReadonlyArray<JsTuple2<K, V>> = definedExternally,
) : MutableMapLike<K, V> {
    override val size: Int

    override fun clear()
    override fun delete(key: K): Boolean
    override fun entries(): JsIterator<JsTuple2<K, V>>
    override fun forEach(action: (value: V, key: K) -> Unit)
    override operator fun get(key: K): V?
    override fun has(key: K): Boolean
    override fun keys(): JsIterator<K>
    override operator fun set(key: K, value: V)
    override fun values(): JsIterator<V>

    companion object {
        fun <T : Any, K> groupBy(
            items: ReadonlyArray<T>,
            keySelector: (value: T, index: Int) -> K,
        ): JsMap<K, ReadonlyArray<T>>
    }
}
