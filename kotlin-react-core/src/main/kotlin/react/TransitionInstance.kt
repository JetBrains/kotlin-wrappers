package react

import kotlinx.js.JsPair

typealias TransitionFunction = () -> Unit
typealias TransitionStartFunction = (callback: TransitionFunction) -> Unit

typealias TransitionInstance = JsPair<Boolean, TransitionStartFunction>
