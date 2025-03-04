package js.collections

import js.core.JsAny

external interface ReadonlyMap<K : JsAny?, out V : JsAny?> :
    MapLike<K, V>,
    ReadonlySetLike<K> {

    override val size: Int

    operator fun get(key: K): V?
    override fun has(key: K): Boolean
}
