package js.reflect

import js.array.ReadonlyArray
import js.function.JsFunction
import js.objects.PropertyKey
import js.objects.TypedPropertyDescriptor
import kotlinx.js.JsPlainObject
import kotlin.js.JsAny

@JsPlainObject
external interface ProxyHandler<T : JsAny> {
    var apply: ((target: T, thisArg: JsAny, argArray: ReadonlyArray<JsAny>) -> JsAny)?
    var construct: ((target: T, argArray: ReadonlyArray<JsAny>, newTarget: JsFunction<*, *>) -> JsAny)?
    var defineProperty: ((target: T, p: PropertyKey, attributes: TypedPropertyDescriptor<*>) -> Boolean)?
    var deleteProperty: ((target: T, p: PropertyKey) -> Boolean)?
    var get: ((target: T, p: PropertyKey, receiver: JsAny) -> JsAny)?
    var getOwnPropertyDescriptor: ((target: T, p: PropertyKey) -> TypedPropertyDescriptor<*>)?
    var getPrototypeOf: ((target: T) -> JsAny?)?
    var has: ((target: T, p: PropertyKey) -> Boolean)?
    var isExtensible: ((target: T) -> Boolean)?
    var ownKeys: ((target: T) -> ReadonlyArray<PropertyKey>)?
    var preventExtensions: ((target: T) -> Boolean)?
    var set: ((target: T, p: PropertyKey, value: JsAny, receiver: JsAny) -> Boolean)?
    var setPrototypeOf: ((target: T, v: JsAny?) -> Boolean)?
}
