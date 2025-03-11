package wrappers.example.table.simple

import emotion.styled.styled
import js.array.ReadonlyArray
import react.FC
import react.PropsWithValue
import react.dom.html.ReactHTML.thead
import react.dom.html.ReactHTML.tr
import tanstack.table.core.HeaderGroup
import web.cssom.px
import wrappers.example.theme.Theme

internal external interface TableHeadProps : PropsWithValue<ReadonlyArray<HeaderGroup<*>>>

internal val TableHead: FC<TableHeadProps> = FC { props ->
    val headerGroups = props.value

    Container {
        for (headerGroup in headerGroups) {
            tr {
                key = headerGroup.id

                for (header in headerGroup.headers) {
                    TableHeader {
                        key = header.id
                        value = header
                    }
                }
            }
        }
    }
}

private val Container = thead.styled {
    fontSize = 18.px
    color = Theme.Text.Gray
    backgroundColor = Theme.Background.Gray
}
