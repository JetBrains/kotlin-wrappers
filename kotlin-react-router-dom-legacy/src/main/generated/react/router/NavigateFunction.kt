// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react.router

/**
 * The interface for the navigate() function returned from useNavigate().
 */
sealed class NavigateFunction {
    inline operator fun invoke(to: history.To) {
        asDynamic()(to)
    }

    inline operator fun invoke(to: history.To, options: NavigateOptions) {
        asDynamic()(to, options)
    }

    inline operator fun invoke(delta: Int) {
        asDynamic()(delta)
    }
}
