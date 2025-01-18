package react

import react.internal.functionRefToFunction

/**
 * [Online Documentation](https://react.dev/learn/separating-events-from-effects#declaring-an-effect-event)
 */
fun <T : Function<Unit>> useEffectEvent(
    handler: T,
): T {
    val handlerRef = useRef<T>()

    useLayoutEffect {
        handlerRef.current = handler
    }

    return useMemo {
        functionRefToFunction(handlerRef)
    }
}
