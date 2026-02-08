// Automatically generated - do not modify!

package electron.core

sealed external interface TraceConfigRecording_mode {
    companion object
}

inline val TraceConfigRecording_mode.Companion.recordUntilFull: TraceConfigRecording_mode
    get() = js.reflect.unsafeCast("record-until-full")

inline val TraceConfigRecording_mode.Companion.recordContinuously: TraceConfigRecording_mode
    get() = js.reflect.unsafeCast("record-continuously")

inline val TraceConfigRecording_mode.Companion.recordAsMuchAsPossible: TraceConfigRecording_mode
    get() = js.reflect.unsafeCast("record-as-much-as-possible")

inline val TraceConfigRecording_mode.Companion.traceToConsole: TraceConfigRecording_mode
    get() = js.reflect.unsafeCast("trace-to-console")
