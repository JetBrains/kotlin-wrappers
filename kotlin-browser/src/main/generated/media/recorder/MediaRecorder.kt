// Automatically generated - do not modify!

package media.recorder

import media.streams.MediaStream
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

external class MediaRecorder(
    stream: MediaStream,
    options: MediaRecorderOptions = definedExternally,
) : EventTarget {
    val audioBitsPerSecond: Int
    val mimeType: String
    var ondataavailable: EventHandler<BlobEvent>?
    var onerror: EventHandler<Event>?
    var onpause: EventHandler<Event>?
    var onresume: EventHandler<Event>?
    var onstart: EventHandler<Event>?
    var onstop: EventHandler<Event>?
    val state: RecordingState
    val stream: MediaStream
    val videoBitsPerSecond: Int
    fun pause()
    fun requestData()
    fun resume()
    fun start(timeslice: Number = definedExternally)
    fun stop()

    companion object {
        fun isTypeSupported(type: String): Boolean
    }
}
