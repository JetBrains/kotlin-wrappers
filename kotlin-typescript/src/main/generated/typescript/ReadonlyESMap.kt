// Automatically generated - do not modify!

package typescript

/** ES6 Map interface, only read methods included. */
external interface ReadonlyESMap<K, V> : ReadonlyCollection<K> {
    operator fun get(key: K): V?
    fun values(): Iterator<V>
    fun entries(): Iterator<dynamic /* [K, V] */>
    fun forEach(action: (value: V, key: K) -> Unit)
}
