// Automatically generated - do not modify!

package electron.core

@js.union.JsUnion
sealed external interface DownloadItemGetStateResult

inline val DownloadItemGetStateResult.Companion.progressing: DownloadItemGetStateResult
    get() = js.reflect.unsafeCast("progressing")

inline val DownloadItemGetStateResult.Companion.completed: DownloadItemGetStateResult
    get() = js.reflect.unsafeCast("completed")

inline val DownloadItemGetStateResult.Companion.cancelled: DownloadItemGetStateResult
    get() = js.reflect.unsafeCast("cancelled")

inline val DownloadItemGetStateResult.Companion.interrupted: DownloadItemGetStateResult
    get() = js.reflect.unsafeCast("interrupted")
