package js.collections

import js.array.ReadonlyArray
import js.array.Tuple2
import js.core.JsAny
import kotlin.js.definedExternally

open external class WeakMap<in K : JsAny, V : JsAny?>(
    entries: ReadonlyArray<Tuple2<K, V>>? = definedExternally,
) {
    fun delete(key: K): Boolean
    fun get(key: K): V?
    fun has(key: K): Boolean
    fun set(key: K, value: V): WeakMap<K, V>
}
