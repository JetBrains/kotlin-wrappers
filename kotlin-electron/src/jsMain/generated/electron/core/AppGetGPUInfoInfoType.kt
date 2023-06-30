package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{basic: 'basic', complete: 'complete'}/*union*/)""")
sealed external interface AppGetGPUInfoInfoType {
    companion object {
        val basic: AppGetGPUInfoInfoType
        val complete: AppGetGPUInfoInfoType
    }
}
