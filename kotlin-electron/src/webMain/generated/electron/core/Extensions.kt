// Automatically generated - do not modify!

@file:JsModule("INTERNAL_ENTITY")

package electron.core

import js.promise.Promise
import node.events.EventEmitter as NodeEventEmitter

external class Extensions : NodeEventEmitter {
// Docs: https://electronjs.org/docs/api/extensions-api
    /**
     * Emitted after an extension is loaded. This occurs whenever an extension is added
     * to the "enabled" set of extensions. This includes:
     *
     * * Extensions being loaded from `Extensions.loadExtension`.
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
     * A list of all loaded extensions.
     *
     * > [!NOTE] This API cannot be called before the `ready` event of the `app` module
     * is emitted.
     */
    fun getAllExtensions(): js.array.ReadonlyArray<Extension>

    /**
     * The loaded extension with the given ID.
     *
     * > [!NOTE] This API cannot be called before the `ready` event of the `app` module
     * is emitted.
     */
    fun getExtension(extensionId: String): Extension?

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
     */
    fun loadExtension(
        path: String,
        options: LoadExtensionOptions = definedExternally,
    ): Promise<Extension>

    /**
     * Unloads an extension.
     *
     * > [!NOTE] This API cannot be called before the `ready` event of the `app` module
     * is emitted.
     */
    fun removeExtension(extensionId: String)

    @web.events.JsEvent("extension-loaded")
    val extensionLoadedEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, Extension>>

    @web.events.JsEvent("extension-ready")
    val extensionReadyEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, Extension>>

    @web.events.JsEvent("extension-unloaded")
    val extensionUnloadedEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, Extension>>
}
