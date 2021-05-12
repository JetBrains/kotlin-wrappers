plugins {
    kotlin("js")
    `publishing-conventions`
}

signing {
    setRequired({
        gradle.taskGraph.hasTask("publish")
    })

    sign(configurations.archives.get())
}