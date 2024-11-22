package web.workers.internal

import js.coroutines.internal.IsolatedCoroutineScope
import js.reflect.unsafeCast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.launch
import web.globals.internal.getGlobalScope
import web.workers.WorkerGlobalScope
import web.workers.WorkerHandle

internal fun <S : WorkerGlobalScope> createWorker(
    scopeClassName: String,
    block: suspend CoroutineScope.(self: S) -> Unit,
): WorkerHandle {
    val self: S = getGlobalScope(scopeClassName)

    IsolatedCoroutineScope()
        .launch(
            start = CoroutineStart.UNDISPATCHED,
            block = { block(self) },
        )

    return unsafeCast("Missed plugin integration! Worker handle should be generated!")
}
