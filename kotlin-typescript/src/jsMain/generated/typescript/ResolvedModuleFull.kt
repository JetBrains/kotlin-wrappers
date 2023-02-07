// Automatically generated - do not modify!

package typescript

/**
 * ResolvedModule with an explicitly provided `extension` property.
 * Prefer this over `ResolvedModule`.
 * If changing this, remember to change `moduleResolutionIsEqualTo`.
 */
sealed external interface ResolvedModuleFull : ResolvedModule {
    /**
     * Extension of resolvedFileName. This must match what's at the end of resolvedFileName.
     * This is optional for backwards-compatibility, but will be added if not provided.
     */
    var extension: Extension
    var packageId: PackageId?
}
