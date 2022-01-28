// Automatically generated - do not modify!

package typescript

/** ES6 Map interface. */
sealed external interface ESMap<K, V> : ReadonlyESMap<K, V>, Collection<K> {
    operator fun set(
        key: K,
        value: V,
    ): ESMap<K, V>
}
