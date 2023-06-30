package electron.core


external interface SharingItem {
// Docs: https://electronjs.org/docs/api/structures/sharing-item
    /**
     * An array of files to share.
     */
    var filePaths: js.core.ReadonlyArray<String>?

    /**
     * An array of text to share.
     */
    var texts: js.core.ReadonlyArray<String>?

    /**
     * An array of URLs to share.
     */
    var urls: js.core.ReadonlyArray<String>?
}
