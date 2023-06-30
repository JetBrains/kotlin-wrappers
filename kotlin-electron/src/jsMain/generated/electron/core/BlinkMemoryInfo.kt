package electron.core


external interface BlinkMemoryInfo {
    /**
     * Size of all allocated objects in Kilobytes.
     */
    var allocated: Double

    /**
     * Total allocated space in Kilobytes.
     */
    var total: Double
}
