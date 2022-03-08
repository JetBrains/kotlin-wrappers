@file:JsModule("@emotion/styled")
@file:JsNonModule

package emotion.styled

import csstype.Properties
import react.ElementType
import react.FC
import react.Props

@JsName("default")
external fun <P: Props> styled(
    type: ElementType<P>
): ((P) -> Properties) -> FC<P>
