package js.collections

import js.array.Tuple2
import js.iterable.AsyncIterable
import js.iterable.AsyncIterator
import kotlin.js.JsAny

external interface AsyncMapLike<K : JsAny?, out V : JsAny?> :
    AsyncIterable<Tuple2<K, V>> {

    fun entries(): AsyncIterator<Tuple2<K, V>>
    fun keys(): AsyncIterator<K>
    fun values(): AsyncIterator<V>
}
