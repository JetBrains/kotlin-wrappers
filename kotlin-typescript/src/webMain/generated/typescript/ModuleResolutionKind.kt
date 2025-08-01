// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

sealed external interface ModuleResolutionKind {
    companion object {
        val Classic: ModuleResolutionKind

        /**
         * @deprecated
         * `NodeJs` was renamed to `Node10` to better reflect the version of Node that it targets.
         * Use the new name or consider switching to a modern module resolution target.
         */
        val NodeJs: ModuleResolutionKind
        val Node10: ModuleResolutionKind
        val Node16: ModuleResolutionKind
        val NodeNext: ModuleResolutionKind
        val Bundler: ModuleResolutionKind
    }
}
