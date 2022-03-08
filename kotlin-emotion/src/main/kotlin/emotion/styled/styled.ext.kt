package emotion.styled

import csstype.Properties
import csstype.PropertiesBuilder
import emotion.react.Theme
import kotlinx.js.jso
import react.ElementType
import react.FC
import react.Props
import react.PropsWithClassName

external interface PropsWithTheme : Props {
    val theme: Theme
}

fun <P : PropsWithClassName> ElementType<P>.styled(
    block: PropertiesBuilder.(P, Theme) -> Unit,
): FC<P> {
    val style = { props: P ->
        block(
            jso(),
            props,
            props.unsafeCast<PropsWithTheme>().theme
        ).unsafeCast<Properties>()
    }

    return styled(this)(style)
}
