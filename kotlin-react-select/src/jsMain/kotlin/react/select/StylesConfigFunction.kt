package react.select

import csstype.PropertiesBuilder
import js.objects.Object
import js.objects.jso
import js.reflect.unsafeCast
import react.Props

typealias StylesConfigFunction<P /* Props */> = (
    base: CSSObjectWithLabel,
    props: P,
) -> CSSObjectWithLabel

fun <P : Props> Styles(
    block: /* CSSObjectWithLabel */ PropertiesBuilder.(props: P) -> Unit,
): StylesConfigFunction<P> {
    return { base, props ->
        val result = Object.assign(jso(), base)
        block(unsafeCast(result), props)
        result
    }
}
