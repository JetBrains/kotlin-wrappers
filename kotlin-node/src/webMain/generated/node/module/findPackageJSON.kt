// Automatically generated - do not modify!

@file:JsModule("node:module")

package node.module

import web.url.URL

/**
 * ```text
 * /path/to/project
 *   ├ packages/
 *     ├ bar/
 *       ├ bar.js
 *       └ package.json // name = '@foo/bar'
 *     └ qux/
 *       ├ node_modules/
 *         └ some-package/
 *           └ package.json // name = 'some-package'
 *       ├ qux.js
 *       └ package.json // name = '@foo/qux'
 *   ├ main.js
 *   └ package.json // name = '@foo'
 * ```
 * ```js
 * // /path/to/project/packages/bar/bar.js
 * import { findPackageJSON } from 'node:module';
 *
 * findPackageJSON('..', import.meta.url);
 * // '/path/to/project/package.json'
 * // Same result when passing an absolute specifier instead:
 * findPackageJSON(new URL('../', import.meta.url));
 * findPackageJSON(import.meta.resolve('../'));
 *
 * findPackageJSON('some-package', import.meta.url);
 * // '/path/to/project/packages/bar/node_modules/some-package/package.json'
 * // When passing an absolute specifier, you might get a different result if the
 * // resolved module is inside a subfolder that has nested `package.json`.
 * findPackageJSON(import.meta.resolve('some-package'));
 * // '/path/to/project/packages/bar/node_modules/some-package/some-subfolder/package.json'
 *
 * findPackageJSON('@foo/qux', import.meta.url);
 * // '/path/to/project/packages/qux/package.json'
 * ```
 * @since v22.14.0
 * @param specifier The specifier for the module whose `package.json` to
 * retrieve. When passing a _bare specifier_, the `package.json` at the root of
 * the package is returned. When passing a _relative specifier_ or an _absolute specifier_,
 * the closest parent `package.json` is returned.
 * @param base The absolute location (`file:` URL string or FS path) of the
 * containing  module. For CJS, use `__filename` (not `__dirname`!); for ESM, use
 * `import.meta.url`. You do not need to pass it if `specifier` is an _absolute specifier_.
 * @returns A path if the `package.json` is found. When `startLocation`
 * is a package, the package's root `package.json`; when a relative or unresolved, the closest
 * `package.json` to the `startLocation`.
 */
external fun findPackageJSON(specifier: String): String?

/**
 * ```text
 * /path/to/project
 *   ├ packages/
 *     ├ bar/
 *       ├ bar.js
 *       └ package.json // name = '@foo/bar'
 *     └ qux/
 *       ├ node_modules/
 *         └ some-package/
 *           └ package.json // name = 'some-package'
 *       ├ qux.js
 *       └ package.json // name = '@foo/qux'
 *   ├ main.js
 *   └ package.json // name = '@foo'
 * ```
 * ```js
 * // /path/to/project/packages/bar/bar.js
 * import { findPackageJSON } from 'node:module';
 *
 * findPackageJSON('..', import.meta.url);
 * // '/path/to/project/package.json'
 * // Same result when passing an absolute specifier instead:
 * findPackageJSON(new URL('../', import.meta.url));
 * findPackageJSON(import.meta.resolve('../'));
 *
 * findPackageJSON('some-package', import.meta.url);
 * // '/path/to/project/packages/bar/node_modules/some-package/package.json'
 * // When passing an absolute specifier, you might get a different result if the
 * // resolved module is inside a subfolder that has nested `package.json`.
 * findPackageJSON(import.meta.resolve('some-package'));
 * // '/path/to/project/packages/bar/node_modules/some-package/some-subfolder/package.json'
 *
 * findPackageJSON('@foo/qux', import.meta.url);
 * // '/path/to/project/packages/qux/package.json'
 * ```
 * @since v22.14.0
 * @param specifier The specifier for the module whose `package.json` to
 * retrieve. When passing a _bare specifier_, the `package.json` at the root of
 * the package is returned. When passing a _relative specifier_ or an _absolute specifier_,
 * the closest parent `package.json` is returned.
 * @param base The absolute location (`file:` URL string or FS path) of the
 * containing  module. For CJS, use `__filename` (not `__dirname`!); for ESM, use
 * `import.meta.url`. You do not need to pass it if `specifier` is an _absolute specifier_.
 * @returns A path if the `package.json` is found. When `startLocation`
 * is a package, the package's root `package.json`; when a relative or unresolved, the closest
 * `package.json` to the `startLocation`.
 */
external fun findPackageJSON(
    specifier: String,
    base: String = definedExternally,
): String?

/**
 * ```text
 * /path/to/project
 *   ├ packages/
 *     ├ bar/
 *       ├ bar.js
 *       └ package.json // name = '@foo/bar'
 *     └ qux/
 *       ├ node_modules/
 *         └ some-package/
 *           └ package.json // name = 'some-package'
 *       ├ qux.js
 *       └ package.json // name = '@foo/qux'
 *   ├ main.js
 *   └ package.json // name = '@foo'
 * ```
 * ```js
 * // /path/to/project/packages/bar/bar.js
 * import { findPackageJSON } from 'node:module';
 *
 * findPackageJSON('..', import.meta.url);
 * // '/path/to/project/package.json'
 * // Same result when passing an absolute specifier instead:
 * findPackageJSON(new URL('../', import.meta.url));
 * findPackageJSON(import.meta.resolve('../'));
 *
 * findPackageJSON('some-package', import.meta.url);
 * // '/path/to/project/packages/bar/node_modules/some-package/package.json'
 * // When passing an absolute specifier, you might get a different result if the
 * // resolved module is inside a subfolder that has nested `package.json`.
 * findPackageJSON(import.meta.resolve('some-package'));
 * // '/path/to/project/packages/bar/node_modules/some-package/some-subfolder/package.json'
 *
 * findPackageJSON('@foo/qux', import.meta.url);
 * // '/path/to/project/packages/qux/package.json'
 * ```
 * @since v22.14.0
 * @param specifier The specifier for the module whose `package.json` to
 * retrieve. When passing a _bare specifier_, the `package.json` at the root of
 * the package is returned. When passing a _relative specifier_ or an _absolute specifier_,
 * the closest parent `package.json` is returned.
 * @param base The absolute location (`file:` URL string or FS path) of the
 * containing  module. For CJS, use `__filename` (not `__dirname`!); for ESM, use
 * `import.meta.url`. You do not need to pass it if `specifier` is an _absolute specifier_.
 * @returns A path if the `package.json` is found. When `startLocation`
 * is a package, the package's root `package.json`; when a relative or unresolved, the closest
 * `package.json` to the `startLocation`.
 */
external fun findPackageJSON(
    specifier: String,
    base: URL = definedExternally,
): String?

/**
 * ```text
 * /path/to/project
 *   ├ packages/
 *     ├ bar/
 *       ├ bar.js
 *       └ package.json // name = '@foo/bar'
 *     └ qux/
 *       ├ node_modules/
 *         └ some-package/
 *           └ package.json // name = 'some-package'
 *       ├ qux.js
 *       └ package.json // name = '@foo/qux'
 *   ├ main.js
 *   └ package.json // name = '@foo'
 * ```
 * ```js
 * // /path/to/project/packages/bar/bar.js
 * import { findPackageJSON } from 'node:module';
 *
 * findPackageJSON('..', import.meta.url);
 * // '/path/to/project/package.json'
 * // Same result when passing an absolute specifier instead:
 * findPackageJSON(new URL('../', import.meta.url));
 * findPackageJSON(import.meta.resolve('../'));
 *
 * findPackageJSON('some-package', import.meta.url);
 * // '/path/to/project/packages/bar/node_modules/some-package/package.json'
 * // When passing an absolute specifier, you might get a different result if the
 * // resolved module is inside a subfolder that has nested `package.json`.
 * findPackageJSON(import.meta.resolve('some-package'));
 * // '/path/to/project/packages/bar/node_modules/some-package/some-subfolder/package.json'
 *
 * findPackageJSON('@foo/qux', import.meta.url);
 * // '/path/to/project/packages/qux/package.json'
 * ```
 * @since v22.14.0
 * @param specifier The specifier for the module whose `package.json` to
 * retrieve. When passing a _bare specifier_, the `package.json` at the root of
 * the package is returned. When passing a _relative specifier_ or an _absolute specifier_,
 * the closest parent `package.json` is returned.
 * @param base The absolute location (`file:` URL string or FS path) of the
 * containing  module. For CJS, use `__filename` (not `__dirname`!); for ESM, use
 * `import.meta.url`. You do not need to pass it if `specifier` is an _absolute specifier_.
 * @returns A path if the `package.json` is found. When `startLocation`
 * is a package, the package's root `package.json`; when a relative or unresolved, the closest
 * `package.json` to the `startLocation`.
 */
external fun findPackageJSON(specifier: URL): String?

/**
 * ```text
 * /path/to/project
 *   ├ packages/
 *     ├ bar/
 *       ├ bar.js
 *       └ package.json // name = '@foo/bar'
 *     └ qux/
 *       ├ node_modules/
 *         └ some-package/
 *           └ package.json // name = 'some-package'
 *       ├ qux.js
 *       └ package.json // name = '@foo/qux'
 *   ├ main.js
 *   └ package.json // name = '@foo'
 * ```
 * ```js
 * // /path/to/project/packages/bar/bar.js
 * import { findPackageJSON } from 'node:module';
 *
 * findPackageJSON('..', import.meta.url);
 * // '/path/to/project/package.json'
 * // Same result when passing an absolute specifier instead:
 * findPackageJSON(new URL('../', import.meta.url));
 * findPackageJSON(import.meta.resolve('../'));
 *
 * findPackageJSON('some-package', import.meta.url);
 * // '/path/to/project/packages/bar/node_modules/some-package/package.json'
 * // When passing an absolute specifier, you might get a different result if the
 * // resolved module is inside a subfolder that has nested `package.json`.
 * findPackageJSON(import.meta.resolve('some-package'));
 * // '/path/to/project/packages/bar/node_modules/some-package/some-subfolder/package.json'
 *
 * findPackageJSON('@foo/qux', import.meta.url);
 * // '/path/to/project/packages/qux/package.json'
 * ```
 * @since v22.14.0
 * @param specifier The specifier for the module whose `package.json` to
 * retrieve. When passing a _bare specifier_, the `package.json` at the root of
 * the package is returned. When passing a _relative specifier_ or an _absolute specifier_,
 * the closest parent `package.json` is returned.
 * @param base The absolute location (`file:` URL string or FS path) of the
 * containing  module. For CJS, use `__filename` (not `__dirname`!); for ESM, use
 * `import.meta.url`. You do not need to pass it if `specifier` is an _absolute specifier_.
 * @returns A path if the `package.json` is found. When `startLocation`
 * is a package, the package's root `package.json`; when a relative or unresolved, the closest
 * `package.json` to the `startLocation`.
 */
external fun findPackageJSON(
    specifier: URL,
    base: String = definedExternally,
): String?

/**
 * ```text
 * /path/to/project
 *   ├ packages/
 *     ├ bar/
 *       ├ bar.js
 *       └ package.json // name = '@foo/bar'
 *     └ qux/
 *       ├ node_modules/
 *         └ some-package/
 *           └ package.json // name = 'some-package'
 *       ├ qux.js
 *       └ package.json // name = '@foo/qux'
 *   ├ main.js
 *   └ package.json // name = '@foo'
 * ```
 * ```js
 * // /path/to/project/packages/bar/bar.js
 * import { findPackageJSON } from 'node:module';
 *
 * findPackageJSON('..', import.meta.url);
 * // '/path/to/project/package.json'
 * // Same result when passing an absolute specifier instead:
 * findPackageJSON(new URL('../', import.meta.url));
 * findPackageJSON(import.meta.resolve('../'));
 *
 * findPackageJSON('some-package', import.meta.url);
 * // '/path/to/project/packages/bar/node_modules/some-package/package.json'
 * // When passing an absolute specifier, you might get a different result if the
 * // resolved module is inside a subfolder that has nested `package.json`.
 * findPackageJSON(import.meta.resolve('some-package'));
 * // '/path/to/project/packages/bar/node_modules/some-package/some-subfolder/package.json'
 *
 * findPackageJSON('@foo/qux', import.meta.url);
 * // '/path/to/project/packages/qux/package.json'
 * ```
 * @since v22.14.0
 * @param specifier The specifier for the module whose `package.json` to
 * retrieve. When passing a _bare specifier_, the `package.json` at the root of
 * the package is returned. When passing a _relative specifier_ or an _absolute specifier_,
 * the closest parent `package.json` is returned.
 * @param base The absolute location (`file:` URL string or FS path) of the
 * containing  module. For CJS, use `__filename` (not `__dirname`!); for ESM, use
 * `import.meta.url`. You do not need to pass it if `specifier` is an _absolute specifier_.
 * @returns A path if the `package.json` is found. When `startLocation`
 * is a package, the package's root `package.json`; when a relative or unresolved, the closest
 * `package.json` to the `startLocation`.
 */
external fun findPackageJSON(
    specifier: URL,
    base: URL = definedExternally,
): String?
