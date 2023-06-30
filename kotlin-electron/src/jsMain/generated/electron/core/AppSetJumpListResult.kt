package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{ok: 'ok', error: 'error', invalidSeparatorError: 'invalidSeparatorError', fileTypeRegistrationError: 'fileTypeRegistrationError', customCategoryAccessDeniedError: 'customCategoryAccessDeniedError'}/*union*/)""")
sealed external interface AppSetJumpListResult {
    companion object {
        val ok: AppSetJumpListResult
        val error: AppSetJumpListResult
        val invalidSeparatorError: AppSetJumpListResult
        val fileTypeRegistrationError: AppSetJumpListResult
        val customCategoryAccessDeniedError: AppSetJumpListResult
    }
}
