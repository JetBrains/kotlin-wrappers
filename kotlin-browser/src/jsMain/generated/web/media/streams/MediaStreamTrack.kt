// Automatically generated - do not modify!

package web.media.streams

import js.core.Void
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import kotlin.js.Promise

/**
 * A single media track within a stream; typically, these are audio or video tracks, but other track types may exist as well.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack)
 */
sealed external class MediaStreamTrack :
    EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/contentHint) */
    var contentHint: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/enabled) */
    var enabled: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/id) */
    val id: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/kind) */
    val kind: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/label) */
    val label: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/muted) */
    val muted: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/ended_event) */
    var onended: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/mute_event) */
    var onmute: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/unmute_event) */
    var onunmute: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/readyState) */
    val readyState: MediaStreamTrackState

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/applyConstraints) */
    fun applyConstraints(constraints: MediaTrackConstraints = definedExternally): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/clone) */
    fun clone(): MediaStreamTrack

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/getCapabilities) */
    fun getCapabilities(): MediaTrackCapabilities

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/getConstraints) */
    fun getConstraints(): MediaTrackConstraints

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/getSettings) */
    fun getSettings(): MediaTrackSettings

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/stop) */
    fun stop()
}
