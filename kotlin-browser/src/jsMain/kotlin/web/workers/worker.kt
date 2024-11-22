package web.workers

import js.coroutines.internal.IsolatedCoroutineScope
import js.globals.globalThis
import js.reflect.unsafeCast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.launch

fun <S : WorkerGlobalScope> worker(
    block: suspend CoroutineScope.(self: S) -> Unit,
): WorkerHandle {
    val self: S = unsafeCast(globalThis as WorkerGlobalScope)

    IsolatedCoroutineScope()
        .launch(
            start = CoroutineStart.UNDISPATCHED,
            block = { block(self) },
        )

    return unsafeCast("Missed plugin integration! Worker handle should be generated!")
}
