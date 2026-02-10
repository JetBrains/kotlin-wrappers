@file:JsModule("@tanstack/router-core")

package tanstack.router.core.raw

import tanstack.router.core.RedirectOptions

@JsName("redirect")
internal external fun <T : Any> redirectRaw(
    options: RedirectOptions,
): T /* Redirect | Nothing */
