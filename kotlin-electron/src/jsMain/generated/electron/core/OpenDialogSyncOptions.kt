package electron.core


external interface OpenDialogSyncOptions {
    var title: String?
    var defaultPath: String?

    /**
     * Custom label for the confirmation button, when left empty the default label will
     * be used.
     */
    var buttonLabel: String?
    var filters: js.core.ReadonlyArray<FileFilter>?

    /**
     * Contains which features the dialog should use. The following values are
     * supported:
     */
    var properties: Array<OpenDialogSyncOptionsProperty>?

    /**
     * Message to display above input boxes.
     *
     * @platform darwin
     */
    var message: String?

    /**
     * Create security scoped bookmarks when packaged for the Mac App Store.
     *
     * @platform darwin,mas
     */
    var securityScopedBookmarks: Boolean?
}
