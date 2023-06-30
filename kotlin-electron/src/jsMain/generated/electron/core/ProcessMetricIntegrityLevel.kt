package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{untrusted: 'untrusted', low: 'low', medium: 'medium', high: 'high', unknown: 'unknown'}/*union*/)""")
sealed external interface ProcessMetricIntegrityLevel {
    companion object {
        val untrusted: ProcessMetricIntegrityLevel
        val low: ProcessMetricIntegrityLevel
        val medium: ProcessMetricIntegrityLevel
        val high: ProcessMetricIntegrityLevel
        val unknown: ProcessMetricIntegrityLevel
    }
}
