package js.function

import js.array.JsTuple

@JsExternalInheritorsOnly
external interface JsConstructorFunction<in A : JsTuple, R : Any> : JsClass<R>
