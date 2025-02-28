package web.workers

import js.core.JsNativeInvoke
import kotlinx.coroutines.CoroutineScope

sealed external interface WorkerFactory<T : AbstractWorker> {
    @JsNativeInvoke
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
