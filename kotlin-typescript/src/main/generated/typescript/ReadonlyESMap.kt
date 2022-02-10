// Automatically generated - do not modify!

package typescript

import kotlinx.js.JsPair

/** ES6 Map interface, only read methods included. */
sealed external interface ReadonlyESMap<K, V> : ReadonlyCollection<K> {
    operator fun get(key: K): V?
    fun values(): JsIterator<V>
    fun entries(): JsIterator<JsPair<K, V>>
    fun forEach(action: (value: V, key: K) -> Unit)
}
