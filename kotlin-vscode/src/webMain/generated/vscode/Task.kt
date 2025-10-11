// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsAny
import kotlin.js.JsModule
import kotlin.js.JsString
import kotlin.js.definedExternally

/**
 * A task to execute
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Task)
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
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Task.constructor)
     */
    constructor(
        taskDefinition: TaskDefinition,
        scope: WorkspaceFolder,
        name: String,
        source: String,
        execution: ProcessExecution = definedExternally,
        problemMatchers: String = definedExternally,
    )

    constructor(
        taskDefinition: TaskDefinition,
        scope: TaskScope,
        name: String,
        source: String,
        execution: ProcessExecution = definedExternally,
        problemMatchers: String = definedExternally,
    )

    constructor(
        taskDefinition: TaskDefinition,
        scope: WorkspaceFolder,
        name: String,
        source: String,
        execution: ProcessExecution = definedExternally,
        problemMatchers: ReadonlyArray<JsString>,
    )

    constructor(
        taskDefinition: TaskDefinition,
        scope: TaskScope,
        name: String,
        source: String,
        execution: ProcessExecution = definedExternally,
        problemMatchers: ReadonlyArray<JsString>,
    )

    constructor(
        taskDefinition: TaskDefinition,
        scope: WorkspaceFolder,
        name: String,
        source: String,
        execution: ShellExecution,
        problemMatchers: String = definedExternally,
    )

    constructor(
        taskDefinition: TaskDefinition,
        scope: TaskScope,
        name: String,
        source: String,
        execution: ShellExecution,
        problemMatchers: String = definedExternally,
    )

    constructor(
        taskDefinition: TaskDefinition,
        scope: WorkspaceFolder,
        name: String,
        source: String,
        execution: ShellExecution,
        problemMatchers: ReadonlyArray<JsString>,
    )

    constructor(
        taskDefinition: TaskDefinition,
        scope: TaskScope,
        name: String,
        source: String,
        execution: ShellExecution,
        problemMatchers: ReadonlyArray<JsString>,
    )

    constructor(
        taskDefinition: TaskDefinition,
        scope: WorkspaceFolder,
        name: String,
        source: String,
        execution: CustomExecution,
        problemMatchers: String = definedExternally,
    )

    constructor(
        taskDefinition: TaskDefinition,
        scope: TaskScope,
        name: String,
        source: String,
        execution: CustomExecution,
        problemMatchers: String = definedExternally,
    )

    constructor(
        taskDefinition: TaskDefinition,
        scope: WorkspaceFolder,
        name: String,
        source: String,
        execution: CustomExecution,
        problemMatchers: ReadonlyArray<JsString>,
    )

    constructor(
        taskDefinition: TaskDefinition,
        scope: TaskScope,
        name: String,
        source: String,
        execution: CustomExecution,
        problemMatchers: ReadonlyArray<JsString>,
    )

    /**
     * The task's definition.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Task.definition)
     */
    var definition: TaskDefinition

    /**
     * The task's scope.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Task.scope)
     */
    val scope: JsAny /* TaskScope | WorkspaceFolder */?

    /**
     * The task's name
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Task.name)
     */
    var name: String

    /**
     * A human-readable string which is rendered less prominently on a separate line in places
     * where the task's name is displayed. Supports rendering of [theme icons][ThemeIcon]
     * via the `$(<name>)`-syntax.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Task.detail)
     */
    var detail: String?

    /**
     * The task's execution engine
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Task.execution)
     */
    var execution: JsAny /* ProcessExecution | ShellExecution | CustomExecution */?

    /**
     * Whether the task is a background task or not.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Task.isBackground)
     */
    var isBackground: Boolean

    /**
     * A human-readable string describing the source of this shell task, e.g. 'gulp'
     * or 'npm'. Supports rendering of [theme icons][ThemeIcon] via the `$(<name>)`-syntax.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Task.source)
     */
    var source: String

    /**
     * The task group this tasks belongs to. See TaskGroup
     * for a predefined set of available groups.
     * Defaults to undefined meaning that the task doesn't
     * belong to any special group.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Task.group)
     */
    var group: TaskGroup?

    /**
     * The presentation options. Defaults to an empty literal.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Task.presentationOptions)
     */
    var presentationOptions: TaskPresentationOptions

    /**
     * The problem matchers attached to the task. Defaults to an empty
     * array.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Task.problemMatchers)
     */
    var problemMatchers: ReadonlyArray<JsString>

    /**
     * Run options for the task
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Task.runOptions)
     */
    var runOptions: RunOptions
}
