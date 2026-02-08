// Automatically generated - do not modify!

package electron.core

sealed external interface DownloadItemGetStateResult {
    companion object
}

inline val DownloadItemGetStateResult.Companion.progressing: DownloadItemGetStateResult
    get() = js.reflect.unsafeCast("progressing")

inline val DownloadItemGetStateResult.Companion.completed: DownloadItemGetStateResult
    get() = js.reflect.unsafeCast("completed")

inline val DownloadItemGetStateResult.Companion.cancelled: DownloadItemGetStateResult
    get() = js.reflect.unsafeCast("cancelled")

inline val DownloadItemGetStateResult.Companion.interrupted: DownloadItemGetStateResult
    get() = js.reflect.unsafeCast("interrupted")
