package js.iterable.internal

import js.core.JsAny
import js.iterable.JsIterable
import js.iterable.iterator
import js.symbol.Symbol

@PublishedApi
internal fun <T : JsAny?> iteratorFromJsIterable(
    source: JsIterable<T>,
): Iterator<T> =
    source[Symbol.iterator]().iterator()
