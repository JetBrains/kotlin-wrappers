package team.karakum.hooks

import js.objects.jso
import js.promise.Promise
import tanstack.query.core.QueryFunction
import tanstack.query.core.QueryKey
import tanstack.query.core.skipToken
import tanstack.react.query.useQuery
import team.karakum.USERS_QUERY_KEY
import team.karakum.entities.Users
import web.http.fetchAsync

fun useUsers(): Users {
    val result = useQuery<Users, Error, Users, QueryKey>(
        options = jso {
            queryKey = USERS_QUERY_KEY
            queryFn = QueryFunction { getUsers() }
        },
    )
    return result.data ?: emptyArray()
}

fun useSkipUsers(): Users {
    val result = useQuery<Users, Error, Users, QueryKey>(
        options = jso {
            queryKey = USERS_QUERY_KEY
            queryFn = skipToken
        },
    )
    return result.data ?: emptyArray()
}

private fun getUsers(): Promise<Users> =
    fetchAsync("https://jsonplaceholder.typicode.com/users")
        .then { it.jsonAsync() }
        .then { it.unsafeCast<Users>() }
