// Automatically generated - do not modify!

package web.vtt

import web.events.*

/**
 * The **`TextTrack`** interface of the WebVTT API represents a text track associated with a media element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack)
 */
external class TextTrack
private constructor() :
    EventTarget {
    /**
     * The **`activeCues`** read-only property of the TextTrack interface returns a TextTrackCueList object listing the currently active cues.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/activeCues)
     */
    val activeCues: TextTrackCueList?

    /**
     * The **`cues`** read-only property of the TextTrack interface returns a TextTrackCueList object containing all of the track's cues.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/cues)
     */
    val cues: TextTrackCueList?

    /**
     * The **`id`** read-only property of the TextTrack interface returns the ID of the track if it has one.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/id)
     */
    val id: String

    /**
     * The **`inBandMetadataTrackDispatchType`** read-only property of the TextTrack interface returns the text track's in-band metadata dispatch type of the text track represented by the TextTrack object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/inBandMetadataTrackDispatchType)
     */
    val inBandMetadataTrackDispatchType: String

    /**
     * The **`kind`** read-only property of the TextTrack interface returns the kind of text track this object represents.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/kind)
     */
    val kind: TextTrackKind

    /**
     * The **`label`** read-only property of the TextTrack interface returns a human-readable label for the text track, if it is available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/label)
     */
    val label: String

    /**
     * The **`language`** read-only property of the TextTrack interface returns the language of the text track.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/language)
     */
    val language: String

    /**
     * The TextTrack interface's **`mode`** property is a string specifying and controlling the text track's mode: `disabled`, `hidden`, or `showing`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/mode)
     */
    var mode: TextTrackMode

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/cuechange_event)
     */
    var oncuechange: EventHandler<Event, TextTrack, TextTrack>?

    /**
     * The **`addCue()`** method of the TextTrack interface adds a new cue to the list of cues.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/addCue)
     */
    fun addCue(cue: TextTrackCue)

    /**
     * The **`removeCue()`** method of the TextTrack interface removes a cue from the list of cues.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/removeCue)
     */
    fun removeCue(cue: TextTrackCue)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/cuechange_event)
     */
    @JsEvent("cuechange")
    val cueChangeEvent: EventInstance<Event, TextTrack /* this */, TextTrack /* this */>
}
