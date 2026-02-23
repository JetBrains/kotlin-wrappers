@file:JsModule("@tanstack/router-core")

package tanstack.router.core.raw

import tanstack.router.core.Redirect
import tanstack.router.core.RedirectOptions

@JsName("redirect")
internal /* raw */
external fun <T : Redirect> redirectRaw(
    options: RedirectOptions,
): T /* Redirect | Nothing */
