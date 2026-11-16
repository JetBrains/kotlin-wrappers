// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import typescript.sync.CompilerOptions
import typescript.sync.ModuleResolutionCache
import typescript.sync.PackageJsonInfoCache

external fun createModuleResolutionCache(
    currentDirectory: String,
    getCanonicalFileName: (s: String) -> String,
    options: CompilerOptions = definedExternally,
    packageJsonInfoCache: PackageJsonInfoCache = definedExternally,
): ModuleResolutionCache
