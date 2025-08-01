// Automatically generated - do not modify!

package vscode

/**
 * An object representing an executed Task. It can be used
 * to terminate a task.
 *
 * This interface is not intended to be implemented.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskExecution)
 */
external interface TaskExecution {
    /**
     * The task that got started.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskExecution.task)
     */
    var task: Task

    /**
     * Terminates the task execution.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskExecution.terminate)
     */
    fun terminate()
}
