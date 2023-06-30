package electron.core


external interface SaveDialogOptions {
    /**
     * The dialog title. Cannot be displayed on some _Linux_ desktop environments.
     */
    var title: String?

    /**
     * Absolute directory path, absolute file path, or file name to use by default.
     */
    var defaultPath: String?

    /**
     * Custom label for the confirmation button, when left empty the default label will
     * be used.
     */
    var buttonLabel: String?
    var filters: js.core.ReadonlyArray<FileFilter>?

    /**
     * Message to display above text fields.
     *
     * @platform darwin
     */
    var message: String?

    /**
     * Custom label for the text displayed in front of the filename text field.
     *
     * @platform darwin
     */
    var nameFieldLabel: String?

    /**
     * Show the tags input box, defaults to `true`.
     *
     * @platform darwin
     */
    var showsTagField: Boolean?
    var properties: Array<SaveDialogOptionsProperty>?

    /**
     * Create a security scoped bookmark when packaged for the Mac App Store. If this
     * option is enabled and the file doesn't already exist a blank file will be
     * created at the chosen path.
     *
     * @platform darwin,mas
     */
    var securityScopedBookmarks: Boolean?
}
