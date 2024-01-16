// Automatically generated - do not modify!

package typescript

sealed external interface NonRelativeNameResolutionCache<T> {
    fun getFromNonRelativeNameCache(
        nonRelativeName: String,
        mode: ResolutionMode,
        directoryName: String,
        redirectedReference: ResolvedProjectReference?,
    ): T?

    fun getOrCreateCacheForNonRelativeName(
        nonRelativeName: String,
        mode: ResolutionMode,
        redirectedReference: ResolvedProjectReference = definedExternally,
    ): PerNonRelativeNameCache<T>

    fun clear()

    /**
     *  Updates with the current compilerOptions the cache will operate with.
     *  This updates the redirects map as well if needed so module resolutions are cached if they can across the projects
     */
    fun update(options: CompilerOptions)
}
