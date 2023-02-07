// Automatically generated - do not modify!

package typescript

/**
 * Cached resolutions per containing directory.
 * This assumes that any module id will have the same resolution for sibling files located in the same folder.
 */
sealed external interface PerDirectoryResolutionCache<T> {
    fun getOrCreateCacheForDirectory(
        directoryName: String,
        redirectedReference: ResolvedProjectReference = definedExternally,
    ): ModeAwareCache<T>

    fun clear()

    /**
     *  Updates with the current compilerOptions the cache will operate with.
     *  This updates the redirects map as well if needed so module resolutions are cached if they can across the projects
     */
    fun update(options: CompilerOptions)
}
