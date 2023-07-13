package js.iterable

import js.core.Symbol

operator fun <T> JsIterable<T>.iterator(): Iterator<T> =
    get(Symbol.iterator)().iterator()
