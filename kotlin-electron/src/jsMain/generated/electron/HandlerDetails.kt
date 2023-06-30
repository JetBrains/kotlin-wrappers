package electron


external interface HandlerDetails {
    /**
     * The _resolved_ version of the URL passed to `window.open()`. e.g. opening a
     * window with `window.open('foo')` will yield something like
     * `https://the-origin/the/current/path/foo`.
     */
    var url: String

    /**
     * Name of the window provided in `window.open()`
     */
    var frameName: String

    /**
     * Comma separated list of window features provided to `window.open()`.
     */
    var features: String

    /**
     * Can be `default`, `foreground-tab`, `background-tab`, `new-window` or `other`.
     */
    var disposition: (HandlerDetailsDisposition)

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
}
