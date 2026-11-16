// Automatically generated - do not modify!

package web.speech

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/available_static#options)
 */
@JsPlainObject
external interface SpeechRecognitionOptions {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/available_static#langs)
     */
    var langs: ReadonlyArray<JsString>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/available_static#processlocally)
     */
    var processLocally: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognition/available_static#quality)
     */
    var quality: SpeechRecognitionQuality?
}
