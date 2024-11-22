package web.workers.internal

import js.coroutines.internal.IsolatedCoroutineScope
import js.module.ModuleHandle
import js.reflect.unsafeCast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.launch
import web.globals.internal.getGlobalScope
import web.workers.WorkerGlobalScope

internal fun <S : WorkerGlobalScope, H : ModuleHandle> createWorker(
    scopeClassName: String,
    block: suspend CoroutineScope.(self: S) -> Unit,
): H {
    val self: S = getGlobalScope(scopeClassName)

    IsolatedCoroutineScope()
        .launch(
            start = CoroutineStart.UNDISPATCHED,
            block = { block(self) },
        )

    return unsafeCast("Missed plugin integration! Worker handle should be generated!")
}
