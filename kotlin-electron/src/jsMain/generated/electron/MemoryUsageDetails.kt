package electron


external interface MemoryUsageDetails {
    // Docs: https://electronjs.org/docs/api/structures/memory-usage-details
    var count: Double
    var liveSize: Double
    var size: Double
}
