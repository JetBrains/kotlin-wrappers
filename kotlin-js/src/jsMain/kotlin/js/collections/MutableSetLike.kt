@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.collections

import js.core.JsTuple2
import js.iterable.IterableIterator

external interface MutableSetLike<T> : ReadonlySet<T> {
    override val size: Int
        get() = definedExternally

    fun add(value: T): Unit /* this */ = definedExternally
    fun clear(): Unit = definedExternally
    fun delete(value: T): Boolean = definedExternally

    override fun entries(): IterableIterator<JsTuple2<T, T>> = definedExternally
    override fun forEach(action: (value: T) -> Unit): Unit = definedExternally
    override fun has(value: T): Boolean = definedExternally
    override fun keys(): IterableIterator<T> = definedExternally
    override fun values(): IterableIterator<T> = definedExternally
}
