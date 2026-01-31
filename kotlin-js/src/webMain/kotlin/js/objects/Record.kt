@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.objects

import js.array.Tuple2
import js.array.component1
import js.array.component2
import kotlin.js.JsAny
import kotlin.js.JsString
import kotlin.js.definedExternally
import kotlin.js.toJsString

external interface Record<K : JsAny, V : JsAny?> :
    ReadonlyRecord<K, V> {

    operator fun set(
        key: K,
        value: V,
    ): Unit = definedExternally
}

inline operator fun <V : JsAny?> Record<JsAny, V>.set(key: String, value: V) {
    set(key.toJsString(), value)
}

inline operator fun <V : JsAny?> Record<JsString, V>.set(key: String, value: V) {
    set(key.toJsString(), value)
}

fun <K : JsAny, V : JsAny?> emptyRecord(): Record<K, V> =
    unsafeJso()

fun <K : JsAny, V : JsAny?> buildRecord(
    block: Record<K, V>.() -> Unit,
): Record<K, V> =
    unsafeJso(block)

fun <K : JsAny, V : JsAny?> Sequence<Tuple2<K, V>>.toRecord(): Record<K, V> =
    buildRecord {
        forEach { (key, value) -> set(key, value) }
    }

fun <K : JsAny, V : JsAny?> Sequence<Pair<K, V>>.toRecord(): Record<K, V> =
    buildRecord {
        forEach { (key, value) -> set(key, value) }
    }

fun <K : JsAny, V : JsAny?> Iterable<Pair<K, V>>.toRecord(): Record<K, V> =
    buildRecord {
        forEach { (key, value) -> set(key, value) }
    }

fun <K : JsAny, V : JsAny?> Map<K, V>.toRecord(): Record<K, V> =
    buildRecord {
        forEach { (key, value) -> set(key, value) }
    }

