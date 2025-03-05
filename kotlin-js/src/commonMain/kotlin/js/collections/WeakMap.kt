package js.collections

import js.array.JsTuple2
import js.array.ReadonlyArray
import js.core.JsAny
import kotlin.js.definedExternally

open external class WeakMap<in K : JsAny, V : JsAny?>(
    entries: ReadonlyArray<JsTuple2<K, V>>? = definedExternally,
) {
    fun delete(key: K): Boolean
    operator fun get(key: K): V?
    fun has(key: K): Boolean
    operator fun set(key: K, value: V): WeakMap<K, V>
}
