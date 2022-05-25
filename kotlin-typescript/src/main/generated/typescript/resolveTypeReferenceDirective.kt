// Automatically generated - do not modify!

@file:JsModule("typescript")
@file:JsNonModule

package typescript

/**
 * @param {string | undefined} containingFile - file that contains type reference directive, can be undefined if containing file is unknown.
 * This is possible in case if resolution is performed for directives specified via 'types' parameter. In this case initial path for secondary lookups
 * is assumed to be the same as root directory of the project.
 */
external fun resolveTypeReferenceDirective(
    typeReferenceDirectiveName: String,
    containingFile: String?,
    options: CompilerOptions,
    host: ModuleResolutionHost,
    redirectedReference: ResolvedProjectReference = definedExternally,
    cache: TypeReferenceDirectiveResolutionCache = definedExternally,
    resolutionMode: NodeFormat = definedExternally,
): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
