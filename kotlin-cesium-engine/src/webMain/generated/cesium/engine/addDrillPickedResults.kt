// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray

/**
 * @param [pickedResults] the results from the pickCallback
 * @param [limit] If supplied, stop drilling after collecting this many picks.
 * @return whether picking should end
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#addDrillPickedResults">Online Documentation</a>
 */
external fun addDrillPickedResults(
    pickedResults: ReadonlyArray<JsAny>,
    limit: Double,
    results: ReadonlyArray<JsAny>,
    pickedPrimitives: ReadonlyArray<JsAny>,
    pickedAttributes: ReadonlyArray<JsAny>,
    pickedFeatures: ReadonlyArray<JsAny>,
): Boolean
