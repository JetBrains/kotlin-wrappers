package react.select

import react.PropsWithChildren
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface ValueContainerProps<Option, Group : GroupBase<Option>> : PropsWithChildren {
    var innerProps: HTMLAttributes<HTMLDivElement>?
    var isDisabled: Boolean
    var getValue: () -> Options<Option>
}
