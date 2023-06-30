package electron.core


external interface SystemMemoryInfo {
    /**
     * The total amount of physical memory in Kilobytes available to the system.
     */
    var total: Double

    /**
     * The total amount of memory not being used by applications or disk cache.
     */
    var free: Double

    /**
     * The total amount of swap memory in Kilobytes available to the system.
     *
     * @platform win32,linux
     */
    var swapTotal: Double

    /**
     * The free amount of swap memory in Kilobytes available to the system.
     *
     * @platform win32,linux
     */
    var swapFree: Double
}
