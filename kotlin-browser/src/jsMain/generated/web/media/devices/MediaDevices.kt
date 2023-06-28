// Automatically generated - do not modify!

package web.media.devices

import js.core.ReadonlyArray
import js.promise.Promise
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
sealed external class MediaDevices :
    EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/devicechange_event) */
    var ondevicechange: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/enumerateDevices) */
    fun enumerateDevices(): Promise<ReadonlyArray<MediaDeviceInfo>>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getDisplayMedia) */
    fun getDisplayMedia(options: DisplayMediaStreamOptions = definedExternally): Promise<MediaStream>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getSupportedConstraints) */
    fun getSupportedConstraints(): MediaTrackSupportedConstraints

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getUserMedia) */
    fun getUserMedia(constraints: MediaStreamConstraints = definedExternally): Promise<MediaStream>
}
