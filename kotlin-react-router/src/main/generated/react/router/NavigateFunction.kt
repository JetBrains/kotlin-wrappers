@file:JsModule("react-router/hooks")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router

import remix.run.router.To

/**
 * The interface for the navigate() function returned from useNavigate().
 */

external interface NavigateFunction {
    fun invoke(to: To, options: NavigateOptions = definedExternally): Unit
    fun invoke(delta: Double): Unit
}

