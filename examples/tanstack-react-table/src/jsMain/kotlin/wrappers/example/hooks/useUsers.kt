package wrappers.example.hooks

import js.objects.jso
import js.promise.Promise
import tanstack.query.core.QueryFunction
import tanstack.query.core.QueryKey
import tanstack.react.query.useQuery
import wrappers.example.USERS_QUERY_KEY
import wrappers.example.entities.Users

fun useUsers(): Users {
    val result = useQuery<Users, Error, Users, QueryKey>(
        options = jso {
            queryKey = USERS_QUERY_KEY
            queryFn = QueryFunction { getUsers() }
        },
    )

    return result.data ?: emptyArray()
}

private fun getUsers(): Promise<Users> =
    fetchData()
