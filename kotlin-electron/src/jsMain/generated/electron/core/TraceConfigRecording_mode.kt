package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{recordUntilFull: 'record-until-full', recordContinuously: 'record-continuously', recordAsMuchAsPossible: 'record-as-much-as-possible', traceToConsole: 'trace-to-console'}/*union*/)""")
sealed external interface TraceConfigRecording_mode {
    companion object {
        val recordUntilFull: TraceConfigRecording_mode
        val recordContinuously: TraceConfigRecording_mode
        val recordAsMuchAsPossible: TraceConfigRecording_mode
        val traceToConsole: TraceConfigRecording_mode
    }
}
