package js.collections

import js.array.JsTuple2
import js.array.ReadonlyArray
import js.core.JsAny
import kotlin.js.definedExternally as definedExternally_

open external class WeakMap<in K : JsAny, V : JsAny?>(
    entries: ReadonlyArray<JsTuple2<K, V>>? = definedExternally_,
) {
    fun delete(key: K): Boolean
    operator fun get(key: K): V?
    fun has(key: K): Boolean
    operator fun set(key: K, value: V): WeakMap<K, V>
}
