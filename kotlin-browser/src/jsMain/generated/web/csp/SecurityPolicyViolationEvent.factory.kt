// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.csp

import web.events.EventTarget
import web.events.EventType

inline fun SecurityPolicyViolationEvent(
    type: EventType<SecurityPolicyViolationEvent<*>>,
): SecurityPolicyViolationEvent<*> =
    SecurityPolicyViolationEvent<EventTarget?>(
        type = type,
    )

inline fun SecurityPolicyViolationEvent(
    type: EventType<SecurityPolicyViolationEvent<*>>,
    init: SecurityPolicyViolationEventInit,
): SecurityPolicyViolationEvent<*> =
    SecurityPolicyViolationEvent<EventTarget?>(
        type = type,
        init = init,
    )
