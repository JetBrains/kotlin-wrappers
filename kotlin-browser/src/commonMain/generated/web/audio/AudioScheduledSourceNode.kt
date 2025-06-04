// Automatically generated - do not modify!

package web.audio

import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.JsEvent
import kotlin.js.definedExternally

/**
 * The `AudioScheduledSourceNode` interface—part of the Web Audio API—is a parent interface for several types of audio source node interfaces which share the ability to be started and stopped, optionally at specified times.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioScheduledSourceNode)
 */
open external class AudioScheduledSourceNode
private constructor() :
    AudioNode {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioScheduledSourceNode/ended_event)
     */
    var onended: EventHandler<Event, AudioScheduledSourceNode, AudioScheduledSourceNode>?

    /**
     * The `start()` method on AudioScheduledSourceNode schedules a sound to begin playback at the specified time.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioScheduledSourceNode/start)
     */
    fun start(`when`: Double = definedExternally)

    /**
     * The `stop()` method on AudioScheduledSourceNode schedules a sound to cease playback at the specified time.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioScheduledSourceNode/stop)
     */
    fun stop(`when`: Double = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioScheduledSourceNode/ended_event)
     */
    @JsEvent("ended")
    val endedEvent: EventInstance<Event, AudioScheduledSourceNode /* this */, AudioScheduledSourceNode /* this */>
}
