package electron.core


external interface HeapStatistics {
    var totalHeapSize: Double
    var totalHeapSizeExecutable: Double
    var totalPhysicalSize: Double
    var totalAvailableSize: Double
    var usedHeapSize: Double
    var heapSizeLimit: Double
    var mallocedMemory: Double
    var peakMallocedMemory: Double
    var doesZapGarbage: Boolean
}
