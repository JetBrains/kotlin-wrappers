// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

// language=JavaScript
@JsName("""(/*union*/{FixedPollingInterval: 0, PriorityPollingInterval: 1, DynamicPriorityPolling: 2, FixedChunkSizePolling: 3, UseFsEvents: 4, UseFsEventsOnParentDirectory: 5}/*union*/)""")
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
