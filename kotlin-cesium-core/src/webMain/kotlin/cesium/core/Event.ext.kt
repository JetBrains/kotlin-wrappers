package cesium.core

import cesium.core.Event.RemoveCallback
import js.array.Tuple
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow

operator fun <T : Tuple> Event<T>.invoke(): Flow<T> =
    callbackFlow {
        val unsubscribe = addEventListener(
            listener = EventListener(::trySend),
        )

        awaitClose(unsubscribe)
    }

fun Event<*>.addHandler(
    handler: () -> Unit,
): RemoveCallback =
    addEventListener(EventListener(handler))

fun <T : Tuple> Event<T>.addHandler(
    handler: (T) -> Unit,
): RemoveCallback =
    addEventListener(EventListener(handler))
