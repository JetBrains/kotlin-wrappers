// Automatically generated - do not modify!

package js.intl

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface CollatorUsage

inline val CollatorUsage.Companion.sort: CollatorUsage
    get() = unsafeCast("sort")

inline val CollatorUsage.Companion.search: CollatorUsage
    get() = unsafeCast("search")
