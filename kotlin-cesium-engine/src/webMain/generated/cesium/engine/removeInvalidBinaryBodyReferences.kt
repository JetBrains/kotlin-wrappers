// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Remove all invalid binary body references from the batch table
 * JSON of the given parsed content.
 *
 * This is a workaround for gracefully handling the invalid PNTS
 * files that may have been created by the point cloud tiler.
 * See https://github.com/CesiumGS/cesium/issues/12872
 *
 * When the batch table JSON is undefined, nothing will be done.
 * When the batch table binary is defined, nothing will be done
 * (assuming that any binary body references are valid - this is
 * not checked here).
 *
 * Otherwise, this will remove all binary body references from the
 * batch table JSON that are not resolved from draco via the
 * `parsedContent.draco.batchTableProperties`.
 *
 * If any (invalid) binary body reference is found (and removed),
 * a one-time warning will be printed.
 * @param [parsedContent] The parsed content
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#removeInvalidBinaryBodyReferences">Online Documentation</a>
 */
external fun removeInvalidBinaryBodyReferences(parsedContent: JsAny)
