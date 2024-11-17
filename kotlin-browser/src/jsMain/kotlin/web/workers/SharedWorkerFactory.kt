package web.workers

import js.coroutines.internal.IsolatedCoroutineScope
import js.globals.globalThis
import js.reflect.unsafeCast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.launch
import seskar.js.JsNative

sealed external interface SharedWorkerFactory {
    @JsNative
    operator fun invoke(): SharedWorker
}

fun SharedWorkerFactory(
    block: suspend CoroutineScope.(self: SharedWorkerGlobalScope) -> Unit,
): SharedWorkerFactory {
    val self = if (globalThis["SharedWorkerGlobalScope"] != null) {
        globalThis as? SharedWorkerGlobalScope
    } else null

    requireNotNull(self) {
        "Invalid shared worker context! `SharedWorkerGlobalScope` as `self` is required!"
    }

    IsolatedCoroutineScope()
        .launch(
            start = CoroutineStart.UNDISPATCHED,
            block = { block(self) },
        )

    return unsafeCast {
        error("Missed plugin integration! SharedWorker factory shouldn't be called directly!")
    }
}
