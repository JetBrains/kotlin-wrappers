package electron.core


external interface LoadFileOptions {
    /**
     * Passed to `url.format()`.
     */
    var query: js.core.ReadonlyRecord<String, String>?

    /**
     * Passed to `url.format()`.
     */
    var search: String?

    /**
     * Passed to `url.format()`.
     */
    var hash: String?
}
