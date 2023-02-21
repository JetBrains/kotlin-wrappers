@file:JsModule("react-router")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router

import remix.run.router.To

/**
 * The interface for the navigate() function returned from useNavigate().
 */

sealed class NavigateFunction {

    @Suppress("NOTHING_TO_INLINE")
    inline operator fun invoke(to: To, options: NavigateOptions): Unit = asDynamic()(to, options)


    @Suppress("NOTHING_TO_INLINE")
    inline operator fun invoke(to: To): Unit = asDynamic()(to)


    @Suppress("NOTHING_TO_INLINE")
    inline operator fun invoke(delta: Double): Unit = asDynamic()(delta)

}

