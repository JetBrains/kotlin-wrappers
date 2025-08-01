// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.mediarecorder

import js.reflect.unsafeCast

sealed external interface RecordingState {
    companion object
}

inline val RecordingState.Companion.inactive: RecordingState
    get() = unsafeCast("inactive")

inline val RecordingState.Companion.paused: RecordingState
    get() = unsafeCast("paused")

inline val RecordingState.Companion.recording: RecordingState
    get() = unsafeCast("recording")
