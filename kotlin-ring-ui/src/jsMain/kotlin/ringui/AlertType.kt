@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package ringui

@JsName("null")
sealed external interface AlertType {
    companion object
}

inline val AlertType.Companion.error: AlertType
    get() = "error".unsafeCast<AlertType>()

inline val AlertType.Companion.message: AlertType
    get() = "message".unsafeCast<AlertType>()

inline val AlertType.Companion.success: AlertType
    get() = "success".unsafeCast<AlertType>()

inline val AlertType.Companion.warning: AlertType
    get() = "warning".unsafeCast<AlertType>()

inline val AlertType.Companion.loading: AlertType
    get() = "loading".unsafeCast<AlertType>()
