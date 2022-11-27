package js.collections

import js.core.HasSymbol
import js.core.JsIterable
import js.core.JsTuple2

external interface ReadonlyMap<K : Any, V> :
    HasSymbol.iterator<() -> JsIterable.Iterator<JsTuple2<K, V>>> {

    val size: Int

    fun entries(): JsIterable.Iterator<JsTuple2<K, V>>
    fun forEach(action: (value: V, key: K) -> Unit)
    operator fun get(key: K): V?
    fun has(key: K): Boolean
    fun keys(): JsIterable.Iterator<K>
    fun values(): JsIterable.Iterator<V>
}
