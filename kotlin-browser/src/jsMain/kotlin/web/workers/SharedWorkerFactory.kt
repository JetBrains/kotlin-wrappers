package web.workers

import kotlinx.coroutines.CoroutineScope

fun SharedWorkerFactory(
    block: suspend CoroutineScope.(self: SharedWorkerGlobalScope) -> Unit,
): WorkerFactory<SharedWorker> =
    createWorkerFactory(
        workerName = "SharedWorker",
        scopeClassName = "SharedWorkerGlobalScope",
        block = block,
    )
