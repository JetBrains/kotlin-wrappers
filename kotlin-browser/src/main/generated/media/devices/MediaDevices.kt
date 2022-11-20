// Automatically generated - do not modify!

package media.devices

import media.streams.MediaStream
import media.streams.MediaStreamConstraints
import media.streams.MediaTrackSupportedConstraints
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import kotlin.js.Promise

sealed external class MediaDevices :
    EventTarget {
    var ondevicechange: EventHandler<Event>?
    fun enumerateDevices(): Promise<MediaDeviceInfo>
    fun getDisplayMedia(options: DisplayMediaStreamOptions = definedExternally): Promise<MediaStream>
    fun getSupportedConstraints(): MediaTrackSupportedConstraints
    fun getUserMedia(constraints: MediaStreamConstraints = definedExternally): Promise<MediaStream>
}
