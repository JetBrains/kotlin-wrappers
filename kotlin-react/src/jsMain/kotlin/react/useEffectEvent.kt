@file:JsModule("react")

package react

/**
 * [Online Documentation](https://react.dev/learn/separating-events-from-effects#declaring-an-effect-event)
 */
external fun <T : Function<Unit>> useEffectEvent(
    handler: T,
): T
