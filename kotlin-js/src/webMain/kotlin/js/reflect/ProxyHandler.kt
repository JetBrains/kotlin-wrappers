package js.reflect

import js.array.ReadonlyArray
import js.function.JsFunction
import js.objects.PropertyKey
import js.objects.TypedPropertyDescriptor
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Proxy)
 */
@JsPlainObject
external interface ProxyHandler<T : JsAny> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Proxy/Proxy/apply)
     */
    var apply: ((target: T, thisArg: JsAny, argArray: ReadonlyArray<JsAny>) -> JsAny)?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Proxy/Proxy/construct)
     */
    var construct: ((target: T, argArray: ReadonlyArray<JsAny>, newTarget: JsFunction<*, *>) -> JsAny)?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Proxy/Proxy/defineProperty)
     */
    var defineProperty: ((target: T, p: PropertyKey, attributes: TypedPropertyDescriptor<*>) -> Boolean)?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Proxy/Proxy/deleteProperty)
     */
    var deleteProperty: ((target: T, p: PropertyKey) -> Boolean)?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Proxy/Proxy/get)
     */
    var get: ((target: T, p: PropertyKey, receiver: JsAny) -> JsAny)?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Proxy/Proxy/getOwnPropertyDescriptor)
     */
    var getOwnPropertyDescriptor: ((target: T, p: PropertyKey) -> TypedPropertyDescriptor<*>)?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Proxy/Proxy/getPrototypeOf)
     */
    var getPrototypeOf: ((target: T) -> JsAny?)?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Proxy/Proxy/has)
     */
    var has: ((target: T, p: PropertyKey) -> Boolean)?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Proxy/Proxy/isExtensible)
     */
    var isExtensible: ((target: T) -> Boolean)?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Proxy/Proxy/ownKeys)
     */
    var ownKeys: ((target: T) -> ReadonlyArray<PropertyKey>)?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Proxy/Proxy/preventExtensions)
     */
    var preventExtensions: ((target: T) -> Boolean)?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Proxy/Proxy/set)
     */
    var set: ((target: T, p: PropertyKey, value: JsAny, receiver: JsAny) -> Boolean)?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Proxy/Proxy/setPrototypeOf)
     */
    var setPrototypeOf: ((target: T, v: JsAny?) -> Boolean)?
}
