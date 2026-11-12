// Automatically generated - do not modify!

package web.speech

import js.array.ReadonlyArray
import js.promise.Promise
import js.promise.await
import web.errors.DOMExceptionType.InvalidStateError
import web.errors.DOMExceptionType.SyntaxError
import web.errors.JsThrows
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.mediastreams.MediaStreamTrack

/**
 * The **`SpeechRecognition`** interface of the Web Speech API is the controller interface for the recognition service; this also handles the SpeechRecognitionEvent sent from the recognition service.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition)
 */
open external class SpeechRecognition :
    EventTarget {
    /**
     * The **`continuous`** property of the SpeechRecognition interface controls whether continuous results are returned for each recognition, or only a single result.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/continuous)
     */
    open var continuous: Boolean

    /**
     * The **`interimResults`** property of the SpeechRecognition interface controls whether interim results should be returned (true) or not (false). Interim results are results that are not yet final (e.g., the SpeechRecognitionResult.isFinal property is false).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/interimResults)
     */
    open var interimResults: Boolean

    /**
     * The **`lang`** property of the SpeechRecognition interface returns and sets the language of the current SpeechRecognition. If not specified, this defaults to the HTML lang attribute value, or the user agent's language setting if that isn't set either.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/lang)
     */
    open var lang: String

    /**
     * The **`maxAlternatives`** property of the SpeechRecognition interface sets the maximum number of SpeechRecognitionAlternatives provided per SpeechRecognitionResult.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/maxAlternatives)
     */
    open var maxAlternatives: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/audioend_event)
     */
    open var onaudioend: EventHandler<Event, SpeechRecognition, SpeechRecognition>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/audiostart_event)
     */
    open var onaudiostart: EventHandler<Event, SpeechRecognition, SpeechRecognition>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/end_event)
     */
    open var onend: EventHandler<Event, SpeechRecognition, SpeechRecognition>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/error_event)
     */
    open var onerror: EventHandler<SpeechRecognitionErrorEvent, SpeechRecognition, SpeechRecognition>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/nomatch_event)
     */
    open var onnomatch: EventHandler<SpeechRecognitionEvent, SpeechRecognition, SpeechRecognition>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/result_event)
     */
    open var onresult: EventHandler<SpeechRecognitionEvent, SpeechRecognition, SpeechRecognition>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/soundend_event)
     */
    open var onsoundend: EventHandler<Event, SpeechRecognition, SpeechRecognition>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/soundstart_event)
     */
    open var onsoundstart: EventHandler<Event, SpeechRecognition, SpeechRecognition>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/speechend_event)
     */
    open var onspeechend: EventHandler<Event, SpeechRecognition, SpeechRecognition>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/speechstart_event)
     */
    open var onspeechstart: EventHandler<Event, SpeechRecognition, SpeechRecognition>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/start_event)
     */
    open var onstart: EventHandler<Event, SpeechRecognition, SpeechRecognition>?

    /**
     * The **`phrases`** property of the SpeechRecognition interface sets an array of SpeechRecognitionPhrase objects to be used for contextual biasing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/phrases)
     */
    open var phrases: ReadonlyArray<SpeechRecognitionPhrase>

    /**
     * The **`processLocally`** property of the SpeechRecognition interface specifies whether speech recognition must be performed locally on the user's device.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/processLocally)
     */
    open var processLocally: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/unspokenPunctuation)
     */
    open var unspokenPunctuation: Boolean

    /**
     * The **`abort()`** method of the Web Speech API stops the speech recognition service from listening to incoming audio, and doesn't attempt to return a SpeechRecognitionResult.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/abort)
     */
    open fun abort()

    /**
     * The **`start()`** method of the Web Speech API starts the speech recognition service to listen for incoming audio (from a microphone or an audio track) and returns the results of that recognition.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/start)
     */
    @JsThrows(InvalidStateError::class)
    open fun start()

    @JsThrows(InvalidStateError::class)
    open fun start(audioTrack: MediaStreamTrack)

    /**
     * The **`stop()`** method of the Web Speech API stops the speech recognition service from listening for incoming audio and attempts to return a SpeechRecognitionResult based on the results captured so far.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/stop)
     */
    open fun stop()

    companion object {
        /**
         * The **`available()`** static method of the Web Speech API checks whether the specified languages are available for speech recognition.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/available_static)
         */
        @JsThrows(InvalidStateError::class)
        @JsThrows(SyntaxError::class)
        @JsName("available")
        fun availableAsync(options: SpeechRecognitionOptions): Promise<SpeechRecognitionAvailabilityStatus>

        /**
         * The **`install()`** static method of the Web Speech API installs the required language packs for on-device speech recognition in the specified languages.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/install_static)
         */
        @JsThrows(InvalidStateError::class)
        @JsThrows(SyntaxError::class)
        @JsName("install")
        fun installAsync(options: SpeechRecognitionOptions): Promise<JsBoolean>
    }
}

/**
 * The **`available()`** static method of the Web Speech API checks whether the specified languages are available for speech recognition.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/available_static)
 */
@JsThrows(InvalidStateError::class)
@JsThrows(SyntaxError::class)
suspend inline fun SpeechRecognition.Companion.available(options: SpeechRecognitionOptions): SpeechRecognitionAvailabilityStatus {
    return availableAsync(
        options = options,
    ).await()
}

/**
 * The **`install()`** static method of the Web Speech API installs the required language packs for on-device speech recognition in the specified languages.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/install_static)
 */
@JsThrows(InvalidStateError::class)
@JsThrows(SyntaxError::class)
suspend inline fun SpeechRecognition.Companion.install(options: SpeechRecognitionOptions): Boolean {
    return installAsync(
        options = options,
    ).await().toBoolean()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/audioend_event)
 */
inline val <C : SpeechRecognition> C.audioEndEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "audioend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/audiostart_event)
 */
inline val <C : SpeechRecognition> C.audioStartEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "audiostart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/end_event)
 */
inline val <C : SpeechRecognition> C.endEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "end")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/error_event)
 */
inline val <C : SpeechRecognition> C.errorEvent: EventInstance<SpeechRecognitionErrorEvent, C, C>
    get() = EventInstance(this, "error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/nomatch_event)
 */
inline val <C : SpeechRecognition> C.noMatchEvent: EventInstance<SpeechRecognitionEvent, C, C>
    get() = EventInstance(this, "nomatch")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/result_event)
 */
inline val <C : SpeechRecognition> C.resultEvent: EventInstance<SpeechRecognitionEvent, C, C>
    get() = EventInstance(this, "result")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/soundend_event)
 */
inline val <C : SpeechRecognition> C.soundEndEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "soundend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/soundstart_event)
 */
inline val <C : SpeechRecognition> C.soundStartEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "soundstart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/speechend_event)
 */
inline val <C : SpeechRecognition> C.speechEndEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "speechend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/speechstart_event)
 */
inline val <C : SpeechRecognition> C.speechStartEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "speechstart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/start_event)
 */
inline val <C : SpeechRecognition> C.startEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "start")
