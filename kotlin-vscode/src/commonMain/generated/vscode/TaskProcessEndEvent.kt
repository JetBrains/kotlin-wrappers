// Automatically generated - do not modify!

package vscode

/**
 * An event signaling the end of a process execution
 * triggered through a task
 */
external interface TaskProcessEndEvent {
    /**
     * The task execution for which the process got started.
     */
    val execution: TaskExecution

    /**
     * The process's exit code. Will be `undefined` when the task is terminated.
     */
    val exitCode: Int
}
