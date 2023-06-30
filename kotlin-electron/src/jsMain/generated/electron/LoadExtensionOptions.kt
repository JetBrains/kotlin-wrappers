package electron


external interface LoadExtensionOptions {
    /**
     * Whether to allow the extension to read local files over `file://` protocol and
     * inject content scripts into `file://` pages. This is required e.g. for loading
     * devtools extensions on `file://` URLs. Defaults to false.
     */
    var allowFileAccess: Boolean
}
