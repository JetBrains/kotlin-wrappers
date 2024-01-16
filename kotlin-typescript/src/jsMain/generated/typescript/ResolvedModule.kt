// Automatically generated - do not modify!

package typescript

/**
 * Represents the result of module resolution.
 * Module resolution will pick up tsx/jsx/js files even if '--jsx' and '--allowJs' are turned off.
 * The Program will then filter results based on these flags.
 *
 * Prefer to return a `ResolvedModuleFull` so that the file type does not have to be inferred.
 */
sealed external interface ResolvedModule {
    /** Path of the file the module was resolved to. */
    var resolvedFileName: String

    /** True if `resolvedFileName` comes from `node_modules`. */
    var isExternalLibraryImport: Boolean?

    /**
     * True if the original module reference used a .ts extension to refer directly to a .ts file,
     * which should produce an error during checking if emit is enabled.
     */
    var resolvedUsingTsExtension: Boolean?
}
