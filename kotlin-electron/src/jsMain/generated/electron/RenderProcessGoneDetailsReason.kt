package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{cleanExit: 'clean-exit', abnormalExit: 'abnormal-exit', killed: 'killed', crashed: 'crashed', oom: 'oom', launchFailed: 'launch-failed', integrityFailure: 'integrity-failure'}/*union*/)""")
sealed external interface RenderProcessGoneDetailsReason {
    companion object {
        val cleanExit: RenderProcessGoneDetailsReason
        val abnormalExit: RenderProcessGoneDetailsReason
        val killed: RenderProcessGoneDetailsReason
        val crashed: RenderProcessGoneDetailsReason
        val oom: RenderProcessGoneDetailsReason
        val launchFailed: RenderProcessGoneDetailsReason
        val integrityFailure: RenderProcessGoneDetailsReason
    }
}
