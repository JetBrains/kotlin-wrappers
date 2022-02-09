@file:Suppress(
    "DECLARATION_CANT_BE_INLINED",
    "NOTHING_TO_INLINE",
)

package kotlinx.js

import kotlinext.js.jso

sealed interface Record<in K : Any, V : Any> {
    inline operator fun get(key: K): V? =
        asDynamic()[key]

    inline operator fun set(key: K, value: V) {
        asDynamic()[key] = value
    }
}

fun <K : Any, V : Any> Record(
    block: Record<K, V>.() -> Unit,
): Record<K, V> = jso(block)
