package example

import react.Props
import react.RBuilder
import react.RProps
import react.dom.*
import react.fc
import react.router.dom.*

val Home = fc<Props> { h2 { +"Home" } }
val About = fc<Props> { h2 { +"About" } }

val Topics = fc<Props> {
    val match = useRouteMatch<RProps>() ?: return@fc

    div {
        h2 { +"Topics" }

        ul {
            li {
                routeLink("${match.url}/components") { +"Components" }
            }
            li {
                routeLink("${match.url}/props-v-state") { +"Props v. State" }
            }
        }

        switch {
            route("${match.path}/:topicId", component = Topic)
            route(match.path) {
                h3 { +"Please select a topic." }
            }
        }
    }
}

external interface TopicProps : RProps {
    val topicId: String
}

val Topic = fc<Props> {
    val topicId = useParams<TopicProps>()?.topicId ?: return@fc

    h3 { +"Requested topic ID: $topicId" }
}

fun RBuilder.appWithRouter() {
    browserRouter {
        div {
            ul {
                li {
                    routeLink("/") { +"Home" }
                }
                li {
                    routeLink("/about") { +"About" }
                }
                li {
                    routeLink("/topics") { +"Topics" }
                }
            }

            switch {
                route("/about", component = About)
                route("/topics", component = Topics)
                route("/", component = Home)
            }
        }
    }
}
