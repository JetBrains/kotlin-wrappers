// Automatically generated - do not modify!

package web.http

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RequestMethod

inline val RequestMethod.Companion.DELETE: RequestMethod
    get() = unsafeCast("DELETE")

inline val RequestMethod.Companion.GET: RequestMethod
    get() = unsafeCast("GET")

inline val RequestMethod.Companion.HEAD: RequestMethod
    get() = unsafeCast("HEAD")

inline val RequestMethod.Companion.OPTIONS: RequestMethod
    get() = unsafeCast("OPTIONS")

inline val RequestMethod.Companion.PATCH: RequestMethod
    get() = unsafeCast("PATCH")

inline val RequestMethod.Companion.POST: RequestMethod
    get() = unsafeCast("POST")

inline val RequestMethod.Companion.PUT: RequestMethod
    get() = unsafeCast("PUT")
