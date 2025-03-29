package react.select

import react.PropsWithChildren
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface NoOptionsMessageProps<Option : Any, Group : GroupBase<Option>> :
    PropsWithChildren {

    var innerProps: HTMLAttributes<HTMLDivElement>
    var selectProps: SelectProps<Option, Group>
}
