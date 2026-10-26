package cesium.core

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
