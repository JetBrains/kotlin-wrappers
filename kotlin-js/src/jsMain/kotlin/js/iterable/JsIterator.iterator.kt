package js.iterable

@PublishedApi
internal fun <T> iteratorFor(
    source: JsIterator<T>
): Iterator<T> =
    iterator {
        do {
            val result = source.next() as? IteratorYieldResult<T>
                ?: break

            yield(result.value)
        } while (true)
    }
