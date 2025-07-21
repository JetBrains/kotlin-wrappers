// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Controls how the task channel is used between tasks
 */
sealed /* enum */
external interface TaskPanelKind {
    companion object {
        /**
         * Shares a panel with other tasks. This is the default.
         */
        val Shared: TaskPanelKind // 1

        /**
         * Uses a dedicated panel for this tasks. The panel is not
         * shared with other tasks.
         */
        val Dedicated: TaskPanelKind // 2

        /**
         * Creates a new panel whenever this task is executed.
         */
        val New: TaskPanelKind // 3
    }
}
