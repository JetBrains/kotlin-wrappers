// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * An event signaling the end of a process execution
 * triggered through a task
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskProcessEndEvent)
 */
@JsPlainObject
external interface TaskProcessEndEvent {
    /**
     * The task execution for which the process got started.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskProcessEndEvent.execution)
     */
    val execution: TaskExecution

    /**
     * The process's exit code. Will be `undefined` when the task is terminated.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskProcessEndEvent.exitCode)
     */
    val exitCode: Int?
}
