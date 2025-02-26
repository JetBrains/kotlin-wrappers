package js.errors

@JsName("Error")
actual open external class JsError {
    actual open val message: String?
}
