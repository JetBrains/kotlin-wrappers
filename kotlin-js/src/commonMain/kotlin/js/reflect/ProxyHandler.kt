package js.reflect

import js.array.ReadonlyArray
import js.core.JsAny
import js.function.JsFunction
import js.objects.JsPlainObject
import js.objects.PropertyKey
import js.objects.TypedPropertyDescriptor

@JsPlainObject
external interface ProxyHandler<in T : JsAny> {
    val apply: ((target: T, thisArg: JsAny, argArray: ReadonlyArray<JsAny>) -> JsAny)?
    val construct: ((target: T, argArray: ReadonlyArray<JsAny>, newTarget: JsFunction<*, *>) -> JsAny)?
    val defineProperty: ((target: T, p: PropertyKey, attributes: TypedPropertyDescriptor<*>) -> Boolean)?
    val deleteProperty: ((target: T, p: PropertyKey) -> Boolean)?
    val get: ((target: T, p: PropertyKey, receiver: JsAny) -> JsAny)?
    val getOwnPropertyDescriptor: ((target: T, p: PropertyKey) -> TypedPropertyDescriptor<*>)?
    val getPrototypeOf: ((target: T) -> JsAny?)?
    val has: ((target: T, p: PropertyKey) -> Boolean)?
    val isExtensible: ((target: T) -> Boolean)?
    val ownKeys: ((target: T) -> ReadonlyArray<PropertyKey>)?
    val preventExtensions: ((target: T) -> Boolean)?
    val set: ((target: T, p: PropertyKey, value: JsAny, receiver: JsAny) -> Boolean)?
    val setPrototypeOf: ((target: T, v: JsAny?) -> Boolean)?
}
