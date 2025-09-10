package js.collections

import kotlin.js.JsAny

external interface MutableMapLike<K : JsAny?, V : JsAny?> :
    ReadonlyMap<K, V> {

    fun clear()
    fun delete(key: K): Boolean
    fun set(key: K, value: V)
}
