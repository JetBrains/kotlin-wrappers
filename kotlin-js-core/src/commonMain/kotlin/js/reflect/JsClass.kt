@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
    "EXPECTED_EXTERNAL_DECLARATION",
)

package js.reflect

expect external interface JsClass<T : Any /* JsAny */> {
    val name: String
}
