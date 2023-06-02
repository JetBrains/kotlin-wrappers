package js.core

import js.collections.SuspendableIterator
import kotlinx.coroutines.await

operator fun <T> AsyncIterator<T>.iterator(): SuspendableIterator<T> =
    AsyncIteratorAdapter(this)

private class AsyncIteratorAdapter<T>(
    private val source: AsyncIterator<T>,
) : SuspendableIterator<T> {
    private lateinit var lastResult: JsIterator.Result<T, Void>

    override fun next(): T =
        lastResult.asYield().value

    override suspend fun hasNext(): Boolean {
        lastResult = source.next().await()

        return !lastResult.done
    }
}
