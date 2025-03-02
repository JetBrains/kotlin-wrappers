@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
)

package js.reflect

actual external interface JsClass<T : Any /* JsAny */> {
    actual val name: String
}
