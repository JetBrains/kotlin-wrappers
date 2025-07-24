// Automatically generated - do not modify!

package vscode

import js.core.JsString
import js.core.Void
import js.promise.PromiseLike

/**
 * The clipboard provides read and write access to the system's clipboard.
 */
external interface Clipboard {
    /**
     * Read the current clipboard contents as text.
     * @returns A thenable that resolves to a string.
     */
    fun readText(): PromiseLike<JsString>

    /**
     * Writes text into the clipboard.
     * @returns A thenable that resolves when writing happened.
     */
    fun writeText(value: String): PromiseLike<Void>
}
