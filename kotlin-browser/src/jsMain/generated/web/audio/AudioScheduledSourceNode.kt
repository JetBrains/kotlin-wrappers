// Automatically generated - do not modify!

package web.audio

import web.events.Event
import web.events.EventHandler

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioScheduledSourceNode) */
sealed external class AudioScheduledSourceNode :
    AudioNode {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioScheduledSourceNode/ended_event) */
    var onended: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioScheduledSourceNode/start) */
    fun start(`when`: Number = definedExternally)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioScheduledSourceNode/stop) */
    fun stop(`when`: Number = definedExternally)
}
