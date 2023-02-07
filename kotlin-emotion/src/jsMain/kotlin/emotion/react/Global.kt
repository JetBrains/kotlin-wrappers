@file:JsModule("@emotion/react")
@file:JsNonModule

package emotion.react

import csstype.Rules
import react.FC
import react.Props

external interface GlobalProps : Props {
    var styles: Rules
}

external val Global: FC<GlobalProps>
