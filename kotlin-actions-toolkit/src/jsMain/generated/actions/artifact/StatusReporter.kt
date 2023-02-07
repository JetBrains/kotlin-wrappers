// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

external class StatusReporter {
    constructor(displayFrequencyInMilliseconds: Number)

    fun setTotalNumberOfFilesToProcess(fileTotal: Number)
    fun start()
    fun updateLargeFileStatus(
        fileName: String,
        chunkStartIndex: Number,
        chunkEndIndex: Number,
        totalUploadFileSize: Number,
    )

    fun stop()
    fun incrementProcessedCount()
}
