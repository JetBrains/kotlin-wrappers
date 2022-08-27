package react

import kotlinx.js.JsTuple2

typealias TransitionFunction = () -> Unit
typealias TransitionStartFunction = (callback: TransitionFunction) -> Unit

typealias TransitionInstance = JsTuple2<Boolean, TransitionStartFunction>
