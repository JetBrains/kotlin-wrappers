@file:Suppress(
    "BOUNDS_NOT_ALLOWED_IF_BOUNDED_BY_TYPE_PARAMETER",
)

package web.events

import js.coroutines.internal.internalSubscribeJob
import js.iterable.SuspendIterator
import js.objects.unsafeJso
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.coroutines.resume
import kotlin.js.undefined

class EventInstance<out E : Event, out C : EventTarget, out T : EventTarget>(
    internal val target: C,
    internal val type: EventType<E>,
)

inline fun <E : Event, C : EventTarget, T : EventTarget> EventInstance(
    target: C,
    type: String,
): EventInstance<E, C, T> =
    EventInstance(
        target = target,
        type = EventType(type),
    )

// addHandler
fun <E : Event, C : EventTarget, T : EventTarget> EventInstance<E, C, T>.addHandler(
    handler: EventHandler<E, C, T>,
    options: AddEventListenerOptions? = undefined,
): () -> Unit =
    target.addEventHandler(
        type = type,
        options = options,
        handler = handler,
    )

fun <E : Event, C : EventTarget, T : EventTarget, D> EventInstance<E, C, T>.addHandler(
    handler: (D) -> Unit,
): () -> Unit
        where D : E,
              D : HasTargets<C, T> =
    addHandler(
        handler = EventHandler(handler),
    )

fun <E : Event, C : EventTarget, T : EventTarget, D> EventInstance<E, C, T>.addHandler(
    options: AddEventListenerOptions?,
    handler: (D) -> Unit,
): () -> Unit
        where D : E,
              D : HasTargets<C, T> =
    addHandler(
        handler = EventHandler(handler),
        options = options,
    )

// subscribe
suspend fun <E : Event, C : EventTarget, T : EventTarget> EventInstance<E, C, T>.subscribe(
    handler: EventHandler<E, C, T>,
    options: AddEventListenerOptions? = undefined,
): Job =
    internalSubscribeJob {
        addHandler(handler, options)
    }

suspend fun <E : Event, C : EventTarget, T : EventTarget, D> EventInstance<E, C, T>.subscribe(
    handler: (D) -> Unit,
): Job
        where D : E,
              D : HasTargets<C, T> =
    subscribe(
        handler = EventHandler(handler),
    )

suspend fun <E : Event, C : EventTarget, T : EventTarget, D> EventInstance<E, C, T>.subscribe(
    options: AddEventListenerOptions?,
    handler: (D) -> Unit,
): Job
        where D : E,
              D : HasTargets<C, T> =
    subscribe(
        handler = EventHandler(handler),
        options = options,
    )

// once
suspend fun <E : Event, C : EventTarget, T : EventTarget, D> EventInstance<E, C, T>.once(): D
        where D : E,
              D : HasTargets<C, T> {
    return suspendCancellableCoroutine { continuation ->
        val unsubscribe = addHandler(
            handler = continuation::resume,
            options = unsafeJso { once = true },
        )

        continuation.invokeOnCancellation {
            unsubscribe()
        }
    }
}

// iterator
suspend operator fun <E : Event, T : EventTarget, D> EventInstance<E, *, T>.iterator(): SuspendIterator<D>
        where D : E,
              D : HasTargets<*, T> =
    SuspendIterator(asChannel<_, _, D>().iterator())

// channel
internal suspend fun <E : Event, T : EventTarget, D> EventInstance<E, *, T>.asChannel(): ReceiveChannel<D>
        where D : E,
              D : HasTargets<*, T> {
    val channel = Channel<D>()
    val job = subscribe(channel::trySend)
    channel.invokeOnClose { job.cancel() }
    return channel
}

// asFlow
fun <E : Event, T : EventTarget, D> EventInstance<E, *, T>.asFlow(): Flow<D>
        where D : E,
              D : HasTargets<*, T> =
    flow {
        for (event in asChannel<_, _, D>()) {
            emit(event)
        }
    }
