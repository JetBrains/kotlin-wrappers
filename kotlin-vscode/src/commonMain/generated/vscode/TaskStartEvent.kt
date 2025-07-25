// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * An event signaling the start of a task execution.
 *
 * This interface is not intended to be implemented.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskStartEvent)
 */
@JsPlainObject
external interface TaskStartEvent {
    /**
     * The task item representing the task that got started.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskStartEvent.execution)
     */
    val execution: TaskExecution
}
