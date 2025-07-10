// Automatically generated - do not modify!

package web.imagecapture

import js.promise.Promise
import js.promise.await
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
    @JsName("getPhotoCapabilities")
    fun getPhotoCapabilitiesAsync(): Promise<PhotoCapabilities>

    /**
     * The **`getPhotoSettings()`** method of the ImageCapture interface returns a Promise that resolves with an object containing the current photo configuration settings.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageCapture/getPhotoSettings)
     */
    @JsName("getPhotoSettings")
    fun getPhotoSettingsAsync(): Promise<PhotoSettings>

    /**
     * The **`grabFrame()`** method of the a ImageBitmap containing the snapshot.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageCapture/grabFrame)
     */
    @JsName("grabFrame")
    fun grabFrameAsync(): Promise<ImageBitmap>

    /**
     * The **`takePhoto()`** method of the device sourcing a MediaStreamTrack and returns a Promise that resolves with a Blob containing the data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageCapture/takePhoto)
     */
    @JsName("takePhoto")
    fun takePhotoAsync(photoSettings: PhotoSettings = definedExternally): Promise<Blob>
}

/**
 * The **`getPhotoCapabilities()`** method of the ImageCapture interface returns a Promise that resolves with an object containing the ranges of available configuration options.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageCapture/getPhotoCapabilities)
 */
suspend inline fun ImageCapture.getPhotoCapabilities(): PhotoCapabilities {
    return getPhotoCapabilitiesAsync().await()
}

/**
 * The **`getPhotoSettings()`** method of the ImageCapture interface returns a Promise that resolves with an object containing the current photo configuration settings.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageCapture/getPhotoSettings)
 */
suspend inline fun ImageCapture.getPhotoSettings(): PhotoSettings {
    return getPhotoSettingsAsync().await()
}

/**
 * The **`grabFrame()`** method of the a ImageBitmap containing the snapshot.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageCapture/grabFrame)
 */
suspend inline fun ImageCapture.grabFrame(): ImageBitmap {
    return grabFrameAsync().await()
}

/**
 * The **`takePhoto()`** method of the device sourcing a MediaStreamTrack and returns a Promise that resolves with a Blob containing the data.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageCapture/takePhoto)
 */
suspend inline fun ImageCapture.takePhoto(photoSettings: PhotoSettings): Blob {
    return takePhotoAsync(photoSettings = photoSettings).await()
}

/**
 * The **`takePhoto()`** method of the device sourcing a MediaStreamTrack and returns a Promise that resolves with a Blob containing the data.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageCapture/takePhoto)
 */
suspend inline fun ImageCapture.takePhoto(): Blob {
    return takePhotoAsync().await()
}
