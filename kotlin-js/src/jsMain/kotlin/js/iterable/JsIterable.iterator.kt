package js.iterable

import js.core.Symbol

@PublishedApi
internal fun <T> iteratorFor(
    source: JsIterable<T>,
): Iterator<T> =
    source[Symbol.iterator]().iterator()
