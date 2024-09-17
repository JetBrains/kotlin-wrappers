package web.workers

import js.globals.globalThis
import seskar.js.JsNative

sealed external interface WorkerFactory {
    @JsNative
    operator fun invoke(): Worker
}

fun WorkerFactory(
    block: (self: DedicatedWorkerGlobalScope) -> Unit,
): WorkerFactory {
    val self = if (globalThis.DedicatedWorkerGlobalScope) {
        globalThis as? DedicatedWorkerGlobalScope
    } else null

    requireNotNull(self) {
        "Invalid worker context! `DedicatedWorkerGlobalScope` as `self` is required!"
    }

    block(self)

    return {
        error("Missed plugin integration! Worker factory shouldn't be called directly!")
    }.unsafeCast<WorkerFactory>()
}
