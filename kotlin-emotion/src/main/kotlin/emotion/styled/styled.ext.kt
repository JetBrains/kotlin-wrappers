package emotion.styled

import csstype.PropertiesBuilder
import emotion.react.Theme
import kotlinx.js.Object
import kotlinx.js.jso
import react.ElementType
import react.Props
import react.PropsWithClassName

private inline val Props.theme: Theme
    get() = asDynamic().theme

fun <P : PropsWithClassName> ElementType<P>.styled(
    options: (StyledOptions.() -> Unit)? = null,
    block: PropertiesBuilder.(P, Theme) -> Unit,
): StyledComponent<P> {
    val style = { props: P ->
        val builder: PropertiesBuilder = jso()
        block(builder, props, props.theme)
        builder
    }

    val defaultOptions: StyledOptions = jso {
        target = generateId(this@styled)
    }

    val finalOptions = Object.assign(defaultOptions, options?.let(::jso))

    return styled(this, finalOptions)(style)
}
