// Automatically generated - do not modify!

package node.module

import web.url.URL

sealed external interface ImportMeta {
    var url: String

    /**
     * `import.meta.resolve` is a module-relative resolution function scoped to
     * each module, returning the URL string.
     *
     * ```js
     * const dependencyAsset = import.meta.resolve('component-lib/asset.css');
     * // file:///app/node_modules/component-lib/asset.css
     * import.meta.resolve('./dep.js');
     * // file:///app/dep.js
     * ```
     *
     * All features of the Node.js module resolution are supported. Dependency
     * resolutions are subject to the permitted exports resolutions within the package.
     *
     * **Caveats**:
     *
     * * This can result in synchronous file-system operations, which
     *   can impact performance similarly to `require.resolve`.
     * * This feature is not available within custom loaders (it would
     *   create a deadlock).
     * @since v13.9.0, v12.16.0
     * @param specifier The module specifier to resolve relative to the
     * current module.
     * @param parent An optional absolute parent module URL to resolve from.
     * **Default:** `import.meta.url`
     * @returns The absolute URL string that the specifier would resolve to.
     */
    fun resolve(specifier: String): String

    /**
     * `import.meta.resolve` is a module-relative resolution function scoped to
     * each module, returning the URL string.
     *
     * ```js
     * const dependencyAsset = import.meta.resolve('component-lib/asset.css');
     * // file:///app/node_modules/component-lib/asset.css
     * import.meta.resolve('./dep.js');
     * // file:///app/dep.js
     * ```
     *
     * All features of the Node.js module resolution are supported. Dependency
     * resolutions are subject to the permitted exports resolutions within the package.
     *
     * **Caveats**:
     *
     * * This can result in synchronous file-system operations, which
     *   can impact performance similarly to `require.resolve`.
     * * This feature is not available within custom loaders (it would
     *   create a deadlock).
     * @since v13.9.0, v12.16.0
     * @param specifier The module specifier to resolve relative to the
     * current module.
     * @param parent An optional absolute parent module URL to resolve from.
     * **Default:** `import.meta.url`
     * @returns The absolute URL string that the specifier would resolve to.
     */
    fun resolve(
        specifier: String,
        parent: String = definedExternally,
    ): String

    /**
     * `import.meta.resolve` is a module-relative resolution function scoped to
     * each module, returning the URL string.
     *
     * ```js
     * const dependencyAsset = import.meta.resolve('component-lib/asset.css');
     * // file:///app/node_modules/component-lib/asset.css
     * import.meta.resolve('./dep.js');
     * // file:///app/dep.js
     * ```
     *
     * All features of the Node.js module resolution are supported. Dependency
     * resolutions are subject to the permitted exports resolutions within the package.
     *
     * **Caveats**:
     *
     * * This can result in synchronous file-system operations, which
     *   can impact performance similarly to `require.resolve`.
     * * This feature is not available within custom loaders (it would
     *   create a deadlock).
     * @since v13.9.0, v12.16.0
     * @param specifier The module specifier to resolve relative to the
     * current module.
     * @param parent An optional absolute parent module URL to resolve from.
     * **Default:** `import.meta.url`
     * @returns The absolute URL string that the specifier would resolve to.
     */
    fun resolve(
        specifier: String,
        parent: URL = definedExternally,
    ): String

    /**
     * The directory name of the current module.
     *
     * This is the same as the `path.dirname()` of the `import.meta.filename`.
     *
     * > **Caveat**: only present on `file:` modules.
     * @since v21.2.0, v20.11.0
     */
    var dirname: String

    /**
     * The full absolute path and filename of the current module, with
     * symlinks resolved.
     *
     * This is the same as the `url.fileURLToPath()` of the `import.meta.url`.
     *
     * > **Caveat** only local modules support this property. Modules not using the
     * > `file:` protocol will not provide it.
     * @since v21.2.0, v20.11.0
     */
    var filename: String

    /**
     * `true` when the current module is the entry point of the current process; `false` otherwise.
     *
     * Equivalent to `require.main === module` in CommonJS.
     *
     * Analogous to Python's `__name__ == "__main__"`.
     *
     * ```js
     * export function foo() {
     *   return 'Hello, world';
     * }
     *
     * function main() {
     *   const message = foo();
     *   console.log(message);
     * }
     *
     * if (import.meta.main) main();
     * // `foo` can be imported from another module without possible side-effects from `main`
     * ```
     * @since v24.2.0
     * @experimental
     */
    var main: Boolean
}
