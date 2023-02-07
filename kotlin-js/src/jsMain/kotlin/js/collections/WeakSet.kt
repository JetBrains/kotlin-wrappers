package js.collections

import js.core.ReadonlyArray

external class WeakSet<in T>(
    values: ReadonlyArray<T>? = definedExternally,
) {
    fun add(value: T): WeakSet<T>
    fun delete(value: T): Boolean
    fun has(value: T): Boolean
}
