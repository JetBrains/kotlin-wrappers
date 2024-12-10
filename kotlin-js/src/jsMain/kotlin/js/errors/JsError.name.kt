package js.errors

import js.reflect.unsafeCast

inline var JsError.name: JsErrorName
    get() = unsafeCast<HasErrorName>(this).name
    set(value) {
        unsafeCast<HasErrorName>(this).name = value
    }

@PublishedApi
internal external interface HasErrorName {
    var name: JsErrorName
}
