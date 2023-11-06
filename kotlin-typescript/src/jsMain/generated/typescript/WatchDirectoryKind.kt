// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsUnion

@JsUnion
sealed external interface WatchDirectoryKind {
    companion object {
        @JsIntValue(0)
        val UseFsEvents: WatchDirectoryKind

        @JsIntValue(1)
        val FixedPollingInterval: WatchDirectoryKind

        @JsIntValue(2)
        val DynamicPriorityPolling: WatchDirectoryKind

        @JsIntValue(3)
        val FixedChunkSizePolling: WatchDirectoryKind
    }
}
