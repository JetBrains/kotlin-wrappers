// Automatically generated - do not modify!

package node.v8

sealed external interface GCProfilerResultStatisticsItem {
    var gcType: String
    var cost: Double
    var beforeGC: GCProfilerResultStatisticsItemBeforeGC
    var afterGC: GCProfilerResultStatisticsItemAfterGC
}
