// Automatically generated - do not modify!

package electron.core

external interface Clipboard {
// Docs: https://electronjs.org/docs/api/clipboard
    /**
     * Clears the clipboard content.
     */
    fun clear()

    /**
     * A promise that resolves with `true` if the clipboard contains data of the
     * specified `mimetype`, otherwise `false`. To check for a raw format, eg
     * `public/utf8-plain-text`, use the `electron application/osclipboard` custom
     * format (`electron application/osclipboard;format="public/utf8-plain-text"`).
     */
    fun has(mimetype: String): js.promise.Promise<Boolean>

    /**
     * A promise that resolves with an array of ClipboardItem objects containing the
     * clipboard's contents.
     */
    fun read(): js.promise.Promise<js.array.ReadonlyArray<ClipboardItem>>

    /**
     * A promise that resolves with the content of the clipboard as plain text. Modeled
     * after the W3C `navigator.clipboard.readText` API.
     */
    fun readText(): js.promise.Promise<String>

    /**
     * Resolves once the data has been written to the clipboard. All entries supplied
     * in a single `write()` call are committed to the system clipboard atomically.
     */
    fun write(data: js.array.ReadonlyArray<ClipboardItem>): js.promise.Promise<js.void.Void>

    /**
     * A promise that resolves once the text has been written to the clipboard. Modeled
     * after the W3C `navigator.clipboard.writeText` API.
     */
    fun writeText(text: String): js.promise.Promise<js.void.Void>

    /**
     * A `Clipboard` property — a `Clipboard` object on Linux that operates against the
     * selection clipboard instead of the system clipboard, and `undefined` on all
     * other platforms. It exposes the same `read`, `write`, `readText`, `writeText`,
     * `has`, and `clear` methods as the top-level `clipboard` module.
     *
     * @platform linux
     */
    val selection: Clipboard
}
