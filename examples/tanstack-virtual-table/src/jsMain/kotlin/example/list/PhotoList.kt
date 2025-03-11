package wrappers.example.list

import react.FC
import react.dom.html.ReactHTML.div
import wrappers.example.table.PhotoTable

val PhotoList = FC {
    div {
        PhotoTable()
    }
}
