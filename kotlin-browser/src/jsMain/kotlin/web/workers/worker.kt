package web.workers

import kotlinx.coroutines.CoroutineScope
import web.workers.internal.createWorker

fun worker(
    block: suspend CoroutineScope.(self: DedicatedWorkerGlobalScope) -> Unit,
): WorkerHandle =
    createWorker("DedicatedWorkerGlobalScope", block)
