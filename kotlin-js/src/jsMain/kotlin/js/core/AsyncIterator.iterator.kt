package js.core

import js.collections.SuspendableIterator
import kotlinx.coroutines.await

operator fun <T> AsyncIterator<T>.iterator(): SuspendableIterator<T> =
    AsyncIteratorAdapter(this)

private class AsyncIteratorAdapter<T>(
    private val source: AsyncIterator<T>,
) : SuspendableIterator<T> {
    private var lastResult: JsIterator.Result<T, Void>? = null

    override suspend fun hasNext(): Boolean {
        val result = lastResult
            ?: source.next().await()

        lastResult = result

        return !result.done
    }

    override suspend fun next(): T {
        val result = lastResult
            ?: source.next().await()

        lastResult = null

        return result.asYield().value
    }
}
