// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")

package node.fs

/**
 * ```js
 * import { glob } from 'node:fs/promises';
 *
 * for await (const entry of glob('*.js'))
 *   console.log(entry);
 * ```
 * @since v22.0.0
 * @returns An AsyncIterator that yields the paths of files
 * that match the pattern.
 */
external fun glob(pattern: String): js.iterable.AsyncIterator<String>

/**
 * ```js
 * import { glob } from 'node:fs/promises';
 *
 * for await (const entry of glob('*.js'))
 *   console.log(entry);
 * ```
 * @since v22.0.0
 * @returns An AsyncIterator that yields the paths of files
 * that match the pattern.
 */
external fun glob(pattern: js.array.ReadonlyArray<String>): js.iterable.AsyncIterator<String>

external fun glob(
    pattern: String,
    options: GlobOptionsWithFileTypes,
): js.iterable.AsyncIterator<Dirent<*>>

external fun glob(
    pattern: js.array.ReadonlyArray<String>,
    options: GlobOptionsWithFileTypes,
): js.iterable.AsyncIterator<Dirent<*>>

external fun glob(
    pattern: String,
    options: GlobOptionsWithoutFileTypes,
): js.iterable.AsyncIterator<String>

external fun glob(
    pattern: js.array.ReadonlyArray<String>,
    options: GlobOptionsWithoutFileTypes,
): js.iterable.AsyncIterator<String>

external fun glob(pattern: String, options: GlobOptions): js.iterable.AsyncIterator<Any /* Dirent | string */>

external fun glob(
    pattern: js.array.ReadonlyArray<String>,
    options: GlobOptions,
): js.iterable.AsyncIterator<Any /* Dirent | string */>
