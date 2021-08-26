@file:Suppress("NOTHING_TO_INLINE")

package react

import kotlinext.js.Tuple

typealias TransitionFunction = () -> Unit
typealias TransitionStartFunction = (callback: TransitionFunction) -> Unit

typealias TransitionInstance = Tuple<Boolean, TransitionStartFunction>
