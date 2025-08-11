package web.workers

import js.coroutines.internal.IsolatedCoroutineScope
import js.globals.internal.getGlobalScope
import js.objects.unsafeJso
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.launch

internal fun <T : AbstractWorker, S : WorkerGlobalScope> createWorkerFactory(
    scopeClassName: String,
    block: suspend CoroutineScope.(self: S) -> Unit,
): WorkerFactory<T> {
    val self: S = getGlobalScope(scopeClassName)

    IsolatedCoroutineScope()
        .launch(
            start = CoroutineStart.UNDISPATCHED,
            block = { block(self) },
        )

    return unsafeJso()
}
