// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Loads the images for a cubemap uniform, if it has changed since the last time this was called.
 * @param [material] The material to load the cubemap images for.
 * @param [uniformId] The ID of the uniform that corresponds to the cubemap images.
 * @return A promise that resolves when the images are loaded, or a resolved promise if image loading is not necessary.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#loadCubeMapImagesForUniform">Online Documentation</a>
 */
external fun loadCubeMapImagesForUniform(
    material: Material,
    uniformId: String,
): JsAny
