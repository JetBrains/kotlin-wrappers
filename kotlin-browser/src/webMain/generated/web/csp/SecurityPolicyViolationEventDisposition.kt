// Automatically generated - do not modify!

package web.csp

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface SecurityPolicyViolationEventDisposition

inline val SecurityPolicyViolationEventDisposition.Companion.enforce: SecurityPolicyViolationEventDisposition
    get() = unsafeCast("enforce")

inline val SecurityPolicyViolationEventDisposition.Companion.report: SecurityPolicyViolationEventDisposition
    get() = unsafeCast("report")
