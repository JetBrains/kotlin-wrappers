// Automatically generated - do not modify!

package typescript

sealed external interface ResolvedTypeReferenceDirective {
    var primary: Boolean
    var resolvedFileName: String?
    var packageId: PackageId?

    /** True if `resolvedFileName` comes from `node_modules`. */
    var isExternalLibraryImport: Boolean?
}
