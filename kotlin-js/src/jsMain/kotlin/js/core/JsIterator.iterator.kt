package js.core

operator fun <T> JsIterator<T>.iterator(): Iterator<T> =
    iterator {
        do {
            val result = next().asYieldOrNull()
                ?: break

            yield(result.value)
        } while (true)
    }
