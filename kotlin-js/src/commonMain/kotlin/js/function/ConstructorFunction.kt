package js.function

import js.array.Tuple
import js.core.JsAny
import js.reflect.JsClass
import js.reflect.JsExternalInheritorsOnly

@JsExternalInheritorsOnly
external interface ConstructorFunction<in A : Tuple, R : JsAny> :
    JsClass<R>
