// Automatically generated - do not modify!

@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.events.EventEmitter as NodeEventEmitter

external class AppShimHost : NodeEventEmitter {
    /**
     * Bounces the shim's Dock icon, in the same way that `dock.bounce()` bounces your
     * app's.
     *
     * @experimental
     */
    fun bounce(type: AppShimHostBounceType = definedExternally)

    /**
     * Cancels a bounce started by `shim.bounce()`.
     *
     * @experimental
     */
    fun cancelBounce()

    /**
     * Whether the shim's process is still connected.
     *
     * @experimental
     */
    fun isConnected(): Boolean

    /**
     * Quits the shim's process and closes its windows. The windows do not emit `close`
     * events. They emit `closed` shortly after this method returns.
     * `shim.isConnected()` returns `false` as soon as this method returns.
     *
     * @experimental
     */
    fun quit()

    /**
     * Whether the code signature of the shim's process satisfies `requirement`. The
     * check is performed on the running process that connected, not on the bundle at
     * `shim.bundlePath`.
     *
     * Throws if `requirement` cannot be parsed.
     *
     * @experimental
     */
    fun satisfiesCodeRequirement(requirement: String): Boolean

    /**
     * Sets the menu bar that is shown while the shim is the active app. This is the
     * shim's equivalent of `Menu.setApplicationMenu()`. Passing `null` restores the
     * shim's minimal default menu.
     *
     * The `click` handlers of the menu's items and the menu's `menu-will-show` event
     * run in your app's main process. Items with a `role` act on the shim instead of
     * your app: for example, the `quit` role quits the shim. The default labels of the
     * `about`, `hide` and `quit` roles use the shim's name.
     *
     * The shim displays the menu's items as they were when this method was called.
     * Later changes to an item's `label`, `enabled`, `checked` or `visible` properties
     * are applied when the shim becomes the active app, when one of its menus is
     * opened, and after an item is clicked.
     *
     * @experimental
     */
    fun setApplicationMenu(menu: Menu?)

    /**
     * Sets the text displayed on the shim's Dock icon. An empty string clears it.
     *
     * @experimental
     */
    fun setBadge(text: String)

    /**
     * A `string` representing the bundle identifier from that bundle's `Info.plist`.
     * This value is not verified, so do not use it to decide whether to trust the
     * shim. Use `shim.satisfiesCodeRequirement()` instead.
     *
     * @experimental
     */
    val bundleId: String

    /**
     * A `string` representing the path of the app bundle that the shim's process was
     * launched from.
     *
     * @experimental
     */
    val bundlePath: String

    /**
     * A `number` representing the process ID of the shim.
     *
     * @experimental
     */
    val pid: Double

    @web.events.JsEvent("activate")
    val activateEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, Boolean>>

    @web.events.JsEvent("disconnected")
    val disconnectedEvent: node.events.EventInstance<js.array.Tuple1<Event<*>>>

    @web.events.JsEvent("open-file")
    val openFileEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, String>>

    @web.events.JsEvent("open-url")
    val openUrlEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, String>>

    @web.events.JsEvent("quit-requested")
    val quitRequestedEvent: node.events.EventInstance<js.array.Tuple1<Event<*>>>
}
