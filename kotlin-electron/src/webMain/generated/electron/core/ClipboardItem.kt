// Automatically generated - do not modify!

@file:JsModule("INTERNAL_ENTITY")

package electron.core

open external class ClipboardItem {
// Docs: https://electronjs.org/docs/api/clipboard-item
    /**
     * ClipboardItem
     */
    constructor (
        items:
        js.objects.ReadonlyRecord<String, Any /* (string) | (ClipboardBookmark) | (Blob) | (Promise<(Blob) | (string)>) */>,
    )

    /**
     * Resolves with the payload for the given MIME type. Modeled after the W3C
     * `ClipboardItem.getType` method. The promise resolves to a `Blob` for most MIME
     * types; the one exception is `getType('electron application/bookmark')`, which
     * resolves to a ClipboardBookmark object instead. Rejects when `type` is not
     * present in `clipboardItem.types`.
     */
    fun <T : Any /* String */> getType(
        type: T,
    ): js.promise.Promise<Any /* string extends T ? (Blob | ClipboardBookmark) : T extends 'electron application/bookmark' ? ClipboardBookmark : Blob */>

    /**
     * Resolves with a ClipboardBookmark when a bookmark is available in the clipboard.
     * Rejects when a bookmark is not available in the clipboard.
     */
    fun getType(
        bookmark: String, /* 'electron application/bookmark' */
    ): js.promise.Promise<ClipboardBookmark>

    /**
     * A `string[]` property — the MIME types of the data carried by this entry. For a
     * constructed `ClipboardItem` these are the keys passed to the constructor; for an
     * item returned by `clipboard.read()` these are the MIME types the platform
     * clipboard currently makes available.
     *
     */
    val types: js.array.ReadonlyArray<String>
}
