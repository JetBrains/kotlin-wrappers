// Automatically generated - do not modify!

package typescript

import seskar.js.JsIntValue

sealed external interface PollingWatchKind {
    companion object {
        @JsIntValue(0)
        val FixedInterval: PollingWatchKind

        @JsIntValue(1)
        val PriorityInterval: PollingWatchKind

        @JsIntValue(2)
        val DynamicPriority: PollingWatchKind

        @JsIntValue(3)
        val FixedChunkSize: PollingWatchKind
    }
}
