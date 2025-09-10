package js.function

import js.array.Tuple
import js.reflect.JsClass
import js.reflect.JsExternalInheritorsOnly
import kotlin.js.JsAny

@JsExternalInheritorsOnly
external interface ConstructorFunction<in A : Tuple, R : JsAny> :
    JsClass<R>
