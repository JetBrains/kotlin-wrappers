package electron


external interface CPUUsage {
// Docs: https://electronjs.org/docs/api/structures/cpu-usage
    /**
     * The number of average idle CPU wakeups per second since the last call to
     * getCPUUsage. First call returns 0. Will always return 0 on Windows.
     */
    var idleWakeupsPerSecond: Double

    /**
     * Percentage of CPU used since the last call to getCPUUsage. First call returns 0.
     */
    var percentCPUUsage: Double
}
