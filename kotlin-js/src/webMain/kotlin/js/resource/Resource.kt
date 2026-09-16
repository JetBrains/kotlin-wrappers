package js.resource

interface Resource<T> :
    AutoCloseable {

    val value: T
}
