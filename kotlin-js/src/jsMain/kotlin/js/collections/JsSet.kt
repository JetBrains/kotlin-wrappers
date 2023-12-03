package js.collections

import js.core.ReadonlyArray
import js.iterable.JsIterator

@JsName("Set")
external class JsSet<T> : MutableSetLike<T> {
    constructor()
    constructor(values: JsIterator<T>?)
    constructor(values: ReadonlyArray<T>?)
}
