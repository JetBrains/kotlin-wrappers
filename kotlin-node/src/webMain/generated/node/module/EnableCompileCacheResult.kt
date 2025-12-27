// Automatically generated - do not modify!

package node.module

sealed external interface EnableCompileCacheResult {
    /**
     * One of the {@link constants.compileCacheStatus}
     */
    var status: Double

    /**
     * If Node.js cannot enable the compile cache, this contains
     * the error message. Only set if `status` is `module.constants.compileCacheStatus.FAILED`.
     */
    var message: String?

    /**
     * If the compile cache is enabled, this contains the directory
     * where the compile cache is stored. Only set if  `status` is
     * `module.constants.compileCacheStatus.ENABLED` or
     * `module.constants.compileCacheStatus.ALREADY_ENABLED`.
     */
    var directory: String?
}
