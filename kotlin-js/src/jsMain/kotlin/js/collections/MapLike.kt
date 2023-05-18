package js.collections

import js.core.JsIterable
import js.core.JsTuple2

external interface MapLike<K, out V> :
    JsIterable<JsTuple2<K, V>> {

    fun entries(): JsIterable.Iterator<JsTuple2<K, V>>
    fun keys(): JsIterable.Iterator<K>
    fun values(): JsIterable.Iterator<V>

    fun forEach(action: (value: V, key: K) -> Unit)
}
