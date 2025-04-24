package example.entities

import js.array.ReadonlyArray
import js.objects.JsPlainObject

@JsPlainObject
external interface User {
    val id: Key
    val name: String
    val email: String
    val phone: String
    val website: String
}

typealias UserList = ReadonlyArray<User>
