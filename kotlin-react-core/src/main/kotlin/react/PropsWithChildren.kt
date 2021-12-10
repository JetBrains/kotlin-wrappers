package react

import kotlinext.js.ReadonlyArray

external interface PropsWithChildren : Props {
    var children: ReadonlyArray<ReactNode>?
}
