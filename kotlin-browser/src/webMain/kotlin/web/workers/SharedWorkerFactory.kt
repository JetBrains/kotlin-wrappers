package web.workers

import kotlinx.coroutines.CoroutineScope

fun SharedWorkerFactory(
    block: suspend CoroutineScope.(self: SharedWorkerGlobalScope) -> Unit,
): WorkerFactory<SharedWorker> =
    createWorkerFactory(
        scopeClassName = "SharedWorkerGlobalScope",
        block = block,
    )
