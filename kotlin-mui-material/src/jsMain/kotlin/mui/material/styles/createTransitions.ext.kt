package mui.material.styles

import js.objects.unsafeJso
import web.cssom.Transition

inline fun Transitions.create(
    vararg props: String,
    block: TransitionCreateOptions.() -> Unit,
): Transition =
    create(props, unsafeJso(block))
