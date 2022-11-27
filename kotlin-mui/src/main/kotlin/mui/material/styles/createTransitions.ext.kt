package mui.material.styles

import csstype.Transition
import js.core.jso

inline fun Transitions.create(
    vararg props: String,
    block: TransitionCreateOptions.() -> Unit,
): Transition =
    create(props, jso(block))
