package emotion.styled

import csstype.PropertiesBuilder
import js.core.Object
import js.core.jso
import react.ElementType
import react.PropsWithClassName

fun <P : PropsWithClassName> ElementType<P>.styled(
    options: StyledOptions?,
    block: PropertiesBuilder.(P) -> Unit,
): StyledComponent<P> {
    val style = { props: P ->
        val builder: PropertiesBuilder = jso()
        block(builder, props)
        builder
    }

    val defaultOptions: StyledOptions = jso {
        target = generateId()
    }

    val finalOptions = Object.assign(defaultOptions, options)

    return styled(this, finalOptions)(style)
}

fun <P : PropsWithClassName> ElementType<P>.styled(
    block: PropertiesBuilder.(P) -> Unit,
): StyledComponent<P> =
    styled(null, block)
