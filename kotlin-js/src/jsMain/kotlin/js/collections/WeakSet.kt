package js.collections

import js.array.ReadonlyArray

open external class WeakSet<in T>(
    values: ReadonlyArray<T>? = definedExternally,
) {
    fun add(value: T): WeakSet<T>
    fun delete(value: T): Boolean
    fun has(key: T): Boolean
}
