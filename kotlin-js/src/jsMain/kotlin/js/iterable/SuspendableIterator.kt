package js.iterable

import kotlinx.coroutines.channels.ChannelIterator

interface SuspendableIterator<out T> {
    suspend operator fun hasNext(): Boolean
    operator fun next(): T
}

fun <T> SuspendableIterator(
    source: ChannelIterator<T>,
): SuspendableIterator<T> =
    object : SuspendableIterator<T> {
        override suspend fun hasNext(): Boolean =
            source.hasNext()

        override fun next(): T =
            source.next()
    }
