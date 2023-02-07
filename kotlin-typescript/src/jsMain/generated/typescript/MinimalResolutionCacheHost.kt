// Automatically generated - do not modify!

package typescript

/**
 * Used by services to specify the minimum host area required to set up source files under any compilation settings
 */
sealed external interface MinimalResolutionCacheHost : ModuleResolutionHost {
    fun getCompilationSettings(): CompilerOptions
    val getCompilerHost: (() -> CompilerHost?)?
}
