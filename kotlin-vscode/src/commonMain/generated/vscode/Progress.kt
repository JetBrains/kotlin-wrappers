// Automatically generated - do not modify!

package vscode

import js.core.JsAny

/**
 * Defines a generalized way of reporting progress updates.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Progress)
 */
external interface Progress<T : JsAny?> {
    /**
     * Report a progress update.
     * @param value A progress item, like a message and/or an
     * report on how much work finished
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Progress.report)
     */
    fun report(value: T)
}
