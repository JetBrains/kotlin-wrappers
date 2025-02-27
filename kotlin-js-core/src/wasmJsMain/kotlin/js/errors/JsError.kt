package js.errors

@JsName("Error")
actual open external class JsError : JsAny {
    actual open val message: String?
}
