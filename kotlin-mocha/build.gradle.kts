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

    sign(configurations.archives.get())
}