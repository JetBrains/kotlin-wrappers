// Automatically generated - do not modify!

package typescript

/**
 * Unique identifier with a package name and version.
 * If changing this, remember to change `packageIdIsEqual`.
 */
sealed external interface PackageId {
    /**
     * Name of the package.
     * Should not include `@types`.
     * If accessing a non-index file, this should include its name e.g. "foo/bar".
     */
    var name: String

    /**
     * Name of a submodule within this package.
     * May be "".
     */
    var subModuleName: String

    /** Version of the package, e.g. "1.2.3" */
    var version: String
}
