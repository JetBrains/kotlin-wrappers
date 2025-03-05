package js.collections

import js.array.JsTuple2
import js.array.ReadonlyArray
import js.core.JsAny
import js.iterable.JsIterator
import kotlin.js.JsName
import kotlin.js.definedExternally

@JsName("Map")
open external class JsMap<K : JsAny?, V : JsAny?>(
    values: ReadonlyArray<JsTuple2<K, V>> = definedExternally,
) : MutableMapLike<K, V> {
    override val size: Int

    override fun clear()
    override fun delete(key: K): Boolean
    override fun entries(): JsIterator<JsTuple2<K, V>>
    override fun forEach(action: (value: V, key: K) -> Unit)
    override operator fun get(key: K): V?
    override fun has(key: K): Boolean
    override fun keys(): JsIterator<K>
    override operator fun set(key: K, value: V)
    override fun values(): JsIterator<V>

    companion object {
        fun <T : JsAny, K : JsAny?> groupBy(
            items: ReadonlyArray<T>,
            keySelector: (value: T, index: Int) -> K,
        ): JsMap<K, ReadonlyArray<T>>
    }
}
