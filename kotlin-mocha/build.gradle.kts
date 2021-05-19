plugins {
    kotlin("js")
    `publishing-conventions`
}

dependencies {
    api(npmv("mocha"))
}

signing {
    setRequired({
        gradle.taskGraph.hasTask("publish")
    })

    sign(publishing.publications)
}