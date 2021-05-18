plugins {
    kotlin("js")
    `publishing-conventions`
}

dependencies {
    api(project(":kotlin-extensions"))

    api(npmv("react"))
}

signing {
    setRequired({
        gradle.taskGraph.hasTask("publish")
    })

    sign(configurations.archives.get())
}
