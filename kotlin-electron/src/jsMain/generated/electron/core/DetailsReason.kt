package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{cleanExit: 'clean-exit', abnormalExit: 'abnormal-exit', killed: 'killed', crashed: 'crashed', oom: 'oom', launchFailed: 'launch-failed', integrityFailure: 'integrity-failure'}/*union*/)""")
sealed external interface DetailsReason {
    companion object {
        val cleanExit: DetailsReason
        val abnormalExit: DetailsReason
        val killed: DetailsReason
        val crashed: DetailsReason
        val oom: DetailsReason
        val launchFailed: DetailsReason
        val integrityFailure: DetailsReason
    }
}
