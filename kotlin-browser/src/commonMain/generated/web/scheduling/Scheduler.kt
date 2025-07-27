// Automatically generated - do not modify!

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
 * The **`Scheduler`** interface of the Prioritized Task Scheduling API provides methods for scheduling prioritized tasks.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Scheduler)
 */
open external class Scheduler
private constructor() {
    /**
     * The **`postTask()`** method of the Scheduler interface is used for adding tasks to be scheduled according to their priority.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Scheduler/postTask)
     */
    @JsName("postTask")
    fun <T : JsAny?> postTaskAsync(
        callback: SchedulerPostTaskCallback<T>,
        options: SchedulerPostTaskOptions = definedExternally,
    ): Promise<T>

    /**
     * The **`yield()`** method of the Scheduler interface is used for yielding to the main thread during a task and continuing execution later, with the continuation scheduled as a prioritized task (see the Prioritized Task Scheduling API for more information).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Scheduler/yield)
     */
    @JsName("yield")
    fun yieldAsync(): Promise<Void>
}

/**
 * The **`postTask()`** method of the Scheduler interface is used for adding tasks to be scheduled according to their priority.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Scheduler/postTask)
 */
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

/**
 * The **`postTask()`** method of the Scheduler interface is used for adding tasks to be scheduled according to their priority.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Scheduler/postTask)
 */
suspend fun <T : JsAny?> Scheduler.postTask(
    callback: SchedulerPostTaskCallback<T>,
): T {
    val controller = AbortController()
    return postTaskAsync(
        callback = callback,
        options = createAbortable(controller),
    ).awaitCancellable(controller)
}

/**
 * The **`yield()`** method of the Scheduler interface is used for yielding to the main thread during a task and continuing execution later, with the continuation scheduled as a prioritized task (see the Prioritized Task Scheduling API for more information).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Scheduler/yield)
 */
suspend inline fun Scheduler.yield() {
    yieldAsync().await()
}
