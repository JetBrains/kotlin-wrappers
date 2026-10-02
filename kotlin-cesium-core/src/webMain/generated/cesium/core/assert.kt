// Automatically generated - do not modify!

@file:JsModule("@cesium/core")

package cesium.core

/**
 * Checks that a condition is truthy, throwing a specified message if condition
 * fails. The `asserts condition` return type allows TypeScript to narrow the
 * types of the condition and enforce stricter types without further if/else
 * checks or nullish coalescing.
 * ```
 * assert(object.optionalProperty, 'Missing .optionalProperty');
 * object.optionalProperty.toString(); // safe; no type error.
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#assert">Online Documentation</a>
 */
external fun assert(
    condition: JsAny,
    msg: String,
)
