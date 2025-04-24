package example.hooks

import example.PHOTOS_QUERY_KEY
import example.entities.PhotoList
import example.query.createQueryFunction
import js.errors.JsError
import tanstack.query.core.QueryKey
import tanstack.react.query.UseQueryOptions
import tanstack.react.query.useQuery

fun usePhotosOrNull(): PhotoList? {
    val result = useQuery<PhotoList, JsError, PhotoList, QueryKey>(
        options = UseQueryOptions(
            queryKey = PHOTOS_QUERY_KEY,
            queryFn = createQueryFunction(::fetchPhotos),
        ),
    )

    return result.data
}

fun usePhotos(): PhotoList =
    requireNotNull(usePhotosOrNull())
