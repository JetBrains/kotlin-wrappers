package node.events

import js.array.JsTuple
import js.array.JsTuple1
import js.coroutines.internal.internalSubscribeJob
import js.function.JsFunction
import js.function.invoke
import js.iterable.SuspendableIterator
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import web.abort.toAbortSignal

private val toNodeListener = JsFunction<JsTuple1<Function<Unit>>, Function<Unit>>(
    parameterNames = arrayOf("handler"),
    // language=javascript
    body = "return (...args) => { handler(args) }",
)

class EventInstance<out P : JsTuple>(
    internal val emitter: EventEmitter,
    internal val type: EventType,
) {
    fun addHandler(
        handler: (P) -> Unit,
    ): () -> Unit {
        val listener = toNodeListener(handler)

        emitter.on(
            type = type,
            listener = listener,
        )

        return {
            emitter.off(
                type = type,
                listener = listener,
            )
        }
    }

    fun emit(
        payload: @UnsafeVariance P,
    ) {
        emitter.emit(
            type = type,
            args = payload.asArray(),
        )
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
