package kotlinx.js

operator fun <T> JsIterator<T>.iterator(): Iterator<T> =
    iterator {
        var result = next()
        while (!result.done) {
            val value = result
                .unsafeCast<JsIterator.YieldResult<T>>()
                .value

            yield(value)

            result = next()
        }
    }
