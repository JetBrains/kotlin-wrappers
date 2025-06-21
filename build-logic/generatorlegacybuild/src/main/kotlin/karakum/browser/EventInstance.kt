package karakum.browser

internal const val EVENT_INSTANCE = "EventInstance"

// language=kotlin
private val EVENT_INSTANCE_BODY: String = """
import js.coroutines.internal.internalSubscribeJob
import js.iterable.SuspendableIterator
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.coroutines.resume

@JsName("Array")
external class EventInstance<out E : Event, out C : EventTarget, out T : EventTarget>(
    @JsName("0")
    internal val target: C,
    @JsName("1")
    internal val type: EventType<E>,
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
suspend operator fun <E : Event, T : EventTarget, D> EventInstance<E, *, T>.iterator(): SuspendableIterator<D>
        where D : E,
              D : HasTargets<*, T> =
    SuspendableIterator(asChannel<_, _, D>().iterator())

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
""".trimIndent()

internal fun eventInstanceTypes(): Sequence<ConversionResult> =
    sequenceOf(
        ConversionResult(
            name = EVENT_INSTANCE,
            body = EVENT_INSTANCE_BODY,
            pkg = "web.events",
        ),
    )
