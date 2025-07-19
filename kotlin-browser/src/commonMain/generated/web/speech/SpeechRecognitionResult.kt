// Automatically generated - do not modify!

package web.speech

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * The **`SpeechRecognitionResult`** interface of the Web Speech API represents a single recognition match, which may contain multiple SpeechRecognitionAlternative objects.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionResult)
 */
open external class SpeechRecognitionResult
private constructor() :
    ArrayLike<SpeechRecognitionAlternative>,
    JsIterable<SpeechRecognitionAlternative> {
    /**
     * The **`isFinal`** read-only property of the whether this result is final (`true`) or not (`false`) — if so, then this is the final time this result will be returned; if not, then this result is an interim result, and may be updated later on.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionResult/isFinal)
     */
    val isFinal: Boolean

    /**
     * The **`length`** read-only property of the — the number of SpeechRecognitionAlternative objects contained in the result (also referred to as 'n-best alternatives'.) The number of alternatives contained in the result depends on what the recognition was first initiated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionResult/length)
     */
    override val length: Int

    /**
     * The **`item`** getter of the array syntax.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionResult/item)
     */
    fun item(index: Int): SpeechRecognitionAlternative
}
