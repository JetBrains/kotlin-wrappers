// Automatically generated - do not modify!

package typescript

import typescript.sync.CompilerHost
import typescript.sync.CompilerOptions
import typescript.sync.ModuleResolutionHost

/**
 * Used by services to specify the minimum host area required to set up source files under any compilation settings
 */
external interface MinimalResolutionCacheHost : ModuleResolutionHost {
    fun getCompilationSettings(): CompilerOptions

    val getCompilerHost: (() -> CompilerHost?)?
}
