package web.workers

import kotlinx.coroutines.CoroutineScope
import seskar.js.JsNative

sealed external interface WorkerFactory<T : AbstractWorker> {
    @JsNative
    operator fun invoke(): T
}

fun WorkerFactory(
    block: suspend CoroutineScope.(self: DedicatedWorkerGlobalScope) -> Unit,
): WorkerFactory<Worker> =
    createWorkerFactory(
        workerName = "Worker",
        scopeClassName = "DedicatedWorkerGlobalScope",
        block = block,
    )
