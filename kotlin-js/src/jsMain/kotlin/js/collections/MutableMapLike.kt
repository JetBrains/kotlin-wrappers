@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.collections

import js.core.JsTuple2
import js.iterable.IterableIterator

external interface MutableMapLike<K, V> : ReadonlyMap<K, V> {
    override val size: Int
        get() = definedExternally

    fun clear(): Unit = definedExternally
    fun delete(key: K): Boolean = definedExternally
    operator fun set(key: K, value: V): Unit /* this */ = definedExternally

    override operator fun get(key: K): V? = definedExternally
    override fun entries(): IterableIterator<JsTuple2<K, V>> = definedExternally
    override fun forEach(action: (value: V, key: K) -> Unit): Unit = definedExternally
    override fun has(key: K): Boolean = definedExternally
    override fun keys(): IterableIterator<K> = definedExternally
    override fun values(): IterableIterator<V> = definedExternally
}
