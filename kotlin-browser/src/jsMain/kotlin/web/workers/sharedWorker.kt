package web.workers

import kotlinx.coroutines.CoroutineScope
import web.workers.internal.createWorker

fun sharedWorker(
    block: suspend CoroutineScope.(self: SharedWorkerGlobalScope) -> Unit,
): SharedWorkerHandle =
    createWorker("SharedWorkerGlobalScope", block)
