package emotion.styled

import csstype.Selector
import react.FC
import react.Props

external interface StyledComponent<P : Props> :
    FC<P>,
    Selector
