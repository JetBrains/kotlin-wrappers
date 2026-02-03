// Automatically generated - do not modify!

package tauri.apps.api.window

import tauri.apps.api.dpi.LogicalPosition

/**
 * Configuration for the window to create.
 *
 * @since 1.0.0
 */
external interface WindowOptions {
    /** Show window in the center of the screen.. */
    var center: Boolean?

    /** The initial vertical position in logical pixels. Only applies if `y` is also set. */
    var x: Double?

    /** The initial horizontal position in logical pixels. Only applies if `x` is also set. */
    var y: Double?

    /** The initial width in logical pixels. */
    var width: Double?

    /** The initial height in logical pixels. */
    var height: Double?

    /** The minimum width in logical pixels. Only applies if `minHeight` is also set. */
    var minWidth: Double?

    /** The minimum height in logical pixels. Only applies if `minWidth` is also set. */
    var minHeight: Double?

    /** The maximum width in logical pixels. Only applies if `maxHeight` is also set. */
    var maxWidth: Double?

    /** The maximum height in logical pixels. Only applies if `maxWidth` is also set. */
    var maxHeight: Double?

    /**
     * Prevent the window from overflowing the working area (e.g. monitor size - taskbar size)
     * on creation, which means the window size will be limited to `monitor size - taskbar size`
     *
     * Can either be set to `true` or to a {@link PreventOverflowMargin} object to set an additional margin
     * that should be considered to determine the working area
     * (in this case the window size will be limited to `monitor size - taskbar size - margin`)
     *
     * **NOTE**: The overflow check is only performed on window creation, resizes can still overflow
     *
     * #### Platform-specific
     *
     * - **iOS / Android:** Unsupported.
     */
    var preventOverflow: (Any /* boolean | PreventOverflowMargin */)?

    /** Whether the window is resizable or not. */
    var resizable: Boolean?

    /** Window title. */
    var title: String?

    /** Whether the window is in fullscreen mode or not. */
    var fullscreen: Boolean?

    /** Whether the window will be initially focused or not. */
    var focus: Boolean?

    /** Whether the window can be focused or not. */
    var focusable: Boolean?

    /**
     * Whether the window is transparent or not.
     * Note that on `macOS` this requires the `macos-private-api` feature flag, enabled under `tauri.conf.json > app > macOSPrivateApi`.
     * WARNING: Using private APIs on `macOS` prevents your application from being accepted to the `App Store`.
     */
    var transparent: Boolean?

    /** Whether the window should be maximized upon creation or not. */
    var maximized: Boolean?

    /** Whether the window should be immediately visible upon creation or not. */
    var visible: Boolean?

    /** Whether the window should have borders and bars or not. */
    var decorations: Boolean?

    /** Whether the window should always be on top of other windows or not. */
    var alwaysOnTop: Boolean?

    /** Whether the window should always be below other windows. */
    var alwaysOnBottom: Boolean?

    /** Prevents the window contents from being captured by other apps. */
    var contentProtected: Boolean?

    /** Whether or not the window icon should be added to the taskbar. */
    var skipTaskbar: Boolean?

    /**
     *  Whether or not the window has shadow.
     *
     * #### Platform-specific
     *
     * - **Windows:**
     *   - `false` has no effect on decorated window, shadows are always ON.
     *   - `true` will make undecorated window have a 1px white border,
     * and on Windows 11, it will have a rounded corners.
     * - **Linux:** Unsupported.
     *
     * @since 2.0.0
     */
    var shadow: Boolean?

    /**
     * The initial window theme. Defaults to the system theme.
     *
     * Only implemented on Windows and macOS 10.14+.
     */
    var theme: Theme?

    /**
     * The style of the macOS title bar.
     */
    var titleBarStyle: TitleBarStyle?

    /**
     * The position of the window controls on macOS.
     *
     * Requires `titleBarStyle: 'overlay'` and `decorations: true`.
     *
     * @since 2.4.0
     */
    var trafficLightPosition: LogicalPosition?

    /**
     * If `true`, sets the window title to be hidden on macOS.
     */
    var hiddenTitle: Boolean?

    /**
     * Defines the window [tabbing identifier](https://developer.apple.com/documentation/appkit/nswindow/1644704-tabbingidentifier) on macOS.
     *
     * Windows with the same tabbing identifier will be grouped together.
     * If the tabbing identifier is not set, automatic tabbing will be disabled.
     */
    var tabbingIdentifier: String?

    /**
     * Whether the window's native maximize button is enabled or not. Defaults to `true`.
     */
    var maximizable: Boolean?

    /**
     * Whether the window's native minimize button is enabled or not. Defaults to `true`.
     */
    var minimizable: Boolean?

    /**
     * Whether the window's native close button is enabled or not. Defaults to `true`.
     */
    var closable: Boolean?

    /**
     * Sets a parent to the window to be created. Can be either a {@linkcode Window} or a label of the window.
     *
     * #### Platform-specific
     *
     * - **Windows**: This sets the passed parent as an owner window to the window to be created.
     *   From [MSDN owned windows docs](https://docs.microsoft.com/en-us/windows/win32/winmsg/window-features#owned-windows):
     *     - An owned window is always above its owner in the z-order.
     *     - The system automatically destroys an owned window when its owner is destroyed.
     *     - An owned window is hidden when its owner is minimized.
     * - **Linux**: This makes the new window transient for parent, see <https://docs.gtk.org/gtk3/method.Window.set_transient_for.html>
     * - **macOS**: This adds the window as a child of parent, see <https://developer.apple.com/documentation/appkit/nswindow/1419152-addchildwindow?language=objc>
     */
    var parent: (Any /* Window | WebviewWindow | string */)?

    /** Whether the window should be visible on all workspaces or virtual desktops.
     *
     * #### Platform-specific
     *
     * - **Windows / iOS / Android:** Unsupported.
     *
     * @since 2.0.0
     */
    var visibleOnAllWorkspaces: Boolean?

    /**
     * Window effects.
     *
     * Requires the window to be transparent.
     *
     * #### Platform-specific:
     *
     * - **Windows**: If using decorations or shadows, you may want to try this workaround <https://github.com/tauri-apps/tao/issues/72#issuecomment-975607891>
     * - **Linux**: Unsupported
     */
    var windowEffects: Effects?

    /**
     * Set the window background color.
     *
     * #### Platform-specific:
     *
     * - **Android / iOS:** Unsupported.
     * - **Windows**: alpha channel is ignored.
     *
     * @since 2.1.0
     */
    var backgroundColor: Color?

    /** Change the default background throttling behaviour.
     *
     * ## Platform-specific
     *
     * - **Linux / Windows / Android**: Unsupported. Workarounds like a pending WebLock transaction might suffice.
     * - **iOS**: Supported since version 17.0+.
     * - **macOS**: Supported since version 14.0+.
     *
     * see https://github.com/tauri-apps/tauri/issues/5250#issuecomment-2569380578
     *
     * @since 2.3.0
     */
    var backgroundThrottling: BackgroundThrottlingPolicy?

    /**
     * Whether we should disable JavaScript code execution on the webview or not.
     */
    var javascriptDisabled: Boolean?

    /**
     * on macOS and iOS there is a link preview on long pressing links, this is enabled by default.
     * see https://docs.rs/objc2-web-kit/latest/objc2_web_kit/struct.WKWebView.html#method.allowsLinkPreview
     */
    var allowLinkPreview: Boolean?

    /**
     * Allows disabling the input accessory view on iOS.
     *
     * The accessory view is the view that appears above the keyboard when a text input element is focused.
     * It usually displays a view with "Done", "Next" buttons.
     */
    var disableInputAccessoryView: Boolean?

    /**
     * Specifies the native scrollbar style to use with the webview.
     * CSS styles that modify the scrollbar are applied on top of the native appearance configured here.
     *
     * Defaults to `default`, which is the browser default.
     *
     * ## Platform-specific
     *
     * - **Windows**:
     *   - `fluentOverlay` requires WebView2 Runtime version 125.0.2535.41 or higher, and does nothing
     *     on older versions.
     *   - This option must be given the same value for all webviews.
     * - **Linux / Android / iOS / macOS**: Unsupported. Only supports `Default` and performs no operation.
     */
    var scrollBarStyle: ScrollBarStyle?
}
