// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import js.reflect.unsafeCast

sealed external interface LocaleMatcher {
    companion object
}

inline val LocaleMatcher.Companion.lookup: LocaleMatcher
    get() = unsafeCast("lookup")

inline val LocaleMatcher.Companion.bestFit: LocaleMatcher
    get() = unsafeCast("best fit")
