package example.react

import js.promise.Promise
import js.promise.invoke
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import web.abort.Abortable
import web.abort.coroutineScope
import kotlin.coroutines.Continuation
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.startCoroutine

@JsExport
class Counter {

    private suspend fun run(
        callback: (value: Int) -> Unit,
        options: Abortable? = null,
    ): Unit =
        options.coroutineScope {
            var i = 0
            while (isActive) {
                callback(i++)
                delay(300)
            }
        }

    // Will be generated in Kotlin `2.3.20`
    @JsName("run")
    fun runAsync(
        callback: (value: Int) -> Unit,
        options: Abortable? = null,
    ): Promise<Unit> =
        Promise { resolve, reject ->
            val continuation = Continuation<Unit>(
                context = EmptyCoroutineContext,
                resumeWith = { result ->
                    val exception = result.exceptionOrNull()
                    if (exception == null) {
                        resolve(result.getOrThrow())
                    } else {
                        reject(exception)
                    }
                }
            )

            (suspend { run(callback, options) })
                .startCoroutine(continuation)
        }
}
