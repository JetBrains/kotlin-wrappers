@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router

import remix.run.router.To

/**
 * The interface for the navigate() function returned from useNavigate().
 */

sealed external interface NavigateFunction {

    @Suppress("DEPRECATION")
    @nativeInvoke
    operator fun invoke(to: To, options: NavigateOptions = definedExternally): Unit


    @Suppress("DEPRECATION")
    @nativeInvoke
    operator fun invoke(delta: Double)

}
