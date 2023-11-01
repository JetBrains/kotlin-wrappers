package csstype

import js.core.jso
import web.cssom.ContainerName
import web.cssom.ContainerQuery
import web.cssom.Selector

inline fun <T : Any> RuleBuilder<T>.container(
    containerName: ContainerName,
    query: ContainerQuery,
    block: T.() -> Unit,
) {
    set(Selector("@container $containerName $query"), jso(block))
}

inline fun <T : Any> RuleBuilder<T>.container(
    containerName: ContainerName,
    query: String,
    block: T.() -> Unit,
) {
    set(Selector("@container $containerName $query"), jso(block))
}
