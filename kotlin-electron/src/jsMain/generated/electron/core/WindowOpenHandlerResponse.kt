// Generated by Karakum - do not modify it manually!

package electron.core

external interface WindowOpenHandlerResponse {
// Docs: https://electronjs.org/docs/api/structures/window-open-handler-response
    /**
     * Can be `allow` or `deny`. Controls whether new window should be created.
     */
    var action: (WindowOpenHandlerResponseAction)

    /**
     * If specified, will be called instead of `new BrowserWindow` to create the new
     * child window and event `did-create-window` will not be emitted. Constructed
     * child window should use passed `options` object. This can be used for example to
     * have the new window open as a BrowserView instead of in a separate window.
     */
    var createWindow: ((options: BrowserWindowConstructorOptions) -> WebContents)?

    /**
     * By default, child windows are closed when their opener is closed. This can be
     * changed by specifying `outlivesOpener: true`, in which case the opened window
     * will not be closed when its opener is closed.
     */
    var outlivesOpener: Boolean?

    /**
     * Allows customization of the created window.
     */
    var overrideBrowserWindowOptions: BrowserWindowConstructorOptions?
}
