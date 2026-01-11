// Automatically generated - do not modify!

package tauri.apps.api

// unhandled import: PhysicalPosition from "./dpi"
// unhandled import: PhysicalSize from "./dpi"
// unhandled import: LogicalPosition from "./dpi"
// unhandled import: LogicalSize from "./dpi"
// unhandled import: Position from "./dpi"
// unhandled import: Size from "./dpi"
// unhandled import: EventName from "./event"
// unhandled import: EventCallback from "./event"
// unhandled import: UnlistenFn from "./event"
// unhandled import: EventTarget from "./event"
// unhandled import: BackgroundThrottlingPolicy from "./window"
// unhandled import: ScrollBarStyle from "./window"
// unhandled import: Color from "./window"
// unhandled import: Window from "./window"
// unhandled import: WebviewWindow from "./webviewWindow"

/**
 * Configuration for the webview to create.
 *
 * @since 2.0.0
 */
external interface WebviewOptions {
    /**
     * Remote URL or local file path to open.
     *
     * - URL such as `https://github.com/tauri-apps` is opened directly on a Tauri webview.
     * - data: URL such as `data:text/html,<html>...` is only supported with the `webview-data-url` Cargo feature for the `tauri` dependency.
     * - local file path or route such as `/path/to/page.html` or `/users` is appended to the application URL (the devServer URL on development, or `tauri://localhost/` and `https://tauri.localhost/` on production).
     */
    var url: String?

    /** The initial vertical position. */
    var x: Double

    /** The initial horizontal position. */
    var y: Double

    /** The initial width. */
    var width: Double

    /** The initial height. */
    var height: Double

    /**
     * Whether the webview is transparent or not.
     * Note that on `macOS` this requires the `macos-private-api` feature flag, enabled under `tauri.conf.json > app > macOSPrivateApi`.
     * WARNING: Using private APIs on `macOS` prevents your application from being accepted to the `App Store`.
     */
    var transparent: Boolean?

    /**
     * Whether the webview should have focus or not
     *
     * @since 2.1.0
     */
    var focus: Boolean?

    /**
     * Whether the drag and drop is enabled or not on the webview. By default it is enabled.
     *
     * Disabling it is required to use HTML5 drag and drop on the frontend on Windows.
     */
    var dragDropEnabled: Boolean?

    /**
     * Whether clicking an inactive webview also clicks through to the webview on macOS.
     */
    var acceptFirstMouse: Boolean?

    /**
     * The user agent for the webview.
     */
    var userAgent: String?

    /**
     * Whether or not the webview should be launched in incognito mode.
     *
     * #### Platform-specific
     *
     * - **Android:** Unsupported.
     */
    var incognito: Boolean?

    /**
     * The proxy URL for the WebView for all network requests.
     *
     * Must be either a `http://` or a `socks5://` URL.
     *
     * #### Platform-specific
     *
     * - **macOS**: Requires the `macos-proxy` feature flag and only compiles for macOS 14+.
     * */
    var proxyUrl: String?

    /**
     * Whether page zooming by hotkeys is enabled
     *
     * #### Platform-specific:
     *
     * - **Windows**: Controls WebView2's [`IsZoomControlEnabled`](https://learn.microsoft.com/en-us/microsoft-edge/webview2/reference/winrt/microsoft_web_webview2_core/corewebview2settings?view=webview2-winrt-1.0.2420.47#iszoomcontrolenabled) setting.
     * - **MacOS / Linux**: Injects a polyfill that zooms in and out with `ctrl/command` + `-/=`,
     * 20% in each step, ranging from 20% to 1000%. Requires `webview:allow-set-webview-zoom` permission
     *
     * - **Android / iOS**: Unsupported.
     */
    var zoomHotkeysEnabled: Boolean?

    /**
     * Sets whether the custom protocols should use `https://<scheme>.localhost` instead of the default `http://<scheme>.localhost` on Windows and Android. Defaults to `false`.
     *
     * #### Note
     *
     * Using a `https` scheme will NOT allow mixed content when trying to fetch `http` endpoints and therefore will not match the behavior of the `<scheme>://localhost` protocols used on macOS and Linux.
     *
     * #### Warning
     *
     * Changing this value between releases will change the IndexedDB, cookies and localstorage location and your app will not be able to access them.
     *
     * @since 2.1.0
     */
    var useHttpsScheme: Boolean?

    /**
     * Whether web inspector, which is usually called browser devtools, is enabled or not. Enabled by default.
     *
     * This API works in **debug** builds, but requires `devtools` feature flag to enable it in **release** builds.
     *
     * #### Platform-specific
     *
     * - macOS: This will call private functions on **macOS**.
     * - Android: Open `chrome://inspect/#devices` in Chrome to get the devtools window. Wry's `WebView` devtools API isn't supported on Android.
     * - iOS: Open Safari > Develop > [Your Device Name] > [Your WebView] to get the devtools window.
     *
     * @since 2.1.0
     */
    var devtools: Boolean?

    /**
     * Set the window and webview background color.
     *
     * #### Platform-specific:
     *
     * - **macOS / iOS**: Not implemented.
     * - **Windows**:
     *   - On Windows 7, alpha channel is ignored.
     *   - On Windows 8 and newer, if alpha channel is not `0`, it will be ignored.
     *
     * @since 2.1.0
     */
    var backgroundColor: Color?

    /** Change the default background throttling behaviour.
     *
     * By default, browsers use a suspend policy that will throttle timers and even unload
     * the whole tab (view) to free resources after roughly 5 minutes when a view became
     * minimized or hidden. This will pause all tasks until the documents visibility state
     * changes back from hidden to visible by bringing the view back to the foreground.
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
     * Set a custom path for the webview's data directory (localStorage, cache, etc.) **relative to [`appDataDir()`]/${label}**.
     * For security reasons, paths outside of that location can only be configured on the Rust side.
     *
     * #### Platform-specific:
     *
     * - **Windows**: WebViews with different values for settings like `additionalBrowserArgs`, `browserExtensionsEnabled` or `scrollBarStyle` must have different data directories.
     * - **macOS / iOS**: Unsupported, use `dataStoreIdentifier` instead.
     * - **Android**: Unsupported.
     *
     * @since 2.9.0
     */
    var dataDirectory: String?

    /**
     * Initialize the WebView with a custom data store identifier. This can be seen as a replacement for `dataDirectory` which is unavailable in WKWebView.
     * See https://developer.apple.com/documentation/webkit/wkwebsitedatastore/init(foridentifier:)?language=objc
     *
     * The array must contain 16 u8 numbers.
     *
     * #### Platform-specific:
     *
     * - **macOS / iOS**: Available on macOS >= 14 and iOS >= 17
     * - **Windows / Linux / Android**: Unsupported.
     *
     * @since 2.9.0
     */
    var dataStoreIdentifier: js.array.ReadonlyArray<Double>?

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
