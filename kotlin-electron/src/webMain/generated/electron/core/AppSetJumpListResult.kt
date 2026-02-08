// Automatically generated - do not modify!

package electron.core

sealed external interface AppSetJumpListResult {
    companion object
}

inline val AppSetJumpListResult.Companion.ok: AppSetJumpListResult
    get() = js.reflect.unsafeCast("ok")

inline val AppSetJumpListResult.Companion.error: AppSetJumpListResult
    get() = js.reflect.unsafeCast("error")

inline val AppSetJumpListResult.Companion.invalidSeparatorError: AppSetJumpListResult
    get() = js.reflect.unsafeCast("invalidSeparatorError")

inline val AppSetJumpListResult.Companion.fileTypeRegistrationError: AppSetJumpListResult
    get() = js.reflect.unsafeCast("fileTypeRegistrationError")

inline val AppSetJumpListResult.Companion.customCategoryAccessDeniedError: AppSetJumpListResult
    get() = js.reflect.unsafeCast("customCategoryAccessDeniedError")
