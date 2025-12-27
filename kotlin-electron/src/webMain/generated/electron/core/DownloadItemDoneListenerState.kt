// Automatically generated - do not modify!

package electron.core

sealed external interface DownloadItemDoneListenerState {
    companion object {
        @seskar.js.JsValue("completed")
        val completed: DownloadItemDoneListenerState

        @seskar.js.JsValue("cancelled")
        val cancelled: DownloadItemDoneListenerState

        @seskar.js.JsValue("interrupted")
        val interrupted: DownloadItemDoneListenerState
    }
}
