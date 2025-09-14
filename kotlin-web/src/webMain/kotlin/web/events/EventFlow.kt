package web.events

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

// subscribe
suspend fun <E : Event> Flow<E>.subscribe(
    handler: (E) -> Unit,
): Job {
    val currentScope = CoroutineScope(currentCoroutineContext())

    return onEach(handler)
        .launchIn(currentScope + Dispatchers.Unconfined)
}
