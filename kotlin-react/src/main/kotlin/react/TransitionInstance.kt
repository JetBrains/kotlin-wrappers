@file:Suppress("NOTHING_TO_INLINE")

package react

import kotlinext.js.JsPair

typealias TransitionFunction = () -> Unit
typealias TransitionStartFunction = (callback: TransitionFunction) -> Unit

typealias TransitionInstance = JsPair<Boolean, TransitionStartFunction>
