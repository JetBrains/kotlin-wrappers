package js.collections

import js.core.JsAny

external interface ReadonlyMap<K : JsAny?, out V : JsAny?> :
    MapLike<K, V>,
    ReadonlySetLike<K> {

    override val size: Int

    fun get(key: K): V?
    override fun has(key: K): Boolean
}
