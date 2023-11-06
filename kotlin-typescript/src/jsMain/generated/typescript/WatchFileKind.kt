// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsUnion

@JsUnion
sealed external interface WatchFileKind {
    companion object {
        @JsIntValue(0)
        val FixedPollingInterval: WatchFileKind

        @JsIntValue(1)
        val PriorityPollingInterval: WatchFileKind

        @JsIntValue(2)
        val DynamicPriorityPolling: WatchFileKind

        @JsIntValue(3)
        val FixedChunkSizePolling: WatchFileKind

        @JsIntValue(4)
        val UseFsEvents: WatchFileKind

        @JsIntValue(5)
        val UseFsEventsOnParentDirectory: WatchFileKind
    }
}
