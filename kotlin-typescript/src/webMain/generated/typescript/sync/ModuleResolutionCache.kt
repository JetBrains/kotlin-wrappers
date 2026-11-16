// Automatically generated - do not modify!

package typescript.sync

external interface ModuleResolutionCache :
    PerDirectoryResolutionCache<ResolvedModuleWithFailedLookupLocations>,
    NonRelativeModuleNameResolutionCache,
    PackageJsonInfoCache {
    fun getPackageJsonInfoCache(): PackageJsonInfoCache
}
