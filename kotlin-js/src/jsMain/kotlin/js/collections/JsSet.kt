package js.collections

import js.array.JsTuple2
import js.array.ReadonlyArray
import js.iterable.IterableIterator
import js.iterable.JsIterable

@JsName("Set")
external class JsSet<T>(
    values: JsIterable<T> = definedExternally,
) : MutableSetLike<T> {
    constructor(values: ReadonlyArray<T>)

    override val size: Int

    override fun add(value: T)
    override fun clear()
    override fun delete(value: T): Boolean
    fun difference(other: ReadonlySet<T>): JsSet<T>
    override fun entries(): IterableIterator<JsTuple2<T, T>>
    override fun forEach(action: (value: T) -> Unit)
    override fun has(value: T): Boolean
    fun intersection(other: ReadonlySet<T>): JsSet<T>
    fun isDisjointFrom(other: ReadonlySet<T>): Boolean
    fun isSubsetOf(other: ReadonlySet<T>): Boolean
    fun isSupersetOf(other: ReadonlySet<T>): Boolean
    override fun keys(): IterableIterator<T>
    fun symmetricDifference(other: ReadonlySet<T>): JsSet<T>
    fun union(other: ReadonlySet<T>): JsSet<T>
    override fun values(): IterableIterator<T>
}
