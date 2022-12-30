// Automatically generated - do not modify!

package web.media.streams

import js.core.Void
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import kotlin.js.Promise

sealed external class MediaStreamTrack :
    EventTarget {
    var contentHint: String
    var enabled: Boolean
    val id: String
    val kind: String
    val label: String
    val muted: Boolean
    var onended: EventHandler<Event>?
    var onmute: EventHandler<Event>?
    var onunmute: EventHandler<Event>?
    val readyState: MediaStreamTrackState
    fun applyConstraints(constraints: MediaTrackConstraints = definedExternally): Promise<Void>
    fun clone(): MediaStreamTrack
    fun getCapabilities(): MediaTrackCapabilities
    fun getConstraints(): MediaTrackConstraints
    fun getSettings(): MediaTrackSettings
    fun stop()
}
