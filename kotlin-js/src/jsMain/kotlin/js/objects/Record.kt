@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.objects

import js.core.jso
import seskar.js.JsNative

external interface Record<K : Any, V>
    : ReadonlyRecord<K, V> {
    @JsNative
    operator fun set(
        key: K,
        value: V,
    ): Unit = definedExternally
}

fun <K : Any, V> Record(): Record<K, V> =
    jso()

fun <K : Any, V> Record(
    block: Record<K, V>.() -> Unit,
): Record<K, V> =
    jso(block)
