plugins {
    kotlin("js")
    `publish-conventions`
}

signing {
    setRequired({
        gradle.taskGraph.hasTask("publish")
    })

    sign(publishing.publications)
}
