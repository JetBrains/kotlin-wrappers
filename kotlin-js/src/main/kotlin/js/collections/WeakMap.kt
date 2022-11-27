package js.collections

import kotlinx.js.JsTuple2
import kotlinx.js.ReadonlyArray

external class WeakMap<in K : Any, V>(
    entries: ReadonlyArray<JsTuple2<K, V>>? = definedExternally,
) {
    fun delete(key: K): Boolean
    operator fun get(key: K): V?
    fun has(key: K): Boolean
    operator fun set(key: K, value: V): WeakMap<K, V>
}
