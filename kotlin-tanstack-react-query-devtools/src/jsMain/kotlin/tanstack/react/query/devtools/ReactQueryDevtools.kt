@file:JsModule("@tanstack/react-query-devtools")

package tanstack.react.query.devtools

import react.FC
import react.Props

external interface ReactQueryDevtoolsProps : Props {
    var initialIsOpen: Boolean
}

external val ReactQueryDevtools: FC<ReactQueryDevtoolsProps>
