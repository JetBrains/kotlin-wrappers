package react.select

import react.PropsWithChildren
import web.cssom.Length

external interface LoadingIndicatorProps<Option : Any, Group : GroupBase<Option>> : PropsWithChildren {
    var size: Length?
    var selectProps: SelectProps<Option, Group>
}
