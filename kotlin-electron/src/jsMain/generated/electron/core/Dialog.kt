package electron.core

import kotlin.js.Promise


external interface Dialog {
// Docs: https://electronjs.org/docs/api/dialog
    /**
     * resolves when the certificate trust dialog is shown.
     *
     * On macOS, this displays a modal dialog that shows a message and certificate
     * information, and gives the user the option of trusting/importing the
     * certificate. If you provide a `browserWindow` argument the dialog will be
     * attached to the parent window, making it modal.
     *
     * On Windows the options are more limited, due to the Win32 APIs used:
     *
     * * The `message` argument is not used, as the OS provides its own confirmation
     * dialog.
     * * The `browserWindow` argument is ignored since it is not possible to make this
     * confirmation dialog modal.
     *
     * @platform darwin,win32
     */
    fun showCertificateTrustDialog(browserWindow: BrowserWindow, options: CertificateTrustDialogOptions): Promise<Unit>

    /**
     * resolves when the certificate trust dialog is shown.
     *
     * On macOS, this displays a modal dialog that shows a message and certificate
     * information, and gives the user the option of trusting/importing the
     * certificate. If you provide a `browserWindow` argument the dialog will be
     * attached to the parent window, making it modal.
     *
     * On Windows the options are more limited, due to the Win32 APIs used:
     *
     * * The `message` argument is not used, as the OS provides its own confirmation
     * dialog.
     * * The `browserWindow` argument is ignored since it is not possible to make this
     * confirmation dialog modal.
     *
     * @platform darwin,win32
     */
    fun showCertificateTrustDialog(options: CertificateTrustDialogOptions): Promise<Unit>

    /**
     * Displays a modal dialog that shows an error message.
     *
     * This API can be called safely before the `ready` event the `app` module emits,
     * it is usually used to report errors in early stage of startup. If called before
     * the app `ready`event on Linux, the message will be emitted to stderr, and no GUI
     * dialog will appear.
     */
    fun showErrorBox(title: String, content: String): Unit

    /**
     * resolves with a promise containing the following properties:
     *
     * * `response` number - The index of the clicked button.
     * * `checkboxChecked` boolean - The checked state of the checkbox if
     * `checkboxLabel` was set. Otherwise `false`.
     *
     * Shows a message box.
     *
     * The `browserWindow` argument allows the dialog to attach itself to a parent
     * window, making it modal.
     */
    fun showMessageBox(browserWindow: BrowserWindow, options: MessageBoxOptions): Promise<MessageBoxReturnValue>

    /**
     * resolves with a promise containing the following properties:
     *
     * * `response` number - The index of the clicked button.
     * * `checkboxChecked` boolean - The checked state of the checkbox if
     * `checkboxLabel` was set. Otherwise `false`.
     *
     * Shows a message box.
     *
     * The `browserWindow` argument allows the dialog to attach itself to a parent
     * window, making it modal.
     */
    fun showMessageBox(options: MessageBoxOptions): Promise<MessageBoxReturnValue>

    /**
     * the index of the clicked button.
     *
     * Shows a message box, it will block the process until the message box is closed.
     * It returns the index of the clicked button.
     *
     * The `browserWindow` argument allows the dialog to attach itself to a parent
     * window, making it modal. If `browserWindow` is not shown dialog will not be
     * attached to it. In such case it will be displayed as an independent window.
     */
    fun showMessageBoxSync(browserWindow: BrowserWindow, options: MessageBoxSyncOptions): Double

    /**
     * the index of the clicked button.
     *
     * Shows a message box, it will block the process until the message box is closed.
     * It returns the index of the clicked button.
     *
     * The `browserWindow` argument allows the dialog to attach itself to a parent
     * window, making it modal. If `browserWindow` is not shown dialog will not be
     * attached to it. In such case it will be displayed as an independent window.
     */
    fun showMessageBoxSync(options: MessageBoxSyncOptions): Double

    /**
     * Resolve with an object containing the following:
     *
     * * `canceled` boolean - whether or not the dialog was canceled.
     * * `filePaths` string[] - An array of file paths chosen by the user. If the
     * dialog is cancelled this will be an empty array.
     * * `bookmarks` string[] (optional) _macOS_ _mas_ - An array matching the
     * `filePaths` array of base64 encoded strings which contains security scoped
     * bookmark data. `securityScopedBookmarks` must be enabled for this to be
     * populated. (For return values, see table here.)
     *
     * The `browserWindow` argument allows the dialog to attach itself to a parent
     * window, making it modal.
     *
     * The `filters` specifies an array of file types that can be displayed or selected
     * when you want to limit the user to a specific type. For example:
     *
     * The `extensions` array should contain extensions without wildcards or dots (e.g.
     * `'png'` is good but `'.png'` and `'*.png'` are bad). To show all files, use the
     * `'*'` wildcard (no other wildcard is supported).
     *
     * **Note:** On Windows and Linux an open dialog can not be both a file selector
     * and a directory selector, so if you set `properties` to `['openFile',
     * 'openDirectory']` on these platforms, a directory selector will be shown.
     */
    fun showOpenDialog(browserWindow: BrowserWindow, options: OpenDialogOptions): Promise<OpenDialogReturnValue>

    /**
     * Resolve with an object containing the following:
     *
     * * `canceled` boolean - whether or not the dialog was canceled.
     * * `filePaths` string[] - An array of file paths chosen by the user. If the
     * dialog is cancelled this will be an empty array.
     * * `bookmarks` string[] (optional) _macOS_ _mas_ - An array matching the
     * `filePaths` array of base64 encoded strings which contains security scoped
     * bookmark data. `securityScopedBookmarks` must be enabled for this to be
     * populated. (For return values, see table here.)
     *
     * The `browserWindow` argument allows the dialog to attach itself to a parent
     * window, making it modal.
     *
     * The `filters` specifies an array of file types that can be displayed or selected
     * when you want to limit the user to a specific type. For example:
     *
     * The `extensions` array should contain extensions without wildcards or dots (e.g.
     * `'png'` is good but `'.png'` and `'*.png'` are bad). To show all files, use the
     * `'*'` wildcard (no other wildcard is supported).
     *
     * **Note:** On Windows and Linux an open dialog can not be both a file selector
     * and a directory selector, so if you set `properties` to `['openFile',
     * 'openDirectory']` on these platforms, a directory selector will be shown.
     */
    fun showOpenDialog(options: OpenDialogOptions): Promise<OpenDialogReturnValue>

    /**
     * the file paths chosen by the user; if the dialog is cancelled it returns
     * `undefined`.
     *
     * The `browserWindow` argument allows the dialog to attach itself to a parent
     * window, making it modal.
     *
     * The `filters` specifies an array of file types that can be displayed or selected
     * when you want to limit the user to a specific type. For example:
     *
     * The `extensions` array should contain extensions without wildcards or dots (e.g.
     * `'png'` is good but `'.png'` and `'*.png'` are bad). To show all files, use the
     * `'*'` wildcard (no other wildcard is supported).
     *
     * **Note:** On Windows and Linux an open dialog can not be both a file selector
     * and a directory selector, so if you set `properties` to `['openFile',
     * 'openDirectory']` on these platforms, a directory selector will be shown.
     */
    fun showOpenDialogSync(browserWindow: BrowserWindow, options: OpenDialogSyncOptions): js.core.ReadonlyArray<String>?

    /**
     * the file paths chosen by the user; if the dialog is cancelled it returns
     * `undefined`.
     *
     * The `browserWindow` argument allows the dialog to attach itself to a parent
     * window, making it modal.
     *
     * The `filters` specifies an array of file types that can be displayed or selected
     * when you want to limit the user to a specific type. For example:
     *
     * The `extensions` array should contain extensions without wildcards or dots (e.g.
     * `'png'` is good but `'.png'` and `'*.png'` are bad). To show all files, use the
     * `'*'` wildcard (no other wildcard is supported).
     *
     * **Note:** On Windows and Linux an open dialog can not be both a file selector
     * and a directory selector, so if you set `properties` to `['openFile',
     * 'openDirectory']` on these platforms, a directory selector will be shown.
     */
    fun showOpenDialogSync(options: OpenDialogSyncOptions): js.core.ReadonlyArray<String>?

    /**
     * Resolve with an object containing the following:
     *
     * * `canceled` boolean - whether or not the dialog was canceled.
     * * `filePath` string (optional) - If the dialog is canceled, this will be
     * `undefined`.
     * * `bookmark` string (optional) _macOS_ _mas_ - Base64 encoded string which
     * contains the security scoped bookmark data for the saved file.
     * `securityScopedBookmarks` must be enabled for this to be present. (For return
     * values, see table here.)
     *
     * The `browserWindow` argument allows the dialog to attach itself to a parent
     * window, making it modal.
     *
     * The `filters` specifies an array of file types that can be displayed, see
     * `dialog.showOpenDialog` for an example.
     *
     * **Note:** On macOS, using the asynchronous version is recommended to avoid
     * issues when expanding and collapsing the dialog.
     */
    fun showSaveDialog(browserWindow: BrowserWindow, options: SaveDialogOptions): Promise<SaveDialogReturnValue>

    /**
     * Resolve with an object containing the following:
     *
     * * `canceled` boolean - whether or not the dialog was canceled.
     * * `filePath` string (optional) - If the dialog is canceled, this will be
     * `undefined`.
     * * `bookmark` string (optional) _macOS_ _mas_ - Base64 encoded string which
     * contains the security scoped bookmark data for the saved file.
     * `securityScopedBookmarks` must be enabled for this to be present. (For return
     * values, see table here.)
     *
     * The `browserWindow` argument allows the dialog to attach itself to a parent
     * window, making it modal.
     *
     * The `filters` specifies an array of file types that can be displayed, see
     * `dialog.showOpenDialog` for an example.
     *
     * **Note:** On macOS, using the asynchronous version is recommended to avoid
     * issues when expanding and collapsing the dialog.
     */
    fun showSaveDialog(options: SaveDialogOptions): Promise<SaveDialogReturnValue>

    /**
     * the path of the file chosen by the user; if the dialog is cancelled it returns
     * `undefined`.
     *
     * The `browserWindow` argument allows the dialog to attach itself to a parent
     * window, making it modal.
     *
     * The `filters` specifies an array of file types that can be displayed, see
     * `dialog.showOpenDialog` for an example.
     */
    fun showSaveDialogSync(browserWindow: BrowserWindow, options: SaveDialogSyncOptions): String?

    /**
     * the path of the file chosen by the user; if the dialog is cancelled it returns
     * `undefined`.
     *
     * The `browserWindow` argument allows the dialog to attach itself to a parent
     * window, making it modal.
     *
     * The `filters` specifies an array of file types that can be displayed, see
     * `dialog.showOpenDialog` for an example.
     */
    fun showSaveDialogSync(options: SaveDialogSyncOptions): String?
}
