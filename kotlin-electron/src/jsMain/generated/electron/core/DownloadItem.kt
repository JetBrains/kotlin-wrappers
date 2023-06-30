@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.events.EventEmitter as NodeEventEmitter


external class DownloadItem : NodeEventEmitter {
// Docs: https://electronjs.org/docs/api/download-item
    /**
     * Emitted when the download is in a terminal state. This includes a completed
     * download, a cancelled download (via `downloadItem.cancel()`), and interrupted
     * download that can't be resumed.
     *
     * The `state` can be one of following:
     *
     * * `completed` - The download completed successfully.
     * * `cancelled` - The download has been cancelled.
     * * `interrupted` - The download has interrupted and can not resume.
     */
    fun on(
        event: DownloadItemEvent.DONE, listener: (
            event: Event,
            /**
             * Can be `completed`, `cancelled` or `interrupted`.
             */
            state: (DownloadItemOnListenerState)
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when the download has been updated and is not done.
     *
     * The `state` can be one of following:
     *
     * * `progressing` - The download is in-progress.
     * * `interrupted` - The download has interrupted and can be resumed.
     */
    fun on(
        event: DownloadItemEvent.UPDATED, listener: (
            event: Event,
            /**
             * Can be `progressing` or `interrupted`.
             */
            state: (DownloadItemOnListenerState)
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: DownloadItemEvent.DONE, listener: (
            event: Event,
            /**
             * Can be `completed`, `cancelled` or `interrupted`.
             */
            state: (DownloadItemOnceListenerState)
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: DownloadItemEvent.UPDATED, listener: (
            event: Event,
            /**
             * Can be `progressing` or `interrupted`.
             */
            state: (DownloadItemOnceListenerState)
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: DownloadItemEvent.DONE, listener: (
            event: Event,
            /**
             * Can be `completed`, `cancelled` or `interrupted`.
             */
            state: (DownloadItemAddListenerListenerState)
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: DownloadItemEvent.UPDATED, listener: (
            event: Event,
            /**
             * Can be `progressing` or `interrupted`.
             */
            state: (DownloadItemAddListenerListenerState)
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: DownloadItemEvent.DONE, listener: (
            event: Event,
            /**
             * Can be `completed`, `cancelled` or `interrupted`.
             */
            state: (DownloadItemRemoveListenerListenerState)
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: DownloadItemEvent.UPDATED, listener: (
            event: Event,
            /**
             * Can be `progressing` or `interrupted`.
             */
            state: (DownloadItemRemoveListenerListenerState)
        ) -> Unit
    ): Unit /* this */

    /**
     * Cancels the download operation.
     */
    fun cancel(): Unit

    /**
     * Whether the download can resume.
     */
    fun canResume(): Boolean

    /**
     * The Content-Disposition field from the response header.
     */
    fun getContentDisposition(): String

    /**
     * ETag header value.
     */
    fun getETag(): String

    /**
     * The file name of the download item.
     *
     * **Note:** The file name is not always the same as the actual one saved in local
     * disk. If user changes the file name in a prompted download saving dialog, the
     * actual name of saved file will be different.
     */
    fun getFilename(): String

    /**
     * Last-Modified header value.
     */
    fun getLastModifiedTime(): String

    /**
     * The files mime type.
     */
    fun getMimeType(): String

    /**
     * The received bytes of the download item.
     */
    fun getReceivedBytes(): Double

    /**
     * Returns the object previously set by
     * `downloadItem.setSaveDialogOptions(options)`.
     */
    fun getSaveDialogOptions(): SaveDialogOptions

    /**
     * The save path of the download item. This will be either the path set via
     * `downloadItem.setSavePath(path)` or the path selected from the shown save
     * dialog.
     */
    fun getSavePath(): String

    /**
     * Number of seconds since the UNIX epoch when the download was started.
     */
    fun getStartTime(): Double

    /**
     * The current state. Can be `progressing`, `completed`, `cancelled` or
     * `interrupted`.
     *
     * **Note:** The following methods are useful specifically to resume a `cancelled`
     * item when session is restarted.
     */
    fun getState(): (DownloadItemGetStateResult)

    /**
     * The total size in bytes of the download item.
     *
     * If the size is unknown, it returns 0.
     */
    fun getTotalBytes(): Double

    /**
     * The origin URL where the item is downloaded from.
     */
    fun getURL(): String

    /**
     * The complete URL chain of the item including any redirects.
     */
    fun getURLChain(): js.core.ReadonlyArray<String>

    /**
     * Whether the download has user gesture.
     */
    fun hasUserGesture(): Boolean

    /**
     * Whether the download is paused.
     */
    fun isPaused(): Boolean

    /**
     * Pauses the download.
     */
    fun pause(): Unit

    /**
     * Resumes the download that has been paused.
     *
     * **Note:** To enable resumable downloads the server you are downloading from must
     * support range requests and provide both `Last-Modified` and `ETag` header
     * values. Otherwise `resume()` will dismiss previously received bytes and restart
     * the download from the beginning.
     */
    fun resume(): Unit

    /**
     * This API allows the user to set custom options for the save dialog that opens
     * for the download item by default. The API is only available in session's
     * `will-download` callback function.
     */
    fun setSaveDialogOptions(options: SaveDialogOptions): Unit

    /**
     * The API is only available in session's `will-download` callback function. If
     * `path` doesn't exist, Electron will try to make the directory recursively. If
     * user doesn't set the save path via the API, Electron will use the original
     * routine to determine the save path; this usually prompts a save dialog.
     */
    fun setSavePath(path: String): Unit

    /**
     * A `string` property that determines the save file path of the download item.
     *
     * The property is only available in session's `will-download` callback function.
     * If user doesn't set the save path via the property, Electron will use the
     * original routine to determine the save path; this usually prompts a save dialog.
     */
    var savePath: String
}
