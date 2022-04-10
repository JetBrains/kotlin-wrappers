package mui.material.styles

import csstype.Transition
import kotlinx.js.jso

inline fun Transitions.create(
    vararg props: String,
    block: TransitionCreateOptions.() -> Unit,
): Transition =
    create(props, jso(block))
