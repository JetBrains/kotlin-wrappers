package js.errors

actual typealias JsError = Throwable

inline var JsError.name: JsErrorName
    get() = asDynamic().name
    set(value) {
        asDynamic().name = value
    }
