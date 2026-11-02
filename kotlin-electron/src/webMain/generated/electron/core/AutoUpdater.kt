// Automatically generated - do not modify!

package electron.core

@Suppress("INTERFACE_WITH_SUPERCLASS")
external interface AutoUpdater : node.events.EventEmitter {
    /**
     * Asks the server whether there is an update. You must call `setFeedURL` before
     * using this API.
     *
     * > [!NOTE] If an update is available it will be downloaded automatically. Calling
     * `autoUpdater.checkForUpdates()` twice will download the update two times.
     */
    fun checkForUpdates()

    /**
     * The current update feed URL.
     */
    fun getFeedURL(): String

    /**
     * Restarts the app and installs the update after it has been downloaded. It should
     * only be called after `update-downloaded` has been emitted.
     *
     * Under the hood calling `autoUpdater.quitAndInstall()` will close all application
     * windows first, and automatically call `app.quit()` after all windows have been
     * closed.
     *
     * > [!NOTE] It is not strictly necessary to call this function to apply an update,
     * as a successfully downloaded update will always be applied the next time the
     * application starts.
     */
    fun quitAndInstall()

    /**
     * Sets the `url` and initialize the auto updater.
     */
    fun setFeedURL(options: FeedURLOptions)

    @web.events.JsEvent("before-quit-for-update")
    val beforeQuitForUpdateEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("checking-for-update")
    val checkingForUpdateEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("error")
    val errorEvent: node.events.EventInstance<js.array.Tuple1<js.errors.JsError>>

    @web.events.JsEvent("update-available")
    val updateAvailableEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("update-downloaded")
    val updateDownloadedEvent:
            node.events.EventInstance<js.array.Tuple5<Event<*>, String, String, js.date.Date, String>>

    @web.events.JsEvent("update-not-available")
    val updateNotAvailableEvent: node.events.EventInstance<js.array.Tuple>
}
