// Automatically generated - do not modify!

@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.buffer.Buffer
import node.events.EventEmitter as NodeEventEmitter

external class Session : NodeEventEmitter {
    /**
     * Emitted after an extension is loaded. This occurs whenever an extension is added
     * to the "enabled" set of extensions. This includes:
     *
     * * Extensions being loaded from `Session.loadExtension`.
     * * Extensions being reloaded:
     *   * from a crash.
     *   * if the extension requested it (`chrome.runtime.reload()`).
     */

    /**
     * Emitted after an extension is loaded and all necessary browser state is
     * initialized to support the start of the extension's background page.
     */

    /**
     * Emitted after an extension is unloaded. This occurs when
     * `Session.removeExtension` is called.
     */

    /**
     * Emitted after `navigator.hid.requestDevice` has been called and
     * `select-hid-device` has fired if a new device becomes available before the
     * callback from `select-hid-device` is called.  This event is intended for use
     * when using a UI to ask users to pick a device so that the UI can be updated with
     * the newly added device.
     */

    /**
     * Emitted after `navigator.hid.requestDevice` has been called and
     * `select-hid-device` has fired if a device has been removed before the callback
     * from `select-hid-device` is called.  This event is intended for use when using a
     * UI to ask users to pick a device so that the UI can be updated to remove the
     * specified device.
     */

    /**
     * Emitted after `HIDDevice.forget()` has been called.  This event can be used to
     * help maintain persistent storage of permissions when
     * `setDevicePermissionHandler` is used.
     */

    /**
     * Emitted when a render process requests preconnection to a URL, generally due to
     * a resource hint.
     */

    /**
     * Emitted when a HID device needs to be selected when a call to
     * `navigator.hid.requestDevice` is made. `callback` should be called with
     * `deviceId` to be selected; passing no arguments to `callback` will cancel the
     * request.  Additionally, permissioning on `navigator.hid` can be further managed
     * by using `ses.setPermissionCheckHandler(handler)` and
     * `ses.setDevicePermissionHandler(handler)`.
     */

    /**
     * Emitted when a serial port needs to be selected when a call to
     * `navigator.serial.requestPort` is made. `callback` should be called with
     * `portId` to be selected, passing an empty string to `callback` will cancel the
     * request.  Additionally, permissioning on `navigator.serial` can be managed by
     * using ses.setPermissionCheckHandler(handler) with the `serial` permission.
     */

    /**
     * Emitted when a USB device needs to be selected when a call to
     * `navigator.usb.requestDevice` is made. `callback` should be called with
     * `deviceId` to be selected; passing no arguments to `callback` will cancel the
     * request.  Additionally, permissioning on `navigator.usb` can be further managed
     * by using `ses.setPermissionCheckHandler(handler)` and
     * `ses.setDevicePermissionHandler(handler)`.
     */

    /**
     * Emitted after `navigator.serial.requestPort` has been called and
     * `select-serial-port` has fired if a new serial port becomes available before the
     * callback from `select-serial-port` is called.  This event is intended for use
     * when using a UI to ask users to pick a port so that the UI can be updated with
     * the newly added port.
     */

    /**
     * Emitted after `navigator.serial.requestPort` has been called and
     * `select-serial-port` has fired if a serial port has been removed before the
     * callback from `select-serial-port` is called.  This event is intended for use
     * when using a UI to ask users to pick a port so that the UI can be updated to
     * remove the specified port.
     */

    /**
     * Emitted after `SerialPort.forget()` has been called.  This event can be used to
     * help maintain persistent storage of permissions when
     * `setDevicePermissionHandler` is used.
     */

    /**
     * Emitted when a hunspell dictionary file starts downloading
     */

    /**
     * Emitted when a hunspell dictionary file download fails.  For details on the
     * failure you should collect a netlog and inspect the download request.
     */

    /**
     * Emitted when a hunspell dictionary file has been successfully downloaded
     */

    /**
     * Emitted when a hunspell dictionary file has been successfully initialized. This
     * occurs after the file has been downloaded.
     */

    /**
     * Emitted after `navigator.usb.requestDevice` has been called and
     * `select-usb-device` has fired if a new device becomes available before the
     * callback from `select-usb-device` is called.  This event is intended for use
     * when using a UI to ask users to pick a device so that the UI can be updated with
     * the newly added device.
     */

    /**
     * Emitted after `navigator.usb.requestDevice` has been called and
     * `select-usb-device` has fired if a device has been removed before the callback
     * from `select-usb-device` is called.  This event is intended for use when using a
     * UI to ask users to pick a device so that the UI can be updated to remove the
     * specified device.
     */

    /**
     * Emitted after `USBDevice.forget()` has been called.  This event can be used to
     * help maintain persistent storage of permissions when
     * `setDevicePermissionHandler` is used.
     */

    /**
     * Emitted when Electron is about to download `item` in `webContents`.
     *
     * Calling `event.preventDefault()` will cancel the download and `item` will not be
     * available from next tick of the process.
     */

    /**
     * Whether the word was successfully written to the custom dictionary. This API
     * will not work on non-persistent (in-memory) sessions.
     *
     * > [!NOTE] On macOS and Windows, this word will be written to the OS custom
     * dictionary as well.
     */
    fun addWordToSpellCheckerDictionary(word: String): Boolean

    /**
     * Dynamically sets whether to always send credentials for HTTP NTLM or Negotiate
     * authentication.
     */
    fun allowNTLMCredentialsForDomains(domains: String)

    /**
     * resolves when the session’s HTTP authentication cache has been cleared.
     */
    fun clearAuthCache(): js.promise.Promise<js.core.Void>

    /**
     * resolves when the cache clear operation is complete.
     *
     * Clears the session’s HTTP cache.
     */
    fun clearCache(): js.promise.Promise<js.core.Void>

    /**
     * resolves when the code cache clear operation is complete.
     */
    fun clearCodeCaches(options: ClearCodeCachesOptions): js.promise.Promise<js.core.Void>

    /**
     * resolves when all data has been cleared.
     *
     * Clears various different types of data.
     *
     * This method clears more types of data and is more thorough than the
     * `clearStorageData` method.
     *
     * > [!NOTE] Cookies are stored at a broader scope than origins. When removing
     * cookies and filtering by `origins` (or `excludeOrigins`), the cookies will be
     * removed at the registrable domain level. For example, clearing cookies for the
     * origin `https://really.specific.origin.example.com/` will end up clearing all
     * cookies for `example.com`. Clearing cookies for the origin
     * `https://my.website.example.co.uk/` will end up clearing all cookies for
     * `example.co.uk`.
     *
     * > [!NOTE] Clearing cache data will also clear the shared dictionary cache. This
     * means that any dictionaries used for compression may be reloaded after clearing
     * the cache. If you wish to clear the shared dictionary cache but leave other
     * cached data intact, you may want to use the `clearSharedDictionaryCache` method.
     *
     * For more information, refer to Chromium's `BrowsingDataRemover` interface.
     */
    fun clearData(options: ClearDataOptions = definedExternally): js.promise.Promise<js.core.Void>

    /**
     * Resolves when the operation is complete.
     *
     * Clears the host resolver cache.
     */
    fun clearHostResolverCache(): js.promise.Promise<js.core.Void>

    /**
     * resolves when the dictionary cache has been cleared, both in memory and on disk.
     */
    fun clearSharedDictionaryCache(): js.promise.Promise<js.core.Void>

    /**
     * resolves when the dictionary cache has been cleared for the specified isolation
     * key, both in memory and on disk.
     */
    fun clearSharedDictionaryCacheForIsolationKey(
        options: ClearSharedDictionaryCacheForIsolationKeyOptions,
    ): js.promise.Promise<js.core.Void>

    /**
     * resolves when the storage data has been cleared.
     */
    fun clearStorageData(options: ClearStorageDataOptions = definedExternally): js.promise.Promise<js.core.Void>

    /**
     * Resolves when all connections are closed.
     *
     * > [!NOTE] It will terminate / fail all requests currently in flight.
     */
    fun closeAllConnections(): js.promise.Promise<js.core.Void>

    /**
     * Allows resuming `cancelled` or `interrupted` downloads from previous `Session`.
     * The API will generate a DownloadItem that can be accessed with the will-download
     * event. The DownloadItem will not have any `WebContents` associated with it and
     * the initial state will be `interrupted`. The download will start only when the
     * `resume` API is called on the DownloadItem.
     */
    fun createInterruptedDownload(options: CreateInterruptedDownloadOptions)

    /**
     * Disables any network emulation already active for the `session`. Resets to the
     * original network configuration.
     */
    fun disableNetworkEmulation()

    /**
     * Initiates a download of the resource at `url`. The API will generate a
     * DownloadItem that can be accessed with the will-download event.
     *
     * > [!NOTE] This does not perform any security checks that relate to a page's
     * origin, unlike `webContents.downloadURL`.
     */
    fun downloadURL(
        url: String,
        options: DownloadURLOptions = definedExternally,
    )

    /**
     * Emulates network with the given configuration for the `session`.
     */
    fun enableNetworkEmulation(options: EnableNetworkEmulationOptions)

    /**
     * see Response.
     *
     * Sends a request, similarly to how `fetch()` works in the renderer, using
     * Chrome's network stack. This differs from Node's `fetch()`, which uses Node.js's
     * HTTP stack.
     *
     * Example:
     *
     * See also `net.fetch()`, a convenience method which issues requests from the
     * default session.
     *
     * See the MDN documentation for `fetch()` for more details.
     *
     * Limitations:
     *
     * * `net.fetch()` does not support the `data:` or `blob:` schemes.
     * * The value of the `integrity` option is ignored.
     * * The `.type` and `.url` values of the returned `Response` object are incorrect.
     *
     * By default, requests made with `net.fetch` can be made to custom protocols as
     * well as `file:`, and will trigger webRequest handlers if present. When the
     * non-standard `bypassCustomProtocolHandlers` option is set in RequestInit, custom
     * protocol handlers will not be called for this request. This allows forwarding an
     * intercepted request to the built-in handler. webRequest handlers will still be
     * triggered when bypassing custom protocols.
     */
    fun fetch(
        input: String,
        init: SessionFetchInit = definedExternally,
    ): js.promise.Promise<GlobalResponse>

    /**
     * see Response.
     *
     * Sends a request, similarly to how `fetch()` works in the renderer, using
     * Chrome's network stack. This differs from Node's `fetch()`, which uses Node.js's
     * HTTP stack.
     *
     * Example:
     *
     * See also `net.fetch()`, a convenience method which issues requests from the
     * default session.
     *
     * See the MDN documentation for `fetch()` for more details.
     *
     * Limitations:
     *
     * * `net.fetch()` does not support the `data:` or `blob:` schemes.
     * * The value of the `integrity` option is ignored.
     * * The `.type` and `.url` values of the returned `Response` object are incorrect.
     *
     * By default, requests made with `net.fetch` can be made to custom protocols as
     * well as `file:`, and will trigger webRequest handlers if present. When the
     * non-standard `bypassCustomProtocolHandlers` option is set in RequestInit, custom
     * protocol handlers will not be called for this request. This allows forwarding an
     * intercepted request to the built-in handler. webRequest handlers will still be
     * triggered when bypassing custom protocols.
     */
    fun fetch(
        input: GlobalRequest,
        init: SessionFetchInit = definedExternally,
    ): js.promise.Promise<GlobalResponse>

    /**
     * Writes any unwritten DOMStorage data to disk.
     */
    fun flushStorageData()

    /**
     * Resolves when the all internal states of proxy service is reset and the latest
     * proxy configuration is reapplied if it's already available. The pac script will
     * be fetched from `pacScript` again if the proxy mode is `pac_script`.
     */
    fun forceReloadProxyConfig(): js.promise.Promise<js.core.Void>

    /**
     * A list of all loaded extensions.
     *
     * > [!NOTE] This API cannot be called before the `ready` event of the `app` module
     * is emitted.
     *
     * **Deprecated:** Use the new `ses.extensions.getAllExtensions` API.
     *
     * @deprecated
     */
    fun getAllExtensions(): js.array.ReadonlyArray<Extension>

    /**
     * resolves with blob data.
     */
    fun getBlobData(identifier: String): js.promise.Promise<Buffer<*>>

    /**
     * the session's current cache size, in bytes.
     */
    fun getCacheSize(): js.promise.Promise<Double>

    /**
     * The loaded extension with the given ID.
     *
     * > [!NOTE] This API cannot be called before the `ready` event of the `app` module
     * is emitted.
     *
     * **Deprecated:** Use the new `ses.extensions.getExtension` API.
     *
     * @deprecated
     */
    fun getExtension(extensionId: String): Extension?

    /**
     * an array of paths to preload scripts that have been registered.
     *
     * **Deprecated:** Use the new `ses.getPreloadScripts` API. This will only return
     * preload script paths for `frame` context types.
     *
     * @deprecated
     */
    fun getPreloads(): js.array.ReadonlyArray<String>

    /**
     * An array of paths to preload scripts that have been registered.
     */
    fun getPreloadScripts(): js.array.ReadonlyArray<PreloadScript>

    /**
     * an array of shared dictionary information entries in Chromium's networking
     * service's storage.
     *
     * To get information about all present shared dictionaries, call
     * `getSharedDictionaryUsageInfo()`.
     */
    fun getSharedDictionaryInfo(
        options: SharedDictionaryInfoOptions,
    ): js.promise.Promise<js.array.ReadonlyArray<SharedDictionaryInfo>>

    /**
     * an array of shared dictionary information entries in Chromium's networking
     * service's storage.
     *
     * Shared dictionaries are used to power advanced compression of data sent over the
     * wire, specifically with Brotli and ZStandard. You don't need to call any of the
     * shared dictionary APIs in Electron to make use of this advanced web feature, but
     * if you do, they allow deeper control and inspection of the shared dictionaries
     * used during decompression.
     *
     * To get detailed information about a specific shared dictionary entry, call
     * `getSharedDictionaryInfo(options)`.
     */
    fun getSharedDictionaryUsageInfo(): js.promise.Promise<js.array.ReadonlyArray<SharedDictionaryUsageInfo>>

    /**
     * An array of language codes the spellchecker is enabled for.  If this list is
     * empty the spellchecker will fallback to using `en-US`.  By default on launch if
     * this setting is an empty list Electron will try to populate this setting with
     * the current OS locale.  This setting is persisted across restarts.
     *
     * > [!NOTE] On macOS, the OS spellchecker is used and has its own list of
     * languages. On macOS, this API will return whichever languages have been
     * configured by the OS.
     */
    fun getSpellCheckerLanguages(): js.array.ReadonlyArray<String>

    /**
     * The absolute file system path where data for this session is persisted on disk.
     * For in memory sessions this returns `null`.
     */
    fun getStoragePath(): String?

    /**
     * The user agent for this session.
     */
    fun getUserAgent(): String

    /**
     * Whether or not this session is a persistent one. The default `webContents`
     * session of a `BrowserWindow` is persistent. When creating a session from a
     * partition, session prefixed with `persist:` will be persistent, while others
     * will be temporary.
     */
    fun isPersistent(): Boolean

    /**
     * Whether the builtin spell checker is enabled.
     */
    fun isSpellCheckerEnabled(): Boolean

    /**
     * An array of all words in app's custom dictionary. Resolves when the full
     * dictionary is loaded from disk.
     */
    fun listWordsInSpellCheckerDictionary(): js.promise.Promise<js.array.ReadonlyArray<String>>

    /**
     * resolves when the extension is loaded.
     *
     * This method will raise an exception if the extension could not be loaded. If
     * there are warnings when installing the extension (e.g. if the extension requests
     * an API that Electron does not support) then they will be logged to the console.
     *
     * Note that Electron does not support the full range of Chrome extensions APIs.
     * See Supported Extensions APIs for more details on what is supported.
     *
     * Note that in previous versions of Electron, extensions that were loaded would be
     * remembered for future runs of the application. This is no longer the case:
     * `loadExtension` must be called on every boot of your app if you want the
     * extension to be loaded.
     *
     * This API does not support loading packed (.crx) extensions.
     *
     * > [!NOTE] This API cannot be called before the `ready` event of the `app` module
     * is emitted.
     *
     * > [!NOTE] Loading extensions into in-memory (non-persistent) sessions is not
     * supported and will throw an error.
     *
     * **Deprecated:** Use the new `ses.extensions.loadExtension` API.
     *
     * @deprecated
     */
    fun loadExtension(
        path: String,
        options: LoadExtensionOptions = definedExternally,
    ): js.promise.Promise<Extension>

    /**
     * Preconnects the given number of sockets to an origin.
     */
    fun preconnect(options: PreconnectOptions)

    /**
     * Registers preload script that will be executed in its associated context type in
     * this session. For `frame` contexts, this will run prior to any preload defined
     * in the web preferences of a WebContents.
     *
     * The ID of the registered preload script.
     */
    fun registerPreloadScript(script: PreloadScriptRegistration): String

    /**
     * Unloads an extension.
     *
     * > [!NOTE] This API cannot be called before the `ready` event of the `app` module
     * is emitted.
     *
     * **Deprecated:** Use the new `ses.extensions.removeExtension` API.
     *
     * @deprecated
     */
    fun removeExtension(extensionId: String)

    /**
     * Whether the word was successfully removed from the custom dictionary. This API
     * will not work on non-persistent (in-memory) sessions.
     *
     * > [!NOTE] On macOS and Windows, this word will be removed from the OS custom
     * dictionary as well.
     */
    fun removeWordFromSpellCheckerDictionary(word: String): Boolean

    /**
     * Resolves with the resolved IP addresses for the `host`.
     */
    fun resolveHost(
        host: String,
        options: ResolveHostOptions = definedExternally,
    ): js.promise.Promise<ResolvedHost>

    /**
     * Resolves with the proxy information for `url`.
     */
    fun resolveProxy(url: String): js.promise.Promise<String>

    /**
     * Sets a handler to respond to Bluetooth pairing requests. This handler allows
     * developers to handle devices that require additional validation before pairing.
     * When a handler is not defined, any pairing on Linux or Windows that requires
     * additional validation will be automatically cancelled. macOS does not require a
     * handler because macOS handles the pairing automatically.  To clear the handler,
     * call `setBluetoothPairingHandler(null)`.
     *
     * @platform win32,linux
     */
    fun setBluetoothPairingHandler(
        handler: ((details: BluetoothPairingHandlerHandlerDetails, callback: (response: Response) -> Unit) -> Unit)?,
    )

    /**
     * Sets the certificate verify proc for `session`, the `proc` will be called with
     * `proc(request, callback)` whenever a server certificate verification is
     * requested. Calling `callback(0)` accepts the certificate, calling `callback(-2)`
     * rejects it.
     *
     * Calling `setCertificateVerifyProc(null)` will revert back to default certificate
     * verify proc.
     *
     * > **NOTE:** The result of this procedure is cached by the network service.
     */
    fun setCertificateVerifyProc(proc: ((request: Request, callback: (verificationResult: Double) -> Unit) -> Unit)?)

    /**
     * Sets the directory to store the generated JS code cache for this session. The
     * directory is not required to be created by the user before this call, the
     * runtime will create if it does not exist otherwise will use the existing
     * directory. If directory cannot be created, then code cache will not be used and
     * all operations related to code cache will fail silently inside the runtime. By
     * default, the directory will be `Code Cache` under the respective user data
     * folder.
     *
     * Note that by default code cache is only enabled for http(s) URLs, to enable code
     * cache for custom protocols, `codeCache: true` and `standard: true` must be
     * specified when registering the protocol.
     */
    fun setCodeCachePath(path: String)

    /**
     * Sets the handler which can be used to respond to device permission checks for
     * the `session`. Returning `true` will allow the device to be permitted and
     * `false` will reject it. To clear the handler, call
     * `setDevicePermissionHandler(null)`. This handler can be used to provide default
     * permissioning to devices without first calling for permission to devices (eg via
     * `navigator.hid.requestDevice`).  If this handler is not defined, the default
     * device permissions as granted through device selection (eg via
     * `navigator.hid.requestDevice`) will be used. Additionally, the default behavior
     * of Electron is to store granted device permission in memory. If longer term
     * storage is needed, a developer can store granted device permissions (eg when
     * handling the `select-hid-device` event) and then read from that storage with
     * `setDevicePermissionHandler`.
     */
    fun setDevicePermissionHandler(handler: ((details: DevicePermissionHandlerHandlerDetails) -> Boolean)?)

    /**
     * This handler will be called when web content requests access to display media
     * via the `navigator.mediaDevices.getDisplayMedia` API. Use the desktopCapturer
     * API to choose which stream(s) to grant access to.
     *
     * `useSystemPicker` allows an application to use the system picker instead of
     * providing a specific video source from `getSources`. This option is
     * experimental, and currently available for MacOS 15+ only. If the system picker
     * is available and `useSystemPicker` is set to `true`, the handler will not be
     * invoked.
     *
     * Passing a WebFrameMain object as a video or audio stream will capture the video
     * or audio stream from that frame.
     *
     * Passing `null` instead of a function resets the handler to its default state.
     */
    fun setDisplayMediaRequestHandler(
        handler: ((request: DisplayMediaRequestHandlerHandlerRequest, callback: (streams: Streams) -> Unit) -> Unit)?,
        opts: DisplayMediaRequestHandlerOpts = definedExternally,
    )

    /**
     * Sets download saving directory. By default, the download directory will be the
     * `Downloads` under the respective app folder.
     */
    fun setDownloadPath(path: String)

    /**
     * Sets the handler which can be used to respond to permission checks for the
     * `session`. Returning `true` will allow the permission and `false` will reject
     * it.  Please note that you must also implement `setPermissionRequestHandler` to
     * get complete permission handling. Most web APIs do a permission check and then
     * make a permission request if the check is denied. To clear the handler, call
     * `setPermissionCheckHandler(null)`.
     *
     * > [!NOTE] `isMainFrame` will always be `false` for a `fileSystem` request as a
     * result of Chromium limitations.
     */
    fun setPermissionCheckHandler(
        handler: (
            (
            webContents: WebContents?,
            permission: SessionSetPermissionCheckHandlerHandlerPermission,
            requestingOrigin: String,
            details: PermissionCheckHandlerHandlerDetails,
        ) -> Boolean
        )?,
    )

    /**
     * Sets the handler which can be used to respond to permission requests for the
     * `session`. Calling `callback(true)` will allow the permission and
     * `callback(false)` will reject it. To clear the handler, call
     * `setPermissionRequestHandler(null)`.  Please note that you must also implement
     * `setPermissionCheckHandler` to get complete permission handling. Most web APIs
     * do a permission check and then make a permission request if the check is denied.
     */
    fun setPermissionRequestHandler(
        handler: (
            (
            webContents: WebContents,
            permission: SessionSetPermissionRequestHandlerHandlerPermission,
            callback: (permissionGranted: Boolean) -> Unit,
            details: Any, // (PermissionRequest) | (FilesystemPermissionRequest) | (MediaAccessPermissionRequest) | (OpenExternalPermissionRequest)
        ) -> Unit
        )?,
    )

    /**
     * Adds scripts that will be executed on ALL web contents that are associated with
     * this session just before normal `preload` scripts run.
     *
     * **Deprecated:** Use the new `ses.registerPreloadScript` API.
     *
     * @deprecated
     */
    fun setPreloads(preloads: js.array.ReadonlyArray<String>)

    /**
     * Resolves when the proxy setting process is complete.
     *
     * Sets the proxy settings.
     *
     * You may need `ses.closeAllConnections` to close currently in flight connections
     * to prevent pooled sockets using previous proxy from being reused by future
     * requests.
     */
    fun setProxy(config: ProxyConfig): js.promise.Promise<js.core.Void>

    /**
     * By default Electron will download hunspell dictionaries from the Chromium CDN.
     * If you want to override this behavior you can use this API to point the
     * dictionary downloader at your own hosted version of the hunspell dictionaries.
     * We publish a `hunspell_dictionaries.zip` file with each release which contains
     * the files you need to host here.
     *
     * The file server must be **case insensitive**. If you cannot do this, you must
     * upload each file twice: once with the case it has in the ZIP file and once with
     * the filename as all lowercase.
     *
     * If the files present in `hunspell_dictionaries.zip` are available at
     * `https://example.com/dictionaries/language-code.bdic` then you should call this
     * api with
     * `ses.setSpellCheckerDictionaryDownloadURL('https://example.com/dictionaries/')`.
     *  Please note the trailing slash.  The URL to the dictionaries is formed as
     * `${url}${filename}`.
     *
     * > [!NOTE] On macOS, the OS spellchecker is used and therefore we do not download
     * any dictionary files. This API is a no-op on macOS.
     */
    fun setSpellCheckerDictionaryDownloadURL(url: String)

    /**
     * Sets whether to enable the builtin spell checker.
     */
    fun setSpellCheckerEnabled(enable: Boolean)

    /**
     * The built in spellchecker does not automatically detect what language a user is
     * typing in.  In order for the spell checker to correctly check their words you
     * must call this API with an array of language codes.  You can get the list of
     * supported language codes with the `ses.availableSpellCheckerLanguages` property.
     *
     * > [!NOTE] On macOS, the OS spellchecker is used and will detect your language
     * automatically. This API is a no-op on macOS.
     */
    fun setSpellCheckerLanguages(languages: js.array.ReadonlyArray<String>)

    /**
     * Sets the SSL configuration for the session. All subsequent network requests will
     * use the new configuration. Existing network connections (such as WebSocket
     * connections) will not be terminated, but old sockets in the pool will not be
     * reused for new connections.
     */
    fun setSSLConfig(config: Config)

    /**
     * Sets the handler which can be used to override which USB classes are protected.
     * The return value for the handler is a string array of USB classes which should
     * be considered protected (eg not available in the renderer).  Valid values for
     * the array are:
     *
     * * `audio`
     * * `audio-video`
     * * `hid`
     * * `mass-storage`
     * * `smart-card`
     * * `video`
     * * `wireless`
     *
     * Returning an empty string array from the handler will allow all USB classes;
     * returning the passed in array will maintain the default list of protected USB
     * classes (this is also the default behavior if a handler is not defined). To
     * clear the handler, call `setUSBProtectedClassesHandler(null)`.
     */
    fun setUSBProtectedClassesHandler(
        handler: ((details: USBProtectedClassesHandlerHandlerDetails) -> js.array.ReadonlyArray<String>)?,
    )

    /**
     * Overrides the `userAgent` and `acceptLanguages` for this session.
     *
     * The `acceptLanguages` must be a comma separated ordered list of language codes,
     * for example `"en-US,fr,de,ko,zh-CN,ja"`.
     *
     * This doesn't affect existing `WebContents`, and each `WebContents` can use
     * `webContents.setUserAgent` to override the session-wide user agent.
     */
    fun setUserAgent(
        userAgent: String,
        acceptLanguages: String = definedExternally,
    )

    /**
     * Unregisters script.
     */
    fun unregisterPreloadScript(id: String)

    /**
     * A `string[]` array which consists of all the known available spell checker
     * languages.  Providing a language code to the `setSpellCheckerLanguages` API that
     * isn't in this array will result in an error.
     *
     */
    val availableSpellCheckerLanguages: js.array.ReadonlyArray<String>

    /**
     * A `Cookies` object for this session.
     *
     */
    val cookies: Cookies

    /**
     * A `Extensions` object for this session.
     *
     */
    val extensions: Extensions

    /**
     * A `NetLog` object for this session.
     *
     */
    val netLog: NetLog

    /**
     * A `Protocol` object for this session.
     *
     */
    val protocol: Protocol

    /**
     * A `ServiceWorkers` object for this session.
     *
     */
    val serviceWorkers: ServiceWorkers

    /**
     * A `boolean` indicating whether builtin spell checker is enabled.
     */
    var spellCheckerEnabled: Boolean

    /**
     * A `string | null` indicating the absolute file system path where data for this
     * session is persisted on disk.  For in memory sessions this returns `null`.
     *
     */
    val storagePath: String?

    /**
     * A `WebRequest` object for this session.
     *
     */
    val webRequest: WebRequest

    @web.events.JsEvent("extension-loaded")
    val extensionLoadedEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, Extension>>

    @web.events.JsEvent("extension-ready")
    val extensionReadyEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, Extension>>

    @web.events.JsEvent("extension-unloaded")
    val extensionUnloadedEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, Extension>>

    @web.events.JsEvent("file-system-access-restricted")
    val fileSystemAccessRestrictedEvent:
            node.events.EventInstance<
                    js.array.Tuple3<
                            Event<*>,
                            FileSystemAccessRestrictedDetails,
                                (
                        action: SessionFileSystemAccessRestrictedListenerCallbackAction,
                    ) -> Unit
                            >
                    >

    @web.events.JsEvent("hid-device-added")
    val hidDeviceAddedEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, HidDeviceAddedDetails>>

    @web.events.JsEvent("hid-device-removed")
    val hidDeviceRemovedEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, HidDeviceRemovedDetails>>

    @web.events.JsEvent("hid-device-revoked")
    val hidDeviceRevokedEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, HidDeviceRevokedDetails>>

    @web.events.JsEvent("preconnect")
    val preconnectEvent: node.events.EventInstance<js.array.Tuple3<Event<*>, String, Boolean>>

    @web.events.JsEvent("select-hid-device")
    val selectHidDeviceEvent: node.events.EventInstance<
            js.array.Tuple3<
                    Event<*>,
                    SelectHidDeviceDetails,
                        (
                deviceId: String?, // use undefined for default
            ) -> Unit
                    >
            >

    @web.events.JsEvent("select-serial-port")
    val selectSerialPortEvent:
            node.events.EventInstance<
                    js.array.Tuple4<
                            Event<*>,
                            js.array.ReadonlyArray<SerialPort>,
                            WebContents,
                                (
                        portId: String,
                    ) -> Unit
                            >
                    >

    @web.events.JsEvent("select-usb-device")
    val selectUsbDeviceEvent: node.events.EventInstance<
            js.array.Tuple3<
                    Event<*>,
                    SelectUsbDeviceDetails,
                        (
                deviceId: String?, // use undefined for default
            ) -> Unit
                    >
            >

    @web.events.JsEvent("serial-port-added")
    val serialPortAddedEvent: node.events.EventInstance<js.array.Tuple3<Event<*>, SerialPort, WebContents>>

    @web.events.JsEvent("serial-port-removed")
    val serialPortRemovedEvent: node.events.EventInstance<js.array.Tuple3<Event<*>, SerialPort, WebContents>>

    @web.events.JsEvent("serial-port-revoked")
    val serialPortRevokedEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, SerialPortRevokedDetails>>

    @web.events.JsEvent("spellcheck-dictionary-download-begin")
    val spellcheckDictionaryDownloadBeginEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, String>>

    @web.events.JsEvent("spellcheck-dictionary-download-failure")
    val spellcheckDictionaryDownloadFailureEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, String>>

    @web.events.JsEvent("spellcheck-dictionary-download-success")
    val spellcheckDictionaryDownloadSuccessEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, String>>

    @web.events.JsEvent("spellcheck-dictionary-initialized")
    val spellcheckDictionaryInitializedEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, String>>

    @web.events.JsEvent("usb-device-added")
    val usbDeviceAddedEvent: node.events.EventInstance<js.array.Tuple3<Event<*>, USBDevice, WebContents>>

    @web.events.JsEvent("usb-device-removed")
    val usbDeviceRemovedEvent: node.events.EventInstance<js.array.Tuple3<Event<*>, USBDevice, WebContents>>

    @web.events.JsEvent("usb-device-revoked")
    val usbDeviceRevokedEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, UsbDeviceRevokedDetails>>

    @web.events.JsEvent("will-download")
    val willDownloadEvent: node.events.EventInstance<js.array.Tuple3<Event<*>, DownloadItem, WebContents>>

    companion object {
// Docs: https://electronjs.org/docs/api/session
        /**
         * A session instance from `partition` string. When there is an existing `Session`
         * with the same `partition`, it will be returned; otherwise a new `Session`
         * instance will be created with `options`.
         *
         * If `partition` starts with `persist:`, the page will use a persistent session
         * available to all pages in the app with the same `partition`. if there is no
         * `persist:` prefix, the page will use an in-memory session. If the `partition` is
         * empty then default session of the app will be returned.
         *
         * To create a `Session` with `options`, you have to ensure the `Session` with the
         * `partition` has never been used before. There is no way to change the `options`
         * of an existing `Session` object.
         */
        fun fromPartition(
            partition: String,
            options: FromPartitionOptions = definedExternally,
        ): Session

        /**
         * A session instance from the absolute path as specified by the `path` string.
         * When there is an existing `Session` with the same absolute path, it will be
         * returned; otherwise a new `Session` instance will be created with `options`. The
         * call will throw an error if the path is not an absolute path. Additionally, an
         * error will be thrown if an empty string is provided.
         *
         * To create a `Session` with `options`, you have to ensure the `Session` with the
         * `path` has never been used before. There is no way to change the `options` of an
         * existing `Session` object.
         */
        fun fromPath(
            path: String,
            options: FromPathOptions = definedExternally,
        ): Session

        /**
         * A `Session` object, the default session object of the app, available after
         * `app.whenReady` is called.
         */
        var defaultSession: Session
    }
}
