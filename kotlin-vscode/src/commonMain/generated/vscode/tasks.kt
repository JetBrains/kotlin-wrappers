// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.promise.PromiseLike
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Namespace for tasks functionality.
 */
external object tasks {
    /**
     * Register a task provider.
     *
     * @param type The task kind type this provider is registered for.
     * @param provider A task provider.
     * @returns A [Disposable] that unregisters this provider when being disposed.
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
     */
    fun fetchTasks(filter: TaskFilter = definedExternally): PromiseLike<ReadonlyArray<Task>>

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
     */
    fun executeTask(task: Task): PromiseLike<TaskExecution>

    /**
     * The currently active task executions or an empty array.
     */
    val taskExecutions: ReadonlyArray<TaskExecution>

    /**
     * Fires when a task starts.
     */
    val onDidStartTask: Event<TaskStartEvent>

    /**
     * Fires when a task ends.
     */
    val onDidEndTask: Event<TaskEndEvent>

    /**
     * Fires when the underlying process has been started.
     * This event will not fire for tasks that don't
     * execute an underlying process.
     */
    val onDidStartTaskProcess: Event<TaskProcessStartEvent>

    /**
     * Fires when the underlying process has ended.
     * This event will not fire for tasks that don't
     * execute an underlying process.
     */
    val onDidEndTaskProcess: Event<TaskProcessEndEvent>
}
