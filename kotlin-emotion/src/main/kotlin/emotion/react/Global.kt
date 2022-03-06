@file:JsModule("@emotion/react")
@file:JsNonModule

package emotion.react

import csstype.Properties
import react.FC
import react.Props

external interface GlobalProps : Props {
    var styles: Properties
}

external val Global: FC<GlobalProps>
