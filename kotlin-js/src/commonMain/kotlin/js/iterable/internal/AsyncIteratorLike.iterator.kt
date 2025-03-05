package js.iterable.internal

import js.core.JsAny
import js.iterable.AsyncIteratorLike
import js.iterable.IteratorResult
import js.iterable.IteratorYieldResult
import js.iterable.SuspendableIterator

@PublishedApi
internal fun <T : JsAny?> iteratorFromAsyncIteratorLike(
    source: AsyncIteratorLike<T>,
): SuspendableIterator<T> =
    AsyncIteratorAdapter(source)

private class AsyncIteratorAdapter<T : JsAny?>(
    private val source: AsyncIteratorLike<T>,
) : SuspendableIterator<T> {
    private var lastResult: IteratorResult<T, *>? = null

    override suspend fun hasNext(): Boolean {
        val result = lastResult
            ?: source.next().await()

        lastResult = result

        return result is IteratorYieldResult<T>
    }

    override fun next(): T {
        val result = checkNotNull(lastResult) {
            "`hasNext` must be called before `next`"
        }

        lastResult = null

        result
        return result.value
    }
}
