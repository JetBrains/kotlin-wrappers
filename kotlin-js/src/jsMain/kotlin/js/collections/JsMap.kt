package js.collections

import js.core.JsTuple2
import js.core.ReadonlyArray
import js.iterable.IterableIterator

@JsName("Map")
external class JsMap<K, V> : ReadonlyMap<K, V> {
    constructor()
    constructor(values: ReadonlyArray<JsTuple2<K, V>>?)

    override val size: Int

    fun clear()
    fun delete(key: K): Boolean
    operator fun set(key: K, value: V): JsMap<K, V>

    override fun entries(): IterableIterator<JsTuple2<K, V>>
    override fun forEach(action: (value: V, key: K) -> Unit)
    override operator fun get(key: K): V?
    override fun has(key: K): Boolean
    override fun keys(): IterableIterator<K>
    override fun values(): IterableIterator<V>
}
