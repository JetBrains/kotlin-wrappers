package kotlinx.js

@JsName("Map")
external class JsMap<K : Any, V> : ReadonlyMap<K, V> {
    constructor()
    constructor(values: ReadonlyArray<JsTuple2<K, V>>?)

    override val size: Int

    fun clear()
    fun delete(key: K): Boolean
    fun set(key: K, value: V): JsMap<K, V>

    override fun entries(): JsIterable.Iterator<JsTuple2<K, V>>
    override fun forEach(action: (value: V, key: K) -> Unit)
    override operator fun get(key: K): V?
    override fun has(key: K): Boolean
    override fun keys(): JsIterable.Iterator<K>
    override fun values(): JsIterable.Iterator<V>
}
