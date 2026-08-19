// Automatically generated - do not modify!

package web.csp

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/disposition)
 */
@JsUnion
sealed /* union */
external interface SecurityPolicyViolationEventDisposition

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/disposition#enforce)
 */
inline val SecurityPolicyViolationEventDisposition.Companion.enforce: SecurityPolicyViolationEventDisposition
    get() = unsafeCast("enforce")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/disposition#report)
 */
inline val SecurityPolicyViolationEventDisposition.Companion.report: SecurityPolicyViolationEventDisposition
    get() = unsafeCast("report")
