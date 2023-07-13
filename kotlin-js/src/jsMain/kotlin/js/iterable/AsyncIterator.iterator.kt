package js.iterable

import js.promise.await

operator fun <T> AsyncIterator<T>.iterator(): SuspendableIterator<T> =
    AsyncIteratorAdapter(this)

private class AsyncIteratorAdapter<T>(
    private val source: AsyncIterator<T>,
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

        result as IteratorYieldResult<T>
        return result.value
    }
}
