// Automatically generated - do not modify!

package web.authn

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface ResidentKeyRequirement

inline val ResidentKeyRequirement.Companion.discouraged: ResidentKeyRequirement
    get() = unsafeCast("discouraged")

inline val ResidentKeyRequirement.Companion.preferred: ResidentKeyRequirement
    get() = unsafeCast("preferred")

inline val ResidentKeyRequirement.Companion.required: ResidentKeyRequirement
    get() = unsafeCast("required")
