package js.collections

import js.array.ReadonlyArray
import js.array.Tuple2
import js.core.JsAny
import js.iterable.JsIterable
import js.iterable.JsIterator
import kotlin.js.JsName
import kotlin.js.definedExternally

@JsName("Set")
open external class JsSet<T : JsAny?>(
    values: JsIterable<T> = definedExternally,
) : MutableSetLike<T> {
    constructor(values: ReadonlyArray<T>)

    override val size: Int

    override fun add(value: T)
    override fun clear()
    override fun delete(value: T): Boolean
    fun difference(other: ReadonlySetLike<T>): JsSet<T>
    override fun entries(): JsIterator<Tuple2<T, T>>
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
