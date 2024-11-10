// Automatically generated - do not modify!

package web.media.devices

import js.array.ReadonlyArray
import js.promise.Promise
import seskar.js.JsAsync
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import web.media.streams.MediaStream
import web.media.streams.MediaStreamConstraints
import web.media.streams.MediaTrackSupportedConstraints

/**
 * Provides access to connected media input devices like cameras and microphones, as well as screen sharing. In essence, it lets you obtain access to any hardware source of media data.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices)
 */
external class MediaDevices
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/devicechange_event)
     */
    var ondevicechange: EventHandler<Event, MediaDevices, MediaDevices>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/enumerateDevices)
     */
    @JsAsync
    suspend fun enumerateDevices(): ReadonlyArray<MediaDeviceInfo>

    @JsName("enumerateDevices")
    fun enumerateDevicesAsync(): Promise<ReadonlyArray<MediaDeviceInfo>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getDisplayMedia)
     */
    @JsAsync
    suspend fun getDisplayMedia(options: DisplayMediaStreamOptions = definedExternally): MediaStream

    @JsName("getDisplayMedia")
    fun getDisplayMediaAsync(options: DisplayMediaStreamOptions = definedExternally): Promise<MediaStream>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getSupportedConstraints)
     */
    fun getSupportedConstraints(): MediaTrackSupportedConstraints

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getUserMedia)
     */
    @JsAsync
    suspend fun getUserMedia(constraints: MediaStreamConstraints = definedExternally): MediaStream

    @JsName("getUserMedia")
    fun getUserMediaAsync(constraints: MediaStreamConstraints = definedExternally): Promise<MediaStream>
}
