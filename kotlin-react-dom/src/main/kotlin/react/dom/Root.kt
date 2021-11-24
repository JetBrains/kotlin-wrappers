package react.dom

import kotlinext.js.ReadonlyArray
import react.ReactNode

external interface Root {
    fun render(children: ReactNode)
    fun render(children: ReadonlyArray<ReactNode>)
}
