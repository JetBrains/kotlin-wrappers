// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * A task provider allows to add tasks to the task service.
 * A task provider is registered via [tasks.registerTaskProvider].
 */
external interface TaskProvider<T : Task> {
    /**
     * Provides tasks.
     * @param token A cancellation token.
     * @returns an array of tasks
     */
    fun provideTasks(token: CancellationToken): ProviderResult<ReadonlyArray<T>>

    /**
     * Resolves a task that has no {@linkcode Task.execution execution} set. Tasks are
     * often created from information found in the `tasks.json`-file. Such tasks miss
     * the information on how to execute them and a task provider must fill in
     * the missing information in the `resolveTask`-method. This method will not be
     * called for tasks returned from the above `provideTasks` method since those
     * tasks are always fully resolved. A valid default implementation for the
     * `resolveTask` method is to return `undefined`.
     *
     * Note that when filling in the properties of `task`, you _must_ be sure to
     * use the exact same `TaskDefinition` and not create a new one. Other properties
     * may be changed.
     *
     * @param task The task to resolve.
     * @param token A cancellation token.
     * @returns The resolved task
     */
    fun resolveTask(
        task: T,
        token: CancellationToken,
    ): ProviderResult<T>
}
