package electron.core

import kotlin.js.Promise


external interface SystemPreferences : node.events.IEventEmitter {
    // Docs: https://electronjs.org/docs/api/system-preferences
    fun on(
        event: SystemPreferencesEvent.ACCENT_COLOR_CHANGED, listener: (
            event: Event,
            /**
             * The new RGBA color the user assigned to be their system accent color.
             */
            newColor: String
        ) -> Unit
    ): Unit /* this */

    fun on(event: SystemPreferencesEvent.COLOR_CHANGED, listener: (event: Event) -> Unit): Unit /* this */

    /**
     * **Deprecated:** Should use the new `updated` event on the `nativeTheme` module.
     *
     * @deprecated
     * @platform win32
     */
    fun on(
        event: SystemPreferencesEvent.HIGH_CONTRAST_COLOR_SCHEME_CHANGED, listener: (
            event: Event,
            /**
             * `true` if a high contrast theme is being used, `false` otherwise.
             */
            highContrastColorScheme: Boolean
        ) -> Unit
    ): Unit /* this */

    /**
     * **Deprecated:** Should use the new `updated` event on the `nativeTheme` module.
     *
     * @deprecated
     * @platform win32
     */
    fun on(
        event: SystemPreferencesEvent.INVERTED_COLOR_SCHEME_CHANGED, listener: (
            event: Event,
            /**
             * `true` if an inverted color scheme (a high contrast color scheme with light text
             * and dark backgrounds) is being used, `false` otherwise.
             */
            invertedColorScheme: Boolean
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: SystemPreferencesEvent.ACCENT_COLOR_CHANGED, listener: (
            event: Event,
            /**
             * The new RGBA color the user assigned to be their system accent color.
             */
            newColor: String
        ) -> Unit
    ): Unit /* this */

    fun once(event: SystemPreferencesEvent.COLOR_CHANGED, listener: (event: Event) -> Unit): Unit /* this */
    fun once(
        event: SystemPreferencesEvent.HIGH_CONTRAST_COLOR_SCHEME_CHANGED, listener: (
            event: Event,
            /**
             * `true` if a high contrast theme is being used, `false` otherwise.
             */
            highContrastColorScheme: Boolean
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: SystemPreferencesEvent.INVERTED_COLOR_SCHEME_CHANGED, listener: (
            event: Event,
            /**
             * `true` if an inverted color scheme (a high contrast color scheme with light text
             * and dark backgrounds) is being used, `false` otherwise.
             */
            invertedColorScheme: Boolean
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: SystemPreferencesEvent.ACCENT_COLOR_CHANGED, listener: (
            event: Event,
            /**
             * The new RGBA color the user assigned to be their system accent color.
             */
            newColor: String
        ) -> Unit
    ): Unit /* this */

    fun addListener(event: SystemPreferencesEvent.COLOR_CHANGED, listener: (event: Event) -> Unit): Unit /* this */
    fun addListener(
        event: SystemPreferencesEvent.HIGH_CONTRAST_COLOR_SCHEME_CHANGED, listener: (
            event: Event,
            /**
             * `true` if a high contrast theme is being used, `false` otherwise.
             */
            highContrastColorScheme: Boolean
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: SystemPreferencesEvent.INVERTED_COLOR_SCHEME_CHANGED, listener: (
            event: Event,
            /**
             * `true` if an inverted color scheme (a high contrast color scheme with light text
             * and dark backgrounds) is being used, `false` otherwise.
             */
            invertedColorScheme: Boolean
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: SystemPreferencesEvent.ACCENT_COLOR_CHANGED, listener: (
            event: Event,
            /**
             * The new RGBA color the user assigned to be their system accent color.
             */
            newColor: String
        ) -> Unit
    ): Unit /* this */

    fun removeListener(event: SystemPreferencesEvent.COLOR_CHANGED, listener: (event: Event) -> Unit): Unit /* this */
    fun removeListener(
        event: SystemPreferencesEvent.HIGH_CONTRAST_COLOR_SCHEME_CHANGED, listener: (
            event: Event,
            /**
             * `true` if a high contrast theme is being used, `false` otherwise.
             */
            highContrastColorScheme: Boolean
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: SystemPreferencesEvent.INVERTED_COLOR_SCHEME_CHANGED, listener: (
            event: Event,
            /**
             * `true` if an inverted color scheme (a high contrast color scheme with light text
             * and dark backgrounds) is being used, `false` otherwise.
             */
            invertedColorScheme: Boolean
        ) -> Unit
    ): Unit /* this */

    /**
     * A promise that resolves with `true` if consent was granted and `false` if it was
     * denied. If an invalid `mediaType` is passed, the promise will be rejected. If an
     * access request was denied and later is changed through the System Preferences
     * pane, a restart of the app will be required for the new permissions to take
     * effect. If access has already been requested and denied, it _must_ be changed
     * through the preference pane; an alert will not pop up and the promise will
     * resolve with the existing access status.
     *
     * **Important:** In order to properly leverage this API, you must set the
     * `NSMicrophoneUsageDescription` and `NSCameraUsageDescription` strings in your
     * app's `Info.plist` file. The values for these keys will be used to populate the
     * permission dialogs so that the user will be properly informed as to the purpose
     * of the permission request. See Electron Application Distribution for more
     * information about how to set these in the context of Electron.
     *
     * This user consent was not required until macOS 10.14 Mojave, so this method will
     * always return `true` if your system is running 10.13 High Sierra.
     *
     * @platform darwin
     */
    fun askForMediaAccess(mediaType: SystemPreferencesAskForMediaAccessMediaType): Promise<Boolean>

    /**
     * whether or not this device has the ability to use Touch ID.
     *
     * @platform darwin
     */
    fun canPromptTouchID(): Boolean

    /**
     * The users current system wide accent color preference in RGBA hexadecimal form.
     *
     * This API is only available on macOS 10.14 Mojave or newer.
     *
     * @platform win32,darwin
     */
    fun getAccentColor(): String

    /**
     * * `shouldRenderRichAnimation` boolean - Returns true if rich animations should
     * be rendered. Looks at session type (e.g. remote desktop) and accessibility
     * settings to give guidance for heavy animations.
     * * `scrollAnimationsEnabledBySystem` boolean - Determines on a per-platform basis
     * whether scroll animations (e.g. produced by home/end key) should be enabled.
     * * `prefersReducedMotion` boolean - Determines whether the user desires reduced
     * motion based on platform APIs.
     *
     * Returns an object with system animation settings.
     */
    fun getAnimationSettings(): AnimationSettings

    /**
     * | `null` - Can be `dark`, `light` or `unknown`.
     *
     * Gets the macOS appearance setting that you have declared you want for your
     * application, maps to NSApplication.appearance. You can use the
     * `setAppLevelAppearance` API to set this value.
     *
     * @deprecated
     * @platform darwin
     */
    fun getAppLevelAppearance(): (SystemPreferencesGetAppLevelAppearanceResult)

    /**
     * The system color setting in RGB hexadecimal form (`#ABCDEF`). See the Windows
     * docs and the macOS docs for more details.
     *
     * The following colors are only available on macOS 10.14: `find-highlight`,
     * `selected-content-background`, `separator`,
     * `unemphasized-selected-content-background`,
     * `unemphasized-selected-text-background`, and `unemphasized-selected-text`.
     *
     * @platform win32,darwin
     */
    fun getColor(color: SystemPreferencesGetColorColor): String

    /**
     * Can be `dark`, `light` or `unknown`.
     *
     * Gets the macOS appearance setting that is currently applied to your application,
     * maps to NSApplication.effectiveAppearance
     *
     * @platform darwin
     */
    fun getEffectiveAppearance(): (SystemPreferencesGetEffectiveAppearanceResult)

    /**
     * Can be `not-determined`, `granted`, `denied`, `restricted` or `unknown`.
     *
     * This user consent was not required on macOS 10.13 High Sierra so this method
     * will always return `granted`. macOS 10.14 Mojave or higher requires consent for
     * `microphone` and `camera` access. macOS 10.15 Catalina or higher requires
     * consent for `screen` access.
     *
     * Windows 10 has a global setting controlling `microphone` and `camera` access for
     * all win32 applications. It will always return `granted` for `screen` and for all
     * media types on older versions of Windows.
     *
     * @platform win32,darwin
     */
    fun getMediaAccessStatus(mediaType: SystemPreferencesGetMediaAccessStatusMediaType): (SystemPreferencesGetMediaAccessStatusResult)

    /**
     * The standard system color formatted as `#RRGGBBAA`.
     *
     * Returns one of several standard system colors that automatically adapt to
     * vibrancy and changes in accessibility settings like 'Increase contrast' and
     * 'Reduce transparency'. See Apple Documentation for  more details.
     *
     * @platform darwin
     */
    fun getSystemColor(color: SystemPreferencesGetSystemColorColor): String

    /**
     * The value of `key` in `NSUserDefaults`.
     *
     * Some popular `key` and `type`s are:
     *
     * * `AppleInterfaceStyle`: `string`
     * * `AppleAquaColorVariant`: `integer`
     * * `AppleHighlightColor`: `string`
     * * `AppleShowScrollBars`: `string`
     * * `NSNavRecentPlaces`: `array`
     * * `NSPreferredWebServices`: `dictionary`
     * * `NSUserDictionaryReplacementItems`: `array`
     *
     * @platform darwin
     */
    fun getUserDefault(key: String, type: String): Any?

    /**
     * `true` if DWM composition (Aero Glass) is enabled, and `false` otherwise.
     *
     * An example of using it to determine if you should create a transparent window or
     * not (transparent windows won't work correctly when DWM composition is disabled):
     *
     * @platform win32
     */
    fun isAeroGlassEnabled(): Boolean

    /**
     * Whether the system is in Dark Mode.
     *
     * **Deprecated:** Should use the new `nativeTheme.shouldUseDarkColors` API.
     *
     * @deprecated
     * @platform darwin,win32
     */
    fun isDarkMode(): Boolean

    /**
     * `true` if a high contrast theme is active, `false` otherwise.
     *
     * **Deprecated:** Should use the new `nativeTheme.shouldUseHighContrastColors`
     * API.
     *
     * @deprecated
     * @platform darwin,win32
     */
    fun isHighContrastColorScheme(): Boolean

    /**
     * `true` if an inverted color scheme (a high contrast color scheme with light text
     * and dark backgrounds) is active, `false` otherwise.
     *
     * **Deprecated:** Should use the new `nativeTheme.shouldUseInvertedColorScheme`
     * API.
     *
     * @deprecated
     * @platform win32
     */
    fun isInvertedColorScheme(): Boolean

    /**
     * Whether the Swipe between pages setting is on.
     *
     * @platform darwin
     */
    fun isSwipeTrackingFromScrollEventsEnabled(): Boolean

    /**
     * `true` if the current process is a trusted accessibility client and `false` if
     * it is not.
     *
     * @platform darwin
     */
    fun isTrustedAccessibilityClient(prompt: Boolean): Boolean

    /**
     * Posts `event` as native notifications of macOS. The `userInfo` is an Object that
     * contains the user information dictionary sent along with the notification.
     *
     * @platform darwin
     */
    fun postLocalNotification(event: String, userInfo: js.core.ReadonlyRecord<String, Any>): Unit

    /**
     * Posts `event` as native notifications of macOS. The `userInfo` is an Object that
     * contains the user information dictionary sent along with the notification.
     *
     * @platform darwin
     */
    fun postNotification(event: String, userInfo: js.core.ReadonlyRecord<String, Any>, deliverImmediately: Boolean = definedExternally): Unit

    /**
     * Posts `event` as native notifications of macOS. The `userInfo` is an Object that
     * contains the user information dictionary sent along with the notification.
     *
     * @platform darwin
     */
    fun postWorkspaceNotification(event: String, userInfo: js.core.ReadonlyRecord<String, Any>): Unit

    /**
     * resolves if the user has successfully authenticated with Touch ID.
     *
     * This API itself will not protect your user data; rather, it is a mechanism to
     * allow you to do so. Native apps will need to set Access Control Constants like
     * `kSecAccessControlUserPresence` on their keychain entry so that reading it would
     * auto-prompt for Touch ID biometric consent. This could be done with
     * `node-keytar`, such that one would store an encryption key with `node-keytar`
     * and only fetch it if `promptTouchID()` resolves.
     *
     * @platform darwin
     */
    fun promptTouchID(reason: String): Promise<Unit>

    /**
     * Add the specified defaults to your application's `NSUserDefaults`.
     *
     * @platform darwin
     */
    fun registerDefaults(defaults: js.core.ReadonlyRecord<String, Any /* (string) | (boolean) | (number) */>): Unit

    /**
     * Removes the `key` in `NSUserDefaults`. This can be used to restore the default
     * or global value of a `key` previously set with `setUserDefault`.
     *
     * @platform darwin
     */
    fun removeUserDefault(key: String): Unit

    /**
     * Sets the appearance setting for your application, this should override the
     * system default and override the value of `getEffectiveAppearance`.
     *
     * @deprecated
     * @platform darwin
     */
    fun setAppLevelAppearance(appearance: ((Temp2))): Unit

    fun setAppLevelAppearance(appearance: (Nothing?)): Unit

    /**
     * Set the value of `key` in `NSUserDefaults`.
     *
     * Note that `type` should match actual type of `value`. An exception is thrown if
     * they don't.
     *
     * Some popular `key` and `type`s are:
     *
     * * `ApplePressAndHoldEnabled`: `boolean`
     *
     * @platform darwin
     */
    fun setUserDefault(key: String, type: String, value: Any?): Unit

    /**
     * The ID of this subscription
     *
     * Same as `subscribeNotification`, but uses `NSNotificationCenter` for local
     * defaults. This is necessary for events such as
     * `NSUserDefaultsDidChangeNotification`.
     *
     * If `event` is null, the `NSNotificationCenter` doesn’t use it as criteria for
     * delivery to the observer. See docs for more information.
     *
     * @platform darwin
     */
    fun subscribeLocalNotification(event: (String), callback: (event: String, userInfo: js.core.ReadonlyRecord<String, Any>, `object`: String) -> Unit): Double

    fun subscribeLocalNotification(event: (Nothing?), callback: (event: String, userInfo: js.core.ReadonlyRecord<String, Any>, `object`: String) -> Unit): Double

    /**
     * The ID of this subscription
     *
     * Subscribes to native notifications of macOS, `callback` will be called with
     * `callback(event, userInfo)` when the corresponding `event` happens. The
     * `userInfo` is an Object that contains the user information dictionary sent along
     * with the notification. The `object` is the sender of the notification, and only
     * supports `NSString` values for now.
     *
     * The `id` of the subscriber is returned, which can be used to unsubscribe the
     * `event`.
     *
     * Under the hood this API subscribes to `NSDistributedNotificationCenter`, example
     * values of `event` are:
     *
     * * `AppleInterfaceThemeChangedNotification`
     * * `AppleAquaColorVariantChanged`
     * * `AppleColorPreferencesChangedNotification`
     * * `AppleShowScrollBarsSettingChanged`
     *
     * If `event` is null, the `NSDistributedNotificationCenter` doesn’t use it as
     * criteria for delivery to the observer. See docs  for more information.
     *
     * @platform darwin
     */
    fun subscribeNotification(event: (String), callback: (event: String, userInfo: js.core.ReadonlyRecord<String, Any>, `object`: String) -> Unit): Double

    fun subscribeNotification(event: (Nothing?), callback: (event: String, userInfo: js.core.ReadonlyRecord<String, Any>, `object`: String) -> Unit): Double

    /**
     * The ID of this subscription
     *
     * Same as `subscribeNotification`, but uses
     * `NSWorkspace.sharedWorkspace.notificationCenter`. This is necessary for events
     * such as `NSWorkspaceDidActivateApplicationNotification`.
     *
     * If `event` is null, the `NSWorkspaceNotificationCenter` doesn’t use it as
     * criteria for delivery to the observer. See docs for more information.
     *
     * @platform darwin
     */
    fun subscribeWorkspaceNotification(event: (String), callback: (event: String, userInfo: js.core.ReadonlyRecord<String, Any>, `object`: String) -> Unit): Double

    fun subscribeWorkspaceNotification(event: (Nothing?), callback: (event: String, userInfo: js.core.ReadonlyRecord<String, Any>, `object`: String) -> Unit): Double

    /**
     * Same as `unsubscribeNotification`, but removes the subscriber from
     * `NSNotificationCenter`.
     *
     * @platform darwin
     */
    fun unsubscribeLocalNotification(id: Double): Unit

    /**
     * Removes the subscriber with `id`.
     *
     * @platform darwin
     */
    fun unsubscribeNotification(id: Double): Unit

    /**
     * Same as `unsubscribeNotification`, but removes the subscriber from
     * `NSWorkspace.sharedWorkspace.notificationCenter`.
     *
     * @platform darwin
     */
    fun unsubscribeWorkspaceNotification(id: Double): Unit

    /**
     * A `string` property that can be `dark`, `light` or `unknown`. It determines the
     * macOS appearance setting for your application. This maps to values in:
     * NSApplication.appearance. Setting this will override the system default as well
     * as the value of `getEffectiveAppearance`.
     *
     * Possible values that can be set are `dark` and `light`, and possible return
     * values are `dark`, `light`, and `unknown`.
     *
     * This property is only available on macOS 10.14 Mojave or newer.
     *
     * @platform darwin
     */
    var appLevelAppearance: (SystemPreferencesAppLevelAppearance)

    /**
     * A `string` property that can be `dark`, `light` or `unknown`.
     *
     * Returns the macOS appearance setting that is currently applied to your
     * application, maps to NSApplication.effectiveAppearance
     *
     * @platform darwin
     */
    val effectiveAppearance: (SystemPreferencesEffectiveAppearance)
}
