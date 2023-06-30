package electron.core


external interface NativeTheme : node.events.IEventEmitter {
// Docs: https://electronjs.org/docs/api/native-theme
    /**
     * Emitted when something in the underlying NativeTheme has changed. This normally
     * means that either the value of `shouldUseDarkColors`,
     * `shouldUseHighContrastColors` or `shouldUseInvertedColorScheme` has changed. You
     * will have to check them to determine which one has changed.
     */
    fun on(event: NativeThemeEvent.UPDATED, listener: Function<*>): Unit /* this */
    fun once(event: NativeThemeEvent.UPDATED, listener: Function<*>): Unit /* this */
    fun addListener(event: NativeThemeEvent.UPDATED, listener: Function<*>): Unit /* this */
    fun removeListener(event: NativeThemeEvent.UPDATED, listener: Function<*>): Unit /* this */

    /**
     * A `boolean` indicating whether Chromium is in forced colors mode, controlled by
     * system accessibility settings. Currently, Windows high contrast is the only
     * system setting that triggers forced colors mode.
     *
     * @platform win32
     */
    val inForcedColorsMode: Boolean

    /**
     * A `boolean` for if the OS / Chromium currently has a dark mode enabled or is
     * being instructed to show a dark-style UI.  If you want to modify this value you
     * should use `themeSource` below.
     *
     */
    val shouldUseDarkColors: Boolean

    /**
     * A `boolean` for if the OS / Chromium currently has high-contrast mode enabled or
     * is being instructed to show a high-contrast UI.
     *
     * @platform darwin,win32
     */
    val shouldUseHighContrastColors: Boolean

    /**
     * A `boolean` for if the OS / Chromium currently has an inverted color scheme or
     * is being instructed to use an inverted color scheme.
     *
     * @platform darwin,win32
     */
    val shouldUseInvertedColorScheme: Boolean

    /**
     * A `string` property that can be `system`, `light` or `dark`.  It is used to
     * override and supersede the value that Chromium has chosen to use internally.
     *
     * Setting this property to `system` will remove the override and everything will
     * be reset to the OS default.  By default `themeSource` is `system`.
     *
     * Settings this property to `dark` will have the following effects:
     *
     * * `nativeTheme.shouldUseDarkColors` will be `true` when accessed
     * * Any UI Electron renders on Linux and Windows including context menus,
     * devtools, etc. will use the dark UI.
     * * Any UI the OS renders on macOS including menus, window frames, etc. will use
     * the dark UI.
     * * The `prefers-color-scheme` CSS query will match `dark` mode.
     * * The `updated` event will be emitted
     *
     * Settings this property to `light` will have the following effects:
     *
     * * `nativeTheme.shouldUseDarkColors` will be `false` when accessed
     * * Any UI Electron renders on Linux and Windows including context menus,
     * devtools, etc. will use the light UI.
     * * Any UI the OS renders on macOS including menus, window frames, etc. will use
     * the light UI.
     * * The `prefers-color-scheme` CSS query will match `light` mode.
     * * The `updated` event will be emitted
     *
     * The usage of this property should align with a classic "dark mode" state machine
     * in your application where the user has three options.
     *
     * * `Follow OS` --> `themeSource = 'system'`
     * * `Dark Mode` --> `themeSource = 'dark'`
     * * `Light Mode` --> `themeSource = 'light'`
     *
     * Your application should then always use `shouldUseDarkColors` to determine what
     * CSS to apply.
     */
    var themeSource: (NativeThemeThemeSource)
}
