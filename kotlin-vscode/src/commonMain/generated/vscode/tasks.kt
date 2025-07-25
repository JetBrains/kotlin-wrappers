// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.promise.PromiseLike
import kotlin.js.JsModule
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * Namespace for tasks functionality.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#tasks)
 */
external object tasks {
    /**
     * Register a task provider.
     *
     * @param type The task kind type this provider is registered for.
     * @param provider A task provider.
     * @returns A [Disposable] that unregisters this provider when being disposed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#tasks.registerTaskProvider)
     */
    fun registerTaskProvider(
        type: String,
        provider: TaskProvider<*>,
    ): Disposable

    /**
     * Fetches all tasks available in the systems. This includes tasks
     * from `tasks.json` files as well as tasks from task providers
     * contributed through extensions.
     *
     * @param filter Optional filter to select tasks of a certain type or version.
     * @returns A thenable that resolves to an array of tasks.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#tasks.fetchTasks)
     */
    @JsName("fetchTasks")
    fun fetchTasksAsync(filter: TaskFilter = definedExternally): PromiseLike<ReadonlyArray<Task>>

    /**
     * Executes a task that is managed by the editor. The returned
     * task execution can be used to terminate the task.
     *
     * @throws When running a ShellExecution or a ProcessExecution
     * task in an environment where a new process cannot be started.
     * In such an environment, only CustomExecution tasks can be run.
     *
     * @param task the task to execute
     * @returns A thenable that resolves to a task execution.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#tasks.executeTask)
     */
    @JsName("executeTask")
    fun executeTaskAsync(task: Task): PromiseLike<TaskExecution>

    /**
     * The currently active task executions or an empty array.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#tasks.taskExecutions)
     */
    val taskExecutions: ReadonlyArray<TaskExecution>

    /**
     * Fires when a task starts.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#tasks.onDidStartTask)
     */
    val onDidStartTask: Event<TaskStartEvent>

    /**
     * Fires when a task ends.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#tasks.onDidEndTask)
     */
    val onDidEndTask: Event<TaskEndEvent>

    /**
     * Fires when the underlying process has been started.
     * This event will not fire for tasks that don't
     * execute an underlying process.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#tasks.onDidStartTaskProcess)
     */
    val onDidStartTaskProcess: Event<TaskProcessStartEvent>

    /**
     * Fires when the underlying process has ended.
     * This event will not fire for tasks that don't
     * execute an underlying process.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#tasks.onDidEndTaskProcess)
     */
    val onDidEndTaskProcess: Event<TaskProcessEndEvent>
}
