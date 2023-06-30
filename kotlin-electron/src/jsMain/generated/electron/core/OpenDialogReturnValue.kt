package electron.core


external interface OpenDialogReturnValue {
    /**
     * whether or not the dialog was canceled.
     */
    var canceled: Boolean

    /**
     * An array of file paths chosen by the user. If the dialog is cancelled this will
     * be an empty array.
     */
    var filePaths: js.core.ReadonlyArray<String>

    /**
     * An array matching the `filePaths` array of base64 encoded strings which contains
     * security scoped bookmark data. `securityScopedBookmarks` must be enabled for
     * this to be populated. (For return values, see table here.)
     *
     * @platform darwin,mas
     */
    var bookmarks: js.core.ReadonlyArray<String>?
}
