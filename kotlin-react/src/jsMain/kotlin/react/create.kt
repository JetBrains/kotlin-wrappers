package react

import js.objects.unsafeJso
import react.jsx.runtime.jsx
import react.jsx.runtime.jsxs

fun <P : Props> ElementType<P>.create(): ReactElement<P> =
    jsx(this, unsafeJso())

fun <P : Props> ElementType<P>.create(
    block: context(ChildrenBuilder) (@ReactDsl P).() -> Unit,
): ReactElement<P> =
    jsxs(
        type = this,
        props = unsafeJso {
            val builder = ChildrenBuilder()

            context(builder) { block() }

            // TODO: overloads by generics
            asDynamic().children = builder
        },
    )
