// Automatically generated - do not modify!

package web.scheduling

import web.abort.AbortController
import kotlin.js.definedExternally

/**
 * The **`TaskController`** interface of the Prioritized Task Scheduling API represents a controller object that can be used to both abort and change the priority of one or more prioritized tasks. If there is no need to change task priorities, then AbortController can be used instead.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TaskController)
 */
open external class TaskController(
    init: TaskControllerInit = definedExternally,
) : AbortController {
    /**
     * The **`setPriority()`** method of the TaskController interface can be called to set a new priority for this controller's signal. If a prioritized task is configured to use the signal, this will also change the task priority.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TaskController/setPriority)
     */
    fun setPriority(priority: TaskPriority)
}
