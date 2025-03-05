@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.objects

import js.core.JsAny
import seskar.js.JsNativeSetter
import kotlin.js.definedExternally

external interface Record<K : JsAny, V : JsAny?> :
    ReadonlyRecord<K, V> {

    @JsNativeSetter
    operator fun set(
        key: K,
        value: V,
    ): Unit = definedExternally
}

fun <K : JsAny, V : JsAny?> Record(): Record<K, V> =
    jso()

fun <K : JsAny, V : JsAny?> Record(
    block: Record<K, V>.() -> Unit,
): Record<K, V> =
    jso(block)
