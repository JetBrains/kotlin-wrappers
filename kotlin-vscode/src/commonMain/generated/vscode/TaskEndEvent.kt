// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * An event signaling the end of an executed task.
 *
 * This interface is not intended to be implemented.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskEndEvent)
 */
@JsPlainObject
external interface TaskEndEvent {
    /**
     * The task item representing the task that finished.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskEndEvent.execution)
     */
    val execution: TaskExecution
}
