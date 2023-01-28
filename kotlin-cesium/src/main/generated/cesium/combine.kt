// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * Merges two objects, copying their properties onto a new combined object. When two objects have the same
 * property, the value of the property on the first object is used.  If either object is undefined,
 * it will be treated as an empty object.
 * ```
 * const object1 = {
 *     propOne : 1,
 *     propTwo : {
 *         value1 : 10
 *     }
 * }
 * const object2 = {
 *     propTwo : 2
 * }
 * const final = combine(object1, object2);
 *
 * // final === {
 * //     propOne : 1,
 * //     propTwo : {
 * //         value1 : 10
 * //     }
 * // }
 * ```
 * @param [object1] The first object to merge.
 * @param [object2] The second object to merge.
 * @param [deep] Perform a recursive merge.
 *   Default value - `false`
 * @return The combined object containing all properties from both objects.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/combine.html">Online Documentation</a>
 */
external fun combine(
    object1: Any? = definedExternally,
    object2: Any? = definedExternally,
    deep: Boolean? = definedExternally,
): Any
