// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import typescript.sync.ModuleResolutionCache
import typescript.sync.ResolutionMode
import typescript.sync.ResolvedModuleWithFailedLookupLocations

external fun resolveModuleNameFromCache(
    moduleName: String,
    containingFile: String,
    cache: ModuleResolutionCache,
    mode: ResolutionMode = definedExternally,
): ResolvedModuleWithFailedLookupLocations?
