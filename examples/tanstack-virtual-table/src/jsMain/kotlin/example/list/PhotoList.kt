package example.list

import example.table.PhotoTable
import react.FC
import react.dom.html.ReactHTML.div

val PhotoList = FC {
    div {
        PhotoTable()
    }
}
