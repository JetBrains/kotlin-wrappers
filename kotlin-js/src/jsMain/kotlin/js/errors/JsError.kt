package js.errors

typealias JsError = Throwable

inline var JsError.name: JsErrorName
    get() = asDynamic().name
    set(value) {
        asDynamic().name = value
    }
