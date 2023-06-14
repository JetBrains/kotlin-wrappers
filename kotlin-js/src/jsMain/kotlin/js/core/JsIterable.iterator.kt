package js.core

operator fun <T> JsIterable<T>.iterator(): Iterator<T> =
    get(Symbol.iterator)().iterator()
