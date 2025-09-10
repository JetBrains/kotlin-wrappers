package js.iterable.internal

import js.internal.InternalApi
import js.iterable.JsIterable
import js.iterable.iterator
import js.symbol.Symbol
import kotlin.js.JsAny

@InternalApi
@PublishedApi
internal fun <T : JsAny?> iteratorFromJsIterable(
    source: JsIterable<T>,
): Iterator<T> =
    source[Symbol.iterator]().iterator()
