package js.function

import js.array.JsTuple
import js.reflect.JsExternalInheritorsOnly

@JsExternalInheritorsOnly
external interface JsConstructorFunction<in A : JsTuple, R : Any> :
    JsClass<R>
