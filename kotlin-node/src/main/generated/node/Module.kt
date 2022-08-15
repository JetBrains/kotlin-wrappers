// Automatically generated - do not modify!

package node

import kotlinx.js.ReadonlyArray

sealed external interface Module {
    /**
     * `true` if the module is running during the Node.js preload
     */
    var isPreloading: Boolean
    var exports: Any
    var require: dynamic /* Require */
    var id: String
    var filename: String
    var loaded: Boolean

    /** @deprecated since v14.6.0 Please use `require.main` and `module.children` instead. */
    var parent: Module?
    var children: ReadonlyArray<Module>

    /**
     * @since v11.14.0
     *
     * The directory name of the module. This is usually the same as the path.dirname() of the module.id.
     */
    var path: String
    var paths: ReadonlyArray<String>
}
