// Generated by Karakum - do not modify it manually!

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

    /**
     * Emitted when the download has been updated and is not done.
     *
     * The `state` can be one of following:
     *
     * * `progressing` - The download is in-progress.
     * * `interrupted` - The download has interrupted and can be resumed.
     */


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
     * The current download speed in bytes per second.
     */
    fun getCurrentBytesPerSecond(): Double

    /**
     * Number of seconds since the UNIX epoch when the download ended.
     */
    fun getEndTime(): Double

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
     * The download completion in percent.
     */
    fun getPercentComplete(): Double

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
    fun getURLChain(): js.array.ReadonlyArray<String>

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

    @web.events.JsEvent("done")
    val doneEvent: node.events.EventInstance<js.array.JsTuple2<Event<*>, (DownloadItemDoneListenerState)>>

    @web.events.JsEvent("updated")
    val updatedEvent: node.events.EventInstance<js.array.JsTuple2<Event<*>, (DownloadItemUpdatedListenerState)>>
}
