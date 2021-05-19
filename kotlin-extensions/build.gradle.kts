plugins {
    kotlin("js")
    `publishing-conventions`
}

signing {
    setRequired({
        gradle.taskGraph.hasTask("publish")
    })

    sign(publishing.publications)
}