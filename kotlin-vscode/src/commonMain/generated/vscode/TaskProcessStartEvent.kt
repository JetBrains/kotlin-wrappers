// Automatically generated - do not modify!

package vscode

/**
 * An event signaling the start of a process execution
 * triggered through a task
 */
external interface TaskProcessStartEvent {
    /**
     * The task execution for which the process got started.
     */
    val execution: TaskExecution

    /**
     * The underlying process id.
     */
    val processId: Int
}
