package js.collections

import js.array.JsTuple2
import js.array.ReadonlyArray
import js.iterable.JsIterable
import js.iterable.JsIterator

@JsName("Set")
open external class JsSet<T>(
    values: JsIterable<T> = definedExternally,
) : MutableSetLike<T> {
    constructor(values: ReadonlyArray<T>)

    override val size: Int

    override fun add(value: T)
    override fun clear()
    override fun delete(value: T): Boolean
    fun difference(other: ReadonlySetLike<T>): JsSet<T>
    override fun entries(): JsIterator<JsTuple2<T, T>>
    override fun forEach(action: (value: T) -> Unit)
    override fun has(key: T): Boolean
    fun intersection(other: ReadonlySetLike<T>): JsSet<T>
    fun isDisjointFrom(other: ReadonlySetLike<T>): Boolean
    fun isSubsetOf(other: ReadonlySetLike<T>): Boolean
    fun isSupersetOf(other: ReadonlySetLike<T>): Boolean
    override fun keys(): JsIterator<T>
    fun symmetricDifference(other: ReadonlySetLike<T>): JsSet<T>
    fun union(other: ReadonlySetLike<T>): JsSet<T>
    override fun values(): JsIterator<T>
}
