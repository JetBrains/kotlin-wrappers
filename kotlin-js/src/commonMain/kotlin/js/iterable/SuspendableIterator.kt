package js.iterable

import js.core.JsAny
import kotlinx.coroutines.channels.ChannelIterator

interface SuspendableIterator<out T : JsAny?> {
    suspend operator fun hasNext(): Boolean
    operator fun next(): T
}

fun <T : JsAny?> SuspendableIterator(
    source: ChannelIterator<T>,
): SuspendableIterator<T> =
    object : SuspendableIterator<T> {
        override suspend fun hasNext(): Boolean =
            source.hasNext()

        override fun next(): T =
            source.next()
    }
