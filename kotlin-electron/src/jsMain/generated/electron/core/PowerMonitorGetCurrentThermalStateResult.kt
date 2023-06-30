package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{unknown: 'unknown', nominal: 'nominal', fair: 'fair', serious: 'serious', critical: 'critical'}/*union*/)""")
sealed external interface PowerMonitorGetCurrentThermalStateResult {
    companion object {
        val unknown: PowerMonitorGetCurrentThermalStateResult
        val nominal: PowerMonitorGetCurrentThermalStateResult
        val fair: PowerMonitorGetCurrentThermalStateResult
        val serious: PowerMonitorGetCurrentThermalStateResult
        val critical: PowerMonitorGetCurrentThermalStateResult
    }
}
