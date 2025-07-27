package web.scheduling

import js.core.JsAny
import js.core.Void
import js.promise.Promise
import js.promise.await
import web.abort.AbortController
import web.abort.internal.awaitCancellable
import web.abort.internal.createAbortable
import web.abort.internal.patchAbortOptions
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Scheduler)
 */
open external class Scheduler {
    @JsName("postTask")
    fun <T : JsAny?> postTaskAsync(
        callback: SchedulerPostTaskCallback<T>,
        options: SchedulerPostTaskOptions = definedExternally,
    ): Promise<T>

    @JsName("yield")
    fun yieldAsync(): Promise<Void>
}

suspend fun <T : JsAny?> Scheduler.postTask(
    callback: SchedulerPostTaskCallback<T>,
): T {
    val controller = AbortController()
    return postTaskAsync(
        callback = callback,
        options = createAbortable(controller.signal),
    ).awaitCancellable(controller)
}

suspend fun <T : JsAny?> Scheduler.postTask(
    callback: SchedulerPostTaskCallback<T>,
    options: SchedulerPostTaskOptions,
): T {
    val controller = AbortController()
    return postTaskAsync(
        callback = callback,
        options = patchAbortOptions(options, controller),
    ).awaitCancellable(controller)
}

suspend inline fun Scheduler.yield() {
    yieldAsync().await()
}
