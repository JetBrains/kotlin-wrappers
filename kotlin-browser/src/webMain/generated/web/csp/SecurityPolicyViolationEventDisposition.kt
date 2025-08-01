// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.csp

import js.reflect.unsafeCast

sealed external interface SecurityPolicyViolationEventDisposition {
    companion object
}

inline val SecurityPolicyViolationEventDisposition.Companion.enforce: SecurityPolicyViolationEventDisposition
    get() = unsafeCast("enforce")

inline val SecurityPolicyViolationEventDisposition.Companion.report: SecurityPolicyViolationEventDisposition
    get() = unsafeCast("report")
