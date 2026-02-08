// Automatically generated - do not modify!

package electron.core

sealed external interface DownloadItemDoneListenerState {
    companion object
}

inline val DownloadItemDoneListenerState.Companion.completed: DownloadItemDoneListenerState
    get() = js.reflect.unsafeCast("completed")

inline val DownloadItemDoneListenerState.Companion.cancelled: DownloadItemDoneListenerState
    get() = js.reflect.unsafeCast("cancelled")

inline val DownloadItemDoneListenerState.Companion.interrupted: DownloadItemDoneListenerState
    get() = js.reflect.unsafeCast("interrupted")
