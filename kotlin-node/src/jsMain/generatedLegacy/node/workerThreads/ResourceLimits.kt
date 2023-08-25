// Automatically generated - do not modify!

package node.workerThreads

sealed external interface ResourceLimits {
    /**
     * The maximum size of a heap space for recently created objects.
     */
    var maxYoungGenerationSizeMb: Number?

    /**
     * The maximum size of the main heap in MB.
     */
    var maxOldGenerationSizeMb: Number?

    /**
     * The size of a pre-allocated memory range used for generated code.
     */
    var codeRangeSizeMb: Number?

    /**
     * The default maximum stack size for the thread. Small values may lead to unusable Worker instances.
     * @default 4
     */
    var stackSizeMb: Number?
}
