// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray

/**
 * A task to execute
 */
open external class Task {
    /**
     * Creates a new task.
     *
     * @param taskDefinition The task definition as defined in the taskDefinitions extension point.
     * @param scope Specifies the task's scope. It is either a global or a workspace task or a task for a specific workspace folder. Global tasks are currently not supported.
     * @param name The task's name. Is presented in the user interface.
     * @param source The task's source (e.g. 'gulp', 'npm', ...). Is presented in the user interface.
     * @param execution The process or shell execution.
     * @param problemMatchers the names of problem matchers to use, like '$tsc'
     *  or '$eslint'. Problem matchers can be contributed by an extension using
     *  the `problemMatchers` extension point.
     */
//  constructor(taskDefinition: TaskDefinition, scope: WorkspaceFolder | TaskScope.Global | TaskScope.Workspace, name: string, source: string, execution?: ProcessExecution | ShellExecution | CustomExecution, problemMatchers?: string | string[])

    /**
     * Creates a new task.
     *
     * @deprecated Use the new constructors that allow specifying a scope for the task.
     *
     * @param taskDefinition The task definition as defined in the taskDefinitions extension point.
     * @param name The task's name. Is presented in the user interface.
     * @param source The task's source (e.g. 'gulp', 'npm', ...). Is presented in the user interface.
     * @param execution The process or shell execution.
     * @param problemMatchers the names of problem matchers to use, like '$tsc'
     *  or '$eslint'. Problem matchers can be contributed by an extension using
     *  the `problemMatchers` extension point.
     */
//  constructor(taskDefinition: TaskDefinition, name: string, source: string, execution?: ProcessExecution | ShellExecution, problemMatchers?: string | string[])

    /**
     * The task's definition.
     */
    var definition: TaskDefinition

    /**
     * The task's scope.
     */
    val scope: Any /* TaskScope.Global | TaskScope.Workspace | WorkspaceFolder */

    /**
     * The task's name
     */
    var name: String

    /**
     * A human-readable string which is rendered less prominently on a separate line in places
     * where the task's name is displayed. Supports rendering of {@link ThemeIcon theme icons}
     * via the `$(<name>)`-syntax.
     */
    var detail: String?

    /**
     * The task's execution engine
     */
    var execution: Any /* ProcessExecution | ShellExecution | CustomExecution */?

    /**
     * Whether the task is a background task or not.
     */
    var isBackground: Boolean

    /**
     * A human-readable string describing the source of this shell task, e.g. 'gulp'
     * or 'npm'. Supports rendering of {@link ThemeIcon theme icons} via the `$(<name>)`-syntax.
     */
    var source: String

    /**
     * The task group this tasks belongs to. See TaskGroup
     * for a predefined set of available groups.
     * Defaults to undefined meaning that the task doesn't
     * belong to any special group.
     */
    var group: TaskGroup?

    /**
     * The presentation options. Defaults to an empty literal.
     */
    var presentationOptions: TaskPresentationOptions

    /**
     * The problem matchers attached to the task. Defaults to an empty
     * array.
     */
    var problemMatchers: ReadonlyArray<String>

    /**
     * Run options for the task
     */
    var runOptions: RunOptions
}
