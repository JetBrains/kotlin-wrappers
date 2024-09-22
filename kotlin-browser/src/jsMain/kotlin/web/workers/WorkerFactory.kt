package web.workers

import js.coroutines.internal.IsolatedCoroutineScope
import js.globals.globalThis
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.launch
import seskar.js.JsNative

sealed external interface WorkerFactory {
    @JsNative
    operator fun invoke(): Worker
}

fun WorkerFactory(
    block: suspend CoroutineScope.(self: DedicatedWorkerGlobalScope) -> Unit,
): WorkerFactory {
    val self = if (globalThis.DedicatedWorkerGlobalScope) {
        globalThis as? DedicatedWorkerGlobalScope
    } else null

    requireNotNull(self) {
        "Invalid worker context! `DedicatedWorkerGlobalScope` as `self` is required!"
    }

    IsolatedCoroutineScope()
        .launch(
            start = CoroutineStart.UNDISPATCHED,
            block = { block(self) },
        )

    return {
        error("Missed plugin integration! Worker factory shouldn't be called directly!")
    }.unsafeCast<WorkerFactory>()
}
