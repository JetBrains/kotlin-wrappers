@file:Suppress(
    "EXPECTED_EXTERNAL_DECLARATION",
)

package js.errors

expect open external class JsError {
    open val message: String?
}
