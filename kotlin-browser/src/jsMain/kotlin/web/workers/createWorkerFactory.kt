package web.workers

import js.coroutines.internal.IsolatedCoroutineScope
import js.globals.globalThis
import js.reflect.unsafeCast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.launch
import kotlin.reflect.cast

internal fun <T : AbstractWorker, S : WorkerGlobalScope> createWorkerFactory(
    workerName: String,
    scopeClassName: String,
    block: suspend CoroutineScope.(self: S) -> Unit,
): WorkerFactory<T> {
    val self: S = getGlobalScope(scopeClassName)

    IsolatedCoroutineScope()
        .launch(
            start = CoroutineStart.UNDISPATCHED,
            block = { block(self) },
        )

    return unsafeCast {
        error("Missed plugin integration! $workerName factory shouldn't be called directly!")
    }
}

private fun <S : WorkerGlobalScope> getGlobalScope(
    scopeClassName: String,
): S {
    val jsClass = globalThis[scopeClassName]
        ?: error("Class `$scopeClassName` not found!")

    val kotlinClass = unsafeCast<JsClass<S>>(jsClass).kotlin
    return kotlinClass.cast(globalThis)
}
