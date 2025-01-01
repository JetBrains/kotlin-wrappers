package react

import kotlinx.coroutines.CoroutineScope

typealias TransitionFunction = suspend CoroutineScope.() -> Unit
