package electron


external interface FindInPageOptions {
    /**
     * Whether to search forward or backward, defaults to `true`.
     */
    var forward: Boolean?

    /**
     * Whether to begin a new text finding session with this request. Should be `true`
     * for initial requests, and `false` for follow-up requests. Defaults to `false`.
     */
    var findNext: Boolean?

    /**
     * Whether search should be case-sensitive, defaults to `false`.
     */
    var matchCase: Boolean?
}
