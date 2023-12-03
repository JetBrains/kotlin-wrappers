package js.collections

import js.core.JsTuple2
import js.core.ReadonlyArray

@JsName("Map")
external class JsMap<K, V> : MutableMapLike<K, V> {
    constructor()
    constructor(values: ReadonlyArray<JsTuple2<K, V>>?)
}
