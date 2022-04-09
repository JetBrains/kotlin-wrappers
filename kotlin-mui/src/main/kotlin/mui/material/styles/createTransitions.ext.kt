package mui.material.styles

import kotlinx.js.jso

inline fun Transitions.create(
    vararg props: String,
    block: TransitionCreateOptions.() -> Unit,
): String =
    create(props, jso(block))
