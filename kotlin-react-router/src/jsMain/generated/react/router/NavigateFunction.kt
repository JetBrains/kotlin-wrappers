@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react.router

import remix.run.router.To

/**
 * The interface for the navigate() function returned from useNavigate().
 */

sealed class NavigateFunction {
    inline operator fun invoke(to: To) {
        asDynamic()(to)
    }

    inline operator fun invoke(to: To, options: NavigateOptions) {
        asDynamic()(to, options)
    }

    inline operator fun invoke(delta: Int) {
        asDynamic()(delta)
    }
}
