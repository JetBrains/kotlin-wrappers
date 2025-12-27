// Automatically generated - do not modify!

@file:JsModule("node:util/types")

package node.util.types

/**
 * Returns `true` if the value is a native `External` value.
 *
 * A native `External` value is a special type of object that contains a
 * raw C++ pointer (`void*`) for access from native code, and has no other
 * properties. Such objects are created either by Node.js internals or native
 * addons. In JavaScript, they are
 * [frozen](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/freeze) objects with a
 * `null` prototype.
 *
 * ```c
 * #include <js_native_api.h>
 * #include <stdlib.h>
 * napi_value result;
 * static napi_value MyNapi(napi_env env, napi_callback_info info) {
 *   int* raw = (int*) malloc(1024);
 *   napi_status status = napi_create_external(env, (void*) raw, NULL, NULL, &result);
 *   if (status != napi_ok) {
 *     napi_throw_error(env, NULL, "napi_create_external failed");
 *     return NULL;
 *   }
 *   return result;
 * }
 * ...
 * DECLARE_NAPI_PROPERTY("myNapi", MyNapi)
 * ...
 * ```
 *
 * ```js
 * import native from 'napi_addon.node';
 * import { types } from 'node:util';
 *
 * const data = native.myNapi();
 * types.isExternal(data); // returns true
 * types.isExternal(0); // returns false
 * types.isExternal(new String('foo')); // returns false
 * ```
 *
 * For further information on `napi_create_external`, refer to
 * [`napi_create_external()`](https://nodejs.org/docs/latest-v24.x/api/n-api.html#napi_create_external).
 * @since v10.0.0
 */
external fun isExternal(value: Any?): Boolean
