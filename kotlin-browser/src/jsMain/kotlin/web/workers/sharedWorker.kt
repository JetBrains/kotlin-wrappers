package web.workers

import kotlinx.coroutines.CoroutineScope
import web.workers.internal.createWorker

fun sharedWorker(
    block: suspend CoroutineScope.(self: SharedWorkerGlobalScope) -> Unit,
): WorkerHandle =
    createWorker("SharedWorkerGlobalScope", block)
