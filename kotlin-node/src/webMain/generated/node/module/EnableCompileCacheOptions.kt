// Automatically generated - do not modify!

package node.module

@kotlinx.js.JsPlainObject
external interface EnableCompileCacheOptions {
    /**
     * Optional. Directory to store the compile cache. If not specified, the directory specified by
     * the [`NODE_COMPILE_CACHE=dir`](https://nodejs.org/docs/latest-v24.x/api/cli.html#node_compile_cachedir)
     * environment variable will be used if it's set, or `path.join(os.tmpdir(), 'node-compile-cache')` otherwise.
     * @since v24.12.0
     */
    var directory: String?

    /**
     * Optional. If `true`, enables portable compile cache so that the cache can be reused even if the project directory
     * is moved. This is a best-effort feature. If not specified, it will depend on whether the environment variable
     * [NODE_COMPILE_CACHE_PORTABLE=1](https://nodejs.org/docs/latest-v24.x/api/cli.html#node_compile_cache_portable1) is set.
     * @since v24.12.0
     */
    var portable: Boolean?
}
