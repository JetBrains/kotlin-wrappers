package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{none: 'none', code: 'code', bypassHeatCheck: 'bypassHeatCheck', bypassHeatCheckAndEagerCompile: 'bypassHeatCheckAndEagerCompile'}/*union*/)""")
sealed external interface WebPreferencesV8CacheOptions {
    companion object {
        val none: WebPreferencesV8CacheOptions
        val code: WebPreferencesV8CacheOptions
        val bypassHeatCheck: WebPreferencesV8CacheOptions
        val bypassHeatCheckAndEagerCompile: WebPreferencesV8CacheOptions
    }
}
