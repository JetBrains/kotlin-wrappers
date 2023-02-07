// Automatically generated - do not modify!

package typescript

sealed external interface PerModuleNameCache {
    operator fun get(directory: String): ResolvedModuleWithFailedLookupLocations?
    operator fun set(
        directory: String,
        result: ResolvedModuleWithFailedLookupLocations,
    )
}
