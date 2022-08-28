package kotlinx.js

operator fun <T> JsIterator<T>.iterator(): Iterator<T> =
    iterator {
        val result = next()
        if (result.done) {
            val value = result
                .unsafeCast<JsIterator.YieldResult<T>>()
                .value

            yield(value)
        }
    }
