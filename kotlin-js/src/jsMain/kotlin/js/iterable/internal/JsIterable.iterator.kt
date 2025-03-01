package js.iterable.internal

import js.iterable.JsIterable
import js.symbol.Symbol

@PublishedApi
internal fun <T> iteratorFromJsIterable(
    source: JsIterable<T>,
): Iterator<T> =
    source[Symbol.iterator]().iterator()
