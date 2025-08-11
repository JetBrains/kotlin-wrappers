package js.iterable

import js.core.JsAny
import kotlinx.coroutines.channels.ChannelIterator

interface SuspendIterator<out T : JsAny?> {
    suspend operator fun hasNext(): Boolean
    operator fun next(): T
}

fun <T : JsAny?> SuspendIterator(
    source: ChannelIterator<T>,
): SuspendIterator<T> =
    object : SuspendIterator<T> {
        override suspend fun hasNext(): Boolean =
            source.hasNext()

        override fun next(): T =
            source.next()
    }
