// Automatically generated - do not modify!

package web.mediarecorder

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/state)
 */
@JsUnion
sealed /* union */
external interface RecordingState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/state#inactive)
 */
inline val RecordingState.Companion.inactive: RecordingState
    get() = unsafeCast("inactive")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/state#paused)
 */
inline val RecordingState.Companion.paused: RecordingState
    get() = unsafeCast("paused")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/state#recording)
 */
inline val RecordingState.Companion.recording: RecordingState
    get() = unsafeCast("recording")
