// Generated by Karakum - do not modify it manually!

package electron.core


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface AppSetJumpListResult {
    companion object {
        @seskar.js.JsValue("ok")
        val ok: AppSetJumpListResult

        @seskar.js.JsValue("error")
        val error: AppSetJumpListResult

        @seskar.js.JsValue("invalidSeparatorError")
        val invalidSeparatorError: AppSetJumpListResult

        @seskar.js.JsValue("fileTypeRegistrationError")
        val fileTypeRegistrationError: AppSetJumpListResult

        @seskar.js.JsValue("customCategoryAccessDeniedError")
        val customCategoryAccessDeniedError: AppSetJumpListResult
    }
}
