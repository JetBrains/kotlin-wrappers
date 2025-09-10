package js.collections

import js.array.ReadonlyArray
import kotlin.js.JsAny
import kotlin.js.definedExternally

open external class WeakSet<in T : JsAny?>(
    values: ReadonlyArray<T>? = definedExternally,
) {
    fun add(value: T): WeakSet<T>
    fun delete(value: T): Boolean
    fun has(key: T): Boolean
}
