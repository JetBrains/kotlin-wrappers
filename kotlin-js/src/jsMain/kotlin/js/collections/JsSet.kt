package js.collections

import js.core.IterableIterator
import js.core.JsIterator
import js.core.JsTuple2
import js.core.ReadonlyArray

@JsName("Set")
external class JsSet<T> : ReadonlySet<T> {
    constructor()
    constructor(values: JsIterator<T>?)
    constructor(values: ReadonlyArray<T>?)

    override val size: Int
    fun add(value: T): JsSet<T>
    fun clear()
    fun delete(value: T)
    override fun entries(): IterableIterator<JsTuple2<T, T>>
    override fun has(value: T): Boolean
    override fun forEach(action: (value: T) -> Unit)
    override fun keys(): IterableIterator<T>
    override fun values(): IterableIterator<T>
}
