package js.iterable.internal

import js.core.JsAny
import js.internal.InternalApi
import js.iterable.AsyncIteratorLike
import js.iterable.IteratorResult
import js.iterable.SuspendIterator
import js.iterable.isYield
import js.promise.await

@InternalApi
@PublishedApi
internal fun <T : JsAny?> iteratorFromAsyncIteratorLike(
    source: AsyncIteratorLike<T>,
): SuspendIterator<T> =
    AsyncIteratorAdapter(source)

private class AsyncIteratorAdapter<T : JsAny?>(
    private val source: AsyncIteratorLike<T>,
) : SuspendIterator<T> {
    private var lastResult: IteratorResult<T, *>? = null

    override suspend fun hasNext(): Boolean {
        val result = lastResult
            ?: source.next().await()

        lastResult = result

        return !result.done
    }

    override fun next(): T {
        val result = checkNotNull(lastResult) {
            "`hasNext` must be called before `next`"
        }

        lastResult = null

        check(isYield(result))
        return result.value
    }
}
