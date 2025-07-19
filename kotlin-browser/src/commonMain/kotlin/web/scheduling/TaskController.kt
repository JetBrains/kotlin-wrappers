package web.scheduling

import web.abort.AbortController

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TaskController)
 */
open external class TaskController(
    init: TaskControllerInit,
) : AbortController {
    fun setPriority(priority: TaskPriority)
}
