plugins {
    kotlin("js")
    `publishing-conventions`
}

dependencies {
    api(project(":kotlin-extensions"))
    api(project(":kotlin-css"))
    api(project(":kotlin-react"))
    api(project(":kotlin-react-dom"))

    api(kotlinxHtml("js"))

    api(npm("css-in-js-utils", "^3.1.0"))
    api(npm("inline-style-prefixer", "^6.0.0"))
    api(npm("styled-components", "^5.2.0"))
}

signing {
    setRequired({
        gradle.taskGraph.hasTask("publish")
    })

    sign(publishing.publications)
}