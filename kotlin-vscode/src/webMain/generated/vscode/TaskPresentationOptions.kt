// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * Controls how the task is presented in the UI.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskPresentationOptions)
 */
@JsPlainObject
external interface TaskPresentationOptions {
    /**
     * Controls whether the task output is reveal in the user interface.
     * Defaults to `RevealKind.Always`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskPresentationOptions.reveal)
     */
    var reveal: TaskRevealKind?

    /**
     * Controls whether the command associated with the task is echoed
     * in the user interface.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskPresentationOptions.echo)
     */
    var echo: Boolean?

    /**
     * Controls whether the panel showing the task output is taking focus.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskPresentationOptions.focus)
     */
    var focus: Boolean?

    /**
     * Controls if the task panel is used for this task only (dedicated),
     * shared between tasks (shared) or if a new panel is created on
     * every task execution (new). Defaults to `TaskInstanceKind.Shared`
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskPresentationOptions.panel)
     */
    var panel: TaskPanelKind?

    /**
     * Controls whether to show the "Terminal will be reused by tasks, press any key to close it" message.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskPresentationOptions.showReuseMessage)
     */
    var showReuseMessage: Boolean?

    /**
     * Controls whether the terminal is cleared before executing the task.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskPresentationOptions.clear)
     */
    var clear: Boolean?

    /**
     * Controls whether the terminal is closed after executing the task.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskPresentationOptions.close)
     */
    var close: Boolean?
}
