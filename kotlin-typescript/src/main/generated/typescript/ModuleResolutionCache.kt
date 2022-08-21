// Automatically generated - do not modify!

package typescript

sealed external interface ModuleResolutionCache : PerDirectoryResolutionCache<ResolvedModuleWithFailedLookupLocations>,
    NonRelativeModuleNameResolutionCache, PackageJsonInfoCache {
    fun getPackageJsonInfoCache(): PackageJsonInfoCache
}
