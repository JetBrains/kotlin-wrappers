package react.table

import kotlinext.js.jsObject

external interface Record<in K : Any, out V : Any>

inline operator fun <K : Any, V : Any> Record<K, V>.get(key: K): V? =
    asDynamic()[key]

inline operator fun <K : Any, V : Any> Record<K, V>.set(key: K, value: V) {
    asDynamic()[key] = value
}

fun <K : Any, V : Any> Record(
    block: Record<K, V>.() -> Unit,
): Record<K, V> = jsObject(block)
