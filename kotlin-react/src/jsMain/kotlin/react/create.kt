package react

import js.objects.unsafeJso
import react.jsx.runtime.jsx

inline fun <P : Props> ElementType<P>.create(): ReactElement<P> =
    jsx(this)

fun <P : Props> ElementType<P>.create(
    block: context(ChildrenBuilder) (@ReactDsl P).() -> Unit,
): ReactElement<P> {
    val builder = ChildrenBuilder()

    val props = unsafeJso<P> {
        context(builder) {
            block()
        }
    }

    return jsx(
        type = this,
        props = props,
        builderChildren = builder.asReactNode(),
    )
}
