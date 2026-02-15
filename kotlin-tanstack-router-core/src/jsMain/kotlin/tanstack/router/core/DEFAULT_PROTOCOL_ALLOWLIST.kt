@file:JsModule("@tanstack/router-core")

package tanstack.router.core

import js.array.ReadonlyArray

/**
 * Default list of URL protocols to allow in links, redirects, and navigation.
 * Any absolute URL protocol not in this list is treated as dangerous by default.
 */
external val DEFAULT_PROTOCOL_ALLOWLIST: ReadonlyArray<String>
