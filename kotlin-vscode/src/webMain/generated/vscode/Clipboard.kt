// Automatically generated - do not modify!

package vscode

import js.core.Void
import js.promise.PromiseLike
import kotlin.js.JsString

/**
 * The clipboard provides read and write access to the system's clipboard.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Clipboard)
 */
external interface Clipboard {
    /**
     * Read the current clipboard contents as text.
     * @returns A thenable that resolves to a string.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Clipboard.readText)
     */
    fun readText(): PromiseLike<JsString>

    /**
     * Writes text into the clipboard.
     * @returns A thenable that resolves when writing happened.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Clipboard.writeText)
     */
    fun writeText(value: String): PromiseLike<Void>
}
