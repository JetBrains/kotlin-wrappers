// Generated by Karakum - do not modify it manually!


package react.router

import remix.run.router.To

/**
 * The interface for the navigate() function returned from useNavigate().
 */

sealed external interface NavigateFunction {

    @seskar.js.JsNative
    operator fun invoke(to: To, options: NavigateOptions = definedExternally): Unit


    @seskar.js.JsNative
    operator fun invoke(delta: Double): Unit

}
