// Automatically generated - do not modify!

package node.module

sealed external interface RequireResolveOptions {
    /**
     * Paths to resolve module location from. If present, these
     * paths are used instead of the default resolution paths, with the exception
     * of
     * [GLOBAL\_FOLDERS](https://nodejs.org/docs/latest-v24.x/api/modules.html#loading-from-the-global-folders)
     * like `$HOME/.node_modules`, which are
     * always included. Each of these paths is used as a starting point for
     * the module resolution algorithm, meaning that the `node_modules` hierarchy
     * is checked from this location.
     * @since v8.9.0
     */
    var paths: js.array.ReadonlyArray<String>?
}
