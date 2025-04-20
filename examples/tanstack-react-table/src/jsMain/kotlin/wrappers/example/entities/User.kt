package wrappers.example.entities

import js.array.ReadonlyArray

external interface User {
    var id: Key
    var name: String
    var email: String
    var phone: String
    var website: String
}

typealias UserList = ReadonlyArray<User>
