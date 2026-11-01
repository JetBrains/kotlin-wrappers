// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
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
     * The kernel's estimate of the amount of memory available for allocation without
     * swapping, from `/proc/meminfo` `MemAvailable`. Use this as the memory pressure
     * signal on Linux; `free` there is `MemFree`, which excludes page cache and other
     * reclaimable memory.
     *
     * @platform linux
     */
    var available: Double

    /**
     * The amount of memory that currently has been paged out to storage. Includes
     * memory for file caches, network buffers, and other system services.
     *
     * @platform darwin
     */
    var fileBacked: Double

    /**
     * The amount of memory that is marked as "purgeable". The system can reclaim it if
     * memory pressure increases.
     *
     * @platform darwin
     */
    var purgeable: Double

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
