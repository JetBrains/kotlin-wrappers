// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Properties for managing image-based lighting on tilesets and models.
 * Also manages the necessary resources and textures.
 *
 * If specular environment maps are used, [ImageBasedLighting.destroy] must be called
 * when the image-based lighting is no longer needed to clean up GPU resources properly.
 * If a model or tileset creates an instance of ImageBasedLighting, it will handle this.
 * Otherwise, the application is responsible for calling destroy().
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageBasedLighting.html">Online Documentation</a>
 */
external class ImageBasedLighting {
    /**
     * Cesium adds lighting from the earth, sky, atmosphere, and star skybox.
     * This cartesian is used to scale the final diffuse and specular lighting
     * contribution from those sources to the final color. A value of 0.0 will
     * disable those light sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageBasedLighting.html#imageBasedLightingFactor">Online Documentation</a>
     */
    var imageBasedLightingFactor: Cartesian2

    /**
     * The sun's luminance at the zenith in kilo candela per meter squared
     * to use for this model's procedural environment map. This is used when
     * [ImageBasedLighting.specularEnvironmentMaps] and [ImageBasedLighting.sphericalHarmonicCoefficients]
     * are not defined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageBasedLighting.html#luminanceAtZenith">Online Documentation</a>
     */
    var luminanceAtZenith: Double

    /**
     * The third order spherical harmonic coefficients used for the diffuse color of image-based lighting. When `undefined`, a diffuse irradiance
     * computed from the atmosphere color is used.
     *
     * There are nine `Cartesian3` coefficients.
     * The order of the coefficients is: L<sub>0,0</sub>, L<sub>1,-1</sub>, L<sub>1,0</sub>, L<sub>1,1</sub>, L<sub>2,-2</sub>, L<sub>2,-1</sub>, L<sub>2,0</sub>, L<sub>2,1</sub>, L<sub>2,2</sub>
     *
     * These values can be obtained by preprocessing the environment map using the `cmgen` tool of
     * [Google's Filament project](https://github.com/google/filament/releases). This will also generate a KTX file that can be
     * supplied to [Model.specularEnvironmentMaps].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageBasedLighting.html#sphericalHarmonicCoefficients">Online Documentation</a>
     */
    var sphericalHarmonicCoefficients: Array<out Cartesian3>

    /**
     * A URL to a KTX2 file that contains a cube map of the specular lighting and the convoluted specular mipmaps.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageBasedLighting.html#specularEnvironmentMaps">Online Documentation</a>
     */
    var specularEnvironmentMaps: String
}
