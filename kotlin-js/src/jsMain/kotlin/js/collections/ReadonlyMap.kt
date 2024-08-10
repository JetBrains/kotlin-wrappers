package js.collections

external interface ReadonlyMap<K, out V> :
    MapLike<K, V>,
    ReadonlySetLike<K> {

    override val size: Int

    operator fun get(key: K): V?
    override fun has(key: K): Boolean
}
