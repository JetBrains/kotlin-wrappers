package web.workers

import kotlinx.coroutines.CoroutineScope

sealed external interface WorkerFactory<T : AbstractWorker> {
    operator fun invoke(): T
}

fun WorkerFactory(
    block: suspend CoroutineScope.(self: DedicatedWorkerGlobalScope) -> Unit,
): WorkerFactory<Worker> =
    createWorkerFactory(
        scopeClassName = "DedicatedWorkerGlobalScope",
        block = block,
    )
