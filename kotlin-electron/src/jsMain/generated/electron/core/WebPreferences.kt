package electron.core


external interface WebPreferences {
    /**
     * Whether to enable DevTools. If it is set to `false`, can not use
     * `BrowserWindow.webContents.openDevTools()` to open DevTools. Default is `true`.
     */
    var devTools: Boolean?

    /**
     * Whether node integration is enabled. Default is `false`.
     */
    var nodeIntegration: Boolean?

    /**
     * Whether node integration is enabled in web workers. Default is `false`. More
     * about this can be found in Multithreading.
     */
    var nodeIntegrationInWorker: Boolean?

    /**
     * Experimental option for enabling Node.js support in sub-frames such as iframes
     * and child windows. All your preloads will load for every iframe, you can use
     * `process.isMainFrame` to determine if you are in the main frame or not.
     */
    var nodeIntegrationInSubFrames: Boolean?

    /**
     * Specifies a script that will be loaded before other scripts run in the page.
     * This script will always have access to node APIs no matter whether node
     * integration is turned on or off. The value should be the absolute file path to
     * the script. When node integration is turned off, the preload script can
     * reintroduce Node global symbols back to the global scope. See example here.
     */
    var preload: String?

    /**
     * If set, this will sandbox the renderer associated with the window, making it
     * compatible with the Chromium OS-level sandbox and disabling the Node.js engine.
     * This is not the same as the `nodeIntegration` option and the APIs available to
     * the preload script are more limited. Read more about the option here.
     */
    var sandbox: Boolean?

    /**
     * Sets the session used by the page. Instead of passing the Session object
     * directly, you can also choose to use the `partition` option instead, which
     * accepts a partition string. When both `session` and `partition` are provided,
     * `session` will be preferred. Default is the default session.
     */
    var session: Session?

    /**
     * Sets the session used by the page according to the session's partition string.
     * If `partition` starts with `persist:`, the page will use a persistent session
     * available to all pages in the app with the same `partition`. If there is no
     * `persist:` prefix, the page will use an in-memory session. By assigning the same
     * `partition`, multiple pages can share the same session. Default is the default
     * session.
     */
    var partition: String?

    /**
     * The default zoom factor of the page, `3.0` represents `300%`. Default is `1.0`.
     */
    var zoomFactor: Double?

    /**
     * Enables JavaScript support. Default is `true`.
     */
    var javascript: Boolean?

    /**
     * When `false`, it will disable the same-origin policy (usually using testing
     * websites by people), and set `allowRunningInsecureContent` to `true` if this
     * options has not been set by user. Default is `true`.
     */
    var webSecurity: Boolean?

    /**
     * Allow an https page to run JavaScript, CSS or plugins from http URLs. Default is
     * `false`.
     */
    var allowRunningInsecureContent: Boolean?

    /**
     * Enables image support. Default is `true`.
     */
    var images: Boolean?

    /**
     * Specifies how to run image animations (E.g. GIFs).  Can be `animate`,
     * `animateOnce` or `noAnimation`.  Default is `animate`.
     */
    var imageAnimationPolicy: (WebPreferencesImageAnimationPolicy)?

    /**
     * Make TextArea elements resizable. Default is `true`.
     */
    var textAreasAreResizable: Boolean?

    /**
     * Enables WebGL support. Default is `true`.
     */
    var webgl: Boolean?

    /**
     * Whether plugins should be enabled. Default is `false`.
     */
    var plugins: Boolean?

    /**
     * Enables Chromium's experimental features. Default is `false`.
     */
    var experimentalFeatures: Boolean?

    /**
     * Enables scroll bounce (rubber banding) effect on macOS. Default is `false`.
     *
     * @platform darwin
     */
    var scrollBounce: Boolean?

    /**
     * A list of feature strings separated by `,`, like `CSSVariables,KeyboardEventKey`
     * to enable. The full list of supported feature strings can be found in the
     * RuntimeEnabledFeatures.json5 file.
     */
    var enableBlinkFeatures: String?

    /**
     * A list of feature strings separated by `,`, like `CSSVariables,KeyboardEventKey`
     * to disable. The full list of supported feature strings can be found in the
     * RuntimeEnabledFeatures.json5 file.
     */
    var disableBlinkFeatures: String?

    /**
     * Sets the default font for the font-family.
     */
    var defaultFontFamily: DefaultFontFamily?

    /**
     * Defaults to `16`.
     */
    var defaultFontSize: Double?

    /**
     * Defaults to `13`.
     */
    var defaultMonospaceFontSize: Double?

    /**
     * Defaults to `0`.
     */
    var minimumFontSize: Double?

    /**
     * Defaults to `ISO-8859-1`.
     */
    var defaultEncoding: String?

    /**
     * Whether to throttle animations and timers when the page becomes background. This
     * also affects the Page Visibility API. Defaults to `true`.
     */
    var backgroundThrottling: Boolean?

    /**
     * Whether to enable offscreen rendering for the browser window. Defaults to
     * `false`. See the offscreen rendering tutorial for more details.
     */
    var offscreen: Boolean?

    /**
     * Whether to run Electron APIs and the specified `preload` script in a separate
     * JavaScript context. Defaults to `true`. The context that the `preload` script
     * runs in will only have access to its own dedicated `document` and `window`
     * globals, as well as its own set of JavaScript builtins (`Array`, `Object`,
     * `JSON`, etc.), which are all invisible to the loaded content. The Electron API
     * will only be available in the `preload` script and not the loaded page. This
     * option should be used when loading potentially untrusted remote content to
     * ensure the loaded content cannot tamper with the `preload` script and any
     * Electron APIs being used.  This option uses the same technique used by Chrome
     * Content Scripts.  You can access this context in the dev tools by selecting the
     * 'Electron Isolated Context' entry in the combo box at the top of the Console
     * tab.
     */
    var contextIsolation: Boolean?

    /**
     * Whether to enable the `<webview>` tag. Defaults to `false`. **Note:** The
     * `preload` script configured for the `<webview>` will have node integration
     * enabled when it is executed so you should ensure remote/untrusted content is not
     * able to create a `<webview>` tag with a possibly malicious `preload` script. You
     * can use the `will-attach-webview` event on webContents to strip away the
     * `preload` script and to validate or alter the `<webview>`'s initial settings.
     */
    var webviewTag: Boolean?

    /**
     * A list of strings that will be appended to `process.argv` in the renderer
     * process of this app.  Useful for passing small bits of data down to renderer
     * process preload scripts.
     */
    var additionalArguments: js.core.ReadonlyArray<String>?

    /**
     * Whether to enable browser style consecutive dialog protection. Default is
     * `false`.
     */
    var safeDialogs: Boolean?

    /**
     * The message to display when consecutive dialog protection is triggered. If not
     * defined the default message would be used, note that currently the default
     * message is in English and not localized.
     */
    var safeDialogsMessage: String?

    /**
     * Whether to disable dialogs completely. Overrides `safeDialogs`. Default is
     * `false`.
     */
    var disableDialogs: Boolean?

    /**
     * Whether dragging and dropping a file or link onto the page causes a navigation.
     * Default is `false`.
     */
    var navigateOnDragDrop: Boolean?

    /**
     * Autoplay policy to apply to content in the window, can be
     * `no-user-gesture-required`, `user-gesture-required`,
     * `document-user-activation-required`. Defaults to `no-user-gesture-required`.
     */
    var autoplayPolicy: (WebPreferencesAutoplayPolicy)?

    /**
     * Whether to prevent the window from resizing when entering HTML Fullscreen.
     * Default is `false`.
     */
    var disableHtmlFullscreenWindowResize: Boolean?

    /**
     * An alternative title string provided only to accessibility tools such as screen
     * readers. This string is not directly visible to users.
     */
    var accessibleTitle: String?

    /**
     * Whether to enable the builtin spellchecker. Default is `true`.
     */
    var spellcheck: Boolean?

    /**
     * Whether to enable the WebSQL api. Default is `true`.
     */
    var enableWebSQL: Boolean?

    /**
     * Enforces the v8 code caching policy used by blink. Accepted values are
     */
    var v8CacheOptions: (WebPreferencesV8CacheOptions)?

    /**
     * Whether to enable preferred size mode. The preferred size is the minimum size
     * needed to contain the layout of the document—without requiring scrolling.
     * Enabling this will cause the `preferred-size-changed` event to be emitted on the
     * `WebContents` when the preferred size changes. Default is `false`.
     */
    var enablePreferredSizeMode: Boolean?
}
