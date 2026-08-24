// Automatically generated - do not modify!

package web.imagecapture

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageCapture/getPhotoCapabilities#return_value)
 */
@JsPlainObject
external interface PhotoCapabilities {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageCapture/getPhotoCapabilities#filllightmode)
     */
    var fillLightMode: ReadonlyArray<FillLightMode>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageCapture/getPhotoCapabilities#imageheight)
     */
    var imageHeight: MediaSettingsRange?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageCapture/getPhotoCapabilities#imagewidth)
     */
    var imageWidth: MediaSettingsRange?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageCapture/getPhotoCapabilities#redeyereduction)
     */
    var redEyeReduction: RedEyeReduction?
}
