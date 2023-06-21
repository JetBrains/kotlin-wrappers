// Automatically generated - do not modify!

package web.media.devices

import js.core.ReadonlyArray
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import web.media.streams.MediaStream
import web.media.streams.MediaStreamConstraints
import web.media.streams.MediaTrackSupportedConstraints
import kotlin.js.Promise

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
