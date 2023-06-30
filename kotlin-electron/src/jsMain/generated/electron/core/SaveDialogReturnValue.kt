package electron.core


external interface SaveDialogReturnValue {
    /**
     * whether or not the dialog was canceled.
     */
    var canceled: Boolean

    /**
     * If the dialog is canceled, this will be `undefined`.
     */
    var filePath: String?

    /**
     * Base64 encoded string which contains the security scoped bookmark data for the
     * saved file. `securityScopedBookmarks` must be enabled for this to be present.
     * (For return values, see table here.)
     *
     * @platform darwin,mas
     */
    var bookmark: String?
}
