// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * The scope of a task.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskScope)
 */
/* enum */
external class TaskScope
private constructor() {
    /**
     * The task is a global task. Global tasks are currently not supported.
     */
    val Global: TaskScope // 1

    /**
     * The task is a workspace task
     */
    val Workspace: TaskScope // 2
}
