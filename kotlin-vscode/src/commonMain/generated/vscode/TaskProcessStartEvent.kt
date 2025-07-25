// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * An event signaling the start of a process execution
 * triggered through a task
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskProcessStartEvent)
 */
@JsPlainObject
external interface TaskProcessStartEvent {
    /**
     * The task execution for which the process got started.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskProcessStartEvent.execution)
     */
    val execution: TaskExecution

    /**
     * The underlying process id.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskProcessStartEvent.processId)
     */
    val processId: Int
}
