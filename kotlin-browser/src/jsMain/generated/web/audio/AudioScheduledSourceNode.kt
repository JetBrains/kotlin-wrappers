// Automatically generated - do not modify!

package web.audio

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioScheduledSourceNode)
 */
sealed external class AudioScheduledSourceNode :
    AudioNode {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioScheduledSourceNode/ended_event)
     */
    var onended: EventHandler<Event, AudioScheduledSourceNode, EventTarget>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioScheduledSourceNode/start)
     */
    fun start(`when`: Double = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioScheduledSourceNode/stop)
     */
    fun stop(`when`: Double = definedExternally)
}
