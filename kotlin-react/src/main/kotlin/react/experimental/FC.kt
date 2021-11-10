package react.experimental

import react.FC
import react.Props

fun <P : Props> FC(
    fn: ChildrenBuilder.(props: P) -> Unit,
): FC<P> {
    val component = { props: P ->
        createElement { fn(props) }
    }
    return component.unsafeCast<FC<P>>()
}
