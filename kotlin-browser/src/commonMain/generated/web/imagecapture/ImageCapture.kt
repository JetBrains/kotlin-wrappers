// Automatically generated - do not modify!

package web.imagecapture

import js.promise.Promise
import seskar.js.JsAsync
import web.blob.Blob
import web.media.streams.MediaStreamTrack
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`ImageCapture`** interface of the MediaStream Image Capture API provides methods to enable the capture of images or photos from a camera or other photographic device.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageCapture)
 */
open external class ImageCapture(
    videoTrack: MediaStreamTrack,
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageCapture/track)
     */
    val track: MediaStreamTrack

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageCapture/getPhotoCapabilities)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun getPhotoCapabilities(): PhotoCapabilities

    @JsName("getPhotoCapabilities")
    fun getPhotoCapabilitiesAsync(): Promise<PhotoCapabilities>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageCapture/getPhotoSettings)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun getPhotoSettings(): PhotoSettings

    @JsName("getPhotoSettings")
    fun getPhotoSettingsAsync(): Promise<PhotoSettings>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageCapture/takePhoto)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun takePhoto(photoSettings: PhotoSettings = definedExternally): Blob

    @JsName("takePhoto")
    fun takePhotoAsync(photoSettings: PhotoSettings = definedExternally): Promise<Blob>
}
