package example.table.base

import js.array.ReadonlyArray
import react.FC
import react.Key
import react.PropsWithValue
import react.dom.html.ReactHTML.thead
import react.dom.html.ReactHTML.tr
import tanstack.table.core.HeaderGroup

internal external interface TableHeadProps : PropsWithValue<ReadonlyArray<HeaderGroup<*>>>

internal val TableHead: FC<TableHeadProps> = FC { props ->
    val headerGroups = props.value

    thead {
        for (headerGroup in headerGroups) {
            tr {
                key = Key(headerGroup.id)

                for (header in headerGroup.headers) {
                    TableHeader {
                        key = Key(header.id)
                        value = header
                    }
                }
            }
        }
    }
}
