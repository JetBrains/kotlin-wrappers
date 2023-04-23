// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
    "NOTHING_TO_INLINE",
)

package web.cssom

// language=JavaScript
@JsName("""(/*union*/{ease: 'ease', easeIn: 'ease-in', easeInOut: 'ease-in-out', easeOut: 'ease-out', stepEnd: 'step-end', stepStart: 'step-start', linear: 'linear', all: 'all'}/*union*/)""")
sealed external interface Transition {
    companion object {
        val ease: Transition
        val easeIn: Transition
        val easeInOut: Transition
        val easeOut: Transition
        val stepEnd: Transition
        val stepStart: Transition
        val linear: Transition
        val all: Transition
    }
}

inline fun Transition(
    property: TransitionProperty,
    duration: Time,
    timingFunction: TransitionTimingFunction,
): Transition =
    "$property $duration $timingFunction".unsafeCast<Transition>()

inline fun Transition(
    property: TransitionProperty,
    duration: Time,
    delay: Time,
): Transition =
    "$property $duration $delay".unsafeCast<Transition>()

inline fun Transition(
    property: TransitionProperty,
    duration: Time,
    timingFunction: TransitionTimingFunction,
    delay: Time,
): Transition =
    "$property $duration $timingFunction $delay".unsafeCast<Transition>()
