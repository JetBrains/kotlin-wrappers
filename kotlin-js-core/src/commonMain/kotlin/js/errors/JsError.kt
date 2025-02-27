@file:Suppress(
    "EXPECTED_EXTERNAL_DECLARATION",
)

package js.errors

expect open external class JsError {
    constructor()
    constructor(message: String?)

    open val message: String?
}
