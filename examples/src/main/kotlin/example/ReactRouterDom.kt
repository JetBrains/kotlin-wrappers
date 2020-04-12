package example

import react.RBuilder
import react.RProps
import react.child
import react.dom.*
import react.functionalComponent
import react.router.dom.*

val Home = functionalComponent<RProps> { h2 { +"Home" } }
val About = functionalComponent<RProps> { h2 { +"About" } }

val Topics = functionalComponent<RProps> {
    val match = useRouteMatch<RProps>() ?: return@functionalComponent

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
            route("${match.path}/:topicId") { child(Topic) }
            route(match.path) {
                h3 { +"Please select a topic." }
            }
        }
    }
}

external interface TopicProps : RProps {
    val topicId: String
}

val Topic = functionalComponent<RProps> {
    val topicId = useParams<TopicProps>()?.topicId ?: return@functionalComponent

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
                route("/about") { child(About) }
                route("/topics") { child(Topics) }
                route("/") { child(Home) }
            }
        }
    }
}
