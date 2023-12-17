// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package node.inspector

import node.events.EventType
import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface HeapProfilerEvent {
    companion object {
        @JsValue("HeapProfiler.addHeapSnapshotChunk")
        val ADD_HEAP_SNAPSHOT_CHUNK: ADD_HEAP_SNAPSHOT_CHUNK

        @JsValue("HeapProfiler.heapStatsUpdate")
        val HEAP_STATS_UPDATE: HEAP_STATS_UPDATE

        @JsValue("HeapProfiler.lastSeenObjectId")
        val LAST_SEEN_OBJECT_ID: LAST_SEEN_OBJECT_ID

        @JsValue("HeapProfiler.reportHeapSnapshotProgress")
        val REPORT_HEAP_SNAPSHOT_PROGRESS: REPORT_HEAP_SNAPSHOT_PROGRESS

        @JsValue("HeapProfiler.resetProfiles")
        val RESET_PROFILES: RESET_PROFILES
    }

    sealed interface ADD_HEAP_SNAPSHOT_CHUNK : EventType
    sealed interface HEAP_STATS_UPDATE : EventType
    sealed interface LAST_SEEN_OBJECT_ID : EventType
    sealed interface REPORT_HEAP_SNAPSHOT_PROGRESS : EventType
    sealed interface RESET_PROFILES : EventType
}
