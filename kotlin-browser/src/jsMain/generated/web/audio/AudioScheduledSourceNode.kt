// Automatically generated - do not modify!

package web.audio

import web.events.Event
import web.events.EventHandler

sealed external class AudioScheduledSourceNode :
    AudioNode {
    var onended: EventHandler<Event>?
    fun start(`when`: Number = definedExternally)
    fun stop(`when`: Number = definedExternally)
}
