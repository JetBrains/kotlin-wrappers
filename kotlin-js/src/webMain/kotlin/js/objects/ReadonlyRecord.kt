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

fun <V : JsAny?> Sequence<Tuple2<JsString, V>>.toReadonlyRecord(): ReadonlyRecord<JsString, V> =
    Record {
        forEach { (key, value) -> set(key, value) }
    }

fun <V : JsAny?> Sequence<Pair<String, V>>.toReadonlyRecord(): ReadonlyRecord<JsString, V> =
    Record {
        forEach { (key, value) -> set(key, value) }
    }

fun <V : JsAny?> Iterable<Pair<String, V>>.toReadonlyRecord(): ReadonlyRecord<JsString, V> =
    Record {
        forEach { (key, value) -> set(key, value) }
    }


fun <V : JsAny?> Map<String, V>.toReadonlyRecord(): ReadonlyRecord<JsString, V> =
    Record {
        forEach { (key, value) -> set(key, value) }
    }
