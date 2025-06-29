// Automatically generated - do not modify!

package web.imagecapture

import js.promise.Promise
import seskar.js.JsAsync
import web.blob.Blob
import web.images.ImageBitmap
import web.mediastreams.MediaStreamTrack
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`ImageCapture`** interface of the MediaStream Image Capture API provides methods to enable the capture of images or photos from a camera or other photographic device.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageCapture)
 */
open external class ImageCapture(
    videoTrack: MediaStreamTrack,
) {
    /**
     * The **`track`** read-only property of the A MediaStreamTrack object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageCapture/track)
     */
    val track: MediaStreamTrack

    /**
     * The **`getPhotoCapabilities()`** method of the ImageCapture interface returns a Promise that resolves with an object containing the ranges of available configuration options.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageCapture/getPhotoCapabilities)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun getPhotoCapabilities(): PhotoCapabilities

    @JsName("getPhotoCapabilities")
    fun getPhotoCapabilitiesAsync(): Promise<PhotoCapabilities>

    /**
     * The **`getPhotoSettings()`** method of the ImageCapture interface returns a Promise that resolves with an object containing the current photo configuration settings.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageCapture/getPhotoSettings)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun getPhotoSettings(): PhotoSettings

    @JsName("getPhotoSettings")
    fun getPhotoSettingsAsync(): Promise<PhotoSettings>

    /**
     * The **`grabFrame()`** method of the a ImageBitmap containing the snapshot.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageCapture/grabFrame)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun grabFrame(): ImageBitmap

    @JsName("grabFrame")
    fun grabFrameAsync(): Promise<ImageBitmap>

    /**
     * The **`takePhoto()`** method of the device sourcing a MediaStreamTrack and returns a Promise that resolves with a Blob containing the data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageCapture/takePhoto)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun takePhoto(photoSettings: PhotoSettings = definedExternally): Blob

    @JsName("takePhoto")
    fun takePhotoAsync(photoSettings: PhotoSettings = definedExternally): Promise<Blob>
}
