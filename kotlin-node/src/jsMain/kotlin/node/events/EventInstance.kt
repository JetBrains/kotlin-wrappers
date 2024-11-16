package node.events

import js.array.JsTuple
import js.coroutines.internal.internalSubscribeJob
import js.iterable.SuspendableIterator
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import web.abort.toAbortSignal

class EventInstance<out P : JsTuple>(
    internal val emitter: EventEmitter,
    internal val type: EventType,
) {
    fun addHandler(
        handler: (P) -> Unit,
    ): () -> Unit {
        emitter.on(
            type = type,
            listener = handler,
        )

        return {
            emitter.off(
                type = type,
                listener = handler,
            )
        }
    }
}

suspend fun <P : JsTuple> EventInstance<P>.subscribe(
    handler: (P) -> Unit,
): Job =
    internalSubscribeJob {
        addHandler(handler)
    }

suspend fun <P : JsTuple> EventInstance<P>.once(): P =
    suspendCancellableCoroutine { continuation ->
        EventEmitter.once<P>(
            emitter = emitter,
            type = type,
            options = StaticEventEmitterOptions(
                signal = continuation.toAbortSignal(),
            ),
        ).thenTo(continuation)
    }

suspend operator fun <P : JsTuple> EventInstance<P>.iterator(): SuspendableIterator<P> =
    SuspendableIterator(asChannel().iterator())

internal suspend fun <P : JsTuple> EventInstance<P>.asChannel(): ReceiveChannel<P> {
    val channel = Channel<P>()
    val job = subscribe(channel::trySend)
    channel.invokeOnClose { job.cancel() }
    return channel
}

fun <P : JsTuple> EventInstance<P>.asFlow(): Flow<P> =
    flow {
        for (event in asChannel()) {
            emit(event)
        }
    }
