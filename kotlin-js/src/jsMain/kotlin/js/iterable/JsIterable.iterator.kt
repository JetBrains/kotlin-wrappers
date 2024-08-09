package js.iterable

import js.symbol.Symbol

@PublishedApi
internal fun <T> iteratorFromJsIterable(
    source: JsIterable<T>,
): Iterator<T> =
    source[Symbol.iterator]().iterator()
