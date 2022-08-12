// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package node

// TODO: remove after next wrappers release

import kotlinx.js.jso

external interface Record<in K : Any, V : Any>

inline operator fun <K : Any, V : Any> Record<K, V>.get(
    key: K,
): V? =
    asDynamic()[key]

inline operator fun <K : Any, V : Any> Record<K, V>.set(
    key: K,
    value: V,
) {
    asDynamic()[key] = value
}

fun <K : Any, V : Any> Record(): Record<K, V> =
    jso()

fun <K : Any, V : Any> Record(
    block: Record<K, V>.() -> Unit,
): Record<K, V> =
    jso(block)
