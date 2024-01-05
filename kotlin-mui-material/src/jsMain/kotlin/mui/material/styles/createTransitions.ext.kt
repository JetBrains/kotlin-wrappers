package mui.material.styles

import js.objects.jso
import web.cssom.Transition

inline fun Transitions.create(
    vararg props: String,
    block: TransitionCreateOptions.() -> Unit,
): Transition =
    create(props, jso(block))
