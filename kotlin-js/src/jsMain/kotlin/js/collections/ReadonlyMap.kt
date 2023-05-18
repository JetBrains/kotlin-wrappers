package js.collections

external interface ReadonlyMap<K, out V> :
    MapLike<K, V> {

    val size: Int

    operator fun get(key: K): V?
    fun has(key: K): Boolean
}
