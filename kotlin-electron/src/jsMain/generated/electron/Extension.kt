package electron


external interface Extension {
    // Docs: https://electronjs.org/docs/api/structures/extension
    var id: String

    /**
     * Copy of the extension's manifest data.
     */
    var manifest: Any?
    var name: String

    /**
     * The extension's file path.
     */
    var path: String

    /**
     * The extension's `chrome-extension://` URL.
     */
    var url: String
    var version: String
}
