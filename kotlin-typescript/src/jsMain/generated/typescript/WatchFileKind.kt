// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

sealed external interface WatchFileKind {
    companion object {
        val FixedPollingInterval: WatchFileKind
        val PriorityPollingInterval: WatchFileKind
        val DynamicPriorityPolling: WatchFileKind
        val FixedChunkSizePolling: WatchFileKind
        val UseFsEvents: WatchFileKind
        val UseFsEventsOnParentDirectory: WatchFileKind
    }
}
