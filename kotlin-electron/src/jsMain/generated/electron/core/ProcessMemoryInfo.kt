package electron.core


external interface ProcessMemoryInfo {
// Docs: https://electronjs.org/docs/api/structures/process-memory-info
    /**
     * The amount of memory not shared by other processes, such as JS heap or HTML
     * content in Kilobytes.
     */
    var private: Double

    /**
     * The amount of memory currently pinned to actual physical RAM in Kilobytes.
     *
     * @platform linux,win32
     */
    var residentSet: Double

    /**
     * The amount of memory shared between processes, typically memory consumed by the
     * Electron code itself in Kilobytes.
     */
    var shared: Double
}
