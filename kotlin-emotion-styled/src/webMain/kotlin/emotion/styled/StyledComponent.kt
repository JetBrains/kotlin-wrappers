package emotion.styled

import react.FC
import react.Props
import web.cssom.Selector

external interface StyledComponent<P : Props> :
    FC<P>,
    Selector
