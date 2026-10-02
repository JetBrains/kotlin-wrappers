// Automatically generated - do not modify!

@file:JsModule("@cesium/core")

package cesium.core

import js.array.ReadonlyArray

/**
 * Adds all elements from the given source array to the given target array.
 *
 * If the `source` is `null`, `undefined`,
 * or empty, then nothing will be done. Otherwise, this has the same
 * semantics as
 * `for (const s of source) target.push(s);`
 * but is usually more efficient than a `for`-loop, and does not
 * put the elements of the source on the stack, as it would be done with the
 * spread operator or when using `target.push.apply(source)`.
 * ```
 * const target = [ 0, 1, 2 ];
 * const source = [ 3, 4, 5 ];
 * addAllToArray(target, source);
 * // The target is now [ 0, 1, 2, 3, 4, 5 ]
 * ```
 * @param [target] The target array
 * @param [source] The source array
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#addAllToArray">Online Documentation</a>
 */
external fun addAllToArray(
    target: ReadonlyArray<JsAny>,
    source: ReadonlyArray<JsAny>?,
)
