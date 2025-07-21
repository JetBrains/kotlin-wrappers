// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * The scope of a task.
 */
sealed /* enum */
external interface TaskScope {
    companion object {
        /**
         * The task is a global task. Global tasks are currently not supported.
         */
        val Global: TaskScope // 1

        /**
         * The task is a workspace task
         */
        val Workspace: TaskScope // 2
    }
}
