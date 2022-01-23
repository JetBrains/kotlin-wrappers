// Automatically generated - do not modify!

package typescript

/**
 * Stored map from non-relative module name to a table: directory -> result of module lookup in this directory
 * We support only non-relative module names because resolution of relative module names is usually more deterministic and thus less expensive.
 */
external interface NonRelativeModuleNameResolutionCache : PackageJsonInfoCache {
    fun getOrCreateCacheForModuleName(
        nonRelativeModuleName: String,
        mode: ResolutionMode?,
        redirectedReference: ResolvedProjectReference = definedExternally,
    ): PerModuleNameCache
}
