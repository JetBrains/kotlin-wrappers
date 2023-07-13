package js.iterable

operator fun <T> JsIterator<T>.iterator(): Iterator<T> =
    iterator {
        do {
            val result = next() as? IteratorYieldResult<T>
                ?: break

            yield(result.value)
        } while (true)
    }
