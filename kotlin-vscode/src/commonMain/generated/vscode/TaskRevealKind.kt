// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Controls the behaviour of the terminal's visibility.
 */
sealed /* enum */
external interface TaskRevealKind {
    companion object {
        /**
         * Always brings the terminal to front if the task is executed.
         */
        val Always: TaskRevealKind // 1

        /**
         * Only brings the terminal to front if a problem is detected executing the task
         * (e.g. the task couldn't be started because).
         */
        val Silent: TaskRevealKind // 2

        /**
         * The terminal never comes to front when the task is executed.
         */
        val Never: TaskRevealKind // 3
    }
}
