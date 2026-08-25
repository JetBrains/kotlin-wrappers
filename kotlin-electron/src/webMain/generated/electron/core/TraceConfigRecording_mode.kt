// Automatically generated - do not modify!

package electron.core

@js.union.JsUnion
sealed external interface TraceConfigRecording_mode

inline val TraceConfigRecording_mode.Companion.recordUntilFull: TraceConfigRecording_mode
    get() = js.reflect.unsafeCast("record-until-full")

inline val TraceConfigRecording_mode.Companion.recordContinuously: TraceConfigRecording_mode
    get() = js.reflect.unsafeCast("record-continuously")

inline val TraceConfigRecording_mode.Companion.recordAsMuchAsPossible: TraceConfigRecording_mode
    get() = js.reflect.unsafeCast("record-as-much-as-possible")

inline val TraceConfigRecording_mode.Companion.traceToConsole: TraceConfigRecording_mode
    get() = js.reflect.unsafeCast("trace-to-console")
