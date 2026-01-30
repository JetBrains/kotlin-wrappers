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


fun <K : JsAny, V : JsAny?> Record(): Record<K, V> =
    unsafeJso()

fun <K : JsAny, V : JsAny?> Record(
    block: Record<K, V>.() -> Unit,
): Record<K, V> =
    unsafeJso(block)

fun <V : JsAny> Sequence<Tuple2<JsString, V>>.toRecord(): Record<JsString, V> =
    Record {
        forEach { (key, value) -> set(key, value) }
    }

fun <V : JsAny> Sequence<Pair<String, V>>.toRecord(): Record<JsString, V> =
    Record {
        forEach { (key, value) -> set(key, value) }
    }

fun <V : JsAny> Iterable<Pair<String, V>>.toRecord(): Record<JsString, V> =
    Record {
        forEach { (key, value) -> set(key, value) }
    }

fun <V : JsAny> Map<String, V>.toRecord(): Record<JsString, V> =
    Record {
        forEach { (key, value) -> set(key, value) }
    }

