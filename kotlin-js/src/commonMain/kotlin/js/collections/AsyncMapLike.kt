package js.collections

import js.array.JsTuple2
import js.core.JsAny
import js.iterable.AsyncIterable
import js.iterable.AsyncIterator

external interface AsyncMapLike<K : JsAny?, out V : JsAny?> :
    AsyncIterable<JsTuple2<K, V>> {

    fun entries(): AsyncIterator<JsTuple2<K, V>>
    fun keys(): AsyncIterator<K>
    fun values(): AsyncIterator<V>
}
