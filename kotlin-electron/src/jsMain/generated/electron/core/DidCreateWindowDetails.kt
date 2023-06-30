package electron.core


external interface DidCreateWindowDetails {
    /**
     * URL for the created window.
     */
    var url: String

    /**
     * Name given to the created window in the `window.open()` call.
     */
    var frameName: String

    /**
     * The options used to create the BrowserWindow. They are merged in increasing
     * precedence: parsed options from the `features` string from `window.open()`,
     * security-related webPreferences inherited from the parent, and options given by
     * `webContents.setWindowOpenHandler`. Unrecognized options are not filtered out.
     */
    var options: BrowserWindowConstructorOptions

    /**
     * The referrer that will be passed to the new window. May or may not result in the
     * `Referer` header being sent, depending on the referrer policy.
     */
    var referrer: Referrer

    /**
     * The post data that will be sent to the new window, along with the appropriate
     * headers that will be set. If no post data is to be sent, the value will be
     * `null`. Only defined when the window is being created by a form that set
     * `target=_blank`.
     */
    var postBody: PostBody?

    /**
     * Can be `default`, `foreground-tab`, `background-tab`, `new-window` or `other`.
     */
    var disposition: (DidCreateWindowDetailsDisposition)
}
