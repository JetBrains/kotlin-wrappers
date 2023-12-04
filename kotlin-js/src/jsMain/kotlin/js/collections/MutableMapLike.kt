package js.collections

external interface MutableMapLike<K, V> : ReadonlyMap<K, V> {
    fun clear()
    fun delete(key: K): Boolean
    operator fun set(key: K, value: V)
}
