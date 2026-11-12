// Automatically generated - do not modify!

package web.speech

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface SpeechRecognitionAvailabilityStatus

inline val SpeechRecognitionAvailabilityStatus.Companion.available: SpeechRecognitionAvailabilityStatus
    get() = unsafeCast("available")

inline val SpeechRecognitionAvailabilityStatus.Companion.downloadable: SpeechRecognitionAvailabilityStatus
    get() = unsafeCast("downloadable")

inline val SpeechRecognitionAvailabilityStatus.Companion.downloading: SpeechRecognitionAvailabilityStatus
    get() = unsafeCast("downloading")

inline val SpeechRecognitionAvailabilityStatus.Companion.unavailable: SpeechRecognitionAvailabilityStatus
    get() = unsafeCast("unavailable")
