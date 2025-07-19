// Automatically generated - do not modify!

package web.mediadevices

import js.array.ReadonlyArray
import js.promise.Promise
import js.promise.await
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import web.mediastreams.MediaStream
import web.mediastreams.MediaStreamConstraints
import web.mediastreams.MediaTrackSupportedConstraints
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`MediaDevices`** interface of the Media Capture and Streams API provides access to connected media input devices like cameras and microphones, as well as screen sharing.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices)
 */
open external class MediaDevices
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/devicechange_event)
     */
    var ondevicechange: EventHandler<Event, MediaDevices, MediaDevices>?

    /**
     * The **`enumerateDevices()`** method of the MediaDevices interface requests a list of the currently available media input and output devices, such as microphones, cameras, headsets, and so forth.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/enumerateDevices)
     */
    @JsName("enumerateDevices")
    fun enumerateDevicesAsync(): Promise<ReadonlyArray<MediaDeviceInfo>>

    /**
     * The **`getDisplayMedia()`** method of the MediaDevices interface prompts the user to select and grant permission to capture the contents of a display or portion thereof (such as a window) as a MediaStream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getDisplayMedia)
     */
    @JsName("getDisplayMedia")
    fun getDisplayMediaAsync(options: DisplayMediaStreamOptions = definedExternally): Promise<MediaStream>

    /**
     * The **`getSupportedConstraints()`** method of the MediaDevices interface returns an object based on the MediaTrackSupportedConstraints dictionary, whose member fields each specify one of the constrainable properties the user agent understands.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getSupportedConstraints)
     */
    fun getSupportedConstraints(): MediaTrackSupportedConstraints

    /**
     * The **`getUserMedia()`** method of the MediaDevices interface prompts the user for permission to use a media input which produces a MediaStream with tracks containing the requested types of media.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getUserMedia)
     */
    @JsName("getUserMedia")
    fun getUserMediaAsync(constraints: MediaStreamConstraints = definedExternally): Promise<MediaStream>
}

/**
 * The **`enumerateDevices()`** method of the MediaDevices interface requests a list of the currently available media input and output devices, such as microphones, cameras, headsets, and so forth.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/enumerateDevices)
 */
suspend inline fun MediaDevices.enumerateDevices(): ReadonlyArray<MediaDeviceInfo> {
    return enumerateDevicesAsync().await()
}

/**
 * The **`getDisplayMedia()`** method of the MediaDevices interface prompts the user to select and grant permission to capture the contents of a display or portion thereof (such as a window) as a MediaStream.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getDisplayMedia)
 */
suspend inline fun MediaDevices.getDisplayMedia(options: DisplayMediaStreamOptions): MediaStream {
    return getDisplayMediaAsync(
        options = options,
    ).await()
}

/**
 * The **`getDisplayMedia()`** method of the MediaDevices interface prompts the user to select and grant permission to capture the contents of a display or portion thereof (such as a window) as a MediaStream.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getDisplayMedia)
 */
suspend inline fun MediaDevices.getDisplayMedia(): MediaStream {
    return getDisplayMediaAsync().await()
}

/**
 * The **`getUserMedia()`** method of the MediaDevices interface prompts the user for permission to use a media input which produces a MediaStream with tracks containing the requested types of media.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getUserMedia)
 */
suspend inline fun MediaDevices.getUserMedia(constraints: MediaStreamConstraints): MediaStream {
    return getUserMediaAsync(
        constraints = constraints,
    ).await()
}

/**
 * The **`getUserMedia()`** method of the MediaDevices interface prompts the user for permission to use a media input which produces a MediaStream with tracks containing the requested types of media.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getUserMedia)
 */
suspend inline fun MediaDevices.getUserMedia(): MediaStream {
    return getUserMediaAsync().await()
}
