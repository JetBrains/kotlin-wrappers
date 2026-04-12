package web.coroutines.internal

import js.array.ReadonlyArray
import js.internal.InternalApi
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlin.js.JsAny
import kotlin.js.get

@InternalApi
fun <E : JsAny> observerFlow(
    block: ((ReadonlyArray<E>, JsAny) -> Unit) -> () -> Unit,
): Flow<E> =
    callbackFlow {
        val disconnect = block { entries, _ ->
            trySend(requireNotNull(entries[0]))
        }

        awaitClose(disconnect)
    }
