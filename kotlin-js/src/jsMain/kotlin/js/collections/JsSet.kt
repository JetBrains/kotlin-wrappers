package js.collections

import js.core.JsTuple2
import js.core.ReadonlyArray
import js.iterable.IterableIterator
import js.iterable.JsIterator

@JsName("Set")
external class JsSet<T> : MutableSetLike<T> {
    constructor()
    constructor(values: JsIterator<T>?)
    constructor(values: ReadonlyArray<T>?)

    override val size: Int
    override fun add(value: T): JsSet<T>
    override fun clear()
    override fun delete(value: T)
    override fun entries(): IterableIterator<JsTuple2<T, T>>
    override fun has(value: T): Boolean
    override fun forEach(action: (value: T) -> Unit)
    override fun keys(): IterableIterator<T>
    override fun values(): IterableIterator<T>
}
