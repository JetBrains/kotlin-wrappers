// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

external class UploadProgress {
    var contentLength: Number
    var sentBytes: Number
    var startTime: Number
    var displayedComplete: Boolean
    var timeoutHandle: web.timers.Timeout?

    constructor(contentLength: Number)

    /**
     * Sets the number of bytes sent
     *
     * @param sentBytes the number of bytes sent
     */
    fun setSentBytes(sentBytes: Number)

    /**
     * Returns the total number of bytes transferred.
     */
    fun getTransferredBytes(): Number

    /**
     * Returns true if the upload is complete.
     */
    fun isDone(): Boolean

    /**
     * Prints the current upload stats. Once the upload completes, this will print one
     * last line and then stop.
     */
    fun display()

    /**
     * Returns a function used to handle TransferProgressEvents.
     */
    fun onProgress(): (progress: TransferProgressEvent) -> Unit

    /**
     * Starts the timer that displays the stats.
     *
     * @param delayInMs the delay between each write
     */
    fun startDisplayTimer(delayInMs: Number = definedExternally)

    /**
     * Stops the timer that displays the stats. As this typically indicates the upload
     * is complete, this will display one last line, unless the last line has already
     * been written.
     */
    fun stopDisplayTimer()
}
