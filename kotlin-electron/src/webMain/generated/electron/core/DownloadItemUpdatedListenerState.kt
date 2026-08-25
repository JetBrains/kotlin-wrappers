// Automatically generated - do not modify!

package electron.core

@js.union.JsUnion
sealed external interface DownloadItemUpdatedListenerState

inline val DownloadItemUpdatedListenerState.Companion.progressing: DownloadItemUpdatedListenerState
    get() = js.reflect.unsafeCast("progressing")

inline val DownloadItemUpdatedListenerState.Companion.interrupted: DownloadItemUpdatedListenerState
    get() = js.reflect.unsafeCast("interrupted")
