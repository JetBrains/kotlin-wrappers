// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
// ORIGINAL SOURCE

/**
 * Namespace for tasks functionality.
*/
export namespace tasks {

/**
 * Register a task provider.
 *
 * @param type The task kind type this provider is registered for.
 * @param provider A task provider.
 * @returns A {@link Disposable} that unregisters this provider when being disposed.
*/
export function registerTaskProvider(type: string, provider: TaskProvider): Disposable;

/**
 * Fetches all tasks available in the systems. This includes tasks
 * from `tasks.json` files as well as tasks from task providers
 * contributed through extensions.
 *
 * @param filter Optional filter to select tasks of a certain type or version.
 * @returns A thenable that resolves to an array of tasks.
*/
export function fetchTasks(filter?: TaskFilter): Thenable<Task[]>;

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
export function executeTask(task: Task): Thenable<TaskExecution>;

/**
 * The currently active task executions or an empty array.
*/
export const taskExecutions: readonly TaskExecution[];

/**
 * Fires when a task starts.
*/
export const onDidStartTask: Event<TaskStartEvent>;

/**
 * Fires when a task ends.
*/
export const onDidEndTask: Event<TaskEndEvent>;

/**
 * Fires when the underlying process has been started.
 * This event will not fire for tasks that don't
 * execute an underlying process.
*/
export const onDidStartTaskProcess: Event<TaskProcessStartEvent>;

/**
 * Fires when the underlying process has ended.
 * This event will not fire for tasks that don't
 * execute an underlying process.
*/
export const onDidEndTaskProcess: Event<TaskProcessEndEvent>;
}

// ORIGINAL SOURCE
 **/
