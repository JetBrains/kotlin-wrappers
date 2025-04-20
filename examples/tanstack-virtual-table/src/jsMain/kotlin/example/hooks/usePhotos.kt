package wrappers.example.hooks

import tanstack.query.core.QueryKey
import tanstack.react.query.UseQueryOptions
import tanstack.react.query.useQuery
import wrappers.example.PHOTOS_QUERY_KEY
import wrappers.example.entities.PhotoList
import wrappers.example.query.createQueryFunction

fun usePhotosOrNull(): PhotoList? {
    val result = useQuery<PhotoList, Error, PhotoList, QueryKey>(
        options = UseQueryOptions(
            queryKey = PHOTOS_QUERY_KEY,
            queryFn = createQueryFunction(::fetchPhotos),
        ),
    )

    return result.data
}

fun usePhotos(): PhotoList =
    requireNotNull(usePhotosOrNull())
