// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray

/**
 * Drill pick by repeatedly calling a given `pickCallback`, each time stripping away the previously picked objects.
 * @param [pickCallback] Pick callback to execute each iteration
 * @param [limit] If supplied, stop drilling after collecting this many picks
 *   Default value - [Number.MAX_VALUE]
 * @return List of picked results
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#drillPick">Online Documentation</a>
 */
external fun drillPick(
    pickCallback: Function<*>,
    limit: Double? = definedExternally,
): ReadonlyArray<JsAny>
