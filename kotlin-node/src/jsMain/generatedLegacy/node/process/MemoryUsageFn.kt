// Automatically generated - do not modify!

package node.process

sealed external interface MemoryUsageFn {
    /**
     * The `process.memoryUsage()` method iterate over each page to gather informations about memory
     * usage which can be slow depending on the program memory allocations.
     */
    fun  /* native */ invoke(): MemoryUsage

    /**
     * method returns an integer representing the Resident Set Size (RSS) in bytes.
     */
    fun rss(): Number
}
