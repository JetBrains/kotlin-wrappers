package web.workers

import js.function.unsafeInvoke
import kotlinx.coroutines.CoroutineScope

sealed /* final */
external interface WorkerFactory<T : AbstractWorker>

inline operator fun <T : AbstractWorker> WorkerFactory<T>.invoke(): T =
    unsafeInvoke(this)

fun WorkerFactory(
    block: suspend CoroutineScope.(self: DedicatedWorkerGlobalScope) -> Unit,
): WorkerFactory<Worker> =
    createWorkerFactory(
        scopeClassName = "DedicatedWorkerGlobalScope",
        block = block,
    )
