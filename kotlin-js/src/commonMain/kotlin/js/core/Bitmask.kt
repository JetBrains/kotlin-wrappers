@file:Suppress(
    "EXPECTED_EXTERNAL_DECLARATION",
)

package js.core

import js.reflect.JsExternalInheritorsOnly

@JsExternalInheritorsOnly
expect external interface Bitmask<T : Bitmask<T>>
