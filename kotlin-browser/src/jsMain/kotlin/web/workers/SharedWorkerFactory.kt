package web.workers

import js.globals.globalThis
import seskar.js.JsNative

sealed external interface SharedWorkerFactory {
    @JsNative
    operator fun invoke(): SharedWorker
}

fun SharedWorkerFactory(
    block: (self: SharedWorkerGlobalScope) -> Unit,
): SharedWorkerFactory {
    val self = if (globalThis.SharedWorkerGlobalScope) {
        globalThis as? SharedWorkerGlobalScope
    } else null

    requireNotNull(self) {
        "Invalid shared worker context! `SharedWorkerGlobalScope` as `self` is required!"
    }

    block(self)

    return {
        error("Missed plugin integration! SharedWorker factory shouldn't be called directly!")
    }.unsafeCast<SharedWorkerFactory>()
}
