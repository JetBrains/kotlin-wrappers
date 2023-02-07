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
    var ondevicechange: EventHandler<Event>?
    fun enumerateDevices(): Promise<ReadonlyArray<MediaDeviceInfo>>
    fun getDisplayMedia(options: DisplayMediaStreamOptions = definedExternally): Promise<MediaStream>
    fun getSupportedConstraints(): MediaTrackSupportedConstraints
    fun getUserMedia(constraints: MediaStreamConstraints = definedExternally): Promise<MediaStream>
}
