// Automatically generated - do not modify!

@file:JsModule("node:module")

package node.module

/**
 * Enable [module compile cache](https://nodejs.org/docs/latest-v24.x/api/module.html#module-compile-cache)
 * in the current Node.js instance.
 *
 * For general use cases, it's recommended to call `module.enableCompileCache()` without specifying the
 * `options.directory`, so that the directory can be overridden by the `NODE_COMPILE_CACHE` environment
 * variable when necessary.
 *
 * Since compile cache is supposed to be a optimization that is not mission critical, this method is
 * designed to not throw any exception when the compile cache cannot be enabled. Instead, it will return
 * an object containing an error message in the `message` field to aid debugging. If compile cache is
 * enabled successfully, the `directory` field in the returned object contains the path to the directory
 * where the compile cache is stored. The `status` field in the returned object would be one of the
 * `module.constants.compileCacheStatus` values to indicate the result of the attempt to enable the
 * [module compile cache](https://nodejs.org/docs/latest-v24.x/api/module.html#module-compile-cache).
 *
 * This method only affects the current Node.js instance. To enable it in child worker threads,
 * either call this method in child worker threads too, or set the
 * `process.env.NODE_COMPILE_CACHE` value to compile cache directory so the behavior can
 * be inherited into the child workers. The directory can be obtained either from the
 * `directory` field returned by this method, or with {@link getCompileCacheDir `module.getCompileCacheDir()`}.
 * @since v22.8.0
 * @param options Optional. If a string is passed, it is considered to be `options.directory`.
 * will be stored/retrieved.
 */
external fun enableCompileCache(): EnableCompileCacheResult

/**
 * Enable [module compile cache](https://nodejs.org/docs/latest-v24.x/api/module.html#module-compile-cache)
 * in the current Node.js instance.
 *
 * For general use cases, it's recommended to call `module.enableCompileCache()` without specifying the
 * `options.directory`, so that the directory can be overridden by the `NODE_COMPILE_CACHE` environment
 * variable when necessary.
 *
 * Since compile cache is supposed to be a optimization that is not mission critical, this method is
 * designed to not throw any exception when the compile cache cannot be enabled. Instead, it will return
 * an object containing an error message in the `message` field to aid debugging. If compile cache is
 * enabled successfully, the `directory` field in the returned object contains the path to the directory
 * where the compile cache is stored. The `status` field in the returned object would be one of the
 * `module.constants.compileCacheStatus` values to indicate the result of the attempt to enable the
 * [module compile cache](https://nodejs.org/docs/latest-v24.x/api/module.html#module-compile-cache).
 *
 * This method only affects the current Node.js instance. To enable it in child worker threads,
 * either call this method in child worker threads too, or set the
 * `process.env.NODE_COMPILE_CACHE` value to compile cache directory so the behavior can
 * be inherited into the child workers. The directory can be obtained either from the
 * `directory` field returned by this method, or with {@link getCompileCacheDir `module.getCompileCacheDir()`}.
 * @since v22.8.0
 * @param options Optional. If a string is passed, it is considered to be `options.directory`.
 * will be stored/retrieved.
 */
external fun enableCompileCache(options: String = definedExternally): EnableCompileCacheResult

/**
 * Enable [module compile cache](https://nodejs.org/docs/latest-v24.x/api/module.html#module-compile-cache)
 * in the current Node.js instance.
 *
 * For general use cases, it's recommended to call `module.enableCompileCache()` without specifying the
 * `options.directory`, so that the directory can be overridden by the `NODE_COMPILE_CACHE` environment
 * variable when necessary.
 *
 * Since compile cache is supposed to be a optimization that is not mission critical, this method is
 * designed to not throw any exception when the compile cache cannot be enabled. Instead, it will return
 * an object containing an error message in the `message` field to aid debugging. If compile cache is
 * enabled successfully, the `directory` field in the returned object contains the path to the directory
 * where the compile cache is stored. The `status` field in the returned object would be one of the
 * `module.constants.compileCacheStatus` values to indicate the result of the attempt to enable the
 * [module compile cache](https://nodejs.org/docs/latest-v24.x/api/module.html#module-compile-cache).
 *
 * This method only affects the current Node.js instance. To enable it in child worker threads,
 * either call this method in child worker threads too, or set the
 * `process.env.NODE_COMPILE_CACHE` value to compile cache directory so the behavior can
 * be inherited into the child workers. The directory can be obtained either from the
 * `directory` field returned by this method, or with {@link getCompileCacheDir `module.getCompileCacheDir()`}.
 * @since v22.8.0
 * @param options Optional. If a string is passed, it is considered to be `options.directory`.
 * will be stored/retrieved.
 */
external fun enableCompileCache(options: EnableCompileCacheOptions = definedExternally): EnableCompileCacheResult
