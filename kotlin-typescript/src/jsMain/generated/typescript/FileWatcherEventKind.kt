// Automatically generated - do not modify!

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface FileWatcherEventKind {
    companion object {
        @JsIntValue(0)
        val Created: FileWatcherEventKind

        @JsIntValue(1)
        val Changed: FileWatcherEventKind

        @JsIntValue(2)
        val Deleted: FileWatcherEventKind
    }
}
