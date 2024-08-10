package js.iterable

@PublishedApi
internal fun <T> iteratorFromJsIteratorLike(
    source: JsIteratorLike<T>,
): Iterator<T> =
    iterator {
        do {
            val result = source.next() as? IteratorYieldResult<T>
                ?: break

            yield(result.value)
        } while (true)
    }
