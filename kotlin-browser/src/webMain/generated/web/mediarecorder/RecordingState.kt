// Automatically generated - do not modify!

package web.mediarecorder

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RecordingState

inline val RecordingState.Companion.inactive: RecordingState
    get() = unsafeCast("inactive")

inline val RecordingState.Companion.paused: RecordingState
    get() = unsafeCast("paused")

inline val RecordingState.Companion.recording: RecordingState
    get() = unsafeCast("recording")
