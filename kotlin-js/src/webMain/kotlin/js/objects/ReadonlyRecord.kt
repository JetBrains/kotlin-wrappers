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

external interface ReadonlyRecord<K : JsAny, out V : JsAny?> {
    operator fun get(
        key: K,
    ): V? = definedExternally
}

inline operator fun <V : JsAny?> ReadonlyRecord<JsAny, V>.get(key: String): V? =
    get(key.toJsString())

inline operator fun <V : JsAny?> ReadonlyRecord<JsString, V>.get(key: String): V? =
    get(key.toJsString())

fun <K : JsAny, V : JsAny?> Sequence<Tuple2<K, V>>.toReadonlyRecord(): ReadonlyRecord<K, V> =
    Record {
        forEach { (key, value) -> set(key, value) }
    }

fun <K : JsAny, V : JsAny?> Sequence<Pair<K, V>>.toReadonlyRecord(): ReadonlyRecord<K, V> =
    Record {
        forEach { (key, value) -> set(key, value) }
    }

fun <K : JsAny, V : JsAny?> Iterable<Pair<K, V>>.toReadonlyRecord(): ReadonlyRecord<K, V> =
    Record {
        forEach { (key, value) -> set(key, value) }
    }


fun <K : JsAny, V : JsAny?> Map<K, V>.toReadonlyRecord(): ReadonlyRecord<K, V> =
    Record {
        forEach { (key, value) -> set(key, value) }
    }
